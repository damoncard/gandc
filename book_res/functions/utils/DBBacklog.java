
package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBBacklog extends ConnectDB{
    
    
    
    public DBBacklog() {
        super();
    }
    
    public ArrayList<HashMap> getBacklogADay(String date) {
        connect();
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        if(month.charAt(0) == '0') month = String.valueOf(month.charAt(1));
        String sql = "SELECT OOSD_BACKLOG.date, noOfCustomer, revenue, foodName"
                + " FROM OOSD_FOODBACKLOG JOIN OOSD_FOODS ON OOSD_FOODBACKLOG.foodID = OOSD_FOODS.foodID"
                + " JOIN OOSD_BACKLOG ON OOSD_FOODBACKLOG.date = OOSD_BACKLOG.date"
                + " WHERE YEAR(OOSD_BACKLOG.date) = '" + year + "' AND  OOSD_BACKLOG.date IN ("
                + " SELECT date FROM OOSD_FOODBACKLOG AS a"
                + " HAVING qty > ALL(SELECT qty FROM OOSD_FOODBACKLOG AS b WHERE a.date = b.date and a.foodID <> b.foodID) )";
        System.out.println(sql);
        ArrayList<HashMap> queries = db.queryRows(sql);
        disconnect();
        return queries;
    }
    
    public ArrayList<HashMap> getBacklogAMonth(String year) {
        connect();
        String sql = "SELECT MONTH(date) AS date, SUM(noOfCustomer) as noOfCustomer, SUM(revenue) as revenue, foodName"
                + " FROM OOSD_BACKLOG, OOSD_FOODS"
                + " WHERE YEAR(date) = '" + year + "'"
                + " AND (date, foodID) IN (SELECT date, foodID FROM OOSD_FOODBACKLOG AS A WHERE A.qty >= ALL(SELECT qty FROM OOSD_FOODBACKLOG AS B WHERE A.date = B.date))"
                + " GROUP BY MONTH(date)";
        ArrayList<HashMap> queries = db.queryRows(sql);
        disconnect();
        return queries;
    }
    
    
    
}

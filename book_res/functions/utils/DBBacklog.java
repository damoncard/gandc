
package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBBacklog extends ConnectDB{
    
    
    
    public DBBacklog() {
        super();
    }
    
    public ArrayList<HashMap> getBacklogADay(String date) {
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        if(month.charAt(0) == '0') month = String.valueOf(month.charAt(1));
        String sql = "SELECT date, noOfCustomer, revenue, foodName"
                + " FROM OOSD_BACKLOG, OOSD_FOODS"
                + " WHERE YEAR(date) = '" + year + "' AND MONTH(date) = '" + month + "'"
                + " AND (date, foodID) IN (SELECT date, foodID FROM OOSD_FOODBACKLOG AS A WHERE A.qty >= ALL(SELECT qty FROM OOSD_FOODBACKLOG AS B WHERE A.date = B.date))";
        return db.queryRows(sql);
    }
    
    public ArrayList<HashMap> getBacklogAMonth(String year) {
        String sql = "SELECT MONTH(date) AS date, SUM(noOfCustomer) as noOfCustomer, SUM(revenue) as revenue, foodName"
                + " FROM OOSD_BACKLOG, OOSD_FOODS"
                + " WHERE YEAR(date) = '" + year + "'"
                + " AND (date, foodID) IN (SELECT date, foodID FROM OOSD_FOODBACKLOG AS A WHERE A.qty >= ALL(SELECT qty FROM OOSD_FOODBACKLOG AS B WHERE A.date = B.date))"
                + " GROUP BY MONTH(date)";
        return db.queryRows(sql);
    }
    
    
    
}

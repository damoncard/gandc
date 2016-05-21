
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
        String sql = "SELECT date, noOfCustomer, revenue"
                + " FROM OOSD_BACKLOG"
                + " WHERE YEAR(date) = '" + year + "' AND MONTH(date) = '" + month + "'";
        return db.queryRows(sql);
    }
    
    public ArrayList<HashMap> getBacklogAMonth(String year) {
        String sql = "SELECT MONTH(date) AS date, SUM(noOfCustomer) as noOfCustomer, SUM(revenue) as revenue FROM OOSD_BACKLOG"
                + " WHERE YEAR(date) = '" + year + "'"
                + " GROUP BY MONTH(date)";
        return db.queryRows(sql);
    }
    
}

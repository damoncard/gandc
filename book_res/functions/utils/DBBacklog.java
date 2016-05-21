
package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBBacklog extends ConnectDB{
    
    //private final String[] MONTHS = {"January", "Fabuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    public DBBacklog() {
        super();
    }
    
    public ArrayList<HashMap> getBacklogADay(String date) {
        String sql = "SELECT * FROM OOSD_BACKLOG WHERE date = '" + date + "'";
        return db.queryRows(sql);
    }
    
    public ArrayList<HashMap> getBacklogAMonth(String year) {
        String sql = "SELECT MONTH(date) AS month, SUM(noOfCustomer) as noOfCustomer, SUM(revenue) as revenue FROM OOSD_BACKLOG"
                + " WHERE YEAR(date) = '" + year + "'"
                + " GROUP BY month";
        return db.queryRows(sql);
    }
    
}

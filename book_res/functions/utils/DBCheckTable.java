
package book_res.functions.utils;

import java.util.HashMap;

public class DBCheckTable extends ConnectDB{
    
    public DBCheckTable() {
        super();
    }
    
    /**
     * 
     * @param date
     * @param time
     * @param chairs
     * @return tableID that available in this date and time,
     *         -1 is in case that don't have available tables
     */
    public int checkAvailable(String date, String time, int chairs) {
        int tableId = -1;
        
        // to get tableID that available in this date and time
        String tableIdSql = "SELECT tableID FROM OOSD_TABLES AS T"
                + " WHERE chairs = " + chairs
                + " AND (available = 1"
                + " OR EXISTS (SELECT * FROM OOSD_ORDERS AS O"
                +            " WHERE O.tableID = T.tableID AND dateReserve = '" + date + "'" 
                +            " AND (timeReserve >= '" + time + "' OR timeReserve <= '" + time + "')))";
        HashMap table = db.queryRow(tableIdSql);
        
        if(table == null) return tableId; // if can't get any tables return -1
        else tableId = Integer.parseInt(String.valueOf(table));
        return tableId;
    }
    
}

package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBBilling extends ConnectDB{
    
    public DBBilling() {
        super();
    }
    
    /**
     * to get all reserves in particular date
     * @param date in format of "YYYY-MM-DD"
     * @return 
     */
    public ArrayList<HashMap> getReserve(String date) {
        String sql = "SELECT reserveID, tableID, customerName, timeReserve, "
                + " FROM OOSD_RESERVES AS R JOIN OOSD_CUSTOMERS AS C ON R.customerID = C.customerID"
                + " WHERE dateReserve = '" + date + "'"
                + " ORDER BY timeReserve";
        return db.queryRows(sql);
    }
    
    public ArrayList<HashMap> getBilling(int reserveID) {
        String sql = "SELECT foodName, quantity, (price*quantity) AS total"
                + " FROM OOSD_RESERVES AS R, OOSD_ORDERS AS O, OOSD_FOODS AS F"
                + " WHERE R.reserveID = " + reserveID
                + " AND R.reserveID = O.reserveID and O.foodID = F.foodID";
        return db.queryRows(sql);
    }
    
    public static void main(String[] args) {
        DBBilling b = new DBBilling();
        System.out.println(b.getBilling(1));
        b.disconnect();
                
    }

}

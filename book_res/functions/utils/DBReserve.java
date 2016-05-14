
package book_res.functions.utils;

public class DBReserve extends ConnectDB{
    
    public DBReserve() {
        super();
    }

    /**
     * 
     * @param tableId
     * @param customerId
     * @param dateReserve in format of "YYYY-MM-DD"
     * @param timeReserve in format of "HH:MM:SS"
     */
    public void insertReserving(int tableId, int customerId, String dateReserve, String timeReserve) {
        String sql = "INSERT INTO OOSD_RESERVES(dateReserve, timeReserve, tableID, customerID) VALUES ( '"
                + dateReserve + "', '"
                + timeReserve + "', "
                + tableId + ", "
                + customerId
                + " ) ";
        System.out.println(db.executeQuery(sql));
        sql = "SELECT IDENT_CURRENT('OOSD_RESERVES')";
        System.out.println(db.queryRow(sql));
    }
    
    public void getLastestOrderID() {
        //String sql = "SELECT"
    }
    
    public void updateOrderedFood(int foodId, int quantity) {
        String sql = "UPDATE OOSD_FOODS SET ordered = ordered + " + quantity + " WHERE foodID = " + foodId;
        db.executeQuery(sql);
    }
    
    public static void main(String[] args) {
        DBReserve r = new DBReserve();
        r.insertReserving(203, 2, "2016-05-05", "13:00:00");
    }

}

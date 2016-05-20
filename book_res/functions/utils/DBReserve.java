
package book_res.functions.utils;

import java.util.HashMap;

public class DBReserve extends ConnectDB{
    
    public DBReserve() {
        super();
    }

    /**
     * @param tableId
     * @param customerId
     * @param dateReserve in format of "YYYY-MM-DD"
     * @param timeReserve in format of "HH:MM"
     */
    public void insertReserving(int tableId, int customerId, String dateReserve, String timeReserve) {
        String sql = "INSERT INTO OOSD_RESERVES(dateReserve, timeReserve, tableID, customerID) VALUES ( '"
                + dateReserve + "', '"
                + timeReserve + "', "
                + tableId + ", "
                + customerId
                + " )";
        System.out.println(db.executeQuery(sql));
    }
    
    private int getLastestOrderID() {
        String sql = "SELECT MAX(reserveID) AS id FROM OOSD_RESERVES";
        HashMap id = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(id.get("id")));
    }
    
    public int getIDFromName(String name) {
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodName = '" + name + "'";
        HashMap foodName = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(foodName.get("foodID")));
    }
    
    public void addOrders(int foodID, int qty) {
        String sql = "INSERT INTO OOSD_ORDERS(reserveID, foodID, quantity) VALUES ( "
                + getLastestOrderID() + ", "
                + foodID + ", "
                + qty + " )";
        db.executeQuery(sql);
        updateOrderedFood(foodID, qty);
    }
    
    private void updateOrderedFood(int foodId, int quantity) {
        String sql = "UPDATE OOSD_FOODS SET ordered = ordered + " + quantity + " WHERE foodID = " + foodId;
        db.executeQuery(sql);
    }

}

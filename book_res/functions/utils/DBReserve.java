
package book_res.functions.utils;

import java.util.HashMap;

public class DBReserve extends ConnectDB{
    
    public DBReserve() {
        super();
    }

    /**
     * @param tableId
     * @param customerName
     * @param dateReserve in format of "YYYY-MM-DD"
     * @param timeReserve in format of "HH:MM"
     */
    public void insertReserving(int tableId, String customerName, String dateReserve, String timeReserve) {
        insertCustomer(customerName);
        
        String sql = "INSERT INTO OOSD_RESERVES(dateReserve, timeReserve, tableID, customerID) VALUES ( '"
                + dateReserve + "', '"
                + timeReserve + "', "
                + tableId + ", "
                + getLastestCustomerID()
                + " )";
        System.out.println(db.executeQuery(sql));
    }
    
    private void insertCustomer(String name) {
        String sql = "INSERT INTO OOSD_CUSTOMERS(customerName) VALUES ('" + name + "')";
        db.executeQuery(sql);
    }
    
    private int getLastestCustomerID() {
        String sql = "SELECT MAX(customerID) AS id FROM OOSD_CUSTOMERS";
        HashMap id = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(id.get("id")));
    }
    
    private int getLastestOrderID() {
        String sql = "SELECT MAX(reserveID) AS id FROM OOSD_RESERVES";
        HashMap id = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(id.get("id")));
    }

    private int getFoodIDFromName(String name) {
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodName = '" + name + "'";
        HashMap foodName = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(foodName.get("foodID")));
    }
    
    public void addOrders(String date, String foodName, int qty) {
        int foodID = getFoodIDFromName(foodName);
        String sql = "INSERT INTO OOSD_ORDERS(reserveID, foodID, quantity) VALUES ( "
                + getLastestOrderID() + ", "
                + foodID + ", "
                + qty + " )";
        db.executeQuery(sql);
        updateOrderedFood(date, foodID, qty);
    }
    
    private void updateOrderedFood(String date, int foodId, int quantity) {
        String sql = "UPDATE OOSD_FOODBACKLOG SET qty = qty + " + quantity + ""
                + " WHERE foodID = " + foodId + " AND date = '" + date + "'";
        db.executeQuery(sql);
    }

}


package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBFood extends ConnectDB{
    
    private int foodID;
    
    public DBFood() {
        super();
    }
    
    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }
    
    public int getFoodID() {
        return foodID;
    }
    
    public ArrayList<HashMap> getAllFoodIDs() {
        String sql = "SELECT foodID FROM OOSD_FOODS";
        return db.queryRows(sql);
    }
    
    public String getFoodName() {
        String sql = "SELECT foodName FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap name = db.queryRow(sql);
        return String.valueOf(name.get("foodName"));
    }
    
    public int getPrice() {
        String sql = "SELECT price FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap price = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(price.get("price")));
    }
    
    public int getOrdered() {
        String sql = "SELECT ordered FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap ordered = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(ordered.get("ordered")));
    }
    
}
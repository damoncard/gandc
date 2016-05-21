
package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBFood extends ConnectDB{

    public DBFood() {
        super();
    }
 
    public ArrayList<HashMap> getAllFoodIDs() {
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodID BETWEEN 201 AND 299";
        return db.queryRows(sql);
    }
    
    public ArrayList<HashMap> getAllBevaragesIDs() {
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodID BETWEEN 101 AND 199";
        return db.queryRows(sql);
    }
    
    public ArrayList<HashMap> getAllSnackIDs() {
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodID BETWEEN 301 AND 399";
        return db.queryRows(sql);
    }
    
    public String getFoodName(int foodID) {
        String sql = "SELECT foodName FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap name = db.queryRow(sql);
        return String.valueOf(name.get("foodName"));
    }
    
    public String getPrice(int foodID) {
        String sql = "SELECT price FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap price = db.queryRow(sql);
        return String.valueOf(price.get("price"));
    }
    
    public int getOrdered(int foodID) {
        String sql = "SELECT ordered FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap ordered = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(ordered.get("ordered")));
    }
    
}

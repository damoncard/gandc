
package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBFood extends ConnectDB{

    public DBFood() {
        super();
    }
 
    public ArrayList<HashMap> getAllFoodIDs() {
        connect();
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodID BETWEEN 201 AND 299";
        ArrayList<HashMap> queries = db.queryRows(sql);
        disconnect();
        return queries;
    }
    
    public ArrayList<HashMap> getAllBevaragesIDs() {
        connect();
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodID BETWEEN 101 AND 199";
        ArrayList<HashMap> queries = db.queryRows(sql);
        disconnect();
        return queries;
    }
    
    public ArrayList<HashMap> getAllSnackIDs() {
        connect();
        String sql = "SELECT foodID FROM OOSD_FOODS WHERE foodID BETWEEN 301 AND 399";
        ArrayList<HashMap> queries = db.queryRows(sql);
        disconnect();
        return queries;
    }
    
    public String getFoodName(int foodID) {
        connect();
        String sql = "SELECT foodName FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap name = db.queryRow(sql);
        disconnect();
        return String.valueOf(name.get("foodName"));
    }
    
    public String getPrice(int foodID) {
        connect();
        String sql = "SELECT price FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap price = db.queryRow(sql);
        disconnect();
        return String.valueOf(price.get("price"));
    }
    
    public int getOrdered(int foodID) {
        connect();
        String sql = "SELECT ordered FROM OOSD_FOODS WHERE foodID = " + foodID;
        HashMap ordered = db.queryRow(sql);
        disconnect();
        return Integer.parseInt(String.valueOf(ordered.get("ordered")));
    }
    
}

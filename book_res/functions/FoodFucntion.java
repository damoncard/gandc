/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import java.util.ArrayList;
import java.util.Iterator;
import book_res.functions.utils.DBFood;
import java.util.HashMap;

/**
 *
 * @author Default141
 */
public class FoodFucntion {
    static DBFood foodlist = new DBFood();
    
    public ArrayList<HashMap> getFoodList() {
        return list(foodlist.getAllFoodIDs());
    }
    
    public ArrayList<HashMap> getBevarageList() {
        return list(foodlist.getAllBevaragesIDs());
    } 
    
    public ArrayList<HashMap> getSnackList() {
        return list(foodlist.getAllSnackIDs());
    }
    
    private ArrayList<HashMap> list(ArrayList<HashMap> listIDs){
        ArrayList<HashMap> foodList = new ArrayList<>();
        HashMap foodHash;
        for(HashMap foodID : listIDs){
            foodHash = new HashMap();
            int id = Integer.parseInt(String.valueOf(foodID.get("foodID")));
            foodHash.put("NAME", foodlist.getFoodName(id));
            foodHash.put("PRICE", foodlist.getPrice(id));
            foodList.add(foodHash);
        }
        return foodList;
    }

}

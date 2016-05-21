/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import java.util.ArrayList;
import book_res.functions.utils.DBFood;
import java.util.HashMap;

/**
 *
 * @author Default141
 */
public class FoodList {
    private DBFood foodlist;
    /*
    public static void main(String[]args) {
        FoodList f = new FoodList();
        System.out.println(f.getBevarageList());
    }
    */
    public FoodList() {
        foodlist = new DBFood();
        foodlist.connect();
    }
    
    public ArrayList<HashMap<String, String>> getFoodList() {
        return list(foodlist.getAllFoodIDs());
    }
    
    public ArrayList<HashMap<String, String>> getBevarageList() {
        return list(foodlist.getAllBevaragesIDs());
    } 
    
    public ArrayList<HashMap<String, String>> getSnackList() {
        return list(foodlist.getAllSnackIDs());
    }
    
    private ArrayList<HashMap<String, String>> list(ArrayList<HashMap> listIDs){
        
        ArrayList<HashMap<String, String>> foodList = new ArrayList<>();
        HashMap<String, String> foodHash;
        for(HashMap<String, String> foodID : listIDs){
            foodHash = new HashMap();
            int id = Integer.parseInt(String.valueOf(foodID.get("foodID")));
            foodHash.put("NAME", foodlist.getFoodName(id));
            foodHash.put("PRICE", foodlist.getPrice(id));
            foodList.add(foodHash);
        }
        
        return foodList;
    }
}

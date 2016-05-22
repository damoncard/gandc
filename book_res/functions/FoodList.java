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
    }
    // return all of the food ID.
    public ArrayList<HashMap<String, String>> getFoodList() {
        return list(foodlist.getAllFoodIDs());
    }
    // return all of the bevarageID.
    public ArrayList<HashMap<String, String>> getBevarageList() {
        return list(foodlist.getAllBevaragesIDs());
    } 
    // return all of snackID.
    public ArrayList<HashMap<String, String>> getSnackList() {
        return list(foodlist.getAllSnackIDs());
    }
    /**
    * return the food list from the list of food name and id.
    * <p>
    * @param ListIDs list of all food id.
    */
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

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
        foodlist.disconnect();
        return foodList;
    }
}

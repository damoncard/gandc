/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Default141
 */
public class FoodFunction {
     public void actionPerformed(ActionEvent e) {
            foodKindPerformed(1);
     }
     private ArrayList foodKindPerformed(int foodkind){
         FoodList food = new FoodList();
         if(foodkind == 1){
             return food.getFoodList();
         }
         if(foodkind == 2){
             return food.getBevarageList();
         }
         if(foodkind == 3){
             return food.getSnackList();
         }
         else
             return null;
     }
}

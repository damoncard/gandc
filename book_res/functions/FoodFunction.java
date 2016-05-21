/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import book_res.interfaces.ReserveFace;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

/**
 *
 * @author Default141
 */
public class FoodFunction {
     FoodList food = new FoodList();
     public void buttonPerformed(ButtonActionListener e) {
            ReserveFace reserveFace = new ReserveFace();
            foodPerformed(reserveFace.getMenuButtons()[0]);
            SnackPerformed(reserveFace.getMenuButtons()[1]);
            BevaragePerformed(reserveFace.getMenuButtons()[2]);
     }
     private ArrayList foodPerformed(JButton foodkind){
             return food.getFoodList();
     }
     private ArrayList SnackPerformed(JButton foodkind){
             return food.getSnackList();
     }
      private ArrayList BevaragePerformed(JButton foodkind){
             return food.getBevarageList();
     }
}

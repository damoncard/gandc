/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import book_res.interfaces.layout.FoodMenuButtons;
import book_res.interfaces.layout.SnackMenuButtons;
import book_res.interfaces.layout.BeveragesMenuButtons;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;

public class FoodFunction {

    FoodList food;
 
    public void setButtons(JButton b[], JTable[] t) {
        food = new FoodList();
        System.out.println(b[0]);
        System.out.println(t[0]);
//            setSnackButton(b[0], t[0]);
//            setFoodButton(b[1], t[0]);
//            setBeverageButton(b[2], t[1]);


    }

    private void setFoodButton(JButton b, JTable t) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FoodMenuButtons(food.getFoodList(), t);
            }
        });
    }
    
    private void setSnackButton(JButton b, JTable t) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SnackMenuButtons(food.getSnackList(), t);
            }
        });
    }
    
    private void setBeverageButton(JButton b, JTable t) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BeveragesMenuButtons(food.getBevarageList(), t);
            }
        });
    }

}



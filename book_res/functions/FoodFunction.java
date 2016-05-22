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
    
    /**
    * set the button for each table.
    */
    public void setButtons(JButton b[], JTable[] t) {
        food = new FoodList();
            setSnackButton(b[0], t[0]);
            setFoodButton(b[1], t[0]);
            setBeverageButton(b[2], t[1]);


    }
    /**
    *set food button.
    */
    private void setFoodButton(JButton b, JTable t) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FoodMenuButtons(food.getFoodList(), t);
            }
        });
    }
    /**
    * set button for snack food.
    */
    private void setSnackButton(JButton b, JTable t) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SnackMenuButtons(food.getSnackList(), t);
            }
        });
    }
    /**
    *set button for beverage food.
    */
    private void setBeverageButton(JButton b, JTable t) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BeveragesMenuButtons(food.getBevarageList(), t);
            }
        });
    }

}



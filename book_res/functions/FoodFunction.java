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

/**
 *
 * @author Default141
 */
public class FoodFunction {

    FoodList food;
 
    public void setButtons(JButton b[]) {
        food = new FoodList();
            setSnackButton(b[0]);
            setFoodButton(b[1]);
            setBeverageButton(b[2]);


    }

    private void setFoodButton(JButton b) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FoodMenuButtons(food.getFoodList());
            }
        });
    }
    
    private void setSnackButton(JButton b) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SnackMenuButtons(food.getSnackList());
            }
        });
    }
    
    private void setBeverageButton(JButton b) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BeveragesMenuButtons(food.getBevarageList());
            }
        });
    }

}



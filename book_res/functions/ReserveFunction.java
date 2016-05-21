/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author Default141
 */
public class ReserveFunction {
    
    public void reserveFunction(JButton btnDone, JTable[] t) {
       
        btnDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(t);
                System.out.println(t[0].getRowCount());
            } 
        });
    } 
    
}

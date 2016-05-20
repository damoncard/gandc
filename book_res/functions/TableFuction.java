/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import book_res.interfaces.TableFace;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import book_res.functions.utils.DBCheckTable;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Default141
 */
public class TableFuction {

    static DBCheckTable checkTable;
    static TableFace tableface;
    static String time;
    static String date;
    static int tableId;
    static String message1 = "Avalible Table Number: ";
    static String message2 = "Not Avalible";
    static ArrayList<JButton> chairButtons;

    public TableFuction() {
        checkTable = new DBCheckTable();
        tableface = new TableFace();
        chairButtons = tableface.getChairButtons();

        checkTable();
        checkSeat();
    }

    private void checkTable() {
        (tableface.getAddButton()).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //reserveTablePerformed(e);
            }
        });

        tableface.setVisible(true);
    }

    private void checkSeat() {
        chairButtons.get(0).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(0).getText()))));
        chairButtons.get(1).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(1).getText()))));
        chairButtons.get(2).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(2).getText()))));
        chairButtons.get(3).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(3).getText()))));
    }

    private void checkPerformed(int seats) {
        tableId = checkTable.checkAvailable(String.valueOf(tableface.getDate().getValue()), String.valueOf(tableface.getTime().getValue()), seats);

        if (tableId != -1) {
            tableface.getMessage().setText(message1 + tableId);
            tableface.getMessage().setForeground(new Color(0, 204, 0));
        } else {
            tableface.getMessage().setText(message2);
            tableface.getMessage().setForeground(new Color(255, 0, 0));
            this.tableId = tableId;
        }
    }
    
    class ChairButtonAction implements ActionListener {
        int seats;
        
        public ChairButtonAction(int seats) {
            this.seats = seats;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            checkPerformed(seats);
        }
    }

    /*private static void reserveTablePerformed(ActionEvent e) {
     DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     time = String.valueOf(tableface.getTime().getValue());
     date = dateFormat.format(tableface.getDate().getValue());
     tableId = checkTable.checkAvailable("2016-05-04", "13:00", 4);
     //Calendar cal = new GregorianCalendar();
     //cal.set(Calendar.ERA, GregorianCalendar.AD);
     //cal.setTime(date);
     //date.add(java.util.Calendar.YEAR, -543);
     // Call method in model
     //System.out.println(time +"       "+date);
     if(tableId != -1){
     tableface.getMessage().setText(message1+ tableId);
     //tableface.getMessage().setForeground(new Color(0, 204, 0));
     }else{
     tableface.getMessage().setText(message2); 
     //tableface.getMessage().setForeground(new Color(255, 0, 0));
     }
     }*/
    public static void main(String[] args) {
        TableFuction table = new TableFuction();
        //table.checkTable();
    }

    
}

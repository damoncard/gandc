/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.functions;

import book_res.interfaces.TableFace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import book_res.functions.utils.DBCheckTable;
import java.awt.Color;
import java.util.ArrayList;
import book_res.interfaces.ReserveFace;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author Default141
 */
public class TableFuction extends ReserveFace {

    DBCheckTable checkTable;
    TableFace tableface;
    static String time, date;
    static int tableId;
    String message1 = "Avalible Table Number: ";
    String message2 = "Not Avalible";
    ArrayList<JButton> chairButtons;

    public TableFuction() {

        checkTable = new DBCheckTable();
        tableface = new TableFace();
        tableface.setVisible(true);

        chairButtons = tableface.getChairButtons();
        checkTable();
        checkSeat();
    }

    private void checkTable() {
        (tableface.getAddButton()).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTableNo.setText(tableId + "");
                lblReserve.setText(date + " " + time);
                //ReserveFace.init();
                tableface.dispose();
            } 
        });
    }

    private void checkSeat() {  
        chairButtons.get(0).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(0).getText()))));
        chairButtons.get(1).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(1).getText()))));
        chairButtons.get(2).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(2).getText()))));
        chairButtons.get(3).addActionListener(new ChairButtonAction(Integer.parseInt(String.valueOf(chairButtons.get(3).getText()))));
    }

    private static Calendar dateTimeReserve;

    class ChairButtonAction implements ActionListener {

        int seats;

        public ChairButtonAction(int seats) {
            this.seats = seats;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            checkTable.connect();

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dateFormat.format(tableface.getDate().getValue());

            DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            time = timeFormat.format(tableface.getTime().getValue());

            tableId = checkTable.checkAvailable("" + date, time, seats);

            if (tableId != -1) {
                tableface.getMessage().setText(message1 + tableId);
                tableface.getMessage().setForeground(new Color(0, 204, 0));
            } else {
                tableface.getMessage().setText(message2);
                tableface.getMessage().setForeground(new Color(255, 0, 0));
            }
        }
    }

}

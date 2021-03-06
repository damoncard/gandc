package book_res.functions;

import book_res.interfaces.ReserveFace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddFunction {
    
    public void addMenu(JButton add, double price, JTable t) {
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               addDataToTable(add, price, t);
            } 
        });
    } 
    /**
    * Add element to the table
    * <p>
    * @param b  jbutton that use in table
    * @param price of element in table 
    * @param tbl Menu 
    */
    private void addDataToTable(JButton b, double price, JTable tblMenu) {
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        boolean found = false;
        for (int i = 0; i < model.getRowCount(); i++) {
            if (b.getText().equals(model.getValueAt(i, 1))) {
                model.setValueAt(Integer.parseInt(String.valueOf((model.getValueAt(i, 3)))) + 1, i, 3);
                model.setValueAt(price * Integer.parseInt(String.valueOf(model.getValueAt(i, 3))) + "", i, 4);
                found = true;
                break;
            }
        }

        if (!found) {
            model.addRow(new Object[0]);
            tblMenu.setValueAt(model.getRowCount(), model.getRowCount() - 1, 0);
            tblMenu.setValueAt(b.getText(), model.getRowCount() - 1, 1);
            tblMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 2);
            tblMenu.setValueAt(1, model.getRowCount() - 1, 3);
            tblMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 4);
        }
    }

    /**
    * Compute the price from the data of element.
    * <p>
    * @param label Jlabel that use to show the price.
    * @param price price from element.
    * @param sign  math operator - or +
    * @see price with comma
    */
    protected void computePrice(JLabel label, double price, String sign) {
        double totalPrice = 0;

        if (label.getText().equals("")) {
            totalPrice = price;
        } else {
            totalPrice = Integer.parseInt(Comma.removeComma((String.valueOf(label.getText()))));
            if (sign.equals("+")) {
                totalPrice += price;
            }
            else {
                totalPrice -= price;
	   }
          }

            if (totalPrice == 0) {
            label.setText("");
            } else {
                label.setText(Comma.putComma(""+totalPrice));
            }
        }
    }


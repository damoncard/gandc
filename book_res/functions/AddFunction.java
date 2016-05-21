package book_res.functions;


import static book_res.functions.TableFuction.tableId;
import book_res.interfaces.ReserveFace;
import static book_res.interfaces.ReserveFace.lblTableNo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddFunction {
    
    private void AddMenu(JButton add) {
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            } 
        });
    }
 

    private void addMenu(JButton btn, int price, JTable tblMenu) {
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            if (btn.getText().equals(model.getValueAt(i, 1))) {
                model.setValueAt(Integer.parseInt(String.valueOf((model.getValueAt(i, 3)))) + 1, i, 3);
                model.setValueAt(price * Integer.parseInt(String.valueOf(model.getValueAt(i, 3))) + "", i, 4);
                break;
            }
        }

        if (model.getRowCount() == 0/* || i >= model.getRowCount()*/) {
            model.addRow(new Object[0]);
            tblMenu.setValueAt(model.getRowCount(), model.getRowCount() - 1, 0);
            tblMenu.setValueAt(btn.getText(), model.getRowCount() - 1, 1);
            tblMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 2);
            tblMenu.setValueAt(1, model.getRowCount() - 1, 3);
            tblMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 4);
        }
        
        //computePrice(lblTotalFoodPrice, price, "+");
        //computePrice(lblTotalPrice, price, "+");
    }

    protected void computePrice(JLabel label, double price, String sign) {
        double totalPrice = 0;

        if (label.getText().equals("")) {
            totalPrice = price;
        } else {
            totalPrice = Integer.parseInt(String.valueOf(label.getText()));
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
                label.setText(""+totalPrice);
            }
        }
    }


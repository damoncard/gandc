package book_res.functions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddFunction {

    private void addMenu(JButton btn, int price, JTable tblMenu) {
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            if (btn.getText().equals(model.getValueAt(i, 1))) {
                model.setValueAt(Integer.parseInt(String.valueOf((model.getValueAt(i, 3)))) + 1, i, 3);
                model.setValueAt(putComma(price * Integer.parseInt(removeComma(String.valueOf(model.getValueAt(i, 3)))) + ""), i, 4);
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
/*
        computePrice(lblTotalFoodPrice, price, "+");
        computePrice(lblTotalPrice, price, "+");*/
    }
/*
    protected void computePrice(JLabel label, double price, String sign) {
        double totalPrice = 0;

        if (label.getText().equals("")) {
            totalPrice = price;
        } else {
            totalPrice = removeComma(String.valueOf(label.getText()))
            if (sign.equals("+")) {
                totalPrice += price;
                else {
				totalPrice -= price;
			}
            }

            if (totalPrice == 0) {
                label.setText("");
            } else {
                label.setText(putComma(totalPrice));
            }
        }
    }*/
    
    protected String removeComma(String s) {
        if (!s.equals("")) {
            int num = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(s);
                num = number.intValue();
            } catch (ParseException e) {
            }
            return num + "";
        } return "";
    }

    protected String putComma(String s) {
        String res = "";
        System.out.println(s + " " + s.length());
        if (s.length() <= 3) {
            return s + ".00-";
        } else {
            int cnt = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                cnt++;
                res = s.charAt(i) + res;
                if (cnt == 3 && i > 0) {
                    res = "," + res;
                    cnt = 0;
                }
            }
            return res + ".00-";
        }
    }

}

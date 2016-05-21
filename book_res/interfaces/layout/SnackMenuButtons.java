package book_res.interfaces.layout;

import book_res.interfaces.ReserveFace;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

public class SnackMenuButtons extends MenuTemplate {

	public SnackMenuButtons(ArrayList<HashMap<String,String>> buttons, JTable t) {
        super();
		for (HashMap<String, String> b : buttons) {
			createButton(b.get("NAME"), Double.parseDouble(b.get("PRICE")), t);
		}
		setPanel();
	}
		
	@Override
	protected void createButton(String n, double price, JTable t) {
		JButton b = new JButton();
		b.setText(n);
		b.setPreferredSize(new Dimension(170, 50));
		af.addMenu(b, price, t);
		allMenus.add(b);
	}

	@Override
	protected void setPanel() {
		GroupLayout snackLayout = new GroupLayout(ReserveFace.pnlMenuButton);
		ReserveFace.pnlMenuButton.setLayout(snackLayout);
		snackLayout.setHorizontalGroup(
			snackLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(snackLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(snackLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(snackLayout.createSequentialGroup()
										.addComponent(allMenus.get(0), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(allMenus.get(1), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(snackLayout.createSequentialGroup()
										.addComponent(allMenus.get(2), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(allMenus.get(3), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(snackLayout.createSequentialGroup()
										.addComponent(allMenus.get(4), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(allMenus.get(5), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
		snackLayout.setVerticalGroup(
			snackLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(snackLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(snackLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(allMenus.get(0), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(allMenus.get(1), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(snackLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(allMenus.get(2), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(allMenus.get(3), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(snackLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(allMenus.get(4), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(allMenus.get(5), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
	}
		
	/*protected void addMenu(JButton b, double price) {
		DefaultTableModel model = (DefaultTableModel) tblFoodMenu.getModel();

		for (int i = 0; i < model.getRowCount(); i++) {
			if (b.getText().equals(model.getValueAt(i, 1))) {
				model.setValueAt(Integer.parseInt(String.valueOf((model.getValueAt(i, 3)))) + 1, i, 3);
				model.setValueAt(putComma(price * removeComma(String.valueOf(model.getValueAt(i, 3)))), i, 4);
				break;
			}
		}

		if (model.getRowCount() == 0 || i >= model.getRowCount()) {
			model.addRow(new Object[0]);
			tblFoodMenu.setValueAt(model.getRowCount(), model.getRowCount() - 1, 0);
			tblFoodMenu.setValueAt(btn.getText(), model.getRowCount() - 1, 1);
			tblFoodMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 2);
			tblFoodMenu.setValueAt(1, model.getRowCount() - 1, 3);
			tblFoodMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 4);
		}

		computePrice(lblTotalFoodPrice, price, "+");
		computePrice(lblTotalPrice, price, "+");
	}

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

	protected int removeComma(String s) {
		int num = 0;
		try {
			NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
			Number number = format.parse(s);
			num = number.intValue();
		} catch (ParseException e) {
		}
		return num;
	}

	protected String putComma(double num) {
		String s = String.valueOf(num);
		String res = "";
		if (s.length() <= 5) {
			return s + "0.-";
		} else {
			int cnt = 0;
			for (int i = s.length() - 3; i >= 0; i--) {
				cnt++;
				res = s.charAt(i) + res;
				if (cnt == 3 && i > 0) {
					res = "," + res;
					cnt = 0;
				}
			}
			return res + ".00.-";
		}
	}*/
}
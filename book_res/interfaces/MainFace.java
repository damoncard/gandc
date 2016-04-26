package book_res.interfaces;

import java.sql.Timestamp;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class MainFace extends SimpleFace {

	private static Timestamp dateTimeReserve, 

	// Snacks menu button
	private JButton btnFriedFishPasteBalls, btnCharcoalBoiledPorkNeck, btnFriedChicken,
			btnFriedPorkRind, btnCrispyWonton, btnSteamedSpringRoll;

	// Foods menu button
	private JButton btnRice, btnCasseroledPrawns, btnSteamedDuck, btnFriedFishToppedWithChilliSauce,
			btnSpicyVermicelliSalad, btnChickenGreenCurry, btnClearSoup, btnMincedPorkOmelet,
			btnFriedCrabinYellowCurry, btnDeepFriendShrimpCakes, btnTomYumKung;

	// Beverages menu button
	private JButton btnWater, btnPepsi, btnSprite, btnFanta, btnSoda, btnGreenTea;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton btnBacklog;
	private JButton btnBilling;
	private JButton btnPopularFood;
	private JButton btnReserve;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JLabel lblClock;
	private static JLabel lblUser;
	private JPanel pnlContent;
	private JPanel pnlMenuBar;
	// End of variables declaration//GEN-END:variables

	// Variable of reserve's part
	private JButton btnBeverages, btnCheck, btnClear, btnDone, btnFoods, btnSnacks;
	private JLabel jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel8,
			lblDate, lblTime, lblTotalFoodPrice, lblTotalBeveragePrice, lblTotalPrice;
	private JPanel jPanel1, jPanel2, jPanel4, jPanel5, jPanel6, jPanel7,
			pnlMenuButton, pnlTableMenu;
	private JScrollPane jScrollPane1, jScrollPane2, jScrollPane3;
	private static JLabel lblReserve, lblTableNo;
	private JTable tblFoodMenu, tblBeverageMenu;
	private JTextField txtName;

	// Variable of billing's part
	private JButton btn0, btn00, btn000,
			btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
			btnClearBill, btnBack, btnCE, btnDis10, btnDis20,
			btnBillingDone, btnEnter, btnCheckTable;
	private JLabel jLabel7, jLabel9, jLabel10, jLabel14, jLabel15, jLabel16,
			lblCash, lblChange, lblCustomerName, lblTable, lblTotal, lbldateTime;
	private JPanel jPanel8, jPanel9, jPanel10, jPanel11, jPanel12, jPanel13, jPanel14, jPanel15, jPanel16;
	private JScrollPane jScrollPane4, jScrollPane5;
	private JSpinner spnDate;
	private JTable tblBilling, tblgetTables;

	// Variable of backlog's part
	private JButton btnADay, btnAMonth, btnCheckBacklog;
	private JPanel jPanel17, jPanel18, jPanel19;
	private JScrollPane jScrollPane6;
	private JSpinner spnBacklog;
	private JTable tblBacklog;
	
	private JScrollPane jScrollPane7;
	private JTable tblPopular;
	private JButton btnCheckPop;

	private Timer timer;
	private MenuButton mb;

	public MainFrame(String name) {
		super("Restaurant");
		lblUser.setText(name);
		
		mb = new MenuButton();
		mb.createMenuButton();

		initComponents();
		initReserve();
		setTime();
	}

	class MenuButton {

		private void createMenuButton() {
			// Waiting for structs
		}

		private void menuTemplate(Jbutton b, String des, double price) {
			b.setText(des);
			b.setPreferredSize(new Dimension(170, 50));
			b.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					addMenu(b, price);
				}
			});
		}

		private void addMenu(JButton b, double price) {
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

		private void computePrice(JLabel label, double price, String sign) {
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

		private int removeComma(String s) {
			int num = 0;
			try {
				NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
				Number number = format.parse(s);
				num = number.intValue();
			} catch (ParseException e) {
			}
			return num;
		}

		private String putComma(double num) {
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
		}
	}

	private void addFoodsButton() {
		javax.swing.GroupLayout pnlFoodsLayout = new javax.swing.GroupLayout(pnlMenuButton);
		pnlMenuButton.setLayout(pnlFoodsLayout);
		pnlFoodsLayout.setHorizontalGroup(
			pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlFoodsLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(pnlFoodsLayout.createSequentialGroup()
									.addComponent(btnRice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnCasseroledPrawns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlFoodsLayout.createSequentialGroup()
									.addComponent(btnSteamedDuck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnFriedFishToppedWithChilliSauce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlFoodsLayout.createSequentialGroup()
									.addComponent(btnSpicyVermicelliSalad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnChickenGreenCurry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlFoodsLayout.createSequentialGroup()
									.addComponent(btnClearSoup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnMincedPorkOmelet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlFoodsLayout.createSequentialGroup()
									.addComponent(btnFriedCrabinYellowCurry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnDeepFriendShrimpCakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlFoodsLayout.createSequentialGroup()
									.addComponent(btnTomYumKung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					)
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
		pnlFoodsLayout.setVerticalGroup(
			pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlFoodsLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(btnRice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCasseroledPrawns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnSteamedDuck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnFriedFishToppedWithChilliSauce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnSpicyVermicelliSalad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnChickenGreenCurry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnClearSoup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnMincedPorkOmelet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnFriedCrabinYellowCurry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnDeepFriendShrimpCakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnTomYumKung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18))
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
	}

	private void addSnacksButton() {
		javax.swing.GroupLayout pnlSnacksLayout = new javax.swing.GroupLayout(pnlMenuButton);
		pnlMenuButton.setLayout(pnlSnacksLayout);
		pnlSnacksLayout.setHorizontalGroup(
			pnlSnacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlSnacksLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pnlSnacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlSnacksLayout.createSequentialGroup()
										.addComponent(btnFriedFishPasteBalls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnCharcoalBoiledPorkNeck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlSnacksLayout.createSequentialGroup()
										.addComponent(btnFriedChicken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnFriedPorkRind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlSnacksLayout.createSequentialGroup()
										.addComponent(btnCrispyWonton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnSteamedSpringRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
		pnlSnacksLayout.setVerticalGroup(
			pnlSnacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlSnacksLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlSnacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(btnFriedFishPasteBalls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCharcoalBoiledPorkNeck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlSnacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnFriedChicken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnFriedPorkRind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlSnacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnCrispyWonton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnSteamedSpringRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
	}

	private void addBevaragesButton() {
		javax.swing.GroupLayout pnlBevaragesLayout = new javax.swing.GroupLayout(pnlMenuButton);
		pnlMenuButton.setLayout(pnlBevaragesLayout);
		pnlBevaragesLayout.setHorizontalGroup(
			pnlBevaragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlBevaragesLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlBevaragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(pnlBevaragesLayout.createSequentialGroup()
									.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlBevaragesLayout.createSequentialGroup()
									.addComponent(btnSprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlBevaragesLayout.createSequentialGroup()
									.addComponent(btnSoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(btnGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
		pnlBevaragesLayout.setVerticalGroup(
			pnlBevaragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlBevaragesLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlBevaragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlBevaragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnSprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(pnlBevaragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(btnSoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(btnGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
	}

	private void initComponents() {
		pnlMenuBar = new JPanel();
		btnReserve = new JButton();
		btnBilling = new JButton();
		btnBacklog = new JButton();
		btnPopularFood = new JButton();
		pnlContent = new JPanel();
		jPanel3 = new JPanel();
		jLabel1 = new JLabel();
		lblClock = new JLabel();
		lblUser = new JLabel();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				formWindowClosing(evt);
			}
		});

		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		pnlMenuBar.setPreferredSize(new java.awt.Dimension(800, 70));

		btnReserve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		btnReserve.setText("RESERVE");
		btnReserve.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnReserveMouseClicked(evt);
			}
		});

		btnBilling.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		btnBilling.setText("BILLING");
		btnBilling.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btnBilling.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnBillingMouseClicked(evt);
			}
		});

		btnBacklog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		btnBacklog.setText("BACKLOG");
		btnBacklog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btnBacklog.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnBacklogMouseClicked(evt);
			}
		});

		btnPopularFood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		btnPopularFood.setText("POPULAR FOOD");
		btnPopularFood.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btnPopularFood.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnPopularFoodMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout pnlMenuBarLayout = new javax.swing.GroupLayout(pnlMenuBar);
		pnlMenuBar.setLayout(pnlMenuBarLayout);
		pnlMenuBarLayout.setHorizontalGroup(
			pnlMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlMenuBarLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnBacklog, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnPopularFood)
				.addContainerGap(342, Short.MAX_VALUE))
		);
		pnlMenuBarLayout.setVerticalGroup(
			pnlMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlMenuBarLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(pnlMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(btnReserve, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
					.addComponent(btnBilling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnPopularFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnBacklog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);

		getContentPane().add(pnlMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 855, -1));

		pnlContent.setPreferredSize(new java.awt.Dimension(0, 500));

		javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
		pnlContent.setLayout(pnlContentLayout);
		pnlContentLayout.setHorizontalGroup(
			pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGap(0, 855, Short.MAX_VALUE)
		);
		pnlContentLayout.setVerticalGroup(
			pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
			.addGap(0, 525, Short.MAX_VALUE)
		);

		getContentPane().add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 855, 525));

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel1.setText("Chew ID : ");

		lblClock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblClock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
				.addContainerGap(429, Short.MAX_VALUE)
				.addComponent(jLabel1)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(31, 31, 31))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
			.addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, -1, -1));
		pack();
	}

	private void initReserve() {
		pnlTableMenu = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		tblBeverageMenu = new javax.swing.JTable();
		jScrollPane3 = new javax.swing.JScrollPane();
		tblFoodMenu = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		lblTotalFoodPrice = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		lblTotalBeveragePrice = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		btnCheck = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		txtName = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		lblDate = new javax.swing.JLabel();
		lblTime = new javax.swing.JLabel();
		lblTableNo = new javax.swing.JLabel();
		lblReserve = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		btnSnacks = new javax.swing.JButton();
		btnFoods = new javax.swing.JButton();
		btnBeverages = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		pnlMenuButton = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		lblTotalPrice = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		btnClear = new javax.swing.JButton();
		btnDone = new javax.swing.JButton();

		pnlTableMenu.setBackground(new java.awt.Color(204, 204, 204));
		pnlTableMenu.setPreferredSize(new java.awt.Dimension(415, 460));

		tblBeverageMenu.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][]{},
				new String[]{
					"No.", "Beverages", "Price", "Qty.", "Amount"
				}
		) {
			Class[] types = new Class[]{
				java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
			};
			boolean[] canEdit = new boolean[]{
				false, false, false, true, false
			};

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblBeverageMenu.getColumnModel().getColumn(0).setPreferredWidth(15);
		tblBeverageMenu.getColumnModel().getColumn(1).setPreferredWidth(210);
		tblBeverageMenu.getColumnModel().getColumn(2).setPreferredWidth(50);
		tblBeverageMenu.getColumnModel().getColumn(3).setPreferredWidth(15);
		tblBeverageMenu.getColumnModel().getColumn(4).setPreferredWidth(60);
		((javax.swing.table.DefaultTableCellRenderer) tblBeverageMenu.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

		tblBeverageMenu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int row = tblBeverageMenu.getSelectedRow();
					delectSelectedRow(tblBeverageMenu, lblTotalBeveragePrice, row);
				}
			}
		});
		jScrollPane2.setViewportView(tblBeverageMenu);

		tblFoodMenu.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][]{},
				new String[]{
					"No.", "Foods", "Price", "Qty.", "Amount"
				}
		) {
			Class[] types = new Class[]{
				java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
			};
			boolean[] canEdit = new boolean[]{
				false, false, false, true, false
			};

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblFoodMenu.getColumnModel().getColumn(0).setPreferredWidth(15);
		tblFoodMenu.getColumnModel().getColumn(1).setPreferredWidth(210);
		tblFoodMenu.getColumnModel().getColumn(2).setPreferredWidth(50);
		tblFoodMenu.getColumnModel().getColumn(3).setPreferredWidth(15);
		tblFoodMenu.getColumnModel().getColumn(4).setPreferredWidth(60);
		((javax.swing.table.DefaultTableCellRenderer) tblFoodMenu.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);
		tblFoodMenu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int row = tblFoodMenu.getSelectedRow();
					delectSelectedRow(tblFoodMenu, lblTotalFoodPrice, row);
				}
			}
		});

		jScrollPane3.setViewportView(tblFoodMenu);

		javax.swing.table.DefaultTableCellRenderer leftRenderer = new javax.swing.table.DefaultTableCellRenderer();
		leftRenderer.setHorizontalAlignment(javax.swing.JLabel.LEFT);
		for (int i = 0; i <= 4; i++) {
			tblFoodMenu.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
			tblBeverageMenu.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
		}

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));

		jLabel5.setText("Total");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(lblTotalFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(lblTotalFoodPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));

		jLabel6.setText("Total");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(lblTotalBeveragePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
		);
		jPanel5Layout.setVerticalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(lblTotalBeveragePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		javax.swing.GroupLayout pnlTableMenuLayout = new javax.swing.GroupLayout(pnlTableMenu);
		pnlTableMenu.setLayout(pnlTableMenuLayout);
		pnlTableMenuLayout.setHorizontalGroup(
				pnlTableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
				.addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		pnlTableMenuLayout.setVerticalGroup(
				pnlTableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlTableMenuLayout.createSequentialGroup()
						.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		);

		jPanel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		btnCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btnCheck.setText("Check Tables");
		btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				new CheckAvailable().setVisible(true);
			}
		});

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel2.setText("Name");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("Table No.  :");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Reserve	:");

		lblTableNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		lblReserve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addGap(10, 10, 10)
										.addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3)
												.addComponent(jLabel4))
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel6Layout.createSequentialGroup()
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
												.addGroup(jPanel6Layout.createSequentialGroup()
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(lblReserve, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
																.addComponent(lblTableNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGap(0, 0, Short.MAX_VALUE)))
										.addGap(20, 20, 20))))
		);
		jPanel6Layout.setVerticalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblTableNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(lblDate)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(lblTime)))
										.addGap(3, 3, 3))
								.addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addContainerGap())
		);

		btnSnacks.setText("Snacks");
		btnSnacks.setPreferredSize(new java.awt.Dimension(90, 25));
		btnSnacks.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnlMenuButton.removeAll();
				addSnacksButton();
			}
		});

		btnFoods.setText("Foods");
		btnFoods.setPreferredSize(new java.awt.Dimension(90, 25));
		btnFoods.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnlMenuButton.removeAll();
				addFoodsButton();
			}
		});

		btnBeverages.setText("Beverages");
		btnBeverages.setPreferredSize(new java.awt.Dimension(90, 25));
		btnBeverages.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnlMenuButton.removeAll();
				addBevaragesButton();
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						//.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGap(5, 5, 5)
						.addComponent(btnFoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(5, 5, 5)
						//.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(btnBeverages)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnSnacks, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
								.addComponent(btnFoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnBeverages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
		);

		jScrollPane1.setBorder(null);

		javax.swing.GroupLayout pnlMenuButtonLayout = new javax.swing.GroupLayout(pnlMenuButton);
		pnlMenuButton.setLayout(pnlMenuButtonLayout);
		pnlMenuButtonLayout.setHorizontalGroup(
				pnlMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
		);
		pnlMenuButtonLayout.setVerticalGroup(
				pnlMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
		);

		jScrollPane1.setViewportView(pnlMenuButton);

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
		jLabel8.setText("TOTAL");

		lblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		lblTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		lblTotalPrice.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addContainerGap(262, Short.MAX_VALUE)
						.addComponent(jLabel8)
						.addGap(18, 18, 18)
						.addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
		);
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
				.addComponent(lblTotalPrice)
		);

		btnClear.setBackground(new java.awt.Color(255, 0, 0));
		btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		btnClear.setText("CLEAR");
		btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				resetToDefault();
			}
		});

		btnDone.setBackground(new java.awt.Color(51, 204, 0));
		btnDone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		btnDone.setText("DONE");
		btnDone.setPreferredSize(new java.awt.Dimension(85, 31));
		btnDone.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (lblTableNo.getText().equals("") || lblReserve.getText().equals("")) {
					javax.swing.JOptionPane.showMessageDialog(null, "Please select table No. and time reserve");
				} else if (txtName.getText().equals("")) {
					javax.swing.JOptionPane.showMessageDialog(null, "Please input customer's name");
				} else if (tblFoodMenu.getRowCount() == 0 && tblBeverageMenu.getRowCount() == 0) {
					javax.swing.JOptionPane.showMessageDialog(null, "Please select orders");
				} else {
					customerId = queue.getCustomerId(txtName.getText());
					setOrders(tblFoodMenu.getRowCount(), tblFoodMenu);
					setOrders(tblBeverageMenu.getRowCount(), tblBeverageMenu);
					queue.updateStatusTable(tableId);
					resetToDefault();
					javax.swing.JOptionPane.showMessageDialog(null, "Successfully");
				}
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(
				jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
						.addContainerGap(58, Short.MAX_VALUE)
						.addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(10, 10, 10)
						.addComponent(btnClear)
						.addContainerGap())
		);
		jPanel7Layout.setVerticalGroup(
				jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(btnDone, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
				.addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
		pnlContent.setLayout(pnlContentLayout);
		pnlContentLayout.setHorizontalGroup(
				pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlContentLayout.createSequentialGroup()
						.addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(pnlTableMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
										.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
										.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())))
		);
		pnlContentLayout.setVerticalGroup(
				pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(pnlContentLayout.createSequentialGroup()
						.addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
										.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(5, 5, 5)
										.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane1))
								.addGroup(pnlContentLayout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pnlTableMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(13, 13, 13))
		);
	}

	private void setTime() {
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timeTickActionPerformed(e);
			}
		});
		timer.start();
	}

	private void timeTickActionPerformed(ActionEvent e) {
		DateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy   HH:mm:ss");
		Calendar currentTime = new GregorianCalendar();
		currentTime.add(Calendar.YEAR, -543);
		main.lblClock.setText(timeFormat.format(currentTime.getTime()));
	}

}

/*
	javax.swing.JLabel snackPop, foodPop;
	private void addPopularFood() {

		java.util.ArrayList<java.util.HashMap> snacks = queue.getPopularSnacks();
		java.util.ArrayList<java.util.HashMap> foods = queue.getPopularFoods();
		snackPop = new javax.swing.JLabel("=====Snacks Popular=====");
		foodPop = new javax.swing.JLabel("=====Foods Popular=====");
		
		System.out.println(snackButtons.get(snacks.get(0).get("foodName")));
		System.out.println(snackButtons.get(snacks.get(1).get("foodName")));
		System.out.println(foodButtons.get(foods.get(0).get("foodName")));
		System.out.println(foodButtons.get(foods.get(1).get("foodName")));
		System.out.println(foodButtons.get(foods.get(2).get("foodName")));
		System.out.println(foodButtons.get(foods.get(3).get("foodName")));
		

		javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnlMenuButton);
		pnlMenuButton.setLayout(pnlLayout);
		pnlLayout.setHorizontalGroup(
				pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlLayout.createSequentialGroup()
										.addComponent(snackPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlLayout.createSequentialGroup()
										.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlLayout.createSequentialGroup()
										.addComponent(foodPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlLayout.createSequentialGroup()
										.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlLayout.createSequentialGroup()
										.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlLayout.setVerticalGroup(
				pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(snackPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(foodPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
	}
*/
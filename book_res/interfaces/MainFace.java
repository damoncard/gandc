package book_res.interfaces;

import book_res.interfaces.layout.*;
import java.sql.Timestamp;
import java.awt.Dimension;
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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MainFace extends SimpleFace {

	private static Timestamp dateTimeReserve; 

	// Snacks menu button
	private JButton btnFriedFishPasteBalls, btnCharcoalBoiledPorkNeck, btnFriedChicken,
			btnFriedPorkRind, btnCrispyWonton, btnSteamedSpringRoll;

	// Foods menu button
	private JButton btnRice, btnCasseroledPrawns, btnSteamedDuck, btnFriedFishToppedWithChilliSauce,
			btnSpicyVermicelliSalad, btnChickenGreenCurry, btnClearSoup, btnMincedPorkOmelet,
			btnFriedCrabinYellowCurry, btnDeepFriendShrimpCakes, btnTomYumKung;

	// Beverages menu button
	private JButton btnWater, btnPepsi, btnSprite, btnFanta, btnSoda, btnGreenTea;

	// Variables declaration 
	private JButton backlogButton;
	private JButton billingButton;
	private JButton popularButton;
	private JButton reserveButton;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JLabel lblClock;
	private static JLabel lblUser;
	private JPanel contentPane;
	private JPanel menuTab;

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
			billingButtonDone, btnEnter, btnCheckTable;
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

	public MainFace(String name) {
		super("Restaurant", WindowConstants.EXIT_ON_CLOSE);
		lblUser.setText(name);

		initComponents();
		initReserve();
		setTime();
	}

	public JPanel getMenuPane() {
		return pnlMenuButton;

	class newTabLayout {

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

			GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
			jPanel2.setLayout(jPanel2Layout);
			jPanel2Layout.setHorizontalGroup(
					jPanel2Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jLabel5)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(lblTotalFoodPrice, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
			);
			jPanel2Layout.setVerticalGroup(
					jPanel2Layout.createParallelGroup(Alignment.LEADING)
					.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblTotalFoodPrice, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);

			jPanel5.setBackground(new java.awt.Color(255, 255, 255));

			jLabel6.setText("Total");

			GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
			jPanel5.setLayout(jPanel5Layout);
			jPanel5Layout.setHorizontalGroup(
					jPanel5Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jLabel6)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(lblTotalBeveragePrice, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
			);
			jPanel5Layout.setVerticalGroup(
					jPanel5Layout.createParallelGroup(Alignment.LEADING)
					.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblTotalBeveragePrice, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);

			GroupLayout pnlTableMenuLayout = new GroupLayout(pnlTableMenu);
			pnlTableMenu.setLayout(pnlTableMenuLayout);
			pnlTableMenuLayout.setHorizontalGroup(
					pnlTableMenuLayout.createParallelGroup(Alignment.TRAILING)
					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
					.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
					.addComponent(jPanel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			pnlTableMenuLayout.setVerticalGroup(
					pnlTableMenuLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(pnlTableMenuLayout.createSequentialGroup()
							.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			);

			jPanel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

			btnCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
			btnCheck.setText("Check Tables");
			btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					new TableFace().setVisible(true);
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

			GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
			jPanel6.setLayout(jPanel6Layout);
			jPanel6Layout.setHorizontalGroup(
					jPanel6Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(jPanel6Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
									.addGroup(jPanel6Layout.createSequentialGroup()
											.addGap(10, 10, 10)
											.addComponent(jLabel2)
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
											.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(jPanel6Layout.createSequentialGroup()
											.addComponent(btnCheck, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
											.addGap(20, 20, 20)
											.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
													.addComponent(jLabel3)
													.addComponent(jLabel4))
											.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
													.addGroup(jPanel6Layout.createSequentialGroup()
															.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING, false)
																	.addComponent(lblDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																	.addComponent(lblTime, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
													.addGroup(jPanel6Layout.createSequentialGroup()
															.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
															.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING, false)
																	.addComponent(lblReserve, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
																	.addComponent(lblTableNo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
															.addGap(0, 0, Short.MAX_VALUE)))
											.addGap(20, 20, 20))))
			);
			jPanel6Layout.setVerticalGroup(
					jPanel6Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(jPanel6Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
									.addGroup(jPanel6Layout.createSequentialGroup()
											.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
													.addComponent(lblTableNo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
															.addComponent(jLabel3)
															.addComponent(lblDate)))
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
											.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
													.addComponent(lblReserve, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
															.addComponent(jLabel4)
															.addComponent(lblTime)))
											.addGap(3, 3, 3))
									.addComponent(btnCheck, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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

			GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1Layout.setHorizontalGroup(
					jPanel1Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSnacks, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							//.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGap(5, 5, 5)
							.addComponent(btnFoods, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(5, 5, 5)
							//.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(btnBeverages)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			jPanel1Layout.setVerticalGroup(
					jPanel1Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(btnSnacks, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
									.addComponent(btnFoods, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnBeverages, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addContainerGap())
			);

			jScrollPane1.setBorder(null);

			GroupLayout pnlMenuButtonLayout = new GroupLayout(pnlMenuButton);
			pnlMenuButton.setLayout(pnlMenuButtonLayout);
			pnlMenuButtonLayout.setHorizontalGroup(
					pnlMenuButtonLayout.createParallelGroup(Alignment.LEADING)
					.addGap(0, 0, Short.MAX_VALUE)
			);
			pnlMenuButtonLayout.setVerticalGroup(
					pnlMenuButtonLayout.createParallelGroup(Alignment.LEADING)
					.addGap(0, 0, Short.MAX_VALUE)
			);

			jScrollPane1.setViewportView(pnlMenuButton);

			jPanel4.setBackground(new java.awt.Color(255, 255, 255));

			jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
			jLabel8.setText("TOTAL");

			lblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
			lblTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			lblTotalPrice.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

			GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
			jPanel4.setLayout(jPanel4Layout);
			jPanel4Layout.setHorizontalGroup(
					jPanel4Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
							.addContainerGap(262, Short.MAX_VALUE)
							.addComponent(jLabel8)
							.addGap(18, 18, 18)
							.addComponent(lblTotalPrice, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
			);
			jPanel4Layout.setVerticalGroup(
					jPanel4Layout.createParallelGroup(Alignment.LEADING)
					.addComponent(jLabel8, Alignment.TRAILING)
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

			GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
			jPanel7.setLayout(jPanel7Layout);
			jPanel7Layout.setHorizontalGroup(
					jPanel7Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
							.addContainerGap(58, Short.MAX_VALUE)
							.addComponent(btnDone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10, 10, 10)
							.addComponent(btnClear)
							.addContainerGap())
			);
			jPanel7Layout.setVerticalGroup(
					jPanel7Layout.createParallelGroup(Alignment.LEADING)
					.addComponent(btnDone, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
					.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);

			GroupLayout contentPaneLayout = new GroupLayout(contentPane);
			contentPane.setLayout(contentPaneLayout);
			contentPaneLayout.setHorizontalGroup(
					contentPaneLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(pnlTableMenu, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
											.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
											.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addContainerGap())))
			);
			contentPaneLayout.setVerticalGroup(
					contentPaneLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
											.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(5, 5, 5)
											.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(jScrollPane1))
									.addGroup(contentPaneLayout.createSequentialGroup()
											.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(pnlTableMenu, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(13, 13, 13))
			);
		}

		private void initBilling() {
	        jPanel8 = new javax.swing.JPanel();
	        jPanel10 = new javax.swing.JPanel();
	        jScrollPane4 = new javax.swing.JScrollPane();
	        tblBilling = new javax.swing.JTable();
	        jPanel11 = new javax.swing.JPanel();
	        lblTotal = new javax.swing.JLabel();
	        lblChange = new javax.swing.JLabel();
	        lblCash = new javax.swing.JLabel();
	        jLabel14 = new javax.swing.JLabel();
	        jLabel15 = new javax.swing.JLabel();
	        jLabel16 = new javax.swing.JLabel();
	        jPanel9 = new javax.swing.JPanel();
	        jLabel7 = new javax.swing.JLabel();
	        jLabel9 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        lbldateTime = new javax.swing.JLabel();
	        lblCustomerName = new javax.swing.JLabel();
	        lblTable = new javax.swing.JLabel();
	        jPanel12 = new javax.swing.JPanel();
	        jPanel14 = new javax.swing.JPanel();
	        jPanel13 = new javax.swing.JPanel();
	        btn7 = new javax.swing.JButton();
	        btn8 = new javax.swing.JButton();
	        btn9 = new javax.swing.JButton();
	        btn4 = new javax.swing.JButton();
	        btn5 = new javax.swing.JButton();
	        btn1 = new javax.swing.JButton();
	        btn6 = new javax.swing.JButton();
	        btn2 = new javax.swing.JButton();
	        btn3 = new javax.swing.JButton();
	        btn0 = new javax.swing.JButton();
	        btn00 = new javax.swing.JButton();
	        btn000 = new javax.swing.JButton();
	        btnClearBill = new javax.swing.JButton();
	        btnCE = new javax.swing.JButton();
	        btnBack = new javax.swing.JButton();
	        btnCheckTable = new javax.swing.JButton();
	        billingButtonDone = new javax.swing.JButton();
	        btnEnter = new javax.swing.JButton();
	        btnDis10 = new javax.swing.JButton();
	        btnDis20 = new javax.swing.JButton();
	        jPanel15 = new javax.swing.JPanel();
	        jPanel16 = new javax.swing.JPanel();
	        jScrollPane5 = new javax.swing.JScrollPane();
	        tblgetTables = new javax.swing.JTable();
	        spnDate = new javax.swing.JSpinner(new javax.swing.SpinnerDateModel());
	        javax.swing.JSpinner.DateEditor dateEditor = new javax.swing.JSpinner.DateEditor(spnDate, "dd-MM-yyyy");
	        spnDate.setEditor(dateEditor);

	        tblBilling.setModel(new javax.swing.table.DefaultTableModel(
	                new Object[][]{},
	                new String[]{
	                    "Qty.", "Item", "Total"
	                }
	        ) {
	            Class[] types = new Class[]{
	                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
	            };
	            boolean[] canEdit = new boolean[]{
	                false, false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types[columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit[columnIndex];
	            }
	        });
	        tblBilling.getColumnModel().getColumn(0).setPreferredWidth(10);
	        tblBilling.getColumnModel().getColumn(1).setPreferredWidth(230);
	        tblBilling.getColumnModel().getColumn(2).setPreferredWidth(70);
	        ((javax.swing.table.DefaultTableCellRenderer) tblBilling.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

	        jScrollPane4.setViewportView(tblBilling);

	        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
	        jPanel10.setLayout(jPanel10Layout);
	        jPanel10Layout.setHorizontalGroup(
	                jPanel10Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel10Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
	        );
	        jPanel10Layout.setVerticalGroup(
	                jPanel10Layout.createParallelGroup(Alignment.LEADING)
	                .addComponent(jScrollPane4, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
	        );

	        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
	        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

	        lblChange.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
	        lblChange.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

	        lblCash.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
	        lblCash.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

	        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
	        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
	        jLabel14.setText("TOTAL");

	        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
	        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
	        jLabel15.setText("CASH");

	        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
	        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
	        jLabel16.setText("CHANGE");

	        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
	        jPanel11.setLayout(jPanel11Layout);
	        jPanel11Layout.setHorizontalGroup(
	                jPanel11Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel11Layout.createSequentialGroup()
	                        .addContainerGap(142, Short.MAX_VALUE)
	                        .addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING)
	                                .addGroup(Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
	                                        .addGroup(jPanel11Layout.createParallelGroup(Alignment.TRAILING)
	                                                .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
	                                        .addGap(18, 18, 18)
	                                        .addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING, false)
	                                                .addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
	                                                .addComponent(lblCash, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
	                                .addGroup(Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
	                                        .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(lblChange, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
	        );
	        jPanel11Layout.setVerticalGroup(
	                jPanel11Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel11Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING, false)
	                                .addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING, false)
	                                .addComponent(jLabel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(lblCash, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING)
	                                .addGroup(jPanel11Layout.createSequentialGroup()
	                                        .addComponent(jLabel16)
	                                        .addGap(0, 0, Short.MAX_VALUE))
	                                .addComponent(lblChange, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addContainerGap())
	        );

	        jLabel7.setText("DATE / TIMEOUT");

	        jLabel9.setText("Customer's name");

	        jLabel10.setText("Table No.");

	        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
	        jPanel9.setLayout(jPanel9Layout);
	        jPanel9Layout.setHorizontalGroup(
	                jPanel9Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel9Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
	                                .addComponent(jLabel7)
	                                .addComponent(jLabel9)
	                                .addComponent(jLabel10))
	                        .addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
	                                .addGroup(jPanel9Layout.createSequentialGroup()
	                                        .addGap(21, 21, 21)
	                                        .addComponent(lbldateTime, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                .addGroup(jPanel9Layout.createSequentialGroup()
	                                        .addGap(18, 18, 18)
	                                        .addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
	                                                .addComponent(lblCustomerName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                .addComponent(lblTable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	                        .addContainerGap())
	        );
	        jPanel9Layout.setVerticalGroup(
	                jPanel9Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel9Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING, false)
	                                .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(lbldateTime, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
	                                .addComponent(jLabel9)
	                                .addComponent(lblCustomerName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING, false)
	                                .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(lblTable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
	        jPanel8.setLayout(jPanel8Layout);
	        jPanel8Layout.setHorizontalGroup(
	                jPanel8Layout.createParallelGroup(Alignment.LEADING)
	                .addComponent(jPanel11, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel8Layout.setVerticalGroup(
	                jPanel8Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel8Layout.createSequentialGroup()
	                        .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
	        );

	        btn7.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn7.setText("7");
	        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn7.getText()))));
	                }

	            }
	        });

	        btn8.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn8.setText("8");
	        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn8.getText()))));
	                }
	            }
	        });

	        btn9.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn9.setText("9");
	        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn9.getText()))));
	                }
	            }
	        });

	        btn4.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn4.setText("4");
	        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn4.getText()))));
	                }
	            }
	        });

	        btn5.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn5.setText("5");
	        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn5.getText()))));
	                }
	            }
	        });

	        btn1.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn1.setText("1");
	        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn1.getText()))));
	                }
	            }
	        });

	        btn6.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn6.setText("6");
	        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn6.getText()))));
	                }
	            }
	        });

	        btn2.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn2.setText("2");
	        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn2.getText()))));
	                }
	            }
	        });

	        btn3.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn3.setText("3");
	        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn3.getText()))));
	                }
	            }
	        });

	        btn0.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn0.setText("0");
	        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn0.getText()))));
	                }
	            }
	        });

	        btn00.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn00.setText("00");
	        btn00.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn00.getText()))));
	                }
	            }
	        });

	        btn000.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btn000.setText("000");
	        btn000.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText(putComma(Double.parseDouble((removeComma(lblCash.getText()) + btn000.getText()))));
	                }
	            }
	        });

	        btnCE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
	        btnCE.setText("CE");
	        btnCE.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    lblCash.setText("");
	                }
	            }
	        });

	        btnBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
	        btnBack.setText("<-");
	        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    String text = String.valueOf(removeComma(lblCash.getText()));
	                    if (text.length() <= 1) {
	                        lblCash.setText("");
	                    } else {
	                        text = text.substring(0, text.length() - 1);
	                        lblCash.setText(putComma(Double.parseDouble(text)));
	                    }
	                }
	            }
	        });

	        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 20));
	        btnEnter.setText("<html><center>Enter</center></html>");
	        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                lblChange.setText("");

	                double change = removeComma(lblCash.getText()) - removeComma(lblTotal.getText());
	                if (lblCash.getText().equals("") || lblTotal.getText().equals("")) {
	                } else if (change < 0.0) {
	                    javax.swing.JOptionPane.showMessageDialog(null, "Not Enough");
	                } else {
	                    lblChange.setText(putComma(change));
	                    clickedEnter = true;
	                }
	            }
	        });

	        GroupLayout jPanel13Layout = new GroupLayout(jPanel13);
	        jPanel13.setLayout(jPanel13Layout);
	        jPanel13Layout.setHorizontalGroup(
	                jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel13Layout.createSequentialGroup()
	                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                                        .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                        .addGap(0, 0, 0)))
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                                        .addComponent(btn00, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                        .addGap(0, 0, 0)))
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                                .addComponent(btn000, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                        .addGap(0, 0, 0))))
	                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                        .addGap(0, 0, 0)))
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                        .addGap(0, 0, 0)
	                                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                        .addGap(0, 0, Short.MAX_VALUE))
	                                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                                        .addGap(0, 0, 0)
	                                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))))
	                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
	        );
	        jPanel13Layout.setVerticalGroup(
	                jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel13Layout.createSequentialGroup()
	                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING, false)
	                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
	                                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                        .addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
	                                                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
	                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING, false)
	                                .addGroup(jPanel13Layout.createSequentialGroup()
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
	                                                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
	                                                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
	                                        .addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
	                                                .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(btn00, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(btn000, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
	                                .addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE))
	                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        btnClearBill.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btnClearBill.setBackground(new java.awt.Color(255, 0, 0));
	        btnClearBill.setText("CLEAR");
	        btnClearBill.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                resetBillToDefault();
	            }
	        });

	        billingButtonDone.setFont(new java.awt.Font("Tahoma", 0, 24));
	        billingButtonDone.setBackground(new java.awt.Color(51, 204, 0));
	        billingButtonDone.setText("DONE");
	        billingButtonDone.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (clickedEnter) {
	                    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
	                    java.util.Calendar date = new java.util.GregorianCalendar();
	                    date.setTime((java.util.Date) spnDate.getValue());
	                    date.add(java.util.Calendar.YEAR, -543);
	                    queue.removeOrders(dateFormat.format(date.getTime()) + " " + String.valueOf(lbldateTime.getText()).substring(16), Integer.parseInt(lblTable.getText().substring(4)));
	                    queue.updateBacklog(dateFormat.format(date.getTime()), removeComma(lblTotal.getText()), Integer.parseInt(lblTable.getText().substring(4)) / 100);
	                    updatePopularFood();
	                    resetBillToDefault();
	                    checkTable();
	                }
	            }
	        });

	        btnDis10.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btnDis10.setText("10%");
	        btnDis10.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                double total = 90 * removeComma(lblTotal.getText()) / 100;
	                lblTotal.setText(putComma(total));
	            }
	        });

	        btnDis20.setFont(new java.awt.Font("Tahoma", 0, 24));
	        btnDis20.setText("20%");
	        btnDis20.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                double total = 80 * removeComma(lblTotal.getText()) / 100;
	                lblTotal.setText(putComma(total));
	            }
	        });

	        GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
	        jPanel14.setLayout(jPanel14Layout);
	        jPanel14Layout.setHorizontalGroup(
	                jPanel14Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel14Layout.createSequentialGroup()
	                        .addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel14Layout.createParallelGroup(Alignment.LEADING)
	                                .addComponent(btnClearBill, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(billingButtonDone, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(btnDis10, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
	                                .addComponent(btnDis20, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
	                        .addContainerGap())
	        );
	        jPanel14Layout.setVerticalGroup(
	                jPanel14Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
	                        .addGap(0, 9, Short.MAX_VALUE)
	                        .addGroup(jPanel14Layout.createParallelGroup(Alignment.LEADING)
	                                .addGroup(jPanel14Layout.createSequentialGroup()
	                                        .addComponent(btnDis20, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                        .addGap(0, 0, 0)
	                                        .addComponent(btnDis10, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                        .addGap(0, 0, 0)
	                                        .addComponent(billingButtonDone, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                        .addGap(0, 0, 0)
	                                        .addComponent(btnClearBill, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	                                        .addContainerGap())
	                                .addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	        );

	        tblgetTables.setModel(new javax.swing.table.DefaultTableModel(
	                new Object[][]{},
	                new String[]{
	                    "Table No.", "Customer's name", "Start Time", "Time Out"
	                }
	        ) {
	            Class[] types = new Class[]{
	                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
	            };
	            boolean[] canEdit = new boolean[]{
	                false, false, false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types[columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit[columnIndex];
	            }
	        });
	        tblgetTables.getColumnModel().getColumn(0).setPreferredWidth(30);
	        tblgetTables.getColumnModel().getColumn(1).setPreferredWidth(190);
	        tblgetTables.getColumnModel().getColumn(2).setPreferredWidth(40);
	        tblgetTables.getColumnModel().getColumn(3).setPreferredWidth(40);
	        ((javax.swing.table.DefaultTableCellRenderer) tblgetTables.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

	        tblgetTables.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                if (!clickedEnter) {
	                    int row = tblgetTables.getSelectedRow();
	                    int total = 0;
	                    java.util.ArrayList<java.util.HashMap> billing = queue.getBilling(Integer.parseInt(String.valueOf(tblgetTables.getValueAt(row, 0))), String.valueOf(tblgetTables.getValueAt(row, 1)));
	                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblBilling.getModel();
	                    deleteAllRow(model);

	                    int line = 0;
	                    for (java.util.HashMap bill : billing) {
	                        model.addRow(new Object[0]);
	                        model.setValueAt(" " + Integer.parseInt(String.valueOf(bill.get("qty"))), line, 0);
	                        model.setValueAt(" " + String.valueOf(bill.get("foodName")), line, 1);
	                        model.setValueAt(putComma(Integer.parseInt(String.valueOf(bill.get("total")))), line, 2);
	                        line++;

	                        total += Integer.parseInt(String.valueOf(bill.get("total")));
	                    }

	                    lbldateTime.setText("");
	                    lblCustomerName.setText("");
	                    lblTable.setText("");

	                    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
	                    java.util.Calendar date = new java.util.GregorianCalendar();
	                    date.setTime((java.util.Date) (spnDate.getValue()));
	                    date.add(java.util.Calendar.YEAR, -543);
	                    lbldateTime.setText(":  " + String.valueOf(dateFormat.format(date.getTime())) + "   " + String.valueOf(tblgetTables.getValueAt(row, 3)));
	                    lblCustomerName.setText(" :  " + String.valueOf(tblgetTables.getValueAt(row, 1)));
	                    lblTable.setText(" :  " + String.valueOf(tblgetTables.getValueAt(row, 0)));

	                    lblTotal.setText(putComma(total));
	                }
	            }

	        });

	        jScrollPane5.setViewportView(tblgetTables);

	        javax.swing.table.DefaultTableCellRenderer renderer = new javax.swing.table.DefaultTableCellRenderer();
	        renderer.setHorizontalAlignment(javax.swing.JLabel.LEFT);
	        for (int i = 0; i <= 3; i++) {
	            if (i > 0 && i < 3) {
	                tblBilling.getColumnModel().getColumn(i).setCellRenderer(renderer);
	            }
	            tblgetTables.getColumnModel().getColumn(i).setCellRenderer(renderer);
	        }

	        btnCheckTable.setText("CHECK");
	        btnCheckTable.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                checkTable();
	            }
	        });

	        GroupLayout jPanel15Layout = new GroupLayout(jPanel15);
	        jPanel15.setLayout(jPanel15Layout);
	        jPanel15Layout.setHorizontalGroup(
	                jPanel15Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel15Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(spnDate, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
	                        .addGap(10, 10, 10)
	                        .addComponent(btnCheckTable)
	                        .addContainerGap(205, Short.MAX_VALUE))
	                .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
	        );
	        jPanel15Layout.setVerticalGroup(
	                jPanel15Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel15Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(jPanel15Layout.createParallelGroup(Alignment.BASELINE)
	                                .addComponent(spnDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(btnCheckTable))
	                        .addGap(10, 10, 10)
	                        .addComponent(jScrollPane5, GroupLayout.DEFAULT_SIZE, 210, GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
	        jPanel12.setLayout(jPanel12Layout);
	        jPanel12Layout.setHorizontalGroup(
	                jPanel12Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel12Layout.createSequentialGroup()
	                        .addGroup(jPanel12Layout.createParallelGroup(Alignment.LEADING, false)
	                                .addComponent(jPanel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addGap(0, 1, Short.MAX_VALUE))
	        );
	        jPanel12Layout.setVerticalGroup(
	                jPanel12Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
	                        .addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        );

	        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
	        contentPane.setLayout(contentPaneLayout);
	        contentPaneLayout.setHorizontalGroup(
	                contentPaneLayout.createParallelGroup(Alignment.LEADING)
	                .addGroup(contentPaneLayout.createSequentialGroup()
	                        .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addGap(232, 232, 232))
	        );
	        contentPaneLayout.setVerticalGroup(
	                contentPaneLayout.createParallelGroup(Alignment.TRAILING)
	                .addComponent(jPanel12, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jPanel8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        getContentPane().add(contentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 855, 525));
	    }

	    private void initBacklog() {
	        jPanel17 = new javax.swing.JPanel();
	        btnADay = new javax.swing.JButton();
	        btnAMonth = new javax.swing.JButton();
	        jPanel19 = new javax.swing.JPanel();
	        jScrollPane6 = new javax.swing.JScrollPane();
	        tblBacklog = new javax.swing.JTable();
	        jPanel18 = new javax.swing.JPanel();
	        spnBacklog = new javax.swing.JSpinner(new javax.swing.SpinnerDateModel());
	        btnCheckBacklog = new javax.swing.JButton();

	        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

	        ((javax.swing.JSpinner.DefaultEditor) spnBacklog.getEditor()).getTextField().setText("");

	        btnADay.setText("A DAY");
	        btnADay.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent e) {
	                javax.swing.JSpinner.DateEditor dateEditor = new javax.swing.JSpinner.DateEditor(spnBacklog, "MMMMM yyyy");
	                spnBacklog.setEditor(dateEditor);
	                ((javax.swing.JSpinner.DefaultEditor) spnBacklog.getEditor()).getTextField().setHorizontalAlignment(javax.swing.JTextField.RIGHT);
	                clickedADay = true;
	                clickedAMonth = false;
	            }
	        });

	        btnAMonth.setText("A MONTH");
	        btnAMonth.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent e) {
	                javax.swing.JSpinner.DateEditor dateEditor = new javax.swing.JSpinner.DateEditor(spnBacklog, "yyyy");
	                spnBacklog.setEditor(dateEditor);
	                ((javax.swing.JSpinner.DefaultEditor) spnBacklog.getEditor()).getTextField().setHorizontalAlignment(javax.swing.JTextField.RIGHT);
	                clickedAMonth = true;
	                clickedADay = false;
	            }
	        });

	        GroupLayout jPanel17Layout = new GroupLayout(jPanel17);
	        jPanel17.setLayout(jPanel17Layout);
	        jPanel17Layout.setHorizontalGroup(
	                jPanel17Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel17Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(jPanel17Layout.createParallelGroup(Alignment.LEADING)
	                                .addComponent(btnADay, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
	                                .addComponent(btnAMonth, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
	                        .addContainerGap())
	        );
	        jPanel17Layout.setVerticalGroup(
	                jPanel17Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel17Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(btnADay, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btnAMonth, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jPanel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

	        tblBacklog.setModel(new javax.swing.table.DefaultTableModel(
	                new Object[][]{},
	                new String[]{
	                    "DATE", "No. of Customer", "Revenue", "Total"
	                }
	        ) {
	            Class[] types = new Class[]{
	                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
	            };
	            boolean[] canEdit = new boolean[]{
	                false, false, false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types[columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit[columnIndex];
	            }
	        });
	        tblBacklog.getColumnModel().getColumn(0).setPreferredWidth(100);
	        tblBacklog.getColumnModel().getColumn(1).setPreferredWidth(10);
	        tblBacklog.getColumnModel().getColumn(2).setPreferredWidth(60);
	        tblBacklog.getColumnModel().getColumn(3).setPreferredWidth(60);
	        tblBacklog.setFont(new java.awt.Font("Tahoma", 0, 14));
	        ((javax.swing.table.DefaultTableCellRenderer) tblBacklog.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

	        javax.swing.table.DefaultTableCellRenderer leftRenderer = new javax.swing.table.DefaultTableCellRenderer();
	        leftRenderer.setHorizontalAlignment(javax.swing.JLabel.LEFT);
	        for (int i = 0; i < 4; i++) {
	            tblBacklog.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
	        }

	        jScrollPane6.setViewportView(tblBacklog);

	        GroupLayout jPanel19Layout = new GroupLayout(jPanel19);
	        jPanel19.setLayout(jPanel19Layout);
	        jPanel19Layout.setHorizontalGroup(
	                jPanel19Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel19Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
	                        .addGap(21, 21, 21))
	        );
	        jPanel19Layout.setVerticalGroup(
	                jPanel19Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel19Layout.createSequentialGroup()
	                        .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
	                        .addContainerGap())
	        );

	        btnCheckBacklog.setText("check");
	        btnCheckBacklog.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent e) {
	                deleteAllRow((javax.swing.table.DefaultTableModel) tblBacklog.getModel());
	                java.util.ArrayList<java.util.HashMap> logs = null;
	                if (clickedADay) {
	                    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM");
	                    java.util.Calendar date = new java.util.GregorianCalendar();
	                    date.setTime((java.util.Date) spnBacklog.getValue());
	                    date.add(java.util.Calendar.YEAR, -543);

	                    logs = queue.getBacklogADay(dateFormat.format(date.getTime()));
	                }
	                if (clickedAMonth) {
	                    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy");
	                    java.util.Calendar date = new java.util.GregorianCalendar();
	                    date.setTime((java.util.Date) spnBacklog.getValue());
	                    date.add(java.util.Calendar.YEAR, -543);

	                    logs = queue.getBacklogAMonth(dateFormat.format(date.getTime()));
	                }
	                if (logs != null) {
	                    int line = 0;
	                    for (java.util.HashMap log : logs) {
	                        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblBacklog.getModel();
	                        model.addRow(new Object[0]);
	                        model.setValueAt(log.get("date"), line, 0);
	                        model.setValueAt(log.get("noOfCustomer"), line, 1);
	                        model.setValueAt(putComma(Double.parseDouble(String.valueOf(log.get("revenue")))), line, 2);
	                        model.setValueAt(putComma(Double.parseDouble(String.valueOf(log.get("total")))), line, 3);
	                        line++;
	                    }
	                }

	            }
	        });

	        GroupLayout jPanel18Layout = new GroupLayout(jPanel18);
	        jPanel18.setLayout(jPanel18Layout);
	        jPanel18Layout.setHorizontalGroup(
	                jPanel18Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel18Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(spnBacklog, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(btnCheckBacklog)
	                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel18Layout.setVerticalGroup(
	                jPanel18Layout.createParallelGroup(Alignment.LEADING)
	                .addGroup(jPanel18Layout.createSequentialGroup()
	                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(jPanel18Layout.createParallelGroup(Alignment.BASELINE)
	                                .addComponent(spnBacklog, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(btnCheckBacklog)))
	        );

	        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
	        contentPane.setLayout(contentPaneLayout);
	        contentPaneLayout.setHorizontalGroup(
	                contentPaneLayout.createParallelGroup(Alignment.LEADING)
	                .addGroup(contentPaneLayout.createSequentialGroup()
	                        .addComponent(jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
	                                .addComponent(jPanel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jPanel18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	        );
	        contentPaneLayout.setVerticalGroup(
	                contentPaneLayout.createParallelGroup(Alignment.TRAILING)
	                .addComponent(jPanel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(contentPaneLayout.createSequentialGroup()
	                        .addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(jPanel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addContainerGap())
	        );
	    }
    
	    private void initPopular() {
	        jScrollPane7 = new javax.swing.JScrollPane();
	        tblPopular = new javax.swing.JTable();
	        btnCheckPop = new javax.swing.JButton();
	        
	        tblPopular.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "No.", "Snacks", "Foods"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane7.setViewportView(tblPopular);
	        tblPopular.getColumnModel().getColumn(0).setPreferredWidth(10);
	        tblPopular.getColumnModel().getColumn(1).setPreferredWidth(200);
	        tblPopular.getColumnModel().getColumn(2).setPreferredWidth(200);

	        btnCheckPop.setText("CHECK");
	        btnCheckPop.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent e) {
	                java.util.ArrayList<java.util.HashMap> snacks = queue.getPopularSnacks();
	                java.util.ArrayList<java.util.HashMap> foods = queue.getPopularFoods();

	                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblPopular.getModel();
	                for(int i = 0; i < 5; i++) {
	                    model.addRow(new Object[0]);
	                    model.setValueAt(i+1, i, 0);
	                    if(!snacks.get(i).isEmpty()) {
	                        model.setValueAt(snacks.get(i).get("foodName"), i, 1);
	                    } else {
	                        model.setValueAt("", i, 1);
	                    }
	                    model.setValueAt(foods.get(i).get("foodName"), i, 2);
	                    
	                }
	            }
	        });

	        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
	        contentPane.setLayout(contentPaneLayout);
	        contentPaneLayout.setHorizontalGroup(
	            contentPaneLayout.createParallelGroup(Alignment.LEADING)
	            .addGroup(contentPaneLayout.createSequentialGroup()
	                .addGap(25, 25, 25)
	                .addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
	                    .addComponent(jScrollPane7, GroupLayout.PREFERRED_SIZE, 803, GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnCheckPop, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(27, Short.MAX_VALUE))
	        );
	        contentPaneLayout.setVerticalGroup(
	            contentPaneLayout.createParallelGroup(Alignment.TRAILING)
	            .addGroup(Alignment.LEADING, contentPaneLayout.createSequentialGroup()
	                .addGap(19, 19, 19)
	                .addComponent(btnCheckPop)
	                .addGap(18, 18, 18)
	                .addComponent(jScrollPane7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(32, Short.MAX_VALUE))
	        );
	    }
	}

	private void initComponents() {
		menuTab = new JPanel();
		reserveButton = new JButton();
		billingButton = new JButton();
		backlogButton = new JButton();
		popularButton = new JButton();
		contentPane = new JPanel();
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

		menuTab.setPreferredSize(new java.awt.Dimension(800, 70));

		reserveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		reserveButton.setText("RESERVE");
		reserveButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		reserveButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				reserveButtonMouseClicked(evt);
			}
		});

		billingButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		billingButton.setText("BILLING");
		billingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		billingButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				billingButtonMouseClicked(evt);
			}
		});

		backlogButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		backlogButton.setText("BACKLOG");
		backlogButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		backlogButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				backlogButtonMouseClicked(evt);
			}
		});

		popularButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		popularButton.setText("POPULAR FOOD");
		popularButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		popularButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				popularButtonMouseClicked(evt);
			}
		});

		GroupLayout menuTabLayout = new GroupLayout(menuTab);
		menuTab.setLayout(menuTabLayout);
		menuTabLayout.setHorizontalGroup(
			menuTabLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(menuTabLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(reserveButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(billingButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(backlogButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(popularButton)
				.addContainerGap(342, Short.MAX_VALUE))
		);
		menuTabLayout.setVerticalGroup(
			menuTabLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(menuTabLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(menuTabLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(reserveButton, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
					.addComponent(billingButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(popularButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(backlogButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);

		getContentPane().add(menuTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 855, -1));

		contentPane.setPreferredSize(new java.awt.Dimension(0, 500));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup(Alignment.LEADING)
			.addGap(0, 855, Short.MAX_VALUE)
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup(Alignment.TRAILING)
			.addGap(0, 525, Short.MAX_VALUE)
		);

		getContentPane().add(contentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 855, 525));

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel1.setText("Chew ID : ");

		lblClock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblClock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
			.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
				.addContainerGap(429, Short.MAX_VALUE)
				.addComponent(jLabel1)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(lblUser, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(lblClock, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
				.addGap(31, 31, 31))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
			.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblClock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
			.addComponent(lblUser, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, -1, -1));
		pack();
	}

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Queuing.disConnectDb();
    }//GEN-LAST:event_formWindowClosing

    private void reserveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserveButtonMouseClicked
        contentPane.removeAll();
        initReserve();
    }//GEN-LAST:event_reserveButtonMouseClicked

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseClicked
        contentPane.removeAll();
        initBilling();
    }//GEN-LAST:event_billingButtonMouseClicked

    private void backlogButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlogButtonMouseClicked
        contentPane.removeAll();
        initBacklog();
    }//GEN-LAST:event_backlogButtonMouseClicked

    private void popularButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popularButtonMouseClicked
        contentPane.removeAll();
        initPopular();
    }//GEN-LAST:event_popularButtonMouseClicked

    private void resetToDefault() {
        tableId = customerId = -1;
        dateTimeReserve = timeOut = null;
        lblTableNo.setText("");
        lblReserve.setText("");
        txtName.setText("");
        lblTotalBeveragePrice.setText("");
        lblTotalFoodPrice.setText("");
        lblTotalPrice.setText("");
        deleteAllRow((javax.swing.table.DefaultTableModel) tblFoodMenu.getModel());
        deleteAllRow((javax.swing.table.DefaultTableModel) tblBeverageMenu.getModel());
    }

    private void resetBillToDefault() {
        clickedEnter = false;
        lbldateTime.setText("");
        lblCustomerName.setText("");
        lblTable.setText("");
        lblTotal.setText("");
        lblCash.setText("");
        lblChange.setText("");
        deleteAllRow((javax.swing.table.DefaultTableModel) tblgetTables.getModel());
        deleteAllRow((javax.swing.table.DefaultTableModel) tblBilling.getModel());
    }

    private void deleteAllRow(javax.swing.table.DefaultTableModel model) {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    private void delectSelectedRow(javax.swing.JTable tbl, javax.swing.JLabel lbl, int row) {
        int res = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure you want to delete row " + (tbl.getSelectedRow() + 1) + " ?", "Please Confirm", javax.swing.JOptionPane.YES_NO_OPTION);
        switch (res) {

            case javax.swing.JOptionPane.YES_OPTION:
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tbl.getModel();

                computePrice(lbl, removeComma(String.valueOf(model.getValueAt(row, 4))), "-");
                computePrice(lblTotalPrice, removeComma(String.valueOf(model.getValueAt(row, 4))), "-");

                model.removeRow(row);

                for (int i = row; i < model.getRowCount(); i++) {
                    model.setValueAt(i + 1, i, 0);
                }

                javax.swing.JOptionPane.showMessageDialog(null, "Delete Successfully");
                break;

            case javax.swing.JOptionPane.NO_OPTION:
                javax.swing.JOptionPane.showMessageDialog(null, "Delete Action is Canceled");
                break;
        }

    }

    private void checkTable() {
        java.util.ArrayList<java.util.HashMap> tables = queue.getOrders((java.util.Date) (spnDate.getValue()));
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblgetTables.getModel();
        deleteAllRow(model);
        int line = 0;
        if (tables != null) {
            for (java.util.HashMap table : tables) {
                model.addRow(new Object[0]);
                model.setValueAt(Integer.parseInt(String.valueOf(table.get("tableID"))), line, 0);
                model.setValueAt(queue.getCustomerName(Integer.parseInt(String.valueOf(table.get("customerID")))), line, 1);
                model.setValueAt(String.valueOf(table.get("dateTimeReserve")).substring(11, 19), line, 2);
                model.setValueAt(String.valueOf(table.get("timeOut")).substring(11, 19), line, 3);
                line++;
            }
        }
    }

    private void setOrders(int line, javax.swing.JTable tbl) {
        for (int i = 0; i < line; i++) {
            String foodName = String.valueOf(tbl.getValueAt(i, 1));
            int qty = Integer.parseInt(String.valueOf(tbl.getValueAt(i, 3)));
            String reserve = dateTimeReserve.toString().substring(0, dateTimeReserve.toString().length() - 2);
            String out = timeOut.toString().substring(0, timeOut.toString().length() - 2);
            queue.insertOrders(reserve, out, queue.getFoodId(foodName), qty, tableId, customerId);
        }
    }

    private void addtblBeverageMenuLine(javax.swing.JButton btn, double price) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblBeverageMenu.getModel();
        int i = 0;

        for (i = 0; i < model.getRowCount(); i++) {
            if (btn.getText().equals(model.getValueAt(i, 1))) {
                model.setValueAt(Integer.parseInt(String.valueOf((model.getValueAt(i, 3)))) + 1, i, 3);
                model.setValueAt(putComma(price * removeComma(String.valueOf(model.getValueAt(i, 3)))), i, 4);
                break;
            }
        }

        if (model.getRowCount() == 0 || i >= model.getRowCount()) {
            model.addRow(new Object[0]);
            tblBeverageMenu.setValueAt(model.getRowCount(), model.getRowCount() - 1, 0);
            tblBeverageMenu.setValueAt(btn.getText(), model.getRowCount() - 1, 1);
            tblBeverageMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 2);
            tblBeverageMenu.setValueAt(1, model.getRowCount() - 1, 3);
            tblBeverageMenu.setValueAt(price + "0.-", model.getRowCount() - 1, 4);
        }

        computePrice(lblTotalBeveragePrice, price, "+");
        computePrice(lblTotalPrice, price, "+");
    }

    private void updatePopularFood() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblBilling.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            queue.updatePopularFood(Integer.parseInt(String.valueOf(tblBilling.getValueAt(i, 0)).trim()), String.valueOf(tblBilling.getValueAt(i, 1)).trim());
        }
    }

    public static Queuing getQueue() {
        return queue;
    }

    public static void setTableIdAndTime(int id, java.util.Calendar time) {
        tableId = id;
        time.add(java.util.Calendar.YEAR, 543);
        dateTimeReserve = new java.sql.Timestamp(time.getTimeInMillis());
        time.add(java.util.Calendar.MINUTE, 90);
        timeOut = new java.sql.Timestamp(time.getTimeInMillis());
    }

    public static void setLabelDateAndTime(String tableNo, String time) {
        lblTableNo.setText("");
        lblReserve.setText("");

        lblTableNo.setText(tableNo);
        lblReserve.setText(time);
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


package book_res.interfaces;

import book_res.functions.TableFuction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

public class ReserveFace implements MainMenu{


    // Snacks menu button
    private JButton btnFriedFishPasteBalls, btnCharcoalBoiledPorkNeck, btnFriedChicken,
            btnFriedPorkRind, btnCrispyWonton, btnSteamedSpringRoll;

    // Foods menu button
    private JButton btnRice, btnCasseroledPrawns, btnSteamedDuck, btnFriedFishToppedWithChilliSauce,
            btnSpicyVermicelliSalad, btnChickenGreenCurry, btnClearSoup, btnMincedPorkOmelet,
            btnFriedCrabinYellowCurry, btnDeepFriendShrimpCakes, btnTomYumKung;

    // Beverages menu button
    private JButton btnWater, btnPepsi, btnSprite, btnFanta, btnSoda, btnGreenTea;

    // Variable of reserve's part
    private JButton btnBeverages, btnCheck, btnClear, btnDone, btnFoods, btnSnacks;
    private JLabel jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel8,
            lblDate, lblTime, lblTotalFoodPrice, lblTotalBeveragePrice, lblTotalPrice;
    private JPanel jPanel1, jPanel2, jPanel4, jPanel5, jPanel6, jPanel7,
            pnlMenuButton, pnlTableMenu;
    private JScrollPane jScrollPane1, jScrollPane2, jScrollPane3;
    public static JLabel lblReserve, lblTableNo;
    private Table tblFoodMenu, tblBeverageMenu;
    private JTextField txtName;
    
    public ReserveFace() {
        pnlTableMenu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBeverageMenu = new Table("Foods");
        tblFoodMenu = new Table("Bevarages");
        jScrollPane3 = new javax.swing.JScrollPane();
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
    }
    
    public JButton[] getMenuButtons() {
        return new JButton[]{btnFoods, btnSnacks, btnBeverages};
    }
    

    public void init() {
        

        pnlTableMenu.setBackground(new java.awt.Color(204, 204, 204));
        pnlTableMenu.setPreferredSize(new java.awt.Dimension(415, 460));

        tblBeverageMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int row = tblBeverageMenu.getSelectedRow();
                    deleteSelectedRow(tblBeverageMenu, lblTotalBeveragePrice, row);
                }
            }
        });
        jScrollPane2.setViewportView(tblBeverageMenu);

        tblFoodMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int row = tblFoodMenu.getSelectedRow();
                    deleteSelectedRow(tblFoodMenu, lblTotalFoodPrice, row);
                }
            }
        });

        jScrollPane3.setViewportView(tblFoodMenu);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Total");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalFoodPrice, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalFoodPrice, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Total");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalBeveragePrice, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalBeveragePrice, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout pnlTableMenuLayout = new GroupLayout(pnlTableMenu);
        pnlTableMenu.setLayout(pnlTableMenuLayout);
        pnlTableMenuLayout.setHorizontalGroup(
                pnlTableMenuLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTableMenuLayout.setVerticalGroup(
                pnlTableMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                new TableFuction();
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
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(btnCheck, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lblDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblTime, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lblReserve, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                                .addComponent(lblTableNo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(20, 20, 20))))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTableNo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(lblDate)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(lblReserve, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(lblTime)))
                                        .addGap(3, 3, 3))
                                .addComponent(btnCheck, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
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
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnSnacks, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(btnFoods, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBeverages, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );

        jScrollPane1.setBorder(null);

        GroupLayout pnlMenuButtonLayout = new GroupLayout(pnlMenuButton);
        pnlMenuButton.setLayout(pnlMenuButtonLayout);
        pnlMenuButtonLayout.setHorizontalGroup(
                pnlMenuButtonLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMenuButtonLayout.setVerticalGroup(
                pnlMenuButtonLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(262, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalPrice, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, GroupLayout.Alignment.TRAILING)
                .addComponent(lblTotalPrice)
        );

        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //resetToDefault();
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
//                    customerId = queue.getCustomerId(txtName.getText());
//                    setOrders(tblFoodMenu.getRowCount(), tblFoodMenu);
//                    setOrders(tblBeverageMenu.getRowCount(), tblBeverageMenu);
//                    queue.updateStatusTable(tableId);
//                    resetToDefault();
//                    javax.swing.JOptionPane.showMessageDialog(null, "Successfully");
                }
            }
        });

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(btnDone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnClear)
                        .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(btnDone, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(btnClear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout contentPaneLayout = new GroupLayout(Main.contentPane);
        Main.contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnlTableMenu, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                        .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
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

    protected void addSnacksButton() {
        GroupLayout pnlSnacksLayout = new GroupLayout(pnlMenuButton);
        pnlMenuButton.setLayout(pnlSnacksLayout);
        pnlSnacksLayout.setHorizontalGroup(
                pnlSnacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlSnacksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSnacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(pnlSnacksLayout.createSequentialGroup()
                                        .addComponent(btnFriedFishPasteBalls, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCharcoalBoiledPorkNeck, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlSnacksLayout.createSequentialGroup()
                                        .addComponent(btnFriedChicken, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFriedPorkRind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlSnacksLayout.createSequentialGroup()
                                        .addComponent(btnCrispyWonton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSteamedSpringRoll, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );
        pnlSnacksLayout.setVerticalGroup(
                pnlSnacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlSnacksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSnacksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnFriedFishPasteBalls, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCharcoalBoiledPorkNeck, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSnacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnFriedChicken, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFriedPorkRind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSnacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnCrispyWonton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSteamedSpringRoll, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );
    }

    protected void addBevaragesButton() {
        GroupLayout pnlBevaragesLayout = new GroupLayout(pnlMenuButton);
        pnlMenuButton.setLayout(pnlBevaragesLayout);
        pnlBevaragesLayout.setHorizontalGroup(
                pnlBevaragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlBevaragesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBevaragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(pnlBevaragesLayout.createSequentialGroup()
                                        .addComponent(btnWater, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPepsi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlBevaragesLayout.createSequentialGroup()
                                        .addComponent(btnSprite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFanta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlBevaragesLayout.createSequentialGroup()
                                        .addComponent(btnSoda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGreenTea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );
        pnlBevaragesLayout.setVerticalGroup(
                pnlBevaragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlBevaragesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBevaragesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnWater, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPepsi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBevaragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnSprite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFanta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBevaragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnSoda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGreenTea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );
    }

    protected void addFoodsButton() {
        GroupLayout pnlFoodsLayout = new GroupLayout(pnlMenuButton);
        pnlMenuButton.setLayout(pnlFoodsLayout);
        pnlFoodsLayout.setHorizontalGroup(
                pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlFoodsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(pnlFoodsLayout.createSequentialGroup()
                                        .addComponent(btnRice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCasseroledPrawns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlFoodsLayout.createSequentialGroup()
                                        .addComponent(btnSteamedDuck, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFriedFishToppedWithChilliSauce, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlFoodsLayout.createSequentialGroup()
                                        .addComponent(btnSpicyVermicelliSalad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnChickenGreenCurry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlFoodsLayout.createSequentialGroup()
                                        .addComponent(btnClearSoup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMincedPorkOmelet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlFoodsLayout.createSequentialGroup()
                                        .addComponent(btnFriedCrabinYellowCurry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeepFriendShrimpCakes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlFoodsLayout.createSequentialGroup()
                                        .addComponent(btnTomYumKung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        )
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );
        pnlFoodsLayout.setVerticalGroup(
                pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlFoodsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCasseroledPrawns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnSteamedDuck, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFriedFishToppedWithChilliSauce, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnSpicyVermicelliSalad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChickenGreenCurry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnClearSoup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMincedPorkOmelet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnFriedCrabinYellowCurry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDeepFriendShrimpCakes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFoodsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnTomYumKung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );
    }
    

    private void deleteSelectedRow(javax.swing.JTable tbl, javax.swing.JLabel lbl, int row) {
        int res = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure you want to delete row " + (tbl.getSelectedRow() + 1) + " ?", "Please Confirm", javax.swing.JOptionPane.YES_NO_OPTION);
        switch (res) {

            case javax.swing.JOptionPane.YES_OPTION:
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tbl.getModel();

                //computePrice(lbl, removeComma(String.valueOf(model.getValueAt(row, 4))), "-");
                //computePrice(lblTotalPrice, removeComma(String.valueOf(model.getValueAt(row, 4))), "-");

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
}

class Table extends JTable {
    public Table(String name) {
        setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "No.", name, "Price", "Qty.", "Amount"
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
        
        getColumnModel().getColumn(0).setPreferredWidth(15);
        getColumnModel().getColumn(1).setPreferredWidth(210);
        getColumnModel().getColumn(2).setPreferredWidth(50);
        getColumnModel().getColumn(3).setPreferredWidth(15);
        getColumnModel().getColumn(4).setPreferredWidth(60);
        ((DefaultTableCellRenderer) getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(javax.swing.JLabel.LEFT);
        for (int i = 0; i <= 4; i++) {
            getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
        }
    }
}

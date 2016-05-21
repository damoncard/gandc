package book_res.interfaces;

import book_res.functions.Comma;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;

public class BillingFace implements MainMenu {

    // Variable of billing's part
    private ButtonCal btn0, btn00, btn000,
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JButton btnClearBill, btnBack, btnCE, btnDis10, btnDis20,
            billingButtonDone, btnEnter, btnCheckTable;
    private JLabel jLabel7, jLabel9, jLabel10, jLabel14, jLabel15, jLabel16,
            lblCash, lblChange, lblCustomerName, lblTable, lblTotal, lbldateTime;
    private JPanel jPanel8, jPanel9, jPanel10, jPanel11, jPanel12, jPanel13, jPanel14, jPanel15, jPanel16;
    private JScrollPane jScrollPane4, jScrollPane5;
    private JSpinner spnDate;
    private JTable tblBilling, tblgetTables;
    private boolean clickedEnter;

    public void init() {
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
        btn7 = new ButtonCal("7");
        btn8 = new ButtonCal("8");
        btn9 = new ButtonCal("9");
        btn4 = new ButtonCal("4");
        btn5 = new ButtonCal("5");
        btn1 = new ButtonCal("1");
        btn6 = new ButtonCal("6");
        btn2 = new ButtonCal("2");
        btn3 = new ButtonCal("3");
        btn0 = new ButtonCal("0");
        btn00 = new ButtonCal("00");
        btn000 = new ButtonCal("000");
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
        clickedEnter = false;

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
                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(142, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(lblCash, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblChange, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCash, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(lbldateTime, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCustomerName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbldateTime, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(lblCustomerName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
        );
        
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
                    String text = String.valueOf(Comma.removeComma(lblCash.getText()));
                    if (text.length() <= 1) {
                        lblCash.setText("");
                    } else {
                        text = text.substring(0, text.length() - 1);
                        lblCash.setText(Comma.putComma(text));
                    }
                }
            }
        });

        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 20));
        btnEnter.setText("<html><center>Enter</center></html>");
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChange.setText("");

                double change = Double.parseDouble(Comma.removeComma(lblCash.getText())) - Double.parseDouble(Comma.removeComma(lblTotal.getText()));
                if (lblCash.getText().equals("") || lblTotal.getText().equals("")) {
                } else if (change < 0.0) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Not Enough");
                } else {
                    lblChange.setText(Comma.putComma(change + ""));
                    clickedEnter = true;
                }
            }
        });

        GroupLayout jPanel13Layout = new GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)))
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn00, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)))
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btn000, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0))))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)))
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
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
//                    queue.removeOrders(dateFormat.format(date.getTime()) + " " + String.valueOf(lbldateTime.getText()).substring(16), Integer.parseInt(lblTable.getText().substring(4)));
//                    queue.updateBacklog(dateFormat.format(date.getTime()), removeComma(lblTotal.getText()), Integer.parseInt(lblTable.getText().substring(4)) / 100);
//                    updatePopularFood();
                    resetBillToDefault();
                    checkTable();
                }
            }
        });

        btnDis10.setFont(new java.awt.Font("Tahoma", 0, 24));
        btnDis10.setText("10%");
        btnDis10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                double total = 90 * Double.parseDouble(lblTotal.getText()) / 100;
                lblTotal.setText(String.format("%,.2f", total));
            }
        });

        btnDis20.setFont(new java.awt.Font("Tahoma", 0, 24));
        btnDis20.setText("20%");
        btnDis20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                double total = 80 * Double.parseDouble(lblTotal.getText()) / 100;
                lblTotal.setText(String.format("%,.2f", total));
            }
        });

        GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnClearBill, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(billingButtonDone, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDis10, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(btnDis20, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                if (!clickedEnter) {
//                    int row = tblgetTables.getSelectedRow();
//                    int total = 0;
//                    java.util.ArrayList<java.util.HashMap> billing = queue.getBilling(Integer.parseInt(String.valueOf(tblgetTables.getValueAt(row, 0))), String.valueOf(tblgetTables.getValueAt(row, 1)));
//                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblBilling.getModel();
//                    deleteAllRow(model);
//
//                    int line = 0;
//                    for (java.util.HashMap bill : billing) {
//                        model.addRow(new Object[0]);
//                        model.setValueAt(" " + Integer.parseInt(String.valueOf(bill.get("qty"))), line, 0);
//                        model.setValueAt(" " + String.valueOf(bill.get("foodName")), line, 1);
//                        model.setValueAt(String.format("%,.2f", Integer.parseInt(String.valueOf(bill.get("total")))), line, 2);
//                        line++;
//
//                        total += Integer.parseInt(String.valueOf(bill.get("total")));
//                    }
//
//                    lbldateTime.setText("");
//                    lblCustomerName.setText("");
//                    lblTable.setText("");
//
//                    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
//                    java.util.Calendar date = new java.util.GregorianCalendar();
//                    date.setTime((java.util.Date) (spnDate.getValue()));
//                    date.add(java.util.Calendar.YEAR, -543);
//                    lbldateTime.setText(":  " + String.valueOf(dateFormat.format(date.getTime())) + "   " + String.valueOf(tblgetTables.getValueAt(row, 3)));
//                    lblCustomerName.setText(" :  " + String.valueOf(tblgetTables.getValueAt(row, 1)));
//                    lblTable.setText(" :  " + String.valueOf(tblgetTables.getValueAt(row, 0)));
//
//                    lblTotal.setText(String.format("%,.2f", total));
//                }
//            }

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
                jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spnDate, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCheckTable)
                        .addContainerGap(205, Short.MAX_VALUE))
                .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(spnDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCheckTable))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane5, GroupLayout.DEFAULT_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout contentPaneLayout = new GroupLayout(Main.contentPane);
        Main.contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel12, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //getContentPane().add(Main.contentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 855, 525));
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

    private void checkTable() {
//        java.util.ArrayList<java.util.HashMap> tables = queue.getOrders((java.util.Date) (spnDate.getValue()));
//        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblgetTables.getModel();
//        deleteAllRow(model);
//        int line = 0;
//        if (tables != null) {
//            for (java.util.HashMap table : tables) {
//                model.addRow(new Object[0]);
//                model.setValueAt(Integer.parseInt(String.valueOf(table.get("tableID"))), line, 0);
//                model.setValueAt(queue.getCustomerName(Integer.parseInt(String.valueOf(table.get("customerID")))), line, 1);
//                model.setValueAt(String.valueOf(table.get("dateTimeReserve")).substring(11, 19), line, 2);
//                model.setValueAt(String.valueOf(table.get("timeOut")).substring(11, 19), line, 3);
//                line++;
//            }
//        }
    }


    class ButtonCal extends JButton {

        public ButtonCal(String num) {
            setFont(new java.awt.Font("Tahoma", 0, 24));
            setText(num);
            addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    //if (!clickedEnter) {
                    int n = Integer.parseInt(getText());
                    if ((!lblCash.getText().equals("") && n == 0) || n != 0) {
                        lblCash.setText(Comma.putComma((Comma.removeComma(lblCash.getText()) + getText())));
                    }
                    //}
                }
            });
        }
    }

}

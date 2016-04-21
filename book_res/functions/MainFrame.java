package book_res.functions;

public class MainFrame {

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
        btnBillingDone = new javax.swing.JButton();
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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(142, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(lblCash, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblChange, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(lblChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );

        jLabel7.setText("DATE / TIMEOUT");

        jLabel9.setText("Customer's name");

        jLabel10.setText("Table No.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(lbldateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbldateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)))
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)))
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn000, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0))))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)))
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn000, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClearBill.setFont(new java.awt.Font("Tahoma", 0, 24));
        btnClearBill.setBackground(new java.awt.Color(255, 0, 0));
        btnClearBill.setText("CLEAR");
        btnClearBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetBillToDefault();
            }
        });

        btnBillingDone.setFont(new java.awt.Font("Tahoma", 0, 24));
        btnBillingDone.setBackground(new java.awt.Color(51, 204, 0));
        btnBillingDone.setText("DONE");
        btnBillingDone.addMouseListener(new java.awt.event.MouseAdapter() {
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

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnClearBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBillingDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDis10, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(btnDis20, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(btnDis20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnDis10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnBillingDone, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnClearBill, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCheckTable)
                        .addContainerGap(205, Short.MAX_VALUE))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCheckTable))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
                pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
        );
        pnlContentLayout.setVerticalGroup(
                pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 855, 525));
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

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnADay, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(btnAMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                        .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnADay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spnBacklog, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheckBacklog)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spnBacklog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCheckBacklog)))
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
                pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlContentLayout.setVerticalGroup(
                pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckPop, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCheckPop)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );


    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Queuing.disConnectDb();
    }//GEN-LAST:event_formWindowClosing

    private void btnReserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseClicked
        pnlContent.removeAll();
        initReserve();
    }//GEN-LAST:event_btnReserveMouseClicked

    private void btnBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillingMouseClicked
        pnlContent.removeAll();
        initBilling();
    }//GEN-LAST:event_btnBillingMouseClicked

    private void btnBacklogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBacklogMouseClicked
        pnlContent.removeAll();
        initBacklog();
    }//GEN-LAST:event_btnBacklogMouseClicked

    private void btnPopularFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPopularFoodMouseClicked
        pnlContent.removeAll();
        initPopular();
    }//GEN-LAST:event_btnPopularFoodMouseClicked

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
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }
}

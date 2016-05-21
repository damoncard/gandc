package book_res.interfaces;

import book_res.functions.Comma;
import book_res.functions.utils.DBBacklog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BacklogFace implements MainMenu {

    // Variable of backlog's part
    private JButton btnADay, btnAMonth, btnCheckBacklog, btnPopularFood;
    private JPanel jPanel17, jPanel18, jPanel19;
    private JScrollPane jScrollPane6;
    private JSpinner spnBacklog;
    private JTable tblBacklog;
    private boolean clickedADay, clickedAMonth;
    private DBBacklog backlog;
    private final String[] MONTHS = {"January", "Fabuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public void init() {
        jPanel17 = new javax.swing.JPanel();
        btnADay = new javax.swing.JButton();
        btnAMonth = new javax.swing.JButton();
        btnPopularFood = new JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblBacklog = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        spnBacklog = new javax.swing.JSpinner(new javax.swing.SpinnerDateModel());
        btnCheckBacklog = new javax.swing.JButton();
        backlog = new DBBacklog();

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        ((javax.swing.JSpinner.DefaultEditor) spnBacklog.getEditor()).getTextField().setText("");

        btnADay.setText("REVENUE A DAY");
        btnADay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                javax.swing.JSpinner.DateEditor dateEditor = new javax.swing.JSpinner.DateEditor(spnBacklog, "MMMMM yyyy");
                spnBacklog.setEditor(dateEditor);
                ((javax.swing.JSpinner.DefaultEditor) spnBacklog.getEditor()).getTextField().setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                clickedADay = true;
                clickedAMonth = false;
            }
        });

        btnAMonth.setText("REVENUE A MONTH");
        btnAMonth.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                javax.swing.JSpinner.DateEditor dateEditor = new javax.swing.JSpinner.DateEditor(spnBacklog, "yyyy");
                spnBacklog.setEditor(dateEditor);
                ((javax.swing.JSpinner.DefaultEditor) spnBacklog.getEditor()).getTextField().setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                clickedAMonth = true;
                clickedADay = false;
            }
        });

        btnPopularFood.setText("POPULAR FOODS");
        btnPopularFood.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                
            }
        });

        GroupLayout jPanel17Layout = new GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnADay, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(btnAMonth, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(btnPopularFood, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                        .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnADay, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAMonth, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPopularFood, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
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
                jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                        .addContainerGap())
        );

        btnCheckBacklog.setText("check");
        btnCheckBacklog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                backlog.connect();
                deleteAllRow((javax.swing.table.DefaultTableModel) tblBacklog.getModel());
                java.util.ArrayList<java.util.HashMap> logs = null;
                if (clickedADay) {
                    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM");
                    java.util.Calendar date = new java.util.GregorianCalendar();
                    date.setTime((java.util.Date) spnBacklog.getValue());

                    logs = backlog.getBacklogADay(dateFormat.format(date.getTime()));
                }
                if (clickedAMonth) {
                    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy");
                    java.util.Calendar date = new java.util.GregorianCalendar();
                    date.setTime((java.util.Date) spnBacklog.getValue());

                    logs = backlog.getBacklogAMonth(dateFormat.format(date.getTime()));
                }

                if (logs != null) {
                    int total = 0;
                    int line = 0;
                    for (java.util.HashMap log : logs) {
                        DefaultTableModel model = (DefaultTableModel) tblBacklog.getModel();
                        model.addRow(new Object[0]);
                        model.setValueAt((clickedAMonth ? MONTHS[Integer.parseInt(String.valueOf(log.get("date"))) - 1] : log.get("date")), line, 0);
                        model.setValueAt(log.get("noOfCustomer"), line, 1);
                        model.setValueAt(Comma.putComma(String.valueOf(log.get("revenue"))), line, 2);
                        total += Integer.parseInt(String.valueOf(log.get("revenue")));
                        model.setValueAt(Comma.putComma(total + ""), line, 3);
                        line++;
                    }
                }

            }
        });

        GroupLayout jPanel18Layout = new GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spnBacklog, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheckBacklog)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(spnBacklog, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCheckBacklog)))
        );

        GroupLayout contentPaneLayout = new GroupLayout(Main.contentPane);
        Main.contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
        );
    }

    private void deleteAllRow(DefaultTableModel model) {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

}

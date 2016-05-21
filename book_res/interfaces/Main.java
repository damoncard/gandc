/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_res.interfaces;

import book_res.interfaces.layout.FoodMenuButtons;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 *
 * @author eawarnong
 */
public class Main extends SimpleFace {

    private JButton backlogButton;
    private JButton billingButton;
    private JButton popularButton;
    private JButton reserveButton;
    private JLabel jLabel1;
    private JPanel jPanel3;
    private JLabel lblClock;
    private static JLabel lblUser;
    public static JPanel contentPane;
    private JPanel menuTab;
    CollectMainMenu menu;
    private Timer timer;

    public Main() {
        super("Restaurant", WindowConstants.EXIT_ON_CLOSE);
        menu.getReserve();
        setTime();
    }

    @Override
    protected void addComponents() {
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
        menu = new CollectMainMenu();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
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
                contentPane.removeAll();
                menu.getReserve();
            }
        });

        billingButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        billingButton.setText("BILLING");
        billingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        billingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentPane.removeAll();
                menu.getBilling();
            }
        });

        backlogButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backlogButton.setText("BACKLOG");
        backlogButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backlogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentPane.removeAll();
                menu.getBacklog();
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
                menuTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                menuTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(menuTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 855, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
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
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(429, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUser, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblClock, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblClock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                .addComponent(lblUser, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, -1, -1));
        pack();
    }

    private void setTime() {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy   HH:mm:ss");
                Calendar currentTime = new GregorianCalendar();
                currentTime.add(Calendar.YEAR, -543);
                lblClock.setText(timeFormat.format(currentTime.getTime()));
            }
        });
        timer.start();
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Queuing.disConnectDb();
    }//GEN-LAST:event_formWindowClosing

    private void popularButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popularButtonMouseClicked
        contentPane.removeAll();
        //initPopular();
    }//GEN-LAST:event_popularButtonMouseClicked

}

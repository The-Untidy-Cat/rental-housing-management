/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.theuntidycat.rhm.view;

import java.nio.file.Path;
import java.nio.file.Paths;
import com.formdev.flatlaf.FlatLightLaf;
import java.time.Year;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
/**
 *
 * @author SHeroAnh
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTicketIcon = new javax.swing.JLabel();
        lbWaitingTicketCount = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
        reportView1 = new com.theuntidycat.rhm.view.ReportView();
        manageInvoice1 = new com.theuntidycat.rhm.view.ManageInvoice();
        manageContract1 = new com.theuntidycat.rhm.view.ManageContract();
        manageRoom1 = new com.theuntidycat.rhm.view.ManageRoom();
        manageTenant1 = new com.theuntidycat.rhm.view.ManageTenant();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rental Housing Management");
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        lbTicketIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTicketIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theuntidycat/rhm/view/ticket-detailed.png"))); // NOI18N
        lbTicketIcon.setLabelFor(lbWaitingTicketCount);
        lbTicketIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTicketIcon);

        lbWaitingTicketCount.setText("0 phiếu cần hỗ trợ");
        jPanel1.add(lbWaitingTicketCount);

        tabPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabPanel.setMinimumSize(new java.awt.Dimension(640, 500));
        tabPanel.addTab("Thống kê", reportView1);
        tabPanel.addTab("Hoá đơn", manageInvoice1);
        tabPanel.addTab("Hợp đồng", manageContract1);
        tabPanel.addTab("Phòng", manageRoom1);
        tabPanel.addTab("Khách thuê", manageTenant1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void run() {
//        final JOptionPane optionPane = new JOptionPane("Hello world", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
//        final JDialog dialog = new JDialog();
//        dialog.setTitle("Message");
//        dialog.setModal(true);
//
//        dialog.setContentPane(optionPane);
//
//        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
//        dialog.pack();
//        dialog.setVisible(true);
        FlatLightLaf.setup();
        initComponents();
        
        Thread initContract = new Thread(new Runnable() {
            public void run() {
                manageContract1.createTable();
            }
        });
        initContract.start();
        Thread initInvoice = new Thread(new Runnable() {
            public void run() {
                manageInvoice1.updateTable();
            }
        });
        initInvoice.start();
        Thread initTenant = new Thread(new Runnable() {
            public void run() {
                manageTenant1.capnhatTable();
            }
        });
        initTenant.start();
        // manageContract1.createTable();
        // manageInvoice1.updateTable();
        // manageTenant1.capnhatTable();
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTicketIcon;
    private javax.swing.JLabel lbWaitingTicketCount;
    private com.theuntidycat.rhm.view.ManageContract manageContract1;
    private com.theuntidycat.rhm.view.ManageInvoice manageInvoice1;
    private com.theuntidycat.rhm.view.ManageRoom manageRoom1;
    private com.theuntidycat.rhm.view.ManageTenant manageTenant1;
    private com.theuntidycat.rhm.view.ReportView reportView1;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}

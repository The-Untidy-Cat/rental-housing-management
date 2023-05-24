/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.theuntidycat.rhm.view;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author SHeroAnh
 */
public class MainView extends javax.swing.JFrame {
    /**
     * Creates new form MainView
     */
    public MainView() {
        FlatLightLaf.setup(); 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTicketIcon = new javax.swing.JLabel();
        lbWaitingTicketCount = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
        manageContract2 = new com.theuntidycat.rhm.view.ManageContract();
        manageInvoice2 = new com.theuntidycat.rhm.view.ManageInvoice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rental Housing Management");
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        lbTicketIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTicketIcon.setIcon(new javax.swing.ImageIcon("F:\\course\\is216\\project\\IS216.N23.HTCL-TheUntidyCat-RHM\\assets\\ticket-detailed.png")); // NOI18N
        lbTicketIcon.setLabelFor(lbTicketIcon);
        lbTicketIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTicketIcon);

        lbWaitingTicketCount.setText("0 phiếu cần hỗ trợ");
        jPanel1.add(lbWaitingTicketCount);

        tabPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabPanel.setMinimumSize(new java.awt.Dimension(640, 500));

        manageContract2.setMinimumSize(new java.awt.Dimension(620, 385));
        tabPanel.addTab("Hợp đồng", manageContract2);

        manageInvoice2.setMinimumSize(new java.awt.Dimension(620, 385));
        tabPanel.addTab("Hóa đơn", manageInvoice2);

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
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(715, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void run() {
        new MainView().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTicketIcon;
    private javax.swing.JLabel lbWaitingTicketCount;
    private com.theuntidycat.rhm.view.ManageContract manageContract2;
    private com.theuntidycat.rhm.view.ManageInvoice manageInvoice2;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}

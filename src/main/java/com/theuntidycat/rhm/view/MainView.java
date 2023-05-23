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

        tabPanel = new javax.swing.JTabbedPane();
        manageContract1 = new com.theuntidycat.rhm.view.ManageContract();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rental Housing Management");
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        tabPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabPanel.setMinimumSize(new java.awt.Dimension(640, 500));
        tabPanel.addTab("Hợp đồng", manageContract1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(696, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void run() {
        new MainView().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.theuntidycat.rhm.view.ManageContract manageContract1;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}

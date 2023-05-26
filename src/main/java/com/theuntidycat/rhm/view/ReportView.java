package com.theuntidycat.rhm.view;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author SHeroAnh
 */
public class ReportView extends javax.swing.JPanel {

    /**
     * Creates new form ReportView
     */
    public ReportView() {
        initComponents();
        initSearchBar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportTabPane = new javax.swing.JTabbedPane();
        revenueTab = new javax.swing.JPanel();
        searchBar = new javax.swing.JPanel();
        lbMonth = new javax.swing.JLabel();
        cbbMonth = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cbbYear = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btSearch = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 385));

        reportTabPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        searchBar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        lbMonth.setText("Tháng");
        searchBar.add(lbMonth);

        cbbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonthActionPerformed(evt);
            }
        });
        searchBar.add(cbbMonth);
        searchBar.add(jSeparator1);

        jLabel1.setText("Năm");
        searchBar.add(jLabel1);

        cbbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbYearItemStateChanged(evt);
            }
        });
        searchBar.add(cbbYear);
        searchBar.add(jSeparator2);

        btSearch.setText("Tìm kiếm");
        btSearch.setName(""); // NOI18N
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        searchBar.add(btSearch);

        javax.swing.GroupLayout revenueTabLayout = new javax.swing.GroupLayout(revenueTab);
        revenueTab.setLayout(revenueTabLayout);
        revenueTabLayout.setHorizontalGroup(
            revenueTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        revenueTabLayout.setVerticalGroup(
            revenueTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(revenueTabLayout.createSequentialGroup()
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 360, Short.MAX_VALUE))
        );

        reportTabPane.addTab("Doanh thu", revenueTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportTabPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSearchActionPerformed

    private void cbbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMonthActionPerformed

    private void cbbYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbYearItemStateChanged
        DefaultComboBoxModel<String> cbbMonthModel = new DefaultComboBoxModel<>();

        Date now = new Date();
        for (int i = String.valueOf(cbbYear.getSelectedItem()).equals(Integer.toString(Year.now().getValue())) ? now.getMonth() : 11; i >= 0; i--) {
            cbbMonthModel.addElement(Integer.toString(i + 1));
        }
        cbbMonth.setModel(cbbMonthModel);
    }//GEN-LAST:event_cbbYearItemStateChanged

    public void initSearchBar (){
        DefaultComboBoxModel<String> cbbMonthModel = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> cbbYearModel = new DefaultComboBoxModel<>();
        Date now = new Date();
        for (int i = Year.now().getValue(); i >= 2015; i--) {
            cbbYearModel.addElement(Integer.toString(i));
        }
        cbbYear.setModel(cbbYearModel);
        for (int i = now.getMonth(); i >= 0; i--) {
            cbbMonthModel.addElement(Integer.toString(i + 1));
        }
        cbbMonth.setModel(cbbMonthModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbbMonth;
    private javax.swing.JComboBox<String> cbbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JTabbedPane reportTabPane;
    private javax.swing.JPanel revenueTab;
    private javax.swing.JPanel searchBar;
    // End of variables declaration//GEN-END:variables
}

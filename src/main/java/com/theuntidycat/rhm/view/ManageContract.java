/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.theuntidycat.rhm.view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ManageContract extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ManageContract() {
        initComponents();
        setVisible(true);
        createTable();
    }
    DefaultTableModel tblModelTT;
    public void createTable()
    {
        tblModelTT = new DefaultTableModel();
        String title[] = {"Mã HĐ", "Tên khách", "SĐT", "Mã phòng", "Tên phòng", "Ngày BĐ", "Ngày KT", "Trạng thái"};
        tblModelTT.setColumnIdentifiers(title);
        tbContract.setModel(tblModelTT);
        setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContractTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbContract = new javax.swing.JTable();
        ContractButton = new javax.swing.JPanel();
        viewContractDetail = new javax.swing.JButton();
        insertNewContract = new javax.swing.JButton();
        updateContract = new javax.swing.JButton();

        setLayout(null);

        ContractTable.setLayout(null);

        tbContract.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tbContract);

        ContractTable.add(jScrollPane2);
        jScrollPane2.setBounds(6, 0, 600, 342);

        add(ContractTable);
        ContractTable.setBounds(-4, -2, 600, 350);

        viewContractDetail.setText("Xem chi tiết");
        viewContractDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewContractDetailActionPerformed(evt);
            }
        });
        ContractButton.add(viewContractDetail);

        insertNewContract.setText("Thêm");
        insertNewContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewContractActionPerformed(evt);
            }
        });
        ContractButton.add(insertNewContract);

        updateContract.setText("Sửa");
        updateContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateContractActionPerformed(evt);
            }
        });
        ContractButton.add(updateContract);

        add(ContractButton);
        ContractButton.setBounds(0, 350, 600, 72);
    }// </editor-fold>//GEN-END:initComponents

    private void viewContractDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewContractDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewContractDetailActionPerformed

    private void insertNewContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewContractActionPerformed
        // TODO add your handling code here:
        ContractInsertDialog contractInsertDialog = new ContractInsertDialog();
        contractInsertDialog.setVisible(true);
    }//GEN-LAST:event_insertNewContractActionPerformed

    private void updateContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateContractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateContractActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContractButton;
    private javax.swing.JPanel ContractTable;
    private javax.swing.JButton insertNewContract;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbContract;
    private javax.swing.JButton updateContract;
    private javax.swing.JButton viewContractDetail;
    // End of variables declaration//GEN-END:variables
}

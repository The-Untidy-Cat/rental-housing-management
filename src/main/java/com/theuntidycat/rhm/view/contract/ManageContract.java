/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.theuntidycat.rhm.view.contract;

import javax.swing.table.DefaultTableModel;
import com.theuntidycat.rhm.controller.ManageContractController;
import java.sql.*;
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
    }
    
    
    DefaultTableModel tblModelTT;
    public void createTable()
    {
        tblModelTT = new DefaultTableModel();
        String title[] = {"Mã HĐ", "Ngày BĐ", "Ngày KT", "Giá thuê", "Đặt cọc","Mã khách", "Mã phòng","Trạng thái"};
        tblModelTT.setColumnIdentifiers(title);
        try
        {
            ManageContractController controller = new ManageContractController();
            String row[] = new String[8];
            ResultSet rs = controller.getContractTable();
            while(rs.next())
            {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                tblModelTT.addRow(row);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
            System.out.println("Error in ManageContract loadTable");
        } 
        
        tbContract.setModel(tblModelTT);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbContract = new javax.swing.JTable();
        ContractButton = new javax.swing.JPanel();
        viewContractDetail = new javax.swing.JButton();
        insertNewContract = new javax.swing.JButton();
        updateContract = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(500, 385));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(488, 335));

        tbContract.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tbContract.setPreferredSize(new java.awt.Dimension(488, 335));
        jScrollPane2.setViewportView(tbContract);

        ContractButton.setPreferredSize(new java.awt.Dimension(500, 30));

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

        jLabel1.setText("Tìm kiếm hợp đồng");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContractButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
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
        int indexTB = tbContract.getSelectedRow();
        if(indexTB < tblModelTT.getRowCount() && indexTB >= 0)
        {
            ContractUpdateDialog update = new ContractUpdateDialog();
            update.getContractID().setText(tblModelTT.getValueAt(indexTB, 0).toString());
            update.getTxtRoomID().setText(tblModelTT.getValueAt(indexTB, 6).toString());
            update.getRepID().setText(tblModelTT.getValueAt(indexTB, 5).toString());
            update.loadRepName();
            update.loadRoomName();
        }
    }//GEN-LAST:event_updateContractActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        if(!"".equals(txtSearch.getText()))
        {
            try
        {
            ManageContractController controller = new ManageContractController();
            ResultSet rs = controller.loadNewDataContractTable(txtSearch.getText());
            tblModelTT = new DefaultTableModel();
            String title[] = {"Mã HĐ", "Ngày BĐ", "Ngày KT", "Giá thuê", "Đặt cọc","Mã khách", "Mã phòng","Trạng thái"};
            String row[] = new String[8];
            tblModelTT.setColumnIdentifiers(title);
         
            while(rs.next())
            {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                tblModelTT.addRow(row);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
            System.out.println("Error in ManageContract SearchAction");
        }
        tbContract.setModel(tblModelTT);
        }
        else
        {
            createTable();
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    public javax.swing.JTable getTBContract()
    {
        return tbContract;
    }     
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContractButton;
    private javax.swing.JButton insertNewContract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbContract;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JButton updateContract;
    private javax.swing.JButton viewContractDetail;
    // End of variables declaration//GEN-END:variables
}

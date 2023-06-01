/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.theuntidycat.rhm.view;
import com.theuntidycat.rhm.controller.ManageTenantController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHeroAnh
 */
public class ManageTenant extends javax.swing.JPanel {

    /**
     * Creates new form ManageTenant
     */
    DefaultTableModel model;
    
    public ManageTenant(){
        initComponents();
        taoTable();
        // capnhatTable();
    }
    ManageTenantController ctrl = new ManageTenantController();
    ResultSet rs = null;
    public void taoTable(){
        model = new DefaultTableModel();
        String title[] = {"Mã KH", "Tên KH", "Quê quán", "Ngày sinh", "SĐT", "CMND", "Email", "Trạng thái"};
        model.setColumnIdentifiers(title);
        jTable1.setModel(model);
        setVisible(true);
    }
    public void capnhatTable(){
        try{
            System.out.println("Update table");
            rs = ctrl.getListOfTenant();
            model.setRowCount(0);
            while(rs.next()){
                String arr[] = new String[8];
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
                arr[2] = rs.getString(3);
                arr[3] = rs.getString(4);
                arr[4] = rs.getString(5);
                arr[5] = rs.getString(6);
                arr[6] = rs.getString(7);
                arr[7] = rs.getString(8);
                model.addRow(arr);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        actionButtonPanel = new javax.swing.JPanel();
        BtnThem = new javax.swing.JButton();
        BtnXoa = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        CBType = new javax.swing.JComboBox<>();
        BtnTim = new javax.swing.JButton();
        BtnReload = new javax.swing.JButton();

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 285));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Quê quán", "Ngày sinh", "SĐT", "CMND", "Email", "Trạng thái"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        actionButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        BtnThem.setText("Thêm");
        BtnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThemActionPerformed(evt);
            }
        });
        actionButtonPanel.add(BtnThem);

        BtnXoa.setText("Xóa");
        BtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXoaActionPerformed(evt);
            }
        });
        actionButtonPanel.add(BtnXoa);

        BtnSua.setText("Sửa");
        BtnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSuaActionPerformed(evt);
            }
        });
        actionButtonPanel.add(BtnSua);

        searchPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        CBType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoat dong", "Khong hoat dong", "Vo hieu hoa" }));
        CBType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTypeActionPerformed(evt);
            }
        });
        searchPanel.add(CBType);

        BtnTim.setText("Tìm");
        BtnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTimActionPerformed(evt);
            }
        });
        searchPanel.add(BtnTim);

        BtnReload.setText("Refresh");
        BtnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReloadActionPerformed(evt);
            }
        });
        searchPanel.add(BtnReload);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(actionButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThemActionPerformed
        // TODO add your handling code here:
        InsertTenant insert = new InsertTenant();
        insert.setVisible(true);
    }//GEN-LAST:event_BtnThemActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(jTable1.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(this, "Chọn dòng dữ liệu muốn xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int ret = JOptionPane.showConfirmDialog(null,"Bạn chắc chắc muốn xóa ?", "Xóa dữ liệu", JOptionPane.YES_NO_OPTION);
            if (ret == JOptionPane.YES_OPTION){
                String id = jTable1.getValueAt(row, 0).toString();
                model.removeRow(row);
                boolean check = ctrl.deleteTenant(id);
                if(check){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Không thể xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_BtnXoaActionPerformed

    private void BtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuaActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(this, "Chọn dòng dữ liệu muốn sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int row = jTable1.getSelectedRow();
            UpdateTenant update = new UpdateTenant();
            update.ten = model.getValueAt(row, 1).toString(); 
            update.quequan = model.getValueAt(row, 2).toString();
            update.dob = model.getValueAt(row, 3).toString();
            update.sdt = model.getValueAt(row, 4).toString();
            update.cmnd = model.getValueAt(row, 5).toString();
            update.email = model.getValueAt(row, 6).toString();
            update.id = model.getValueAt(row, 0).toString();
            update.setInformation();
            update.setVisible(true);
        }
    }//GEN-LAST:event_BtnSuaActionPerformed
    public void timKhach(String tt){
        try{
            rs = ctrl.queryTenant(tt);
            model.setRowCount(0);
            while(rs.next()){
                String arr[] = new String[8];
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
                arr[2] = rs.getString(3);
                arr[3] = rs.getString(4);
                arr[4] = rs.getString(5);
                arr[5] = rs.getString(6);
                arr[6] = rs.getString(7);
                arr[7] = rs.getString(8);
                model.addRow(arr);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    private void BtnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTimActionPerformed
        // TODO add your handling code here:
        timKhach(CBType.getSelectedItem().toString());
    }//GEN-LAST:event_BtnTimActionPerformed

    private void BtnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReloadActionPerformed
        // TODO add your handling code here:
        capnhatTable();
    }//GEN-LAST:event_BtnReloadActionPerformed

    private void CBTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReload;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnTim;
    private javax.swing.JButton BtnXoa;
    private javax.swing.JComboBox<String> CBType;
    private javax.swing.JPanel actionButtonPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables
}

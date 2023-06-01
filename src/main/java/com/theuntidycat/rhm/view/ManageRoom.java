/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.theuntidycat.rhm.view;

import com.theuntidycat.rhm.controller.ManageRoomController;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHero Anh
 */
public class ManageRoom extends javax.swing.JPanel {

    /**
     * Creates new form ManageRoom
     */
    public ManageRoom(){
        initComponents();
        taoTable();
        capnhatTable();
    }
    DefaultTableModel model;
    ManageRoomController ctrl = new ManageRoomController();
    ResultSet rs = null;
    public void taoTable(){
        model = new DefaultTableModel();
        String title[] = {"Mã phòng", "Tên phòng", "Sức chứa", "Giá thuê", "Loại phòng", "Diện tích", "Trạng thái"};
        model.setColumnIdentifiers(title);
        tbRoom.setModel(model);
        setVisible(true);
    }
    public void capnhatTable(){
        try{
            rs = ctrl.getListOfRoom();
            model.setRowCount(0);
            while(rs.next()){
                String arr[] = new String[7];
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
                arr[2] = rs.getString(3);
                arr[3] = rs.getString(4);
                arr[4] = rs.getString(5);
                arr[5] = rs.getString(6);
                arr[6] = rs.getString(7);
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

        jScrollPane4 = new javax.swing.JScrollPane();
        tbRoom = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        CBType = new javax.swing.JComboBox<>();
        CBStatus = new javax.swing.JComboBox<>();
        BtnTim = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        actionButtonPanel = new javax.swing.JPanel();
        BtnThem = new javax.swing.JButton();
        BtnXoa = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();

        jScrollPane4.setPreferredSize(new java.awt.Dimension(500, 285));

        tbRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Tên phòng", "Sức chứa", "Giá thuê", "Loại phòng", "Diện tích", "Trạng thái"
            }
        ));
        tbRoom.setToolTipText("");
        tbRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRoomMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbRoom);

        searchPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        CBType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Co may lanh", "Khong may lanh" }));
        CBType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTypeActionPerformed(evt);
            }
        });
        searchPanel.add(CBType);

        CBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Da duoc thue", "Con trong", "Dang sua chua" }));
        CBStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBStatusActionPerformed(evt);
            }
        });
        searchPanel.add(CBStatus);

        BtnTim.setText("Tìm");
        BtnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTimActionPerformed(evt);
            }
        });
        searchPanel.add(BtnTim);

        BtnRefresh.setText("Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });
        searchPanel.add(BtnRefresh);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRoomMouseClicked

    private void BtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThemActionPerformed
        // TODO add your handling code here:
        InsertRoom insert = new InsertRoom();
        insert.setVisible(true);
    }//GEN-LAST:event_BtnThemActionPerformed

    private void BtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaActionPerformed
        // TODO add your handling code here:
        if(tbRoom.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null, "Chọn dòng dữ liệu để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int row = tbRoom.getSelectedRow();
            int ret = JOptionPane.showConfirmDialog(null,"Bạn chắc chắc muốn xóa ?", "Xóa dữ liệu", JOptionPane.YES_NO_OPTION);
            if (ret == JOptionPane.YES_OPTION){
                String id = tbRoom.getValueAt(row, 0).toString();
                model.removeRow(row);
                boolean check = ctrl.deleteRoom(id);
                if(check){
                    JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Không thể xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_BtnXoaActionPerformed

    private void BtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuaActionPerformed
        if(tbRoom.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(this, "Chọn dòng dữ liệu muốn sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int row = tbRoom.getSelectedRow();
            UpdateRoom update = new UpdateRoom();
            update.ten = model.getValueAt(row, 1).toString(); 
            update.succhua = model.getValueAt(row, 2).toString();
            update.gia = model.getValueAt(row, 3).toString();
            update.dientich = model.getValueAt(row, 5).toString();
            update.id = model.getValueAt(row, 0).toString();
            update.setInformation();
            update.setVisible(true);
        }
    }//GEN-LAST:event_BtnSuaActionPerformed

    private void CBTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTypeActionPerformed

    private void CBStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBStatusActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        capnhatTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    public void timPhong(String type, String status){
        try{
            rs = ctrl.queryRoom(type, status);
            model.setRowCount(0);
            while(rs.next()){
                String arr[] = new String[7];
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
                arr[2] = rs.getString(3);
                arr[3] = rs.getString(4);
                arr[4] = rs.getString(5);
                arr[5] = rs.getString(6);
                arr[6] = rs.getString(7);
                model.addRow(arr);
            }
        } catch(SQLException e){
            //System.out.println(e);
            System.out.println(type);
            System.out.println(status);
        }
    }
    private void BtnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTimActionPerformed
        // TODO add your handling code here:
        String type = CBType.getSelectedItem().toString();
        String status = CBStatus.getSelectedItem().toString();
        timPhong(type, status);
    }//GEN-LAST:event_BtnTimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnTim;
    private javax.swing.JButton BtnXoa;
    private javax.swing.JComboBox<String> CBStatus;
    private javax.swing.JComboBox<String> CBType;
    private javax.swing.JPanel actionButtonPanel;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tbRoom;
    // End of variables declaration//GEN-END:variables
}

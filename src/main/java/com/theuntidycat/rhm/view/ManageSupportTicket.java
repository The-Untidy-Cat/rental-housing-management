/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.theuntidycat.rhm.view;

import com.theuntidycat.rhm.controller.ManageTicketController;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManageSupportTicket extends javax.swing.JPanel {

    /**
     * Creates new form ManageSupportTicket
     */
    public ManageSupportTicket() {
        initComponents();
        taoTable();
    }
    DefaultTableModel model;
    ManageTicketController ctrl = new ManageTicketController();
    ResultSet rs = null;
    public void taoTable(){
        model = new DefaultTableModel();
        String title[] = {"Mã phiếu", "Mã phòng", "Mã KH", "Ngày xảy ra", "Trạng thái"};
        model.setColumnIdentifiers(title);
        tbRoom.setModel(model);
        setVisible(true);
    }
    public void capnhatTable(){
        try{
            rs = ctrl.getListOfTicket();
            model.setRowCount(0);
            while(rs.next()){
                String arr[] = new String[5];
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
                arr[2] = rs.getString(3);
                arr[3] = rs.getString(4);
                arr[4] = rs.getString(5);
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

        searchPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CBTime = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CBStatus = new javax.swing.JComboBox<>();
        BtnTim = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbRoom = new javax.swing.JTable();
        actionButtonPanel = new javax.swing.JPanel();
        BtnViewDetail = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();

        searchPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabel2.setText("Thời gian");
        searchPanel.add(jLabel2);

        CBTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5/2023", "4/2023", "3/2023", "2/2023", "1/2023" }));
        searchPanel.add(CBTime);

        jLabel1.setText("Trạng thái");
        searchPanel.add(jLabel1);

        CBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoan tat", "Cho xu ly" }));
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

        jScrollPane4.setPreferredSize(new java.awt.Dimension(500, 285));

        tbRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Mã phòng", "Mã KH", "Ngày xảy ra", "Trạng thái"
            }
        ));
        tbRoom.setToolTipText("");
        tbRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRoomMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbRoom);

        actionButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        BtnViewDetail.setText("Xem chi tiết");
        BtnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewDetailActionPerformed(evt);
            }
        });
        actionButtonPanel.add(BtnViewDetail);

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
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(actionButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void timTicket(String status, String period){
        try{
            rs = ctrl.queryTicket(status, period);
            model.setRowCount(0);
            while(rs.next()){
                String arr[] = new String[6];
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
                arr[2] = rs.getString(3);
                arr[3] = rs.getString(4);
                arr[4] = rs.getString(5);
                arr[5] = rs.getString(6);
                model.addRow(arr);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    private void BtnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTimActionPerformed
        // TODO add your handling code here:
        String period = CBTime.getSelectedItem().toString();
        String status = CBStatus.getSelectedItem().toString();
        timTicket(status, period);
    }//GEN-LAST:event_BtnTimActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        capnhatTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void tbRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRoomMouseClicked

    private void BtnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewDetailActionPerformed
        // TODO add your handling code here:
        DetailTicket detail = new DetailTicket();
        detail.setInformation(tbRoom.getValueAt(tbRoom.getSelectedRow(), 0).toString());
        detail.setVisible(true);
    }//GEN-LAST:event_BtnViewDetailActionPerformed

    private void BtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuaActionPerformed
        if(tbRoom.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(this, "Chọn dòng dữ liệu muốn sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int row = tbRoom.getSelectedRow();
            UpdateTicket update = new UpdateTicket();
            String ticket_id = tbRoom.getValueAt(row, 0).toString();
            String room_id = tbRoom.getValueAt(row, 1).toString();
            String tenant_id = tbRoom.getValueAt(row, 2).toString();
            String date = tbRoom.getValueAt(row, 3).toString();
            String description = ctrl.getDescription(ticket_id);
            update.setInformation(ticket_id, room_id, tenant_id, date,  description);
            update.setVisible(true);
        }
    }//GEN-LAST:event_BtnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnTim;
    private javax.swing.JButton BtnViewDetail;
    private javax.swing.JComboBox<String> CBStatus;
    private javax.swing.JComboBox<String> CBTime;
    private javax.swing.JPanel actionButtonPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tbRoom;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.theuntidycat.rhm.view.ticket;

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
        tbTicket.setModel(model);
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
        txtRoom = new javax.swing.JTextField();
        BtnTim = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTicket = new javax.swing.JTable();
        actionButtonPanel = new javax.swing.JPanel();
        BtnSua = new javax.swing.JButton();
        BtnViewDetail = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        searchPanel.setMinimumSize(new java.awt.Dimension(447, 33));
        searchPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabel2.setText("Thời gian");
        searchPanel.add(jLabel2);

        CBTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5/2023", "4/2023", "3/2023", "2/2023", "1/2023" }));
        searchPanel.add(CBTime);

        jLabel1.setText("Phòng");
        searchPanel.add(jLabel1);
        searchPanel.add(txtRoom);

        BtnTim.setText("Tìm");
        BtnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTimActionPerformed(evt);
            }
        });
        searchPanel.add(BtnTim);

        BtnRefresh.setText("Làm mới");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });
        searchPanel.add(BtnRefresh);

        add(searchPanel, java.awt.BorderLayout.PAGE_START);

        tbTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Mã phòng", "Mã KH", "Ngày xảy ra", "Trạng thái"
            }
        ));
        tbTicket.setToolTipText("");
        tbTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTicketMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbTicket);

        add(jScrollPane4, java.awt.BorderLayout.CENTER);

        actionButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        BtnSua.setText("Sửa");
        BtnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSuaActionPerformed(evt);
            }
        });
        actionButtonPanel.add(BtnSua);

        BtnViewDetail.setText("Xem chi tiết");
        BtnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewDetailActionPerformed(evt);
            }
        });
        actionButtonPanel.add(BtnViewDetail);

        add(actionButtonPanel, java.awt.BorderLayout.PAGE_END);
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
                model.addRow(arr);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    private void BtnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTimActionPerformed
        // TODO add your handling code here:
        String period = CBTime.getSelectedItem().toString();
        String roomid = txtRoom.getText();
        timTicket(roomid, period);
    }//GEN-LAST:event_BtnTimActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        capnhatTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void tbTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTicketMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTicketMouseClicked

    private void BtnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewDetailActionPerformed
        // TODO add your handling code here:
        if(tbTicket.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(this, "Chọn dòng dữ liệu muốn xem chi tiết.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            DetailTicket detail = new DetailTicket();
            int row         = tbTicket.getSelectedRow();
            String id       = tbTicket.getValueAt(row, 0).toString();
            String roomid   = tbTicket.getValueAt(row, 1).toString();
            String tenantid = tbTicket.getValueAt(row, 2).toString();
            String date     = tbTicket.getValueAt(row, 3).toString();
            String status   = tbTicket.getValueAt(row, 4).toString();
            detail.setInformation(id, roomid, tenantid, date, status);
            detail.setVisible(true);
        }
    }//GEN-LAST:event_BtnViewDetailActionPerformed

    private void BtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuaActionPerformed
        if(tbTicket.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(this, "Chọn dòng dữ liệu muốn sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int row = tbTicket.getSelectedRow();
            UpdateTicket update = new UpdateTicket();
            String ticket_id    = tbTicket.getValueAt(row, 0).toString();
            String room_id      = tbTicket.getValueAt(row, 1).toString();
            String tenant_id    = tbTicket.getValueAt(row, 2).toString();
            String date         = tbTicket.getValueAt(row, 3).toString();
            String description  = ctrl.getDescription(ticket_id);
            update.setInformation(ticket_id, room_id, tenant_id, date,  description);
            update.setVisible(true);
        }
    }//GEN-LAST:event_BtnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnTim;
    private javax.swing.JButton BtnViewDetail;
    private javax.swing.JComboBox<String> CBTime;
    private javax.swing.JPanel actionButtonPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tbTicket;
    private javax.swing.JTextField txtRoom;
    // End of variables declaration//GEN-END:variables
}

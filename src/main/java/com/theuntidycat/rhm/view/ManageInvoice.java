/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.theuntidycat.rhm.view;

import com.theuntidycat.rhm.controller.ManageInvoiceController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TTMC
 */
public class ManageInvoice extends javax.swing.JPanel {

    /**
     * Creates new form ManageInvoice
     */
    //ManageInvoiceController controller = new ManageInvoiceController();
    
    public ManageInvoice() {
        initComponents();
        createTable();
        updateTable();
        setCbbRoom();
        setCbbPeriod();
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
        jLabel1 = new javax.swing.JLabel();
        CbbKy = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CbbRoom = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btRef = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInvoice = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btXem = new javax.swing.JButton();

        searchPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabel1.setText("Kỳ đóng:");
        searchPanel.add(jLabel1);

        CbbKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbbKyActionPerformed(evt);
            }
        });
        searchPanel.add(CbbKy);

        jLabel2.setText("Phòng:");
        searchPanel.add(jLabel2);

        searchPanel.add(CbbRoom);

        jButton1.setText("Tìm");
        searchPanel.add(jButton1);

        btRef.setText("refresh");
        btRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefActionPerformed(evt);
            }
        });
        searchPanel.add(btRef);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(488, 285));

        tbInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa đơn", "Kỳ đóng", "Phòng", "Tổng tiền", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tbInvoice);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btXem.setText("Xem chi tiết");
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(btXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btXem))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void setCbbRoom(){
        try{
            ManageInvoiceController controller = new ManageInvoiceController();
            CbbRoom.addItem("Tất cả");
            ResultSet rs = controller.getRooms();
            while(rs.next()){
                CbbRoom.addItem(rs.getString(1));
            }
        } catch(SQLException e){
            System.out.println("Error at ManageInvoice/setCbbRoom\nError: " + e);
        }
    }
    
    public void setCbbPeriod(){
        try{
            ManageInvoiceController controller = new ManageInvoiceController();            
            CbbKy.addItem("Tất cả");
            ResultSet rs = controller.getPeriod();
            while(rs.next()){
                CbbKy.addItem(rs.getString(1));
            }
        } catch(SQLException e){
            System.out.println("Error at ManageInvoice/setCbbPeriod\nError: " + e);
        }
    }
    
    DefaultTableModel tblModelTT;
    public void createTable()
    {
        tblModelTT = new DefaultTableModel();
        String title[] = {"Mã Hóa Đơn", "Kỳ đóng", "Phòng", "Tổng tiền", "Trạng thái"};
        tblModelTT.setColumnIdentifiers(title);
        tbInvoice.setModel(tblModelTT);
        setVisible(true);
    }
    
    public void updateTable(){
        try{
            ManageInvoiceController controller = new ManageInvoiceController();
            ResultSet rs = controller.getInvoices();
            while(rs.next()){
                String arr[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                tblModelTT.addRow(arr);
            }
            setVisible(true);
        } catch(SQLException e){
            System.out.println("Error at ManageInvoice/updateTable");
        }
    }
    
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        InfInvoice inf = new InfInvoice();
        //inf.insertNew();
    }//GEN-LAST:event_btThemActionPerformed

    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
        // TODO add your handling code here:
        int n = tbInvoice.getSelectedRow();
        String ph = (String) tbInvoice.getValueAt(n, 2);
        String k = (String) tbInvoice.getValueAt(n, 1);
        System.out.println(ph);
        System.out.println(k);
        DetailInvoice detail = new DetailInvoice();
        detail.setTxt(ph, k);
        //DetailInvoice detail = new DetailInvoice(ph,k);
    }//GEN-LAST:event_btXemActionPerformed

    private void CbbKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbbKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbbKyActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int n = tbInvoice.getSelectedRow();
        String id = (String) tbInvoice.getValueAt(n, 0);
        ManageInvoiceController controller = new ManageInvoiceController();
        boolean check = controller.deleteInvoice(id);
        if(check){
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Xác nhận", JOptionPane.INFORMATION_MESSAGE);

            /*JFrame fr = new JFrame();
            JDialog dialog = new JDialog(fr, "Thông báo", true);
            JPanel mGUI = new JPanel(new BorderLayout());
            mGUI.setBorder(new EmptyBorder(20,50,20,50));
            mGUI.add(new JLabel("Xóa thành công"), BorderLayout.CENTER);
       
            JPanel PanBt = new JPanel(new FlowLayout());
            mGUI.add(PanBt, BorderLayout.SOUTH);
            JButton btOK = new JButton("OK");
            btOK.addActionListener(e->{                
                dialog.setVisible(false);
            });
            PanBt.add(btOK);
       
            dialog.setContentPane(mGUI);
            dialog.pack();
            dialog.setVisible(true);*/
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefActionPerformed
        // TODO add your handling code here:
        tblModelTT.setRowCount(0);
        updateTable();
    }//GEN-LAST:event_btRefActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int n = tbInvoice.getSelectedRow();
        String ph = (String) tbInvoice.getValueAt(n, 2);
        String k = (String) tbInvoice.getValueAt(n, 1);
        String[] ky = k.split("/");
        String id = (String) tbInvoice.getValueAt(n, 0);
        
        //InfInvoice inf = new InfInvoice();
        //inf.updateExisted(ph, ky[0], ky[1], id);
    }//GEN-LAST:event_btSuaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbKy;
    private javax.swing.JComboBox<String> CbbRoom;
    private javax.swing.JButton btRef;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tbInvoice;
    // End of variables declaration//GEN-END:variables


}

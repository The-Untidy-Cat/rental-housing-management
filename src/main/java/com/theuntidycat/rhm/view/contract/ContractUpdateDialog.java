/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.theuntidycat.rhm.view.contract;

import com.theuntidycat.rhm.controller.ManageContractController;
import com.theuntidycat.rhm.view.tenant.InsertTenant;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
/**
 *
 * @author Dell
 */
public class ContractUpdateDialog extends javax.swing.JFrame {

    /**
     * Creates new form ContractUpdateDialog
     */
    public String statusRoom;
    public String statusContract;
    public ContractUpdateDialog() {
        initComponents();
        setVisible(true);
        txtContractID.setEditable(false);
        txtRoomID.setEditable(false);
        txtRoomName.setEditable(false);
        txtRepID.setEditable(false);
        txtRepCCCD.setEditable(false);
        txtTenantID.setEditable(false);
    }

    public void checkStatus()
    {
        if(!statusRoom.equals("Con trong") || !statusContract.equals("Hieu luc"))
        {
            JOptionPane.showMessageDialog(this, "Không thể thêm người ở cùng vì trạng thái hợp đồng hoặc phòng không hợp lệ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        }
    }
    
    
    public void loadRepName()
    {
        try
        {
            checkStatus();
            ManageContractController controller = new ManageContractController();
            ResultSet rs = controller.getRepCCCD(txtRepID.getText());
            rs.next();
            txtRepCCCD.setText(rs.getString(1));
        }
        catch(SQLException e)
        {
            System.out.println(e);
            System.out.println("Error in ContractUpdateDialog loadRepName");
        }
    }
    
    public void loadRoomName()
    {
        try
        {
            ManageContractController controller = new ManageContractController();
            ResultSet rs = controller.getRoomName(txtRoomID.getText());
            rs.next();
            txtRoomName.setText(rs.getString("NAME"));
        }
        catch(SQLException e)
        {
            System.out.println(e);
            System.out.println("Error in ContractUpdateDialog RoomIDAction");
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

        jPanel1 = new javax.swing.JPanel();
        buttonCancel = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtContractID = new javax.swing.JTextField();
        txtRoomID = new javax.swing.JTextField();
        txtRoomName = new javax.swing.JTextField();
        txtRepID = new javax.swing.JTextField();
        txtRepCCCD = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtTenantID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        newTenantButton = new javax.swing.JButton();
        txtTenantCCCD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm người ở cùng");
        setAlwaysOnTop(true);

        buttonCancel.setText("Huỷ");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancel);

        buttonAdd.setText("Hoàn tất");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdd);

        jPanel2.setPreferredSize(new java.awt.Dimension(180, 210));
        jPanel2.setLayout(new java.awt.GridLayout(7, 1, 0, 10));

        jLabel7.setText("Mã hợp đồng");
        jPanel2.add(jLabel7);

        jLabel1.setText("Mã phòng");
        jPanel2.add(jLabel1);

        jLabel2.setText("Tên phòng");
        jPanel2.add(jLabel2);

        jLabel3.setText("Mã người đại diện");
        jPanel2.add(jLabel3);

        jLabel4.setText("CCCD người đại diện");
        jPanel2.add(jLabel4);

        jLabel5.setText("Mã người thuê muốn thêm");
        jPanel2.add(jLabel5);

        jLabel6.setText("CCCD người thuê muốn thêm");
        jPanel2.add(jLabel6);

        jPanel4.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 224));
        jPanel3.setLayout(new java.awt.GridLayout(7, 1, 0, 10));
        jPanel3.add(txtContractID);
        jPanel3.add(txtRoomID);
        jPanel3.add(txtRoomName);
        jPanel3.add(txtRepID);
        jPanel3.add(txtRepCCCD);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0);
        flowLayout1.setAlignOnBaseline(true);
        jPanel5.setLayout(flowLayout1);

        txtTenantID.setPreferredSize(new java.awt.Dimension(118, 22));
        jPanel5.add(txtTenantID);

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator1.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel5.add(jSeparator1);

        newTenantButton.setText("Mới");
        newTenantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTenantButtonActionPerformed(evt);
            }
        });
        jPanel5.add(newTenantButton);

        jPanel3.add(jPanel5);

        txtTenantCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenantCCCDActionPerformed(evt);
            }
        });
        jPanel3.add(txtTenantCCCD);

        jPanel4.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn huỷ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
            setVisible(false);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        ManageContractController controller = new ManageContractController();
        try
        {
            Date nowdate = new Date();
            DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
            String contract_id = txtContractID.getText();
            String tenant_id = txtTenantID.getText();
            
            controller.updateContract(contract_id, tenant_id);
            JOptionPane.showMessageDialog(this, "Them nguoi o ghep thanh cong!");
            setVisible(false);
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Error in ContractUpdateDialog buttonAdd");
            JOptionPane.showMessageDialog(this, "Them nguoi o ghep khong thanh cong!");
        }
                
    }//GEN-LAST:event_buttonAddActionPerformed
    
    private void newTenantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTenantButtonActionPerformed
        InsertTenant insert = new InsertTenant();
        insert.setVisible(true);
    }//GEN-LAST:event_newTenantButtonActionPerformed

    private void txtTenantCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenantCCCDActionPerformed
        // TODO add your handling code here:
        ManageContractController controller = new ManageContractController();
        try
        {
            ResultSet rs = controller.getTenantID(txtTenantCCCD.getText());
            rs.next();
            txtTenantID.setText(rs.getString("ID"));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin CCCD", "Notification", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Error in ContractUpdateDialog txtTenantCCCD");
        }
    }//GEN-LAST:event_txtTenantCCCDActionPerformed
    
    /**
     * @param args the command line arguments
     * @return 
     * 
     */
     
    public javax.swing.JTextField getTxtRoomID()
    {
        return txtRoomID;
    }
    public javax.swing.JTextField getRepCCCD()
    {
        return txtRepCCCD;
    }
    
    public javax.swing.JTextField getRepID()
    {
        return txtRepID;
    }
    
    public javax.swing.JTextField getContractID()
    {
        return txtContractID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newTenantButton;
    private javax.swing.JTextField txtContractID;
    private javax.swing.JTextField txtRepCCCD;
    private javax.swing.JTextField txtRepID;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtRoomName;
    private javax.swing.JTextField txtTenantCCCD;
    private javax.swing.JTextField txtTenantID;
    // End of variables declaration//GEN-END:variables
}

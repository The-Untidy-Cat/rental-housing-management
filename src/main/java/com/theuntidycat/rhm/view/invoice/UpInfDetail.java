/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.theuntidycat.rhm.view.invoice;

import com.theuntidycat.rhm.controller.ManageInvoiceController;
import javax.swing.JOptionPane;

/**
 *
 * @author TTMC
 */
public class UpInfDetail extends javax.swing.JFrame {

    /**
     * Creates new form UpInfDetail
     */
    public UpInfDetail() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtDG = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btQuay = new javax.swing.JButton();
        btThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhật CTHĐ");
        setAlwaysOnTop(true);

        jPanel4.setPreferredSize(new java.awt.Dimension(80, 120));
        jPanel4.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        jLabel1.setText("Mã hóa đơn");
        jPanel4.add(jLabel1);

        jLabel2.setText("Loại hóa đơn");
        jPanel4.add(jLabel2);

        jLabel3.setText("Số lượng");
        jPanel4.add(jLabel3);

        jLabel5.setText("Đơn giá");
        jPanel4.add(jLabel5);

        jPanel1.add(jPanel4);

        jPanel3.setPreferredSize(new java.awt.Dimension(150, 120));
        jPanel3.setLayout(new java.awt.GridLayout(4, 1, 0, 10));
        jPanel3.add(txtID);
        jPanel3.add(txtType);

        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });
        jPanel3.add(txtSL);

        txtDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDGActionPerformed(evt);
            }
        });
        jPanel3.add(txtDG);

        jPanel1.add(jPanel3);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        btQuay.setText("Quay lại");
        btQuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuayActionPerformed(evt);
            }
        });
        jPanel2.add(btQuay);

        btThem.setText("Hoàn tất");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        jPanel2.add(btThem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void displayExisted(String id, String type, String sl, String dg){
        txtID.setText(id);
        txtType.setEditable(false);
        txtType.setText(type);
        txtID.setEditable(false);
        txtSL.setText(sl);
        txtDG.setText(dg);
        
        
    }
    private void txtDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDGActionPerformed
        // TODO add your handling code here:
        String t = txtDG.getText();
             try{
                 double n = Double.parseDouble(t);
             } catch(NumberFormatException ex){
                txtDG.setText("");
                JOptionPane.showMessageDialog(this, "Chỉ nhập số");
             }
    }//GEN-LAST:event_txtDGActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        String loai = txtType.getText();
       String sl = txtSL.getText();
        String dg = txtDG.getText();

        ManageInvoiceController controller = new ManageInvoiceController();
        boolean check = controller.updateDetail(id, loai, sl, dg);

        if(check){
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Xác nhận", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "Trùng thông tin với chi tiết hóa đơn khác. Vui lòng nhập lại", "Xác nhận", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btQuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuayActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btQuayActionPerformed

    private void txtSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLActionPerformed
        // TODO add your handling code here:
        String t = txtSL.getText();
             try{
                 double n = Double.parseDouble(t);
             } catch(NumberFormatException ex){
                txtSL.setText("");
                JOptionPane.showMessageDialog(this, "Chỉ nhập số");
             }
    }//GEN-LAST:event_txtSLActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btQuay;
    private javax.swing.JButton btThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtDG;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}

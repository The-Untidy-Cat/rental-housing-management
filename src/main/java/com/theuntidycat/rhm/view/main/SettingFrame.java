/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.theuntidycat.rhm.view.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.theuntidycat.rhm.controller.AppPropertiseController;
import javax.swing.JOptionPane;

/**
 *
 * @author SHeroAnh
 */
public class SettingFrame extends javax.swing.JFrame {

    /**
     * Creates new form SettingFrame
     */
    public SettingFrame() {
        FlatLightLaf.setup();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailFromPanel = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        inpEmail = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        inpPassword = new javax.swing.JPasswordField();
        lbSmtpHost = new javax.swing.JLabel();
        inpSmtpHost = new javax.swing.JTextField();
        lbSmtpPort = new javax.swing.JLabel();
        inpSmtpPort = new javax.swing.JTextField();
        lbCert = new javax.swing.JLabel();
        cbSsl = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cài đặt");
        setAlwaysOnTop(true);
        setResizable(false);

        emailFromPanel.setLayout(new java.awt.GridLayout(6, 2, 0, 15));

        lbEmail.setText("Địa chỉ Email");
        emailFromPanel.add(lbEmail);
        emailFromPanel.add(inpEmail);

        lbPassword.setText("Mật khẩu");
        emailFromPanel.add(lbPassword);
        emailFromPanel.add(inpPassword);

        lbSmtpHost.setText("Địa chỉ máy chủ SMTP");
        emailFromPanel.add(lbSmtpHost);
        emailFromPanel.add(inpSmtpHost);

        lbSmtpPort.setText("Cổng SMTP");
        emailFromPanel.add(lbSmtpPort);
        emailFromPanel.add(inpSmtpPort);

        lbCert.setText("Chứng chỉ");
        emailFromPanel.add(lbCert);

        cbSsl.setText("SSL");
        cbSsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSslActionPerformed(evt);
            }
        });
        emailFromPanel.add(cbSsl);

        jSeparator1.setForeground(java.awt.SystemColor.control);
        emailFromPanel.add(jSeparator1);

        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        emailFromPanel.add(btnUpdate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailFromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailFromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbSslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSslActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            AppPropertiseController config = new AppPropertiseController();
            config.setData("email", inpEmail.getText());
            config.setData("password", String.valueOf(inpPassword.getPassword()));
            config.setData("smtp_host", inpSmtpHost.getText());
            config.setData("smtp_port", inpSmtpPort.getText());
            config.setData("ssl", String.valueOf(cbSsl.isSelected()));
            setVisible(false);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public void run() {
        setVisible(true);
        loadConfig();
    }

    public void loadConfig() {
        AppPropertiseController config = new AppPropertiseController();
        System.out.println(Boolean.valueOf(config.getData("ssl")));
        inpEmail.setText(config.getData("email"));
        inpPassword.setText(config.getData("password"));
        inpSmtpHost.setText(config.getData("smtp_host"));
        inpSmtpPort.setText(config.getData("smtp_port"));
        cbSsl.setSelected(Boolean.valueOf(config.getData("ssl")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbSsl;
    private javax.swing.JPanel emailFromPanel;
    private javax.swing.JTextField inpEmail;
    private javax.swing.JPasswordField inpPassword;
    private javax.swing.JTextField inpSmtpHost;
    private javax.swing.JTextField inpSmtpPort;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCert;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSmtpHost;
    private javax.swing.JLabel lbSmtpPort;
    // End of variables declaration//GEN-END:variables
}

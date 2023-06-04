/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.theuntidycat.rhm.view.contract;

import javax.swing.JOptionPane;
import com.theuntidycat.rhm.controller.ManageContractController;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
/**
 *
 * @author Dell
 */
public class ContractViewDetailDialog extends javax.swing.JFrame {

    /**
     * Creates new form ContractViewDetailDialog
     */
    public ContractViewDetailDialog() {
        initComponents();
        txtContractID.setEditable(false);
        txtCapacity.setEditable(false);
        txtDeposit.setEditable(false);
        txtPrice.setEditable(false);
        txtRep.setEditable(false);
        txtRoomID.setEditable(false);
        txtContractID.setEditable(false);
        txtStatus.setEditable(false);
        tbTenant.setEnabled(false);
        startDate.setEditable(false);
        endDate.setEditable(false);
        setVisible(true);
    }
    
    public void loadRoomCapacity()
    {
        try
        {
            ManageContractController controller = new ManageContractController();
            ResultSet rs = controller.getRoomCapacity(txtRoomID.getText());
            rs.next();
            txtCapacity.setText(rs.getString(1));
        }
        catch(SQLException e)
        {
            System.out.println(e);
            System.out.println("Error in ContractViewDetailDialog loadRoomCapacity");
        }
    }
    
    DefaultTableModel model;
    public void createTable()
    {
        model = new DefaultTableModel();
        String title[] = {"Mã khách thuê", "Tên khách thuê", "Số CCCD", "Số ĐT"};
        model.setColumnIdentifiers(title);
        try
        {
            ManageContractController controller = new ManageContractController();
            String row[] = new String[4];
            ResultSet rs = controller.loadTenantTb(txtContractID.getText());
            while(rs.next())
            {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                model.addRow(row);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
            System.out.println("Error in ContractViewDetailDialog createTable");
        } 
        tbTenant.setModel(model);
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
        tbTenant = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContractID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        startDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRep = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        endDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRoomID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCapacity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        buttonBack = new javax.swing.JButton();
        buttonPrint = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Contract Detail");
        setAlwaysOnTop(true);

        tbTenant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbTenant);

        jPanel1.setLayout(new java.awt.GridLayout(5, 5, 10, 10));

        jLabel1.setText("Mã hợp đồng");
        jPanel1.add(jLabel1);
        jPanel1.add(txtContractID);

        jLabel2.setText("Số tiền đặt cọc");
        jPanel1.add(jLabel2);
        jPanel1.add(txtDeposit);

        jLabel3.setText("Ngày bắt đầu");
        jPanel1.add(jLabel3);
        jPanel1.add(startDate);

        jLabel4.setText("Mã người đại diện");
        jPanel1.add(jLabel4);
        jPanel1.add(txtRep);

        jLabel5.setText("Ngày kết thúc");
        jPanel1.add(jLabel5);
        jPanel1.add(endDate);

        jLabel6.setText("Mã phòng");
        jPanel1.add(jLabel6);
        jPanel1.add(txtRoomID);

        jLabel7.setText("Giá thuê hàng tháng");
        jPanel1.add(jLabel7);
        jPanel1.add(txtPrice);

        jLabel8.setText("Trạng thái hợp đồng");
        jPanel1.add(jLabel8);
        jPanel1.add(txtStatus);

        jLabel10.setText("Sức chứa");
        jPanel1.add(jLabel10);
        jPanel1.add(txtCapacity);

        buttonBack.setText("Quay lại");
        buttonBack.setMaximumSize(new java.awt.Dimension(75, 30));
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonPrint.setText("In hợp đồng");
        buttonPrint.setPreferredSize(new java.awt.Dimension(75, 30));
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Danh sách những người trong phòng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn quay lại?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
            setVisible(false);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        // TODO add your handling code here:
        String MaHD = txtContractID.getText();
        Document document = new Document(PageSize.A4);
        String filename = "HD"+MaHD;
                    
            try
            {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("reports/"+filename+".pdf"));
                document.open();
                
                //Dinh dang thuoc tinh, noi dung cua file pdf
                document.addAuthor("Whitie");
                document.addCreationDate();
                document.addCreator("RentalHousingManagement");
                document.addTitle("Chi tiết hợp đồng");
                document.addSubject("Chi tiết hợp đồng");
                
                //Dinh nghia cac font su dung trong noi dung file report
                //Dinh dang unicode tieng viet cac font tieu de
                File filefontTieuDe = new File("assets/font/vuArialBold.ttf");
                BaseFont bfTieuDe = BaseFont.createFont(filefontTieuDe.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                
                //fontTieuDe1 in dam, size 16, mau blue
                Font fontTieuDe1 = new Font(bfTieuDe, 16);
                fontTieuDe1.setColor(BaseColor.BLUE);
                //fontTieuDe2 in dam, size 13, mau blue
                Font fontTieuDe2 = new Font(bfTieuDe, 13);
                fontTieuDe1.setColor(BaseColor.BLUE);
                //fontTieuDe3 in dam, size 13, mau den
                Font fontTieuDe3 = new Font(bfTieuDe, 13);
                //fontTieuDe4 in dam, size 12, mau den
                Font fontTieuDe4 = new Font(bfTieuDe, 12);
                
                
                //Dinh dang unicode tieng viet cac font noi dung
                File filefontNoiDung = new File("assets/font/vuArial.ttf");
                BaseFont bfNoiDung = BaseFont.createFont(filefontNoiDung.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                
                //fontNoiDung1 in thuong, size 13, mau den
                Font fontNoiDung1 = new Font(bfNoiDung, 13);
                //fontNoiDung2 in thuong, size 12, mau den
                Font fontNoiDung2 = new Font(bfNoiDung, 12);
                //fontNoiDung3 in thuong, size 11, mau den
                Font fontNoiDung3 = new Font(bfNoiDung, 11);
                
                //Chen logo
                Image logo = Image.getInstance("assets/building.png");
                //Set vi tri tu goc duoi cung ben trai
                logo.setAbsolutePosition(80, 750);
                //Set kich thuoc height va width cua anh
                logo.scaleAbsolute(50,50);
                //add vao document
                document.add(logo);
                
                //Chen thong tin phong tro
                //Chen ten phong tro
                Paragraph prgTenNT = new Paragraph("NHÀ TRỌ ABC", fontTieuDe2);
                prgTenNT.setIndentationLeft(100); //Set kc tu bien trai
                document.add(prgTenNT);
                
                //Chen dia chi phong tro
                Paragraph prgDiaChiNT = new Paragraph("Khu phố xxx, phường xxxxxxxxx, Tp.xxxxxx", fontNoiDung2);
                prgDiaChiNT.setIndentationLeft(100);
                document.add(prgDiaChiNT);
                
                //Chen sdt nha tro
                Paragraph prgSoDTNT = new Paragraph("SDT: 090xxxxxxx", fontNoiDung2);
                prgSoDTNT.setIndentationLeft(100);
                document.add(prgSoDTNT);
                
                //Chen Tieu De
                Paragraph prgTieuDe = new Paragraph("MẪU HỢP ĐỒNG THUÊ NHÀ", fontTieuDe1);
                prgTieuDe.setAlignment(Element.ALIGN_CENTER);
                prgTieuDe.setSpacingBefore(10);
                prgTieuDe.setSpacingAfter(10);
                document.add(prgTieuDe);
                
                //Xu ly noi dung thong tin nguoi dai dien
                //Khai bao bien NgKham va TenBS de hien thi trong phan noi dung nay
//                String ngKham = "";
//                String tenBS = "";
                
                try
                {
                    ManageContractController controller = new ManageContractController();
                    ResultSet rs = controller.getTenantName(txtRep.getText());
                    
                    if(rs.next())
                    {
                        //Chen thong tin khach thue
                        List listTTKH = new List(List.UNORDERED);
                        
                        //Ho ten khach thue
                        listTTKH.add(new ListItem("Họ tên người đại diện: "+rs.getString("NAME").toUpperCase(), fontTieuDe3));
                        
                        //Ma khach thue
                        listTTKH.add(new ListItem("Mã người đại diện: "+txtRep.getText().toUpperCase(), fontNoiDung1));
                        
                        //Que quan
                        listTTKH.add(new ListItem("Quê quán: "+rs.getString("HOMETOWN").toUpperCase(), fontNoiDung1));
                        
                        //Ngay sinh
                        String[] arrayNgSinh = rs.getString("NgSinh").split("-");
                        String ngay = arrayNgSinh[2];
                        String thang = arrayNgSinh[1];
                        String nam = arrayNgSinh[0];
                        listTTKH.add(new ListItem("Ngay sinh: "+ ngay + "/" + thang + "/" + nam, fontNoiDung1));
                        
                        //Dia chi
                        listTTKH.add(new ListItem("Dia chi: " + rs.getString("DChi"), fontNoiDung1));
                        
                        //So DT
                        listTTKH.add(new ListItem("SDT: " + rs.getString("DThoai"), fontNoiDung1));
                        
                        //Yeu cau kham
                        listTTKH.add(new ListItem("Yeu cau kham: " + rs.getString("YeuCauKham"), fontNoiDung1));
                        
                        //Ket luan
                        listTTKH.add(new ListItem("Ket luan: " + rs.getString("KetLuan"), fontTieuDe3));
                        
                        //add vao document
                        document.add(listTTKH);
                        
                        //Gan gia tri cho NgKham va tenBS
                        ngKham = rs.getString("NgayKham");
                        tenBS = rs.getString("TenBS");
                    }
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                    System.out.println("Error");
                }
                    
                //Chen ngay kham va thong tin bac si
                PdfPTable tableTTBS = new PdfPTable(2);
                tableTTBS.setWidthPercentage(90);
                tableTTBS.setSpacingBefore(10);
                tableTTBS.setSpacingAfter(10);
                
                //Set column width
                float[] tableTTBS_columnWidths = {300,200};
                tableTTBS.setWidths(tableTTBS_columnWidths);
                
                //chen noi dung
                //chen dong 1
                PdfPCell cellGhiChu = new PdfPCell(new Paragraph("Ghi chu: ", fontNoiDung3));
                cellGhiChu.setBorder(0);
                cellGhiChu.setRowspan(3);
                cellGhiChu.setHorizontalAlignment(Element.ALIGN_LEFT);
                cellGhiChu.setVerticalAlignment(Element.ALIGN_TOP);
                tableTTBS.addCell(cellGhiChu);
                
                
                String[] arrNgKham = ngKham.split("-");
                String ngay = arrNgKham[2];
                String thang = arrNgKham[1];
                String nam = arrNgKham[0];
                
                Paragraph prgNgKham = new Paragraph("Ngay "+ ngay +" thang " + thang + " nam " + nam +".", fontNoiDung1);
                PdfPCell cellNgKham = new PdfPCell(prgNgKham);
                cellNgKham.setBorder(0);
                cellNgKham.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellNgKham.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableTTBS.addCell(cellNgKham);
                
                //chen dong 2
                PdfPCell cellBS = new PdfPCell(new Paragraph("Bac si chan doan \n \n \n \n \n", fontTieuDe4));
                cellBS.setBorder(0);
                cellBS.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellBS.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableTTBS.addCell(cellBS);
                
                //chen dong 3
                PdfPCell cellTenBS = new PdfPCell(new Paragraph(tenBS, fontTieuDe4));
                cellTenBS.setBorder(0);
                cellTenBS.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTenBS.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableTTBS.addCell(cellTenBS);
                
                document.add(tableTTBS);
                
                //Dong document sau khi dinh dang
                document.close();
                //Dong writer sau khi ghi file pdf
                writer.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
            //Mo file pdf sau khi dinh dang va write
            try
            {
                File file = new File("reports/"+filename+".pdf");
                //Ktra desktop co duoc platform support khong
                if(!Desktop.isDesktopSupported())
                {
                    System.out.println("not supported");
                    return;
                }
                
                Desktop desktop = Desktop.getDesktop();
                //Ktra file co ton tai khong
                if(file.exists())
                {
                    desktop.open(file);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }//GEN-LAST:event_buttonPrintActionPerformed

    /**
     * @param args the command line arguments
     * @return 
     */
    public javax.swing.JTextField getContractID()
    {
        return txtContractID;
    }
    public javax.swing.JTextField getTxtRoomID()
    {
        return txtRoomID;
    }
    public javax.swing.JTextField getTxtStatus()
    {
        return txtStatus;
    }
    public javax.swing.JTextField getStartDate()
    {
        return startDate;
    }
    public javax.swing.JTextField getEndDate()
    {
        return endDate;
    }
    public javax.swing.JTextField getPrice()
    {
        return txtPrice;
    }
    public javax.swing.JTextField getRepID()
    {
        return txtRep;
    }
    public javax.swing.JTextField getDeposit()
    {
        return txtDeposit;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JTextField endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField startDate;
    private javax.swing.JTable tbTenant;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtContractID;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRep;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}

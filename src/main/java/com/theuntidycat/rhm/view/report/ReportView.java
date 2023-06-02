package com.theuntidycat.rhm.view.report;

import com.theuntidycat.rhm.controller.ReportController;
import com.theuntidycat.rhm.model.BarChartDataset;
import com.theuntidycat.rhm.model.PieChartDataset;
import com.theuntidycat.rhm.view.utils.LoadingDialog;
import com.theuntidycat.rhm.view.chart.BarChart;
import com.theuntidycat.rhm.view.chart.PieChart;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author SHeroAnh
 */
public class ReportView extends javax.swing.JPanel {

    private LoadingDialog loading = new LoadingDialog();
    private ReportController rpCtrl = new ReportController();

    /**
     * Creates new form ReportView
     */
    public ReportView() {
//        TestPieChart pieChart = new TestPieChart();
        initComponents();
        initSearchBar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportTabPane = new javax.swing.JTabbedPane();
        revenueTab = new javax.swing.JPanel();
        searchBar = new javax.swing.JPanel();
        lbMonth = new javax.swing.JLabel();
        cbbMonth = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cbbYear = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btSearch = new javax.swing.JButton();
        revenueInfoPanel = new javax.swing.JPanel();
        revenueChartPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(500, 385));

        reportTabPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        searchBar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        lbMonth.setText("Tháng");
        searchBar.add(lbMonth);

        cbbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonthActionPerformed(evt);
            }
        });
        searchBar.add(cbbMonth);
        searchBar.add(jSeparator1);

        jLabel1.setText("Năm");
        searchBar.add(jLabel1);

        cbbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbYearItemStateChanged(evt);
            }
        });
        searchBar.add(cbbYear);
        searchBar.add(jSeparator2);

        btSearch.setText("Tìm kiếm");
        btSearch.setName(""); // NOI18N
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        searchBar.add(btSearch);

        revenueInfoPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        revenueChartPanel.setLayout(new java.awt.GridLayout(1, 2));

        javax.swing.GroupLayout revenueTabLayout = new javax.swing.GroupLayout(revenueTab);
        revenueTab.setLayout(revenueTabLayout);
        revenueTabLayout.setHorizontalGroup(
            revenueTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(revenueInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(revenueChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        revenueTabLayout.setVerticalGroup(
            revenueTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(revenueTabLayout.createSequentialGroup()
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(revenueChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(revenueInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        reportTabPane.addTab("Doanh thu", revenueTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        reportTabPane.addTab("tab2", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportTabPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        loading.setVisible(true);
        try {
            PieChart revenuePieChart = new PieChart();
            BarChart revenueBarChart = new BarChart();
            if (String.valueOf(cbbMonth.getSelectedItem()) == "Tất cả") {
                ResultSet rsMonthlyRevenue = rpCtrl.getMonthlyRevenueByYear(String.valueOf(cbbYear.getSelectedItem()));
                double sumReceived = rpCtrl.getTotalReceivedByYear(String.valueOf(cbbYear.getSelectedItem()));
                double sumRevenue = rpCtrl.getTotalRevenueByYear(String.valueOf(cbbYear.getSelectedItem()));
                ArrayList<PieChartDataset> dataset = new ArrayList<>();
                ArrayList<BarChartDataset> dataset1 = new ArrayList<>();
                dataset.add(new PieChartDataset("Đã thu", sumReceived));
                dataset.add(new PieChartDataset("Còn thiếu", sumRevenue - sumReceived));
                JLabel lbSumRevenue = new JLabel("Tổng doanh thu: " + new DecimalFormat("'$'0.0").format(sumRevenue));
                JLabel lbSumReceived = new JLabel("Đã thu: " + new DecimalFormat("'$'0.0").format(sumReceived));
                
                while (rsMonthlyRevenue.next()) {
                    dataset1.add(new BarChartDataset("Tháng " + rsMonthlyRevenue.getString("MONTH"), Double.valueOf(rsMonthlyRevenue.getString("SUM_RENTAL_PRICE")), "$"));
                }
                revenueBarChart.loadChart("Biểu đồ doanh thu theo tháng năm " + String.valueOf(cbbYear.getSelectedItem()), dataset1);
                revenuePieChart.loadChart("Biểu đồ doanh thu năm " + String.valueOf(cbbYear.getSelectedItem()), dataset);
                revenueChartPanel.removeAll();
                revenueInfoPanel.removeAll();
                revenueInfoPanel.updateUI();
                revenueChartPanel.updateUI();
                revenueChartPanel.add(revenueBarChart);
                revenueChartPanel.add(revenuePieChart);
                revenueInfoPanel.add(lbSumRevenue);
                revenueInfoPanel.add(lbSumReceived);
                revenueInfoPanel.updateUI();
                revenueChartPanel.updateUI();
            } else {
                revenueChartPanel.removeAll();
                revenueInfoPanel.removeAll();
                revenueInfoPanel.updateUI();
                revenueChartPanel.updateUI();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        loading.setVisible(false);
    }//GEN-LAST:event_btSearchActionPerformed

    private void cbbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMonthActionPerformed

    private void cbbYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbYearItemStateChanged
        DefaultComboBoxModel<String> cbbMonthModel = new DefaultComboBoxModel<>();

        Date now = new Date();
        cbbMonthModel.addElement("Tất cả");
        for (int i = String.valueOf(cbbYear.getSelectedItem()).equals(Integer.toString(Year.now().getValue())) ? now.getMonth() : 11; i >= 0; i--) {
            cbbMonthModel.addElement(Integer.toString(i + 1));
        }
        cbbMonth.setModel(cbbMonthModel);
    }//GEN-LAST:event_cbbYearItemStateChanged

    public void initRevenueChart() {
        try {
            PieChart revenuePieChart = new PieChart();
            BarChart revenueBarChart = new BarChart();
            ResultSet rsMonthlyRevenue = rpCtrl.getMonthlyRevenueByYear(String.valueOf(cbbYear.getSelectedItem()));
            double sumReceived = rpCtrl.getTotalReceivedByYear(String.valueOf(cbbYear.getSelectedItem()));
            double sumRevenue = rpCtrl.getTotalRevenueByYear(String.valueOf(cbbYear.getSelectedItem()));
            ArrayList<PieChartDataset> dataset = new ArrayList<>();
            ArrayList<BarChartDataset> dataset1 = new ArrayList<>();
            dataset.add(new PieChartDataset("Đã thu", sumReceived));
            dataset.add(new PieChartDataset("Còn thiếu", sumRevenue - sumReceived));
            JLabel lbSumRevenue = new JLabel("Tổng doanh thu: " + new DecimalFormat("'$'0.0").format(sumRevenue));
                JLabel lbSumReceived = new JLabel("Đã thu: " + new DecimalFormat("'$'0.0").format(sumReceived));
            while (rsMonthlyRevenue.next()) {
                dataset1.add(new BarChartDataset("Tháng " + rsMonthlyRevenue.getString("MONTH"), Double.valueOf(rsMonthlyRevenue.getString("SUM_RENTAL_PRICE")), "$"));
            }
            revenueBarChart.loadChart("Biểu đồ doanh thu theo tháng năm " + String.valueOf(cbbYear.getSelectedItem()), dataset1);
            revenuePieChart.loadChart("Biểu đồ doanh thu năm " + String.valueOf(cbbYear.getSelectedItem()), dataset);
            revenueChartPanel.removeAll();
            revenueInfoPanel.removeAll();
            revenueInfoPanel.updateUI();
            revenueChartPanel.updateUI();
            revenueChartPanel.add(revenueBarChart);
            revenueChartPanel.add(revenuePieChart);
            revenueInfoPanel.add(lbSumRevenue);
            revenueInfoPanel.add(lbSumReceived);
            revenueInfoPanel.updateUI();
            revenueChartPanel.updateUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initSearchBar() {
        DefaultComboBoxModel<String> cbbMonthModel = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> cbbYearModel = new DefaultComboBoxModel<>();
        Date now = new Date();
        for (int i = Year.now().getValue(); i >= 2015; i--) {
            cbbYearModel.addElement(Integer.toString(i));
        }
        cbbYear.setModel(cbbYearModel);
        cbbMonthModel.addElement("Tất cả");
        for (int i = now.getMonth(); i >= 0; i--) {
            cbbMonthModel.addElement(Integer.toString(i + 1));
        }
        cbbMonth.setModel(cbbMonthModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbbMonth;
    private javax.swing.JComboBox<String> cbbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JTabbedPane reportTabPane;
    private javax.swing.JPanel revenueChartPanel;
    private javax.swing.JPanel revenueInfoPanel;
    private javax.swing.JPanel revenueTab;
    private javax.swing.JPanel searchBar;
    // End of variables declaration//GEN-END:variables
}
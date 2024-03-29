/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWA;

import Business.Customer;
import Business.CustomerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaojiyuan
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
    JPanel upc;
    CustomerDirectory customerDirectory;

    public ManageCustomerJPanel(JPanel upc, CustomerDirectory customerDirectory) {
        initComponents();
        this.upc = upc;
        this.customerDirectory = customerDirectory;

        populateCustomerTable();

    }

    private void populateCustomerTable() {
        DefaultTableModel dtm = (DefaultTableModel) supplierJTable.getModel();
        dtm.setRowCount(0);
        for (Customer e : customerDirectory.getCustomerList()) {
            Object row[] = new Object[4];
            row[0] = e;
            row[1] = e.getLastName();
            row[2] = e.getCustomerID();
            row[3] = e.getOrganization();

            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        addCustomerJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        jLabel1.setText("Manage Customer");

        supplierJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Customer ID", "Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierJTable);
        if (supplierJTable.getColumnModel().getColumnCount() > 0) {
            supplierJTable.getColumnModel().getColumn(0).setResizable(false);
            supplierJTable.getColumnModel().getColumn(1).setResizable(false);
            supplierJTable.getColumnModel().getColumn(2).setResizable(false);
            supplierJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        addCustomerJButton.setText("Add Customer");
        addCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(refreshJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addCustomerJButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(addCustomerJButton))
                .addGap(76, 76, 76)
                .addComponent(backJButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateCustomerTable();

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void addCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerJButtonActionPerformed
        // TODO add your handling code here:
        AddCustomerJPanel addCustomerJPanel = new AddCustomerJPanel(upc,customerDirectory);
        upc.add("AddCustomerJP",addCustomerJPanel);
        CardLayout layout = (CardLayout)upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_addCustomerJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        ((CardLayout)upc.getLayout()).previous(upc);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable supplierJTable;
    // End of variables declaration//GEN-END:variables
}

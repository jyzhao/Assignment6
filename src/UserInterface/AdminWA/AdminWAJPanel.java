/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWA;

import Business.CustomerDirectory;
import Business.SupplierDirectory;
import Business.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author zhaojiyuan
 */
public class AdminWAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWAJPanel
     */
    
    JPanel upc;
    UserAccountDirectory userAccountDirectory;
    SupplierDirectory supplierDirectory;
    CustomerDirectory customerDirectory;
    
    public AdminWAJPanel(JPanel upc,SupplierDirectory supplierDirectory,CustomerDirectory customerDirectory,UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.upc = upc;
        this.supplierDirectory = supplierDirectory;
        this.customerDirectory = customerDirectory;
        this.userAccountDirectory = userAccountDirectory;
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
        manageSupplierJButton = new javax.swing.JButton();
        manageUserAccountJButton = new javax.swing.JButton();
        manageCustomerJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Admin Work Area");

        manageSupplierJButton.setText("Manage Supplier");
        manageSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSupplierJButtonActionPerformed(evt);
            }
        });

        manageUserAccountJButton.setText("Manage UserAccount");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });

        manageCustomerJButton.setText("Manage Customer");
        manageCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(manageUserAccountJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageSupplierJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageCustomerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(manageSupplierJButton)
                .addGap(48, 48, 48)
                .addComponent(manageCustomerJButton)
                .addGap(84, 84, 84)
                .addComponent(manageUserAccountJButton)
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSupplierJButtonActionPerformed
        // TODO add your handling code here:
        ManageSupplierJPanel msjp = new ManageSupplierJPanel(upc,supplierDirectory);
        upc.add("ManageSupplierJPanel",msjp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageSupplierJButtonActionPerformed

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(upc,supplierDirectory,customerDirectory,userAccountDirectory);
        upc.add("ManageUserAccountJPanel",muajp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void manageCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerJButtonActionPerformed
        // TODO add your handling code here:
        ManageCustomerJPanel mcjp = new ManageCustomerJPanel(upc,customerDirectory);
        upc.add("ManageCustomerJPanel",mcjp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageCustomerJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageCustomerJButton;
    private javax.swing.JButton manageSupplierJButton;
    private javax.swing.JButton manageUserAccountJButton;
    // End of variables declaration//GEN-END:variables
}

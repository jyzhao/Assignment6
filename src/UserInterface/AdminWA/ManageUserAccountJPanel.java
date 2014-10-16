/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWA;

import Business.CustomerDirectory;
import Business.SupplierDirectory;
import Business.UserAccount;
import Business.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaojiyuan
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUSerAccountJPanel
     */
    JPanel upc;
    SupplierDirectory supplierDirectory;
    UserAccountDirectory userAccountDirectory;
    CustomerDirectory customerDirectory;

    public ManageUserAccountJPanel(JPanel upc, SupplierDirectory supplierDirectory, CustomerDirectory customerDirectory, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.upc = upc;
        this.supplierDirectory = supplierDirectory;
        this.customerDirectory = customerDirectory;
        this.userAccountDirectory = userAccountDirectory;

        populateUserAccountTable();

    }

    private void populateUserAccountTable() {
        DefaultTableModel dtm = (DefaultTableModel) userAccountJTable.getModel();
        dtm.setRowCount(0);

        for (UserAccount ua : userAccountDirectory.getUserAccountList()) {
            Object row[] = new Object[4];
            row[0] = ua;
            row[1] = ua.getPassword();
            row[2] = ua.getRole();
            row[3] = ua.getStatus();
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
        userAccountJTable = new javax.swing.JTable();
        deactivateJButton = new javax.swing.JButton();
        addUserAccountJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        jLabel1.setText("Manage User Account");

        userAccountJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Password", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userAccountJTable);
        if (userAccountJTable.getColumnModel().getColumnCount() > 0) {
            userAccountJTable.getColumnModel().getColumn(0).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(1).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(2).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        deactivateJButton.setText("Deactivate");
        deactivateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deactivateJButtonActionPerformed(evt);
            }
        });

        addUserAccountJButton.setText("Add UserAccount");
        addUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserAccountJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refreshJButton)
                                .addGap(70, 70, 70)
                                .addComponent(deactivateJButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(472, Short.MAX_VALUE)
                    .addComponent(addUserAccountJButton)
                    .addGap(119, 119, 119)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deactivateJButton)
                    .addComponent(refreshJButton))
                .addGap(104, 104, 104)
                .addComponent(backJButton)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(307, Short.MAX_VALUE)
                    .addComponent(addUserAccountJButton)
                    .addGap(240, 240, 240)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateUserAccountTable();

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void addUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserAccountJButtonActionPerformed
        // TODO add your handling code here:
        AddUserAccountJPanel auajp = new AddUserAccountJPanel(upc, supplierDirectory, customerDirectory, userAccountDirectory);
        upc.add("AddUserAccountJP", auajp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_addUserAccountJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        ((CardLayout) upc.getLayout()).previous(upc);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deactivateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deactivateJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = userAccountJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row !!!");
            return;

        }
        UserAccount ua = (UserAccount) userAccountJTable.getValueAt(selectedRow, 0);
        ua.setStatus("Disable");
        populateUserAccountTable();
    }//GEN-LAST:event_deactivateJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserAccountJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deactivateJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable userAccountJTable;
    // End of variables declaration//GEN-END:variables
}

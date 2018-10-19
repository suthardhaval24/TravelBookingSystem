/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.ProductDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author info
 */
public class ProdManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountManagementPanel
     */
    private final ProductDirectory accDir;
    private final JPanel rightPanel;

    public ProdManagementPanel(JPanel rightPanel, ProductDirectory accDir) {
        initComponents();
        this.rightPanel = rightPanel;//if we don't initialize we are not passing constructor params to main object
        this.accDir = accDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setText("Create Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 32, 151, -1));

        btnManage.setText("Manage Products");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 32, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateProductJPanel caPanel = new CreateProductJPanel(rightPanel, accDir);
        rightPanel.add("createAccoutJPanel", caPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);


    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        ManageProdPanel mnPanel = new ManageProdPanel(rightPanel, accDir);
        rightPanel.add("manageProductPanel", mnPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);


    }//GEN-LAST:event_btnManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnManage;
    // End of variables declaration//GEN-END:variables
}
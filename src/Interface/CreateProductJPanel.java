/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import Business.ProductDirectory;
import Business.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author info
 */
public class CreateProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccontJPanel
     */
    private final ProductDirectory prodDir;
    private final JPanel rightPanel;

    public CreateProductJPanel(JPanel rightPanel, ProductDirectory prodDir) {
        initComponents();
        this.prodDir = prodDir;
        this.rightPanel = rightPanel; //initilization
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("Create Product");
        add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 39, -1, -1));

        lblRoutingNo.setText("Product Name*");
        add(lblRoutingNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 82, -1, -1));

        lblAccNo.setText("Availiblity*");
        add(lblAccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 129, -1, 14));

        lblBankName.setText("Price*");
        add(lblBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 170, -1, -1));

        lblBalance.setText("Description");
        add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 214, -1, -1));
        add(txtProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 79, 119, -1));
        add(txtAvailablity, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 123, 119, -1));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 167, 119, -1));
        add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 211, 119, -1));

        btnCreate.setText("Create Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 255, -1, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 255, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //validation through exception handling
        double price = 0;
        int availability = 0;
        if (txtAvailablity.getText().isEmpty() == true || txtDescription.getText().isEmpty() == true || txtPrice.getText().isEmpty() == true || txtProdName.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Enter all the value first");
        } else {
            //validation through exception handling
            try {
                availability = Integer.parseInt(txtAvailablity.getText());

                price = Double.parseDouble(txtPrice.getText());

                Product prod = prodDir.addProduct();
                prod.setName(txtProdName.getText());

                prod.setAvailNum(availability);

                prod.setPrice(price);
                prod.setDescription(txtDescription.getText());

                JOptionPane.showMessageDialog(null, "Account Created Successfully");

                txtAvailablity.setText("");
                txtPrice.setText("");
                txtDescription.setText("");
                txtProdName.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Only Numbers allowed in Availibility and Price");

            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}

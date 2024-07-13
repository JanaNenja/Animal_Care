package iac.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
*@author 1705508 Shoug alharbie 
*
*/
public class User_checkout extends javax.swing.JFrame {

    static String user_name, neighborhoo;
    ArrayList<Product> product_updated = new ArrayList<Product>();

    public User_checkout() {
        initComponents();

        user_with_Neighborhood();
    }

    public void filling_shipping_cost(String dilivery_on_user, String sub_totAAl, String SHipping_cost, String grand_total, ArrayList<Product> product_updats) {
        address.setText(neighborhoo);
        dilivery_on.setText(dilivery_on_user);
        sub_total.setText(sub_totAAl);
        shipping_cost.setText(SHipping_cost);
        Grand_total.setText(grand_total);
        for (int i = 0; i < product_updats.size(); i++) {
            product_updated.add(product_updats.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Est = new javax.swing.JLabel();
        Est3 = new javax.swing.JLabel();
        Est2 = new javax.swing.JLabel();
        Est1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back_buttonss = new javax.swing.JButton();
        complete_pay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        sub_total = new javax.swing.JLabel();
        shipping_cost = new javax.swing.JLabel();
        Grand_total = new javax.swing.JLabel();
        dilivery_on = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel7.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Est.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est.setText(" Estimated dilivery on  :");
        getContentPane().add(Est, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 287, 257, 44));

        Est3.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est3.setText(" Sub total :");
        getContentPane().add(Est3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 340, 128, 44));

        Est2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est2.setText(" Grand total :");
        getContentPane().add(Est2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 446, 148, 35));

        Est1.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est1.setText(" Shipping cost :");
        getContentPane().add(Est1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 393, 175, 44));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel2.setText("Your Adddress :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        back_buttonss.setBackground(new java.awt.Color(255, 153, 0));
        back_buttonss.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back_buttonss.setForeground(new java.awt.Color(255, 255, 255));
        back_buttonss.setText("Back");
        back_buttonss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonssActionPerformed(evt);
            }
        });
        getContentPane().add(back_buttonss, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 180, 60));

        complete_pay.setBackground(new java.awt.Color(255, 153, 0));
        complete_pay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        complete_pay.setForeground(new java.awt.Color(255, 255, 255));
        complete_pay.setText(" Complete payment");
        complete_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complete_payActionPerformed(evt);
            }
        });
        getContentPane().add(complete_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 270, 60));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 16, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\OneDrive\\الصور\\shopping-cart.png")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel6.setText("Checkout");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, -1));

        address.setBackground(new java.awt.Color(255, 51, 102));
        address.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 270, 30));

        sub_total.setBackground(new java.awt.Color(255, 51, 102));
        sub_total.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        sub_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(sub_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 190, 20));

        shipping_cost.setBackground(new java.awt.Color(255, 51, 102));
        shipping_cost.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        shipping_cost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(shipping_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 190, 20));

        Grand_total.setBackground(new java.awt.Color(255, 51, 102));
        Grand_total.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        Grand_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(Grand_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 190, 20));

        dilivery_on.setBackground(new java.awt.Color(255, 255, 255));
        dilivery_on.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        dilivery_on.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(dilivery_on, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 190, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\Downloads\\finaaaal (2)\\finaaaal\\IAC app(jana ver)\\src\\iac\\app\\IMG-20201031-WA0009.jpg")); // NOI18N
        jLabel12.setText(" ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonssActionPerformed
        // TODO add your handling code here:

        Displaying_User_Cart back = new Displaying_User_Cart();
        back.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_back_buttonssActionPerformed

    private void complete_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complete_payActionPerformed
        // TODO add your handling code here:

        User_confirmed con = new User_confirmed();
        con.setVisible(true);
        con.to_update_the_product_file(product_updated);
        this.dispose();
    }//GEN-LAST:event_complete_payActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Est;
    private javax.swing.JLabel Est1;
    private javax.swing.JLabel Est2;
    private javax.swing.JLabel Est3;
    private javax.swing.JLabel Grand_total;
    private javax.swing.JLabel address;
    private javax.swing.JButton back_buttonss;
    private javax.swing.JButton complete_pay;
    private javax.swing.JLabel dilivery_on;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel shipping_cost;
    private javax.swing.JLabel sub_total;
    // End of variables declaration//GEN-END:variables
private void user_with_Neighborhood() {
        try {
            File fileName = new File("user_neighborhood.txt");
            Scanner inputcheck = new Scanner(fileName);

            while (inputcheck.hasNext()) {
                String[] contant = inputcheck.nextLine().split(",,");
                user_name = (contant[0]);
                neighborhoo = (contant[1]);

            }
         } catch (FileNotFoundException ex) {
            Logger.getLogger(User_checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

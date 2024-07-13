package iac.app;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
*@author 1705508 Shoug alharbie 
*
*/
public class Confirm_Grooming_Services extends javax.swing.JFrame {

    ArrayList<String> selected_put_serivces = new ArrayList<>();
    ArrayList<String> Appointments_available = new ArrayList<>();
    String overall_info = "Pet and selected serivces : ";
    String overall_info22 = "";
String userDate_;
    public Confirm_Grooming_Services() {
        initComponents();
    }

    public void filing_in_pet_services_date(ArrayList<String> selected_put_selected_serivces22, 
            ArrayList<String> Appointments_available, String userDate) {

        for (int i = 0; i < selected_put_selected_serivces22.size(); i++) {
            overall_info = overall_info + selected_put_selected_serivces22.get(i);
        }

        overall_info22 = " in " + userDate;
        userDate_=userDate;
        info11.setText(overall_info);
        info22.setText(overall_info22);
        
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("available_grooming_services_date.txt"));
                for (int i = 0; i < Appointments_available.size(); i++) {
                
                bw.write(Appointments_available.get(i).toString());
                bw.newLine();
                
            }
            bw.close();
            
            }
            
            
            catch (IOException ex) {
                Logger.getLogger(Confirm_Grooming_Services.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        info11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        info22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\OneDrive\\الصور\\pet.png")); // NOI18N
        jLabel2.setText(" l");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 140, 120));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel6.setText(" Confirm");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, -1));

        info11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        info11.setText(" ");
        info11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        getContentPane().add(info11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 470, 40));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Confirm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 120, 60));

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 110, 60));

        info22.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        info22.setText(" ");
        info22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        getContentPane().add(info22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 470, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\Downloads\\finaaaal (2)\\finaaaal\\IAC app(jana ver)\\src\\iac\\app\\IMG-20201031-WA0009.jpg")); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Confirmed_Grooming_Services ddsd = new Confirmed_Grooming_Services();
        ddsd.setVisible(true);
        ddsd.date(userDate_);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Homepage h=new   Homepage();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Confirm_Grooming_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm_Grooming_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm_Grooming_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm_Grooming_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirm_Grooming_Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel info11;
    private javax.swing.JLabel info22;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
 

}

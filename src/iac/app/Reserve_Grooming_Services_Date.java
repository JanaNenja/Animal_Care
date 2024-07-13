package iac.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
*
*@author 1705508 Shoug alharbie 
*
*/
public class Reserve_Grooming_Services_Date extends javax.swing.JFrame {

    ArrayList<String> selected_put_selected_serivces22 = new ArrayList<>();
    ArrayList<String> Appointments_available = new ArrayList<>();
    DefaultListModel d = new DefaultListModel();
    String dataUser = "";

    public Reserve_Grooming_Services_Date() {
        initComponents();
        Filing_in_Appointments_available();
        available_date_List.setModel(d);
    }

    public void filing_in_pet_With_services(ArrayList<String> selected_put_selected_serivces) {
        for (int i = 0; i < selected_put_selected_serivces.size(); i++) {
            selected_put_selected_serivces22.add(selected_put_selected_serivces.get(i));
            System.out.println(selected_put_selected_serivces22.get(i));
        }

    }

    public void sendingDataToNextPage() {
        Confirm_Grooming_Services confirm_serivce = new Confirm_Grooming_Services();
        confirm_serivce.setVisible(true);
        confirm_serivce.filing_in_pet_services_date(selected_put_selected_serivces22,
                Appointments_available, dataUser);
        this.dispose();
    }

    public void Filing_in_Appointments_available() {

        try {
            File fileName = new File("available_grooming_services_date.txt");
            Scanner inputcheck = new Scanner(fileName);

            while (inputcheck.hasNext()) {
                String contant = inputcheck.nextLine();
                Appointments_available.add(contant);
                d.addElement(contant);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reserve_Grooming_Services_Date.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        next_button = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        available_date_List = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\OneDrive\\الصور\\pet.png")); // NOI18N
        jLabel2.setText(" l");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 140, 120));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel6.setText(" Booking");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));

        next_button.setBackground(new java.awt.Color(255, 153, 0));
        next_button.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        next_button.setForeground(new java.awt.Color(255, 255, 255));
        next_button.setText(" Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(next_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 110, 60));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText(" Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 110, 60));

        available_date_List.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        available_date_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                available_date_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(available_date_List);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\Downloads\\finaaaal (2)\\finaaaal\\IAC app(jana ver)\\src\\iac\\app\\IMG-20201031-WA0009.jpg")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Reserve_Grooming_Services_And_Pet bb=new Reserve_Grooming_Services_And_Pet();
        bb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void available_date_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_available_date_ListMouseClicked
        // TODO add your handling code here:
        String dateSelected = available_date_List.getSelectedValue().toString();
        for (int i = 0; i < Appointments_available.size(); i++) {
            if (dateSelected.equalsIgnoreCase(Appointments_available.get(i).toString())) {
                dataUser = Appointments_available.get(i);
                Appointments_available.remove(Appointments_available.get(i));

            }
        }
        d.clear();
        for (int i = 0; i < Appointments_available.size(); i++) {
            d.addElement(Appointments_available.get(i));

        }


    }//GEN-LAST:event_available_date_ListMouseClicked

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
        sendingDataToNextPage();
    }//GEN-LAST:event_next_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserve_Grooming_Services_Date().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> available_date_List;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next_button;
    // End of variables declaration//GEN-END:variables
}

package iac.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
/**
*
*@author 1705508 Shoug alharbie 
*
*/
public class Reserve_Grooming_Services_And_Pet extends javax.swing.JFrame {

    ArrayList<String> selected_put_selected_serivces = new ArrayList<>();
    Product p = new Product();

    public Reserve_Grooming_Services_And_Pet() {
        initComponents();

        grooming_services_put();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chosen_ppet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Shave_hair_service = new javax.swing.JCheckBox();
        Cut_hair_service = new javax.swing.JCheckBox();
        shower_service = new javax.swing.JCheckBox();
        Clip_nailes_service = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pet_name = new javax.swing.JLabel();
        pet_combo_box = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        Next_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Testdd = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jLabel12.setText(" ");

        chosen_ppet.setText(" a");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel1.setText("Services");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 202, 146));

        Shave_hair_service.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Shave_hair_service.setText("Shave hair");
        Shave_hair_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shave_hair_serviceActionPerformed(evt);
            }
        });
        getContentPane().add(Shave_hair_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 504, -1, -1));

        Cut_hair_service.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Cut_hair_service.setText("Cut hair");
        Cut_hair_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cut_hair_serviceActionPerformed(evt);
            }
        });
        getContentPane().add(Cut_hair_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 465, -1, -1));

        shower_service.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        shower_service.setText(" Shower");
        shower_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shower_serviceActionPerformed(evt);
            }
        });
        getContentPane().add(shower_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        Clip_nailes_service.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Clip_nailes_service.setText(" Clip nailes");
        Clip_nailes_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clip_nailes_serviceActionPerformed(evt);
            }
        });
        getContentPane().add(Clip_nailes_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 416, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setText(" Select services");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setText("Chosen Pet");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel5.setText(" ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setText(" Add a pet");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        pet_name.setFont(new java.awt.Font("Tw Cen MT", 2, 19)); // NOI18N
        pet_name.setText(" ");
        pet_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        getContentPane().add(pet_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 107, 30));

        pet_combo_box.setBackground(new java.awt.Color(255, 153, 0));
        pet_combo_box.setFont(new java.awt.Font("Tw Cen MT", 3, 19)); // NOI18N
        pet_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        pet_combo_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pet_combo_boxMouseClicked(evt);
            }
        });
        pet_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pet_combo_boxActionPerformed(evt);
            }
        });
        getContentPane().add(pet_combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 107, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setText(" 30.SR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setText(" 50.SR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 469, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setText(" 30.SR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 513, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setText(" 70.SR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 381, -1, -1));

        Cancel.setBackground(new java.awt.Color(255, 153, 0));
        Cancel.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Back");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 131, 58));

        Next_button.setBackground(new java.awt.Color(255, 153, 0));
        Next_button.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        Next_button.setForeground(new java.awt.Color(255, 255, 255));
        Next_button.setText(" Next");
        Next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Next_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, 145, 55));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\OneDrive\\الصور\\pet.png")); // NOI18N
        jLabel2.setText(" l");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 140, 120));
        getContentPane().add(Testdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 390, 50));

        jLabel13.setText(" ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 80, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\Downloads\\finaaaal (2)\\finaaaal\\IAC app(jana ver)\\src\\iac\\app\\IMG-20201031-WA0009.jpg")); // NOI18N
        jLabel14.setText(" ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pet_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pet_combo_boxActionPerformed
        // TODO add your handling code here:
        String pet_name2 = pet_combo_box.getSelectedItem().toString();
        pet_name.setText(pet_name2);
        selected_put_selected_serivces.add(pet_name2);
    }//GEN-LAST:event_pet_combo_boxActionPerformed

    private void pet_combo_boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pet_combo_boxMouseClicked
        String Selsected_put = pet_combo_box.getSelectedItem().toString();
        chosen_ppet.setText(Selsected_put);
    }//GEN-LAST:event_pet_combo_boxMouseClicked

    private void shower_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shower_serviceActionPerformed
        // TODO add your handling code here:
        if (shower_service.isSelected()) {
            selected_put_selected_serivces.add(" ," + shower_service.getText());
        }
    }//GEN-LAST:event_shower_serviceActionPerformed

    private void Clip_nailes_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clip_nailes_serviceActionPerformed
        // TODO add your handling code here:
        if (Clip_nailes_service.isSelected()) {
            selected_put_selected_serivces.add(" ," + Clip_nailes_service.getText());
        }
    }//GEN-LAST:event_Clip_nailes_serviceActionPerformed

    private void Cut_hair_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cut_hair_serviceActionPerformed
        // TODO add your handling code here:
        if (Cut_hair_service.isSelected()) {
            selected_put_selected_serivces.add(" ," + Cut_hair_service.getText());
        }
    }//GEN-LAST:event_Cut_hair_serviceActionPerformed

    private void Shave_hair_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shave_hair_serviceActionPerformed
        // TODO add your handling code here:
        if (Shave_hair_service.isSelected()) {
            selected_put_selected_serivces.add(" ," + Shave_hair_service.getText());
        }

    }//GEN-LAST:event_Shave_hair_serviceActionPerformed

    private void Next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_buttonActionPerformed
        // TODO add your handling code here:
        Reserve_Grooming_Services_Date chose_date = new Reserve_Grooming_Services_Date();
        chose_date.setVisible(true);
        chose_date.filing_in_pet_With_services(selected_put_selected_serivces);
        this.dispose();
    }//GEN-LAST:event_Next_buttonActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        make_an_appointment hh=new make_an_appointment();
        hh.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_And_Pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_And_Pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_And_Pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserve_Grooming_Services_And_Pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserve_Grooming_Services_And_Pet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JCheckBox Clip_nailes_service;
    private javax.swing.JCheckBox Cut_hair_service;
    private javax.swing.JButton Next_button;
    private javax.swing.JCheckBox Shave_hair_service;
    private javax.swing.JLabel Testdd;
    private javax.swing.JLabel chosen_ppet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> pet_combo_box;
    private javax.swing.JLabel pet_name;
    private javax.swing.JCheckBox shower_service;
    // End of variables declaration//GEN-END:variables

    public void grooming_services_put() {
        String user = "";
        try {
            File file_To_Know_TheUser = new File("user_neighborhood.txt");
            Scanner input_ = new Scanner(file_To_Know_TheUser);
            while (input_.hasNext()) {
                String[] contant = input_.nextLine().split(",,");
                user = contant[0];
            }
            File file_User_with_Pet = new File("pets names.txt");
            Scanner input = new Scanner(file_User_with_Pet);
            while (input.hasNext()) {
                String[] contant = input.nextLine().split(",");
                if (contant[0].equalsIgnoreCase(user)) {

                    pet_combo_box.addItem(contant[1]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Buy_from_Pet_store.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //لازم اسوي هرجة ادلو البرودكت خلص من المخزن**88**************************************888888888888888*****
}

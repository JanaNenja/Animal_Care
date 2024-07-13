package iac.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jana Omar Baqays 1805288
 */
public class ReserveDoctor_CONFIRMED extends javax.swing.JFrame {

    /**
     * created a new form ReserveDoctor_CONFIRM.
     */
    public static ReserveDoctor_CONFIRMED RCD = new ReserveDoctor_CONFIRMED();

    /**
     * Creates new form ReserveDoctor_CONFIRMED.
     */
    public ReserveDoctor_CONFIRMED() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGO = new javax.swing.JLabel();
        ConfirmedMassege1 = new javax.swing.JLabel();
        ConfirmedMassege2 = new javax.swing.JLabel();
        ConfirmedMassege3 = new javax.swing.JLabel();
        OK_Button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iac/app/doctor-pet.png"))); // NOI18N
        LOGO.setText("Reserve Doctor");
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 260, 100));

        ConfirmedMassege1.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmedMassege1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        ConfirmedMassege1.setForeground(new java.awt.Color(255, 153, 153));
        ConfirmedMassege1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmedMassege1.setLabelFor(ConfirmedMassege1);
        ConfirmedMassege1.setText("Confirmed!");
        ConfirmedMassege1.setToolTipText("");
        getContentPane().add(ConfirmedMassege1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 280, 80));

        ConfirmedMassege2.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmedMassege2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        ConfirmedMassege2.setForeground(new java.awt.Color(255, 153, 153));
        ConfirmedMassege2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmedMassege2.setLabelFor(ConfirmedMassege1);
        ConfirmedMassege2.setText("Thanks for your trust in us <3");
        ConfirmedMassege2.setToolTipText("");
        getContentPane().add(ConfirmedMassege2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 280, 70));

        ConfirmedMassege3.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmedMassege3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        ConfirmedMassege3.setForeground(new java.awt.Color(102, 102, 102));
        ConfirmedMassege3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmedMassege3.setLabelFor(ConfirmedMassege1);
        ConfirmedMassege3.setText("ANIMAL CARE APPLICATION");
        ConfirmedMassege3.setToolTipText("");
        getContentPane().add(ConfirmedMassege3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 220, 20));

        OK_Button.setBackground(new java.awt.Color(255, 153, 0));
        OK_Button.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        OK_Button.setForeground(new java.awt.Color(255, 255, 255));
        OK_Button.setText("OK");
        OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OK_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iac/app/background photo.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method is called OK_ButtonActionPerformed that means and all is good
     * about Reservation and go to the make_an_appointments page.
     *
     * @param ActionEvent the action of button will run the code inside the
     * method and display the form we want it.
     */
    private void OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_ButtonActionPerformed
        RCD.setVisible(false);
        make_an_appointment MA = new make_an_appointment();
        MA.setVisible(true);
    }//GEN-LAST:event_OK_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReserveDoctor_CONFIRMED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveDoctor_CONFIRMED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveDoctor_CONFIRMED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveDoctor_CONFIRMED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RCD.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel ConfirmedMassege1;
    private javax.swing.JLabel ConfirmedMassege2;
    private javax.swing.JLabel ConfirmedMassege3;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton OK_Button;
    // End of variables declaration//GEN-END:variables
}
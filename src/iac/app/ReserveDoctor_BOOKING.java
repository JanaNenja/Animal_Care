package iac.app;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jana Omar Baqays 1805288
 */
public class ReserveDoctor_BOOKING extends javax.swing.JFrame {

    /**
     * Is a public string value that save in it the appointment that user
     * Choosed from JComboBox ListOfAppointments.
     */
    public String AppointmentChoosen;

    /**
     * Is a public integer value that save in it the index of appointment that
     * user Choosed from JComboBox ListOfAppointments.
     */
    public int IndexChoosen;

    /**
     * Is a public file value that save in it the all available appointments to
     * reading it.
     */
    public File Appointments;

    /**
     * Is a public list value that save in it the all available appointments
     * that readed from the File Appointments.
     */
    public List a = new List();

    /**
     * created a new form ReserveDoctor_BOOKING.
     */
    public static ReserveDoctor_BOOKING RB = new ReserveDoctor_BOOKING();

    /**
     * Creates new form ReserveDoctor_BOOKING.
     */
    public ReserveDoctor_BOOKING() {
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
        ListOfAppointments = new javax.swing.JComboBox<>();
        Next_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iac/app/doctor-pet.png"))); // NOI18N
        LOGO.setText("Reserve Doctor");
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, 100));

        ListOfAppointments.setBackground(new java.awt.Color(153, 204, 0));
        ListOfAppointments.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ListOfAppointments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose An Appointment" }));
        ListOfAppointments.setToolTipText("");
        ListOfAppointments.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ListOfAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfAppointmentsActionPerformed(evt);
            }
        });
        getContentPane().add(ListOfAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 270, 270));

        Next_Button.setBackground(new java.awt.Color(255, 153, 0));
        Next_Button.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Next_Button.setForeground(new java.awt.Color(255, 255, 255));
        Next_Button.setText("Next");
        Next_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Next_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));

        Cancel_Button.setBackground(new java.awt.Color(255, 153, 0));
        Cancel_Button.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Cancel_Button.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_Button.setText("Cancel");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iac/app/background photo.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 715));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method is called Next_ButtonActionPerformed go to the next form and
     * print the Appointment Choosen information.
     *
     * @param ActionEvent the action of button will run the code inside the
     * method and display the form we want it.
     */
    private void Next_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_ButtonActionPerformed
        RB.setVisible(false);
        ReserveDoctor_CONFIRM RC = new ReserveDoctor_CONFIRM();
        RC.setAppointmentChoosenConfirm(AppointmentChoosen);
        RC.setVisible(true);
    }//GEN-LAST:event_Next_ButtonActionPerformed
    /**
     * This method is called Cancel_ButtonActionPerformed that cancel the
     * Reservation and go to the Previous form.
     *
     * @param ActionEvent the action of button will run the code inside the
     * method and display the form we want it.
     */
    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        RB.setVisible(false);
        make_an_appointment MA = new make_an_appointment();
        MA.setVisible(true);
    }//GEN-LAST:event_Cancel_ButtonActionPerformed
    /**
     * This method is called ListOfAppointmentsActionPerformed that storage
     * User's choice from JComboBox ListOfAppointments in AppointmentChoosen and
     * IndexChoosen.
     *
     * @param ActionEvent the action of button will run the code inside the
     * method and display the form we want it.
     */
    private void ListOfAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfAppointmentsActionPerformed
        IndexChoosen = ListOfAppointments.getSelectedIndex();
        AppointmentChoosen = ListOfAppointments.getItemAt(IndexChoosen);
    }//GEN-LAST:event_ListOfAppointmentsActionPerformed

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
            java.util.logging.Logger.getLogger(ReserveDoctor_BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveDoctor_BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveDoctor_BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveDoctor_BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form and print in JComboBox the appointments*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RB.ListOfAppointments();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ReserveDoctor_BOOKING.class.getName()).log(Level.SEVERE, null, ex);
                }
                RB.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JLabel LOGO;
    private javax.swing.JComboBox<String> ListOfAppointments;
    private javax.swing.JButton Next_Button;
    // End of variables declaration//GEN-END:variables

    /**
     * This method is called ListOfAppointments that storage available
     * appointments by reading Appointment_Doctor file and scan the lines and
     * put in List Of Appointments and JComboBox Of Appointments.
     *
     * @throws FileNotFoundException
     */
    public void ListOfAppointments() throws FileNotFoundException {
        Appointments = new File("Appointment_Doctor.txt");
        Scanner sc = new Scanner(Appointments);
        while (sc.hasNextLine()) {
            String date = sc.nextLine();
            a.add(date);
        }
        for (int i = 0; i < a.getItemCount(); i++) {
            ListOfAppointments.addItem(a.getItem(i));
        }
        sc.close();
    }

    /**
     * This method is called DeleteAnAppointment that remove the RESERVATION
     * appointments by remove the element from List Of Appointments and
     * JComboBox Of Appointments and printing the List Of Appointments in
     * Appointment_Doctor file.
     *
     * @throws FileNotFoundException
     */
    public void DeleteAnAppointment() throws FileNotFoundException {
        PrintWriter print = new PrintWriter(Appointments);
        a.remove(IndexChoosen);
        ListOfAppointments.removeItemAt(IndexChoosen);
        for (int i = 0; i < a.getItemCount(); i++) {
            print.println(a.getItem(i));
        }
        print.flush();
        print.close();
    }

    public void setIndexChoosen(int IndexChoosen) {
        this.IndexChoosen = IndexChoosen;
    }
    
    
}

/* THE BASIC AVAILABE APPOINTMEMTS BEFORE DELETE THE RESERVATION.
DATE, Dr.Omar, 8:00 A.M, Sunday, 22-11-2020
DATE, Dr.Omar, 9:00 A.M, Sunday, 22-11-2020
DATE, Dr.Omar, 10:00 A.M, Sunday, 22-11-2020
DATE, Dr.Omar, 11:00 A.M, Sunday, 22-11-2020
DATE, Dr.Omar, 12:00 P.M, Sunday, 2-11-2020
DATE, Dr.Omar, 1:00 P.M, Sunday, 22-11-2020
DATE, Dr.Omar, 2:00 P.M, Sunday, 22-11-2020
DATE, Dr.Omar, 3:00 P.M, Sunday, 22-11-2020
DATE, Dr.Omar, 4:00 P.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 8:00 A.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 9:00 A.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 10:00 A.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 11:00 A.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 12:00 P.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 1:00 P.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 2:00 P.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 3:00 P.M, Sunday, 22-11-2020
DATE, Dr.Tareq, 4:00 P.M, Sunday, 22-11-2020
DATE, Dr.Yosef, 5:00 P.M, Sunday, 22-11-2020
DATE, Dr.Yosef, 6:00 P.M, Sunday, 22-11-2020
DATE, Dr.Yosef, 7:00 P.M, Sunday, 22-11-2020
DATE, Dr.Yosef, 8:00 P.M, Sunday, 22-11-2020
DATE, Dr.Yosef, 9:00 P.M, Sunday, 22-11-2020
DATE, Dr.Yosef, 10:00 P.M, Sunday, 22-11-2020
DATE, Dr.Omar, 8:00 A.M, Monday, 23-11-2020
DATE, Dr.Omar, 9:00 A.M, Monday, 23-11-2020
DATE, Dr.Omar, 10:00 A.M, Monday, 23-11-2020
DATE, Dr.Omar, 11:00 A.M, Monday, 23-11-2020
DATE, Dr.Omar, 12:00 P.M, Monday, 23-11-2020
DATE, Dr.Omar, 1:00 P.M, Monday, 23-11-2020
DATE, Dr.Omar, 2:00 P.M, Monday, 23-11-2020
DATE, Dr.Omar, 3:00 P.M, Monday, 23-11-2020
DATE, Dr.Omar, 4:00 P.M, Monday, 23-11-2020
DATE, Dr.Tareq, 8:00 A.M, Monday, 23-11-2020
DATE, Dr.Tareq, 9:00 A.M, Monday, 23-11-2020
DATE, Dr.Tareq, 10:00 A.M, Monday, 23-11-2020
DATE, Dr.Tareq, 11:00 A.M, Monday, 23-11-2020
DATE, Dr.Tareq, 12:00 P.M, Monday, 23-11-2020
DATE, Dr.Tareq, 1:00 P.M, Monday, 23-11-2020
DATE, Dr.Tareq, 2:00 P.M, Monday, 23-11-2020
DATE, Dr.Tareq, 3:00 P.M, Monday, 23-11-2020
DATE, Dr.Tareq, 4:00 P.M, Monday, 23-11-2020
DATE, Dr.Yosef, 5:00 P.M, Monday, 23-11-2020
DATE, Dr.Yosef, 6:00 P.M, Monday, 23-11-2020
DATE, Dr.Yosef, 7:00 P.M, Monday, 23-11-2020
DATE, Dr.Yosef, 8:00 P.M, Monday, 23-11-2020
DATE, Dr.Yosef, 9:00 P.M, Monday, 23-11-2020
DATE, Dr.Yosef, 10:00 P.M, Monday, 23-11-2020
DATE, Dr.Omar, 8:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 9:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 10:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 11:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 12:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 1:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 2:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 3:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 4:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 8:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 9:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 10:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 11:00 A.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 12:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 1:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 2:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 3:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Tareq, 4:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Yosef, 5:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Yosef, 6:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Yosef, 7:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Yosef, 8:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Yosef, 9:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Yosef, 10:00 P.M, Tuesday, 24-11-2020
DATE, Dr.Omar, 8:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 9:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 10:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 11:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 12:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 1:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 2:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 3:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 4:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 8:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 9:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 10:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 11:00 A.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 12:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 1:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 2:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 3:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Tareq, 4:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Yosef, 5:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Yosef, 6:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Yosef, 7:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Yosef, 8:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Yosef, 9:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Yosef, 10:00 P.M, Wednesday, 25-11-2020
DATE, Dr.Omar, 8:00 A.M, Thursday, 26-11-2020
DATE, Dr.Omar, 9:00 A.M, Thursday, 26-11-2020
DATE, Dr.Omar, 10:00 A.M, Thursday, 26-11-2020
DATE, Dr.Omar, 11:00 A.M, Thursday, 26-11-2020
DATE, Dr.Omar, 12:00 P.M, Thursday, 26-11-2020
DATE, Dr.Omar, 1:00 P.M, Thursday, 26-11-2020
DATE, Dr.Omar, 2:00 P.M, Thursday, 26-11-2020
DATE, Dr.Omar, 3:00 P.M, Thursday, 26-11-2020
DATE, Dr.Omar, 4:00 P.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 8:00 A.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 9:00 A.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 10:00 A.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 11:00 A.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 12:00 P.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 1:00 P.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 2:00 P.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 3:00 P.M, Thursday, 26-11-2020
DATE, Dr.Tareq, 4:00 P.M, Thursday, 26-11-2020
DATE, Dr.Yosef, 5:00 P.M, Thursday, 26-11-2020
DATE, Dr.Yosef, 6:00 P.M, Thursday, 26-11-2020
DATE, Dr.Yosef, 7:00 P.M, Thursday, 26-11-2020
DATE, Dr.Yosef, 8:00 P.M, Thursday, 26-11-2020
DATE, Dr.Yosef, 9:00 P.M, Thursday, 26-11-2020
DATE, Dr.Yosef, 10:00 P.M, Thursday, 26-11-2020
DATE, Dr.Omar, 4:00 P.M, Friday, 27-11-2020
DATE, Dr.Omar, 5:00 P.M, Friday, 27-11-2020
DATE, Dr.Omar, 6:00 P.M, Friday, 27-11-2020
DATE, Dr.Omar, 7:00 P.M, Friday, 27-11-2020
DATE, Dr.Tareq, 8:00 P.M, Friday, 27-11-2020
DATE, Dr.Tareq, 9:00 P.M, Friday, 27-11-2020
DATE, Dr.Tareq, 10:00 P.M, Friday, 27-11-2020
DATE, Dr.Tareq, 11:00 P.M, Friday, 27-11-2020
DATE, Dr.Omar, 1:00 P.M, Saturday, 28-11-2020
DATE, Dr.Omar, 2:00 P.M, Saturday, 28-11-2020
DATE, Dr.Omar, 3:00 P.M, Saturday, 28-11-2020
DATE, Dr.Omar, 4:00 P.M, Saturday, 28-11-2020
DATE, Dr.Omar, 5:00 P.M, Saturday, 28-11-2020
DATE, Dr.Tareq, 1:00 P.M, Saturday, 28-11-2020
DATE, Dr.Tareq, 2:00 P.M, Saturday, 28-11-2020
DATE, Dr.Tareq, 3:00 P.M, Saturday, 28-11-2020
DATE, Dr.Tareq, 4:00 P.M, Saturday, 28-11-2020
DATE, Dr.Tareq, 5:00 P.M, Saturday, 28-11-2020
DATE, Dr.Yosef, 6:00 P.M, Saturday, 28-11-2020
DATE, Dr.Yosef, 7:00 P.M, Saturday, 28-11-2020
DATE, Dr.Yosef, 8:00 P.M, Saturday, 28-11-2020
DATE, Dr.Yosef, 9:00 P.M, Saturday, 28-11-2020
DATE, Dr.Yosef, 10:00 P.M, Saturday, 28-11-2020
 */

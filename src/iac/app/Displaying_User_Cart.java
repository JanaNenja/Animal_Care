package iac.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author 1705508 Shoug alharbie
 *
 */
public class Displaying_User_Cart extends javax.swing.JFrame {

    DefaultListModel d = new DefaultListModel();
    ArrayList<Product> products_of_usercart22 = new ArrayList<Product>();
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Product> User_product_Sort_by_name = new ArrayList<>();
    ArrayList<Product> User_product_sort_by_L_H = new ArrayList<>();

     
    static int day, month, year = 0;
    static int cost_shipping = 20;

    public Displaying_User_Cart() {
        initComponents();
    }

    public int creat_date(int minmumem, int maximum) {
        int rand = 0;
        for (int i = 0; i < maximum; i++) {
            rand = (int) (Math.random() * maximum) + minmumem;

        }
        return rand;
    }

    public void filiing_in_userCarre(ArrayList<Product> user_Choices, ArrayList<Product> products_) {
        List1_user.setModel(d);
        int total = 0;
        for (int i = 0; i < user_Choices.size(); i++) {
            products_of_usercart22.add(user_Choices.get(i));
        }
        add_element_ssin_list(products_of_usercart22);

        for (int i = 0; i < products_.size(); i++) {
            products.add(products_.get(i));
        }
        day = creat_date(1, 12);
        month = creat_date(1, 12);
        Date date = new Date(day, month, 2020);
        String D = Integer.toString(day);
        String M = Integer.toString(month);
        String ddate = D + "/" + M + "/" + "2020";
        dilivery_onLable.setText(ddate);
        shipping_Lable.setText(Integer.toString(cost_shipping));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user_sort_combox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1_user = new javax.swing.JList<>();
        Est = new javax.swing.JLabel();
        Est1 = new javax.swing.JLabel();
        Est2 = new javax.swing.JLabel();
        Est3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        Delete_button = new javax.swing.JButton();
        sub_total_Lable = new javax.swing.JLabel();
        shipping_Lable = new javax.swing.JLabel();
        dilivery_onLable = new javax.swing.JLabel();
        grand_lable = new javax.swing.JLabel();
        SelsectTodelete_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText(" ");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel8.setText(" ");

        jLabel12.setText(" ");

        jLabel5.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 128, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 19)); // NOI18N
        jLabel4.setText(" sorted by");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        user_sort_combox.setBackground(new java.awt.Color(255, 153, 0));
        user_sort_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Name of Product", "Price (Lowest to Highest) ", " " }));
        user_sort_combox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_sort_comboxMouseClicked(evt);
            }
        });
        getContentPane().add(user_sort_combox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, 30));

        List1_user.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List1_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List1_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List1_user);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 416, 149));

        Est.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est.setText(" Estimated dilivery on  :");
        getContentPane().add(Est, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 257, 44));

        Est1.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est1.setText(" Shipping cost :");
        getContentPane().add(Est1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 175, 44));

        Est2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est2.setText(" Grand total :");
        getContentPane().add(Est2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 148, 35));

        Est3.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        Est3.setText(" Sub total :");
        getContentPane().add(Est3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 128, 44));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(" Checkout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\OneDrive\\الصور\\shopping-cart.png")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel7.setText("Your Cart");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 170, -1));

        back.setBackground(new java.awt.Color(255, 153, 0));
        back.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText(" Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 130, 60));

        Delete_button.setText(" Delete from cart");
        Delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 340, 160, -1));

        sub_total_Lable.setText(" ");
        sub_total_Lable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(sub_total_Lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 190, -1));

        shipping_Lable.setText("  ");
        shipping_Lable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(shipping_Lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 190, -1));

        dilivery_onLable.setText(" ");
        dilivery_onLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(dilivery_onLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 190, 30));

        grand_lable.setText(" ");
        grand_lable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 2, true));
        getContentPane().add(grand_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 190, 30));

        SelsectTodelete_Label.setText(" ");
        SelsectTodelete_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(SelsectTodelete_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\Downloads\\finaaaal (2)\\finaaaal\\IAC app(jana ver)\\src\\iac\\app\\IMG-20201031-WA0009.jpg")); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 500, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:

        Buy_from_Pet_store return_To_Store = new Buy_from_Pet_store();
        return_To_Store.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void Delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_buttonActionPerformed
        // TODO add your handling code here:
        String item_todelete = SelsectTodelete_Label.getText();
        for (int i = 0; i < products_of_usercart22.size(); i++) {
            if (item_todelete.equalsIgnoreCase(products_of_usercart22.get(i).toString())) {
                products.get(i).increase_Amount();
                products_of_usercart22.remove(products_of_usercart22.get(i));
            }


    }//GEN-LAST:event_Delete_buttonActionPerformed

        add_element_ssin_list(products_of_usercart22);
    }

    private void List1_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List1_userMouseClicked
        String item = List1_user.getSelectedValue().toString();
        SelsectTodelete_Label.setText(item);
    }//GEN-LAST:event_List1_userMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //this.setVisible(false);
        User_checkout chek_object = new User_checkout();
        chek_object.setVisible(true);
        chek_object.filling_shipping_cost(dilivery_onLable.getText(), sub_total_Lable.getText(),
                shipping_Lable.getText(), grand_lable.getText(), products);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void user_sort_comboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_sort_comboxMouseClicked
        String selected_item = user_sort_combox.getSelectedItem().toString();
        if (selected_item.equalsIgnoreCase("Name of Product")) {
            rearrange_Name_of_Product();
        } else if (selected_item.equalsIgnoreCase("Price (Lowest to Highest) ")) {
            rearrange_Lowest_Price_to_Highest();
        } else if (selected_item.equalsIgnoreCase("All")) {
            add_element_ssin_list(products_of_usercart22);
        }
    }//GEN-LAST:event_user_sort_comboxMouseClicked
    private void rearrange_Name_of_Product() {
        Product p = new Product();
        User_product_Sort_by_name.clear();
        for (int i = 0; i < products_of_usercart22.size(); i++) {
            User_product_Sort_by_name.add(products_of_usercart22.get(i));
        }
        for (int i = 0; i < User_product_Sort_by_name.size(); i++) {
            for (int j = i; j < User_product_Sort_by_name.size(); j++) {
                int comp = User_product_Sort_by_name.get(i).getName().compareTo(User_product_Sort_by_name.get(j).getName());
                if (comp > 0) {
                    p = User_product_Sort_by_name.get(i);
                    User_product_Sort_by_name.set(i, User_product_Sort_by_name.get(j));
                    User_product_Sort_by_name.set(j, p);

                }
            }
        }
        add_element_ssin_list(User_product_Sort_by_name);

    }

//**************************************************** Sort From lowest to Highest  ************************************************************
    private void rearrange_Lowest_Price_to_Highest() {
        
         User_product_sort_by_L_H.clear();
        for (int i = 0; i < products_of_usercart22.size(); i++) {
            User_product_sort_by_L_H.add(products_of_usercart22.get(i));
        }
        Product p = new Product();
        for (int i = 0; i < User_product_sort_by_L_H.size(); i++) {
            for (int j = i; j < User_product_sort_by_L_H.size(); j++) {

                if (User_product_sort_by_L_H.get(i).getPrice() > User_product_sort_by_L_H.get(j).getPrice()) {
                    p = products_of_usercart22.get(i);
                    User_product_sort_by_L_H.set(i, User_product_sort_by_L_H.get(j));
                    User_product_sort_by_L_H.set(j, p);

                }
            }
        }
        add_element_ssin_list(User_product_sort_by_L_H);

    }

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
            java.util.logging.Logger.getLogger(Displaying_User_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Displaying_User_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Displaying_User_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Displaying_User_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Displaying_User_Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_button;
    private javax.swing.JLabel Est;
    private javax.swing.JLabel Est1;
    private javax.swing.JLabel Est2;
    private javax.swing.JLabel Est3;
    private javax.swing.JList<String> List1_user;
    private javax.swing.JLabel SelsectTodelete_Label;
    private javax.swing.JButton back;
    private javax.swing.JLabel dilivery_onLable;
    private javax.swing.JLabel grand_lable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel shipping_Lable;
    private javax.swing.JLabel sub_total_Lable;
    private javax.swing.JComboBox<String> user_sort_combox;
    // End of variables declaration//GEN-END:variables
 public void add_element_ssin_list(ArrayList<Product> ToPrint) {

//        int sub_total = sub_total(ToPrint);
//        String TOTAL = Integer.toString(sub_total);
        d.clear();
        int sub_total = 0;
        for (int i = 0; i < ToPrint.size(); i++) {

            d.addElement(ToPrint.get(i).toString());
        }
        sub_total = sub_total(ToPrint);
        String TOTAL = Integer.toString(sub_total);
        sub_total_Lable.setText(TOTAL + " SR");

        int grand_t = total_grand_calucate(sub_total);
        grand_lable.setText(Integer.toString(grand_t) + " SR");

    }

    public int total_grand_calucate(int total_sub) {
        int grand_t = cost_shipping + total_sub;
        return grand_t;
    }

    public int sub_total(ArrayList<Product> ToPrint) {
//        d.clear();
        int sub_total = 0;
        for (int i = 0; i < ToPrint.size(); i++) {

//            d.addElement(ToPrint.get(i).toString());
            sub_total = sub_total + ToPrint.get(i).getPrice();

        }
        return sub_total;
    }
}

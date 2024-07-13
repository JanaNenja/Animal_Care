package iac.app;

import java.awt.Button;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * /
 * /@author 1705508 Shoug alharbie /
 */
public class Buy_from_Pet_store extends javax.swing.JFrame {

    static ArrayList<Product> products_of_usercart = new ArrayList<>();
    static ArrayList<Product> resultOfsearch = new ArrayList<>();
    ArrayList<Product> product_ = new ArrayList<>();
    ArrayList<Product> product_Sort_by_name = new ArrayList<>();
    ArrayList<Product> product_sort_by_L_H = new ArrayList<>();
    ArrayList<Product> search_product_ = new ArrayList<>();

    ArrayList<Product> product_searched = new ArrayList<>();

    DefaultListModel d = new DefaultListModel();

    public Buy_from_Pet_store() {
        initComponents();
        Add_Product_List();
        Product_List.setModel(d);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Search_buttons = new javax.swing.JButton();
        SortComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product_List = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Search_field = new javax.swing.JTextField();
        add_to_cart_button = new javax.swing.JButton();
        add_or_notLable = new javax.swing.JLabel();
        meesage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel1.setText(" Pet Store ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 0, -1, 122));

        Search_buttons.setBackground(new java.awt.Color(255, 153, 0));
        Search_buttons.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        Search_buttons.setForeground(new java.awt.Color(255, 255, 255));
        Search_buttons.setText(" Search");
        Search_buttons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonsActionPerformed(evt);
            }
        });
        getContentPane().add(Search_buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        SortComboBox1.setBackground(new java.awt.Color(255, 153, 0));
        SortComboBox1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        SortComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        SortComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Name of Product", "Price (Lowest to Highest) ", "Search field" }));
        SortComboBox1.setToolTipText("");
        SortComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SortComboBox1MouseClicked(evt);
            }
        });
        SortComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(SortComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 38));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText(" sorted by");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        Product_List.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Product_List.setForeground(new java.awt.Color(51, 51, 51));
        Product_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Product_List.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Product_ListComponentAdded(evt);
            }
        });
        Product_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Product_List);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 460, 160));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Shopping cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, -1, 60));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(" Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 110, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\OneDrive\\الصور\\shopping-cart.png")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, -1));

        Search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(Search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 230, 30));

        add_to_cart_button.setBackground(new java.awt.Color(255, 153, 0));
        add_to_cart_button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add_to_cart_button.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart_button.setText(" Add To Cart");
        add_to_cart_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_cart_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, 40));

        add_or_notLable.setText(" ");
        add_or_notLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 2));
        getContentPane().add(add_or_notLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 320, 40));
        getContentPane().add(meesage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 290, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\s9123\\Downloads\\finaaaal (2)\\finaaaal\\IAC app(jana ver)\\src\\iac\\app\\IMG-20201031-WA0009.jpg")); // NOI18N
        jLabel5.setText(" ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SortComboBox1ActionPerformed

    private void Product_ListComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Product_ListComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_ListComponentAdded

    private void Product_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_ListMouseClicked
        String selected_item = Product_List.getSelectedValue().toString();
        add_or_notLable.setText(selected_item);
        meesage.setText(" ");
    }//GEN-LAST:event_Product_ListMouseClicked
    //This method will sort the product when search field=null and show it to user in alphabetical Order
    private void rearrange_Name_of_Product() {
        Product p = new Product();
        product_Sort_by_name.clear();
        for (int i = 0; i < product_.size(); i++) {
            product_Sort_by_name.add(product_.get(i));
        }
        for (int i = 0; i < product_Sort_by_name.size(); i++) {
            for (int j = i; j < product_Sort_by_name.size(); j++) {
                int comp = product_Sort_by_name.get(i).getName().compareTo(product_Sort_by_name.get(j).getName());
                if (comp > 0) {
                    p = product_Sort_by_name.get(i);
                    product_Sort_by_name.set(i, product_Sort_by_name.get(j));
                    product_Sort_by_name.set(j, p);

                }
            }
        }

        add_element_ssin_list(product_Sort_by_name);

    }
        //This method will sort the product based on the search and return it in alphabetical Order

public ArrayList rearrange_Name_of_Product_for_priticlar_array(ArrayList<Product>product_all,String field_To_search) {
        Product p = new Product();
        product_searched.clear();
        product_searched = search_to_test(product_all,field_To_search);

        for (int i = 0; i < product_searched.size(); i++) {
            for (int j = i; j < product_searched.size(); j++) {
                int comp = product_searched.get(i).getName().compareTo(product_searched.get(j).getName());
                if (comp > 0) {
                    p = product_searched.get(i);
                    product_searched.set(i, product_searched.get(j));
                    product_searched.set(j, p);

                }
            }
        }
        return product_searched;

    }
//**************************************************** Sort From lowest to Highest  ************************************************************
    //This method will sort the product and show it to user in descending Order when search field =null
   private void rearrange_Lowest_Price_to_Highest() {
        product_sort_by_L_H.clear();
        for (int i = 0; i < product_.size(); i++) {
            product_sort_by_L_H.add(product_.get(i));
        }
        Product p = new Product();
        for (int i = 0; i < product_sort_by_L_H.size(); i++) {
            for (int j = i; j < product_sort_by_L_H.size(); j++) {

                if (product_sort_by_L_H.get(i).getPrice() > product_sort_by_L_H.get(j).getPrice()) {
                    p = product_sort_by_L_H.get(i);
                    product_sort_by_L_H.set(i, product_sort_by_L_H.get(j));
                    product_sort_by_L_H.set(j, p);

                }
            }
        }
        add_element_ssin_list(product_sort_by_L_H);

    }
public ArrayList rearrange_Lowest_Price_to_Highest_For_priticlar_array(ArrayList<Product>product_all,String field_To_search) {
        product_searched.clear();
        product_searched = search_to_test(product_all,field_To_search);
        Product p = new Product();

        for (int i = 0; i < product_searched.size(); i++) {
            for (int j = i; j < product_searched.size(); j++) {

                if (product_searched.get(i).getPrice() > product_searched.get(j).getPrice()) {
                    p = product_searched.get(i);
                    product_searched.set(i, product_searched.get(j));
                    product_searched.set(j, p);

                }
            }
        }
        return product_searched;
    }

    //*********************************************** User choses to sort the product *****************************************************************
    private void SortComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SortComboBox1MouseClicked
        //Take the selscted choose from the sort combo box and sorrted based on selected choose 
             String selected_item = SortComboBox1.getSelectedItem().toString();
        String field = null;
        field = Search_field.getText();
        if (selected_item.equalsIgnoreCase("Name of Product")) {
            if (field.equals("")) {
                rearrange_Name_of_Product();
            } else {
                search_product_.clear();
                search_product_ = rearrange_Name_of_Product_for_priticlar_array(product_,field);
                add_element_ssin_list(search_product_);
            }

        } else if (selected_item.equalsIgnoreCase("Price (Lowest to Highest) ")) {
            if (field.equals("")) {
                rearrange_Lowest_Price_to_Highest();
            } else {
                search_product_.clear();
                search_product_ = rearrange_Lowest_Price_to_Highest_For_priticlar_array(product_,field);
                add_element_ssin_list(search_product_);
            }
        } else if (selected_item.equalsIgnoreCase("All")) {
            add_element_ssin_list(product_);
        } else if (selected_item.equalsIgnoreCase("Search field")) {
            if (field.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Write some search word to show you the list.",
                        "Need to write in search field",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                search_product_.clear();
                search_product_ = rearrange_Lowest_Price_to_Highest_For_priticlar_array(product_,field);
                add_element_ssin_list(search_product_);
            }

        }


    }//GEN-LAST:event_SortComboBox1MouseClicked

    private void Search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_fieldActionPerformed
     }//GEN-LAST:event_Search_fieldActionPerformed
    //Take the search field and filter based on search field

   public ArrayList search_to_test(ArrayList<Product>product_overall,String field) {
        resultOfsearch.clear();     
        for (int i = 0; i < product_overall.size(); i++) {
            if (field.toUpperCase().contains(product_overall.get(i).getType().toUpperCase())) {
                resultOfsearch.add(product_overall.get(i));
            }
        }
        return resultOfsearch;
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Moving to user cart interface
        Displaying_User_Cart user_cart = new Displaying_User_Cart();
        user_cart.setVisible(true);
        user_cart.filiing_in_userCarre(products_of_usercart, product_);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void add_to_cart_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart_buttonActionPerformed

        String selected_item = add_or_notLable.getText();
        meesage.setText(" ");
        for (int i = 0; i < product_.size(); i++) {
            String checkAmounts = checkAmount(product_.get(i));
            if (selected_item.equals(product_.get(i).toString())) {
                if (checkAmounts.equals("Available")) {
                    products_of_usercart.add(product_.get(i));
                    product_.get(i).decrease_Amount();
                } else if (checkAmounts.equals("Not Available")) {
                  JOptionPane.showMessageDialog(null,
                            "Unfortunately, this product is currently out of our stock",
                            "Failed of adding the product",
                            JOptionPane.ERROR_MESSAGE);
//                product_.remove(product_.get(i));
//                add_element_ssin_list(product_);
                }
            }
        }
    }//GEN-LAST:event_add_to_cart_buttonActionPerformed
    public String checkAmount(Product p) {
        String result = "";
        if (p.getAmount() > 0) {
            result = "Available";
        } else //if (p.getAmount() == 0)
        {
            result = "Not Available";
        }
        return result;
    }
    private void Search_buttonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonsActionPerformed
        resultOfsearch.clear();

        String Tosearch_For = Search_field.getText();
        for (int i = 0; i < product_.size(); i++) {
            if (Tosearch_For.toUpperCase().contains(product_.get(i).getType().toUpperCase())) {
                resultOfsearch.add(product_.get(i));
            }
        }
        add_element_ssin_list(resultOfsearch);

        
    }//GEN-LAST:event_Search_buttonsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Moving to homepage interface
        Homepage hh = new Homepage();
        hh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Buy_from_Pet_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buy_from_Pet_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buy_from_Pet_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buy_from_Pet_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buy_from_Pet_store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Product_List;
    private javax.swing.JButton Search_buttons;
    private javax.swing.JTextField Search_field;
    private javax.swing.JComboBox<String> SortComboBox1;
    private javax.swing.JLabel add_or_notLable;
    private javax.swing.JButton add_to_cart_button;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel meesage;
    // End of variables declaration//GEN-END:variables
//Filling in the product and show it to the user 
    public void Add_Product_List() {
        try {
            File fileName = new File("product.txt");
            Scanner inputcheck = new Scanner(fileName);
            Product pp = new Product();
            int price, amount;
            String type, name;
            while (inputcheck.hasNext()) {
                String[] contant = inputcheck.nextLine().split(",");
                type = (contant[0]);
                name = (contant[1]);
                price = Integer.parseInt(contant[2]);
                amount = Integer.parseInt(contant[3]);
                pp = new Product(type, name, price, amount);
                product_.add(pp);

            }
            for (int i = 0; i < product_.size(); i++) {
                d.addElement(product_.get(i).toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Buy_from_Pet_store.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//will take ArrayList(the searched ,or descending, or alphabetical) and print it to the user

    public void add_element_ssin_list(ArrayList<Product> ToPrint) {
        d.clear();
        for (int i = 0; i < ToPrint.size(); i++) {

            d.addElement(ToPrint.get(i).toString());
        }

    }
}

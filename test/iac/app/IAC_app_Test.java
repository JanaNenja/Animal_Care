package iac.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nona-
 */
public class IAC_app_Test {

    public IAC_app_Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //**************************************************************************************************************************

    /*This method will check weither the produuct 
    *that has been selected by the user from the list
    *has an enough amount in the stoke or not 
     */
    @Test
    public void Amount_Test() {
        System.out.println("Amount");
        //p(Type,Name,Price,amount)
        Product p = new Product("Car", "Dry food 1.5kg from Neutram brand", 35, 1);
        Buy_from_Pet_store store_obj = new Buy_from_Pet_store();
        p.decrease_Amount();
        String expected = store_obj.checkAmount(p);
        assertTrue(expected.equalsIgnoreCase("Not Available"));
    }
//**************************************************************************************************************************
    //This method will tset the value of the sub total from the user array product(user cart)

    @Test
    public void Test_The_Sub_Total_Of_User_Product() {
            System.out.println("The_Sub_Total_Of_User_Product");
        //p1(Type,Name,Price,amount)
        Product p1 = new Product("Cat", "Dry food 1.5kg from Neutram brand", 35, 1);
        Product p2 = new Product("Birds", "Food for Parrots 700G from Zolux brand", 16, 12);
        Product p3 = new Product("Dog", "Food for Puppy 4kg from Royal canin brand", 100, 8);
        Product p4 = new Product("fish", "Snack for fish 100ml from Vitakraft brand", 14, 20);
        //creating our array with all diffrent product type (fish,cat,birds,)
        ArrayList<Product> User_product = new ArrayList();
        User_product.add(p1);
        User_product.add(p2);
        User_product.add(p3);
        User_product.add(p4);
        Displaying_User_Cart user_cart = new Displaying_User_Cart();
        int sub_total = user_cart.sub_total(User_product);
        int expect = 165;
        assertEquals(expect,sub_total);
    }

    //**************************************************************************************************************************
    /*This method we will use it when estimatiing when product will arriave 
    *it will be used in checkout inteerface and in user cart interface
     */
    public void Test_creat_date() {
        Displaying_User_Cart user_cart = new Displaying_User_Cart();
        int result = user_cart.creat_date(5, 10);
        int expected_array[] = {5, 6, 7, 8, 9, 10};
        int ex = 0;
        for (int i = 0; i < expected_array.length; i++) {
            if (result == expected_array[i]) {
                ex = expected_array[i];
            }

        }
        assertTrue(ex == result);
    }

    //**************************************************************************************************************************
    /*we will Test the search_to_test method it should take an arrayList of type Product and a search string
    *it will returened a new array with contants that only match with 
    *the search string has been sent
     */
    @Test
    public void Test_The_search() {
        System.out.println("The_search");
        Product p1 = new Product("fish", "Snack for fish 100ml from Vitakraft brand", 14, 15);
        Product p2 = new Product("Birds", "Food for Parrots 700G from Zolux brand", 16, 12);
        Product p3 = new Product("Dog", "Food for Puppy 4kg from Royal canin brand", 100, 8);
        Product p4 = new Product("fish", "Snack for fish 100ml from Vitakraft brand", 14, 20);
        Product p5 = new Product("Cat", "Dry food 1.5kg from Neutram brand", 35, 1);
        Buy_from_Pet_store store_obj = new Buy_from_Pet_store();
        ArrayList<Product> prodect_All_element = new ArrayList();
        prodect_All_element.add(p5);
        prodect_All_element.add(p1);
        prodect_All_element.add(p2);
        prodect_All_element.add(p4);
        String search = "fish Product";

        ArrayList<Product> prodect_All_filtered = new ArrayList();
//by this step only the product that are equal to the search string will save in this array 
        prodect_All_filtered = store_obj.search_to_test(prodect_All_element, search);

//the second array below will contain two product (fish product) 
        ArrayList<Product> array_with_expected_result = new ArrayList();
        array_with_expected_result.add(p1);
        array_with_expected_result.add(p4);
        for (int i = 0; i < prodect_All_filtered.size(); i++) {
            assertEquals(array_with_expected_result.get(i), prodect_All_filtered.get(i));
        }
    }

    @Test
    public void Test_sort_by_name_based_on_search_array() {
        System.out.println("sort_by_name_based_on_search_array");

        Product p1 = new Product("Cat", "Dry food 1.5kg from Neutram brand", 35, 1);
        Product p2 = new Product("Birds", "Food for Parrots 700G from Zolux brand", 16, 12);
        Product p3 = new Product("Dog", "Food for Puppy 4kg from Royal canin brand", 100, 8);
        Product p4 = new Product("Cat", "Cat biscuit mint flavor 40kg from Gim cat brand", 14, 20);
        Product p5 = new Product("fish", "Flake-mix for fish 15g from Vitakraft brand", 12, 26);
        Product p6 = new Product("Cat", "Powder dry milk 30g from gim cat brand", 12, 26);
        Buy_from_Pet_store store_obj = new Buy_from_Pet_store();
//creating our array with all diffrent product type (fish,cat,birds,)
        ArrayList<Product> prodect_All_element = new ArrayList();
        prodect_All_element.add(p5);
        prodect_All_element.add(p1);
        prodect_All_element.add(p2);
        prodect_All_element.add(p4);
        prodect_All_element.add(p6);
        String search = "cat Product";

        ArrayList<Product> prodect_by_search_sortted_by_name = new ArrayList();
        /*by next step only the product that are equal to 
*the search string will save in this array 
*will be also sorted in alphabetical order
         */
        prodect_by_search_sortted_by_name = store_obj.rearrange_Name_of_Product_for_priticlar_array(prodect_All_element, search);

        ArrayList<Product> array_with_expected_result = new ArrayList();
        array_with_expected_result.add(p4);
        array_with_expected_result.add(p1);
        array_with_expected_result.add(p6);
        for (int i = 0; i < prodect_by_search_sortted_by_name.size(); i++) {
            assertEquals(array_with_expected_result.get(i), prodect_by_search_sortted_by_name.get(i));
        }
    }

    @Test
    public void Test_sort_by_price_based_on_search_array() {
        System.out.println("sort_by_price_based_on_search_array");
        Product p1 = new Product("Cat", "Powder dry milk 30g from gim cat brand", 12, 26);
        Product p2 = new Product("Birds", "Food for Parrots 700G from Zolux brand", 16, 12);
        Product p3 = new Product("Dog", "Food for Puppy 4kg from Royal canin brand", 100, 8);
        Product p4 = new Product("Cat", "Cat biscuit mint flavor 40kg from Gim cat brand", 14, 20);
        Product p5 = new Product("fish", "Flake-mix for fish 15g from Vitakraft brand", 12, 26);
        Product p6 = new Product("Cat", "Dry food 1.5kg from Neutram brand", 35, 1);
        Buy_from_Pet_store store_obj = new Buy_from_Pet_store();

//creating our array with all diffrent product type (fish,cat,birds,)
        ArrayList<Product> prodect_All_element = new ArrayList();
        prodect_All_element.add(p5);
        prodect_All_element.add(p2);
        prodect_All_element.add(p1);
        prodect_All_element.add(p4);
        prodect_All_element.add(p3);
        prodect_All_element.add(p6);
        String search = "cat Product";

        ArrayList<Product> prodect_by_search_sortted_by_price = new ArrayList();
        /*by next step only the product that are equal to 
*the search string will save in this array 
*will be also sorted by price in ascending order 
         */
        prodect_by_search_sortted_by_price = store_obj.rearrange_Lowest_Price_to_Highest_For_priticlar_array(prodect_All_element, search);

        ArrayList<Product> array_to_compare = new ArrayList();
        array_to_compare.add(p1);
        array_to_compare.add(p4);
        array_to_compare.add(p6);
        for (int i = 0; i < prodect_by_search_sortted_by_price.size(); i++) {
            assertEquals(array_to_compare.get(i), prodect_by_search_sortted_by_price.get(i));
        }
    }

    /**
     * Test of ListOfAppointments method, of class ReserveDoctor_BOOKING.
     */
    @Test
    public void testListOfAppointments_List() throws Exception {
        System.out.println("ListOfAppointments_List");
        String [] s = {"DATE, Dr.Omar, 8:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Sunday, 2-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 5:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 6:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 7:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 8:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 9:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 10:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 11:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 5:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 5:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Saturday, 28-11-2020"};
        ReserveDoctor_BOOKING instance = new ReserveDoctor_BOOKING();
        instance.ListOfAppointments();
        for (int i = 0; i < instance.a.getItemCount(); i++) {
            String line = instance.a.getItem(i);
            assertTrue(line.equals(s[i]));
        }
        
    }
    
        @Test
    public void testListOfAppointments_File() throws Exception {
        System.out.println("ListOfAppointments_File");
        String [] s = {"DATE, Dr.Omar, 8:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Sunday, 2-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Sunday, 22-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Monday, 23-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Tuesday, 24-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Wednesday, 25-11-2020"
                , "DATE, Dr.Omar, 8:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 9:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 10:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 11:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 12:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 8:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 9:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 10:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 11:00 A.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 12:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 5:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Thursday, 26-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 5:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 6:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 7:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 8:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 9:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 10:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Tareq, 11:00 P.M, Friday, 27-11-2020"
                , "DATE, Dr.Omar, 1:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 2:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 3:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 4:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Omar, 5:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 1:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 2:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 3:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 4:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Tareq, 5:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 6:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 7:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 8:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 9:00 P.M, Saturday, 28-11-2020"
                , "DATE, Dr.Yosef, 10:00 P.M, Saturday, 28-11-2020"};
        ReserveDoctor_BOOKING instance = new ReserveDoctor_BOOKING();
        instance.ListOfAppointments();
        File w =  instance.Appointments;
        Scanner n = new Scanner (w);
        int i = 0;
        while (n.hasNextLine()){
            String line = n.nextLine();
            assertTrue(line.equals(s[i]));
            i++;
        }
    }
    /**
     * Test of DeleteAnAppointment method, of class ReserveDoctor_BOOKING.
     */
    @Test
    public void testDeleteAnAppointment_List() throws Exception {
        System.out.println("DeleteAnAppointment_List");
        String[] s = {"DATE, Dr.Omar, 8:00 A.M, Sunday, 22-11-2020",
            "DATE, Dr.Omar, 9:00 A.M, Sunday, 22-11-2020",
            "DATE, Dr.Omar, 11:00 A.M, Sunday, 22-11-2020",
            "DATE, Dr.Omar, 12:00 P.M, Sunday, 2-11-2020",
            "DATE, Dr.Omar, 1:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Omar, 2:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Omar, 3:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Omar, 4:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 8:00 A.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 9:00 A.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 10:00 A.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 11:00 A.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 12:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 1:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 2:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 3:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Tareq, 4:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Yosef, 5:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Yosef, 6:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Yosef, 7:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Yosef, 8:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Yosef, 9:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Yosef, 10:00 P.M, Sunday, 22-11-2020",
            "DATE, Dr.Omar, 8:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 9:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 10:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 11:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 12:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 1:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 2:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 3:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 4:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 8:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 9:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 10:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 11:00 A.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 12:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 1:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 2:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 3:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Tareq, 4:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Yosef, 5:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Yosef, 6:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Yosef, 7:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Yosef, 8:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Yosef, 9:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Yosef, 10:00 P.M, Monday, 23-11-2020",
            "DATE, Dr.Omar, 8:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 9:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 10:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 11:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 12:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 1:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 2:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 3:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 4:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 8:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 9:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 10:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 11:00 A.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 12:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 1:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 2:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 3:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Tareq, 4:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Yosef, 5:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Yosef, 6:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Yosef, 7:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Yosef, 8:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Yosef, 9:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Yosef, 10:00 P.M, Tuesday, 24-11-2020",
            "DATE, Dr.Omar, 8:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 9:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 10:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 11:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 12:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 1:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 2:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 3:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 4:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 8:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 9:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 10:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 11:00 A.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 12:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 1:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 2:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 3:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Tareq, 4:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Yosef, 5:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Yosef, 6:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Yosef, 7:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Yosef, 8:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Yosef, 9:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Yosef, 10:00 P.M, Wednesday, 25-11-2020",
            "DATE, Dr.Omar, 8:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 9:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 10:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 11:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 12:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 1:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 2:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 3:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 4:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 8:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 9:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 10:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 11:00 A.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 12:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 1:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 2:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 3:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Tareq, 4:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Yosef, 5:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Yosef, 6:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Yosef, 7:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Yosef, 8:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Yosef, 9:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Yosef, 10:00 P.M, Thursday, 26-11-2020",
            "DATE, Dr.Omar, 4:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Omar, 5:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Omar, 6:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Omar, 7:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Tareq, 8:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Tareq, 9:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Tareq, 10:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Tareq, 11:00 P.M, Friday, 27-11-2020",
            "DATE, Dr.Omar, 1:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Omar, 2:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Omar, 3:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Omar, 4:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Omar, 5:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Tareq, 1:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Tareq, 2:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Tareq, 3:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Tareq, 4:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Tareq, 5:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Yosef, 6:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Yosef, 7:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Yosef, 8:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Yosef, 9:00 P.M, Saturday, 28-11-2020",
            "DATE, Dr.Yosef, 10:00 P.M, Saturday, 28-11-2020"};
        ReserveDoctor_BOOKING instance = new ReserveDoctor_BOOKING();
        instance.ListOfAppointments();
        instance.setIndexChoosen(2);
        instance.DeleteAnAppointment();
        for (int i = 0; i < instance.a.getItemCount(); i++) {
            String line = instance.a.getItem(i);
            assertEquals(line,s[i]);
        }
    }

    /**
     * Test of setAppointmentChoosenConfirm method, of class
     * ReserveDoctor_CONFIRM.
     */
    @Test
    public void testSetAppointmentChoosenConfirm() {
        System.out.println("setAppointmentChoosenConfirm");
        String AppointmentChoosen = "DATE, Dr.Tareq, 1:00 P.M, Saturday, 28-11-2020";
        ReserveDoctor_CONFIRM instance = new ReserveDoctor_CONFIRM();
        instance.setAppointmentChoosenConfirm(AppointmentChoosen);
        String [] s = AppointmentChoosen.split(",");
        assertEquals(ReserveDoctor_CONFIRM.AppointmentChoosenConfirm.getText(),s[0]);
        assertEquals(ReserveDoctor_CONFIRM.AppointmentChoosenConfirm_dr.getText(),s[1]);
        assertEquals(ReserveDoctor_CONFIRM.AppointmentChoosenConfirm_time.getText(),s[2]);
        assertEquals(ReserveDoctor_CONFIRM.AppointmentChoosenConfirm_day.getText(),s[3]);
        assertEquals(ReserveDoctor_CONFIRM.AppointmentChoosenConfirm_date.getText(),s[4]);
    }

    /**
     * Test of setPetInfo method, of class PetInfo.
     */
    @Test
    public void testSetPetInfo() {
        System.out.println("setPetInfo");
        String pet = "jana,tom,8,cat, ";
        PetInfo instance = new PetInfo();
        instance.setPetInfo(pet);
        assertTrue(PetInfo.Animal_Name.getText().equals("tom"));
        assertTrue(PetInfo.Animal_Age.getText().equals("8"));
        assertTrue(PetInfo.Animal_Kind.getText().equals("cat"));
        assertTrue(PetInfo.Vaccination_Schedule.getText().equals(" "));
    }
}

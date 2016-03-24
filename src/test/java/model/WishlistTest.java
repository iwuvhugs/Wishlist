/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author iwuvhugs
 */
public class WishlistTest {

    public WishlistTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_wishlist method, of class Wishlist.
     */
    @Test
    public void testGetId_wishlist() {
        System.out.println("getId_wishlist");
        Wishlist instance = new Wishlist();
        int expResult = 0;
        int result = instance.getId_wishlist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_wishlist method, of class Wishlist.
     */
    @Test
    public void testSetId_wishlist() {
        System.out.println("setId_wishlist");
        int id_wishlist = 0;
        Wishlist instance = new Wishlist();
        instance.setId_wishlist(id_wishlist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Wishlist.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Wishlist instance = new Wishlist();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Wishlist.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Wishlist instance = new Wishlist();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTheme method, of class Wishlist.
     */
    @Test
    public void testGetTheme() {
        System.out.println("getTheme");
        Wishlist instance = new Wishlist();
        Theme expResult = null;
        Theme result = instance.getTheme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheme method, of class Wishlist.
     */
    @Test
    public void testSetTheme() {
        System.out.println("setTheme");
        Theme theme = null;
        Wishlist instance = new Wishlist();
        instance.setTheme(theme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducts method, of class Wishlist.
     */
    @Test
    public void testGetProducts() {
        System.out.println("getProducts");
        Wishlist instance = new Wishlist();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProducts method, of class Wishlist.
     */
    @Test
    public void testSetProducts() {
        System.out.println("setProducts");
        ArrayList<Product> products = null;
        Wishlist instance = new Wishlist();
        instance.setProducts(products);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

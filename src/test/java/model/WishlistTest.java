/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akpohere
 */
public class WishlistTest {
    
    public WishlistTest() {
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

    /**
     * Test of getId_wishlist method, of class Wishlist.
     */
    @Test
    public void testGetId_wishlist() {
        System.out.println("getId_wishlist");
        Wishlist instance = new Wishlist();
        int expResult = -1;
        int result = instance.getId_wishlist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId_wishlist method, of class Wishlist.
     */
    @Test
    public void testSetId_wishlist() {
        System.out.println("setId_wishlist");
        int id_wishlist = -1;
        Wishlist instance = new Wishlist();
       instance.setId_wishlist(id_wishlist);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = -1;
        int result = instance.getId_wishlist();
         assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class Wishlist.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        User user = new User();
        Wishlist instance = new Wishlist();
        instance.getUser();
        assertNotNull(user);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUser method, of class Wishlist.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = new User();
        Wishlist instance = new Wishlist();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
       assertNotNull(user);
    }

    /**
     * Test of getTheme method, of class Wishlist.
     */
    @Test
    public void testGetTheme() {
        System.out.println("getTheme");
        Theme theme = new Theme();
        Wishlist instance = new Wishlist();
         instance.getTheme();
        assertNotNull(theme);
        // TODO review the generated test code and remove the default call to fail.
        
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
        
    }
    
}

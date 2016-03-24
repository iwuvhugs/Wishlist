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
public class UserTest {

    public UserTest() {
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

    /**
     * Test of getId_user method, of class User.
     */
    @Test
    public void testGetId_user() {
        System.out.println("getId_user");
        User instance = new User();

        int expResult = -1;
        int result = instance.getId_user();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_user method, of class User.
     */
    @Test
    public void testSetId_user() {
        System.out.println("setId_user");
        int id_user = 3;
        User instance = new User();
        instance.setId_user(id_user);

        int expResult = id_user;
        int result = instance.getId_user();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFirst_name method, of class User.
     */
    @Test
    public void testGetFirst_name() {
        System.out.println("getFirst_name");
        User instance = new User();

        String expResult = "";
        String result = instance.getFirst_name();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirst_name method, of class User.
     */
    @Test
    public void testSetFirst_name() {
        System.out.println("setFirst_name");
        String first_name = "Kirill";
        User instance = new User();
        instance.setFirst_name(first_name);

        String expResult = first_name;
        String result = instance.getFirst_name();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLast_name method, of class User.
     */
    @Test
    public void testGetLast_name() {
        System.out.println("getLast_name");
        User instance = new User();

        String expResult = "";
        String result = instance.getLast_name();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLast_name method, of class User.
     */
    @Test
    public void testSetLast_name() {
        System.out.println("setLast_name");
        String last_name = "Suslov";
        User instance = new User();
        instance.setLast_name(last_name);

        String expResult = last_name;
        String result = instance.getLast_name();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User();

        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "e@mail.com";
        User instance = new User();
        instance.setEmail(email);

        String expResult = email;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();

        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "111111"; // That is actually a passhash
        User instance = new User();
        instance.setPassword(password);

        String expResult = password;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWishlists method, of class User.
     */
    @Test
    public void testGetWishlists() {
        System.out.println("getWishlists");
        User instance = new User();

        int expResult = 0;
        int result = instance.getWishlists().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWishlists method, of class User.
     */
    @Test
    public void testSetWishlists() {
        System.out.println("setWishlists");
        ArrayList<Wishlist> wishlists = new ArrayList<>();
        wishlists.add(new Wishlist());
        wishlists.add(new Wishlist());
        wishlists.add(new Wishlist());

        User instance = new User();
        instance.setWishlists(wishlists);

        int expResult = 3;
        int result = instance.getWishlists().size();
        assertEquals(expResult, result);

    }

}

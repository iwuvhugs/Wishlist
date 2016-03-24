/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class ThemeTest {

    public ThemeTest() {
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
    public void testGetId_user() {
        System.out.println("getId_user");
        User instance = new User();
        int expResult = -1;
        int result = instance.getId_user();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId_theme method, of class Theme.
     */
    @Test
    public void testGetId_theme() {
        System.out.println("getId_theme");
        Theme instance = new Theme();
        int expResult = 0;
        int result = instance.getId_theme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("could not get theme_id");
    }

    /**
     * Test of setId_theme method, of class Theme.
     */
    @Test
    public void testSetId_theme() {
        System.out.println("setId_theme");
        int id_theme = 0;
        Theme instance = new Theme();
        instance.setId_theme(id_theme);
        // TODO review the generated test code and remove the default call to fail.
        fail("could not set id.");
    }

    /**
     * Test of getTitle method, of class Theme.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Theme instance = new Theme();
        String expResult = "default";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("could not get title");
    }

    /**
     * Test of setTitle method, of class Theme.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Theme instance = new Theme();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("could not set title");
    }

    /**
     * Test of toString method, of class Theme.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Theme instance = new Theme();
        String expResult = "Theme{" + "id_theme=-1, title=default}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("toString fail to work");
    }
    

}

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
/**
 * 
 */
    public ThemeTest() {
    }
/**
 * 
 * @throws Exception 
 */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
/**
 * 
 * @throws Exception 
 */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
/**
 * 
 * @throws Exception 
 */
    @Before
    public void setUp() throws Exception {
    }
/**
 * 
 * @throws Exception 
 */
    @After
    public void tearDown() throws Exception {
    }
/**
 * 
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
     * Test of getId_theme method, of class Theme.
     */
    @Test
    public void testGetId_theme() {
        System.out.println("getId_theme");
        Theme instance = new Theme();
        int expResult = -1;
        int result = instance.getId_theme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
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
   
    }

      /**
     * Test of getTitle method, of class Theme.
     */
    @Test
    public void testGetbobTitle() {
        System.out.println("getTitle");
        Theme instance = new Theme(1,"bob");
        String expResult = "bob";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
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
        String expResult = "default";
        String result = instance.getTitle();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
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
        
    }
    

}

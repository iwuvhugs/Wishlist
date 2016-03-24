/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author iwuvhugs
 */
public class ProductTest {

    public ProductTest() {
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
     * Test of getId_product method, of class Product.
     */
    @Test
    public void testGetId_product() {
        System.out.println("getId_product");
        Product instance = new Product();
        
        int expResult = -1;
        int result = instance.getId_product();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_product method, of class Product.
     */
    @Test
    public void testSetId_product() {
        System.out.println("setId_product");
        int id_product = 5;
        Product instance = new Product();
        instance.setId_product(id_product);

        int expResult = id_product;
        int result = instance.getId_product();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProduct_name method, of class Product.
     */
    @Test
    public void testGetProduct_name() {
        System.out.println("getProduct_name");
        Product instance = new Product();
        
        String expResult = "";
        String result = instance.getProduct_name();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProduct_name method, of class Product.
     */
    @Test
    public void testSetProduct_name() {
        System.out.println("setProduct_name");
        String product_name = "tomato";
        Product instance = new Product();
        instance.setProduct_name(product_name);

        String expResult = product_name;
        String result = instance.getProduct_name();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Product instance = new Product();
        
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Product.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Good tomato";
        Product instance = new Product();
        instance.setDescription(description);

        String expResult = description;
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Product instance = new Product();
        instance.setPrice(price);

        double expResult = price;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getLink method, of class Product.
     */
    @Test
    public void testGetLink() {
        System.out.println("getLink");
        Product instance = new Product();
        String expResult = "";
        String result = instance.getLink();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLink method, of class Product.
     */
    @Test
    public void testSetLink() {
        System.out.println("setLink");
        String link = "google.com";
        Product instance = new Product();
        instance.setLink(link);

        String expResult = link;
        String result = instance.getLink();
        assertEquals(expResult, result);
    }

}

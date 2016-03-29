/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 * 
 * @author c0611751
 */
public class Product {

    private int id_product;
    private String product_name;
    private String description;
    private double price;
    private String link;

    /**
     * 
     */
    public Product() {
        id_product = -1;
        product_name = "";
        description = "";
        price = 0;
        link = "";
    }
/**
 * 
 * @return 
 */
    public int getId_product() {
        return id_product;
    }
/**
 * 
 * @param id_product 
 */
    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
/**
 * 
 * @return 
 */
    public String getProduct_name() {
        return product_name;
    }
/**
 * 
 * @param product_name 
 */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
/**
 * 
 * @return 
 */
    public String getDescription() {
        return description;
    }
/**
 * 
 * @param description 
 */
    public void setDescription(String description) {
        this.description = description;
    }
/**
 * 
 * @return 
 */
    public double getPrice() {
        return price;
    }
/**
 * 
 * @param price 
 */
    public void setPrice(double price) {
        this.price = price;
    }
/**
 * 
 * @return 
 */
    public String getLink() {
        return link;
    }
/**
 * 
 * @param link 
 */
    public void setLink(String link) {
        this.link = link;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
/**
 * 
 * @author c0611751
 */
public class Wishlist {

    private int id_wishlist;
    private User user;
    private Theme theme;

    private ArrayList<Product> products;
/**
 * 
 */
    public Wishlist() {
        id_wishlist = -1;
        user = new User();
        theme = new Theme();
        products = new ArrayList<>();
    }
/**
 * 
 * @return 
 */
    public int getId_wishlist() {
        return id_wishlist;
    }
/**
 * 
 * @param id_wishlist 
 */
    public void setId_wishlist(int id_wishlist) {
        this.id_wishlist = id_wishlist;
    }
/**
 * 
 * @return 
 */
    public User getUser() {
        return user;
    }
/**
 * 
 * @param user 
 */
    public void setUser(User user) {
        this.user = user;
    }
/**
 * 
 * @return 
 */
    public Theme getTheme() {
        return theme;
    }
/**
 * 
 * @param theme 
 */
    public void setTheme(Theme theme) {
        this.theme = theme;
    }
/***
 * 
 * @return 
 */
    public ArrayList<Product> getProducts() {
        return products;
    }
/**
 * 
 * @param products 
 */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}

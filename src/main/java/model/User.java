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
public class User {

    private int id_user;
    private String first_name;
    private String last_name;
    private String email;
    private String password;

    private ArrayList<Wishlist> wishlists;
/**
 * 
 */
    public User() {
        id_user = -1;
        first_name = "";
        last_name = "";
        email = "";
        password = "";
        wishlists = new ArrayList<>();
    }
/**
 * 
 * @return 
 */
    public int getId_user() {
        return id_user;
    }
/**
 * 
 * @param id_user 
 */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
/**
 * 
 * @return 
 */
    public String getFirst_name() {
        return first_name;
    }
/**
 * 
 * @param first_name 
 */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
/**
 * 
 * @return 
 */
    public String getLast_name() {
        return last_name;
    }
/**
 * 
 * @param last_name 
 */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
/**
 * 
 * @return 
 */
    public String getEmail() {
        return email;
    }
/**
 * 
 * @param email 
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * 
 * @return 
 */
    public String getPassword() {
        return password;
    }
/**
 * 
 * @param password 
 */
    public void setPassword(String password) {
        this.password = password;
    }
/**
 * 
 * @return 
 */
    public ArrayList<Wishlist> getWishlists() {
        return wishlists;
    }
/**
 * 
 * @param wishlists 
 */
    public void setWishlists(ArrayList<Wishlist> wishlists) {
        this.wishlists = wishlists;
    }

}

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
public class Theme {
    private int id_theme;
    private String title;
/**
 * 
 * @return 
 */
    public int getId_theme() {
        return id_theme;
    }
/**
 * 
 * @param id_theme 
 */
    public void setId_theme(int id_theme) {
        this.id_theme = id_theme;
    }
/**
 * 
 * @return 
 */
    public String getTitle() {
        return title;
    }
/**
 * 
 * @param title 
 */
    public void setTitle(String title) {
        this.title = title;
    }
/**
 * 
 */
    public Theme() {
       id_theme = -1;
       title = "default";
    }
/**
 * 
 * @param id_theme
 * @param title 
 */
    public Theme(int id_theme, String title) {
        this.id_theme = id_theme;
        this.title = title;
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return "Theme{" + "id_theme=" + id_theme + ", title=" + title + '}';
    }
    
    
    
}

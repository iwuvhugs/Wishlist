/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Theme {
    private int id_theme;
    private String title;

    public int getId_theme() {
        return id_theme;
    }

    public void setId_theme(int id_theme) {
        this.id_theme = id_theme;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Theme() {
       id_theme = -1;
       title = "default";
    }

    public Theme(int id_theme, String title) {
        this.id_theme = id_theme;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Theme{" + "id_theme=" + id_theme + ", title=" + title + '}';
    }
    
    
    
}

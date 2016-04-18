/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import utils.DBUtil;

/**
 *
 * @author iwuvhugs
 */
@ApplicationScoped
public class ThemeController {

    public JsonObject getAllThemes() {

        JsonObjectBuilder builder = Json.createObjectBuilder();
        Connection conn;
        try {

            conn = DBUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_theme, title FROM THEME");

            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            while (rs.next()) {
                JsonObjectBuilder themeBuilder = Json.createObjectBuilder();
                themeBuilder.add("id_theme", rs.getInt("id_theme"));
                themeBuilder.add("title", rs.getString("title"));
                arrayBuilder.add(themeBuilder);
            }
            builder.add("data", arrayBuilder);
            builder.add("success", true);
        } catch (SQLException ex) {
            Logger.getLogger(WishlistController.class.getName()).log(Level.SEVERE, null, ex);
            builder.add("success", false);

        }
        JsonObject object = builder.build();
        return object;
    }

}

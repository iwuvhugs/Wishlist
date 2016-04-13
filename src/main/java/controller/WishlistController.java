/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import model.Wishlist;
import utils.DBUtil;

/**
 *
 * @author iwuvhugs
 */
@ApplicationScoped
public class WishlistController {

    private final List<Wishlist> wishilsts = new ArrayList<>();

    public JsonObject getAllWishlists() {
        JsonObjectBuilder builder = Json.createObjectBuilder();

        Connection conn;
        try {
            conn = DBUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_wishlist, first_name, title "
                    + "FROM WISHLIST "
                    + "JOIN USER ON WISHLIST.id_user = USER.id_user "
                    + "JOIN THEME ON WISHLIST.id_theme = THEME.id_theme;");

            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            while (rs.next()) {
                JsonObjectBuilder innerBuilder = Json.createObjectBuilder();
                innerBuilder.add("id", rs.getInt("id_wishlist"));
                innerBuilder.add("name", rs.getString("first_name"));
                innerBuilder.add("theme", rs.getString("title"));
                arrayBuilder.add(innerBuilder);
            }

            builder.add("success", true);
            builder.add("data", arrayBuilder.build().toString());
        } catch (SQLException ex) {
            Logger.getLogger(WishlistController.class.getName()).log(Level.SEVERE, null, ex);
            builder.add("success", false);

        }
        JsonObject object = builder.build();
        return object;
    }
}

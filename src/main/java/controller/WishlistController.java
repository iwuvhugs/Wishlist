/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            ResultSet rs = stmt.executeQuery("SELECT id_wishlist, USER.id_user, first_name, title "
                    + "FROM WISHLIST "
                    + "JOIN USER ON WISHLIST.id_user = USER.id_user "
                    + "JOIN THEME ON WISHLIST.id_theme = THEME.id_theme;");

            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            while (rs.next()) {
                JsonObjectBuilder innerBuilder = Json.createObjectBuilder();
                int wishlist_id = rs.getInt("id_wishlist");
                innerBuilder.add("id", wishlist_id);
                innerBuilder.add("id_user", rs.getInt("USER.id_user"));
                innerBuilder.add("name", rs.getString("first_name"));
                innerBuilder.add("theme", rs.getString("title"));

                PreparedStatement pStmt = conn.prepareStatement(
                        "SELECT PRODUCT_LIST.id_product, "
                        + "PRODUCT.product_name, "
                        + "PRODUCT.description, "
                        + "PRODUCT.price, "
                        + "PRODUCT.link, "
                        + "PRODUCT_LIST.reserved, "
                        + "PRODUCT_LIST.purchased "
                        + "FROM PRODUCT_LIST JOIN PRODUCT "
                        + "ON PRODUCT_LIST.id_product = PRODUCT.id_product "
                        + "WHERE PRODUCT_LIST.id_wishlist = ?;");
                pStmt.setInt(1, wishlist_id);
                ResultSet pRs = pStmt.executeQuery();
                JsonArrayBuilder prodArrayBuilder = Json.createArrayBuilder();
                while (pRs.next()) {
                    JsonObjectBuilder productBuilder = Json.createObjectBuilder();

                    productBuilder.add("id_product", pRs.getInt("PRODUCT_LIST.id_product"));
                    productBuilder.add("product_name", pRs.getString("PRODUCT.product_name"));
                    productBuilder.add("description", pRs.getString("PRODUCT.description"));
                    productBuilder.add("price", pRs.getDouble("PRODUCT.price"));
                    productBuilder.add("link", pRs.getString("PRODUCT.link"));
                    productBuilder.add("reserved", pRs.getBoolean("PRODUCT_LIST.reserved"));
                    productBuilder.add("purchased", pRs.getInt("PRODUCT_LIST.purchased"));

                    prodArrayBuilder.add(productBuilder);
                }
                innerBuilder.add("products", prodArrayBuilder);

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

    public JsonObject getUserWishlists(int id) {
        JsonObjectBuilder builder = Json.createObjectBuilder();

        Connection conn;
        try {
            conn = DBUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT id_wishlist, USER.id_user, first_name, title "
                    + "FROM WISHLIST "
                    + "JOIN USER ON WISHLIST.id_user = USER.id_user "
                    + "JOIN THEME ON WISHLIST.id_theme = THEME.id_theme WHERE USER.id_user = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            while (rs.next()) {
                JsonObjectBuilder innerBuilder = Json.createObjectBuilder();
                int wishlist_id = rs.getInt("id_wishlist");
                innerBuilder.add("id", wishlist_id);
                innerBuilder.add("id_user", rs.getInt("USER.id_user"));
                innerBuilder.add("name", rs.getString("first_name"));
                innerBuilder.add("theme", rs.getString("title"));

                PreparedStatement pStmt = conn.prepareStatement(
                        "SELECT PRODUCT_LIST.id_product, "
                        + "PRODUCT.product_name, "
                        + "PRODUCT.description, "
                        + "PRODUCT.price, "
                        + "PRODUCT.link, "
                        + "PRODUCT_LIST.reserved, "
                        + "PRODUCT_LIST.purchased "
                        + "FROM PRODUCT_LIST JOIN PRODUCT "
                        + "ON PRODUCT_LIST.id_product = PRODUCT.id_product "
                        + "WHERE PRODUCT_LIST.id_wishlist = ?;");
                pStmt.setInt(1, wishlist_id);
                ResultSet pRs = pStmt.executeQuery();
                JsonArrayBuilder prodArrayBuilder = Json.createArrayBuilder();
                while (pRs.next()) {
                    JsonObjectBuilder productBuilder = Json.createObjectBuilder();

                    productBuilder.add("id_product", pRs.getInt("PRODUCT_LIST.id_product"));
                    productBuilder.add("product_name", pRs.getString("PRODUCT.product_name"));
                    productBuilder.add("description", pRs.getString("PRODUCT.description"));
                    productBuilder.add("price", pRs.getDouble("PRODUCT.price"));
                    productBuilder.add("link", pRs.getString("PRODUCT.link"));
                    productBuilder.add("reserved", pRs.getBoolean("PRODUCT_LIST.reserved"));
                    productBuilder.add("purchased", pRs.getInt("PRODUCT_LIST.purchased"));

                    prodArrayBuilder.add(productBuilder);
                }
                innerBuilder.add("products", prodArrayBuilder);

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

    public JsonObject addNewWishlist(int theme_id, int user_id) {

        JsonObjectBuilder builder = Json.createObjectBuilder();

        Connection conn;
        try {
            conn = DBUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO WISHLIST (id_user, id_theme) VALUES ( ? , ? )");
            stmt.setInt(1, user_id);
            stmt.setInt(2, theme_id);
            stmt.executeUpdate();

            builder.add("success", true);
        } catch (SQLException ex) {
            Logger.getLogger(WishlistController.class.getName()).log(Level.SEVERE, null, ex);
            builder.add("success", false);

        }
        JsonObject object = builder.build();
        return object;

    }

    public boolean deleteWishlist(int id) {
        Connection conn;
        try {
            conn = DBUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM WISHLIST WHERE id_wishlist = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(WishlistController.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public JsonObject getWishlistProducts(int id) {

        JsonObjectBuilder builder = Json.createObjectBuilder();
        Connection conn;
        try {
            conn = DBUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT "
                    + "	PRODUCT_LIST.id_wishlist, "
                    + "    PRODUCT_LIST.id_product, "
                    + "    PRODUCT.product_name, "
                    + "    PRODUCT.description, "
                    + "    PRODUCT.price, "
                    + "    PRODUCT.link, "
                    + "    PRODUCT_LIST.reserved, "
                    + "    PRODUCT_LIST.purchased "
                    + "FROM PRODUCT_LIST JOIN PRODUCT  "
                    + "	ON PRODUCT_LIST.id_product = PRODUCT.id_product "
                    + "     WHERE PRODUCT_LIST.id_wishlist = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            while (rs.next()) {
                JsonObjectBuilder innerBuilder = Json.createObjectBuilder();

                innerBuilder.add("id_wishlist", rs.getInt(1));
                innerBuilder.add("id_product", rs.getInt(2));
                innerBuilder.add("product_name", rs.getString(3));
                innerBuilder.add("description", rs.getString(4));
                innerBuilder.add("price", rs.getString(5));
                innerBuilder.add("link", rs.getString(6));
                innerBuilder.add("reserved", rs.getString(7));
                innerBuilder.add("purchased", rs.getString(8));

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

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import model.User;
import utils.DBUtil;

/**
 *
 * @author iwuvhugs
 */
@ApplicationScoped
public class UserController {

    private final User user = new User();

    public JsonObject getUserById(int id) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        Connection conn;
        try {
            conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT id_user, first_name, last_name "
                    + "FROM user WHERE id_user = ?");
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            JsonObjectBuilder userBuilder = Json.createObjectBuilder();
            if (rs.next()) {
                userBuilder.add("id_user", id);
                userBuilder.add("first_name", rs.getString("first_name"));
                userBuilder.add("last_name", rs.getString("last_name"));
                builder.add("data", userBuilder);
            }

            builder.add("success", true);
        } catch (SQLException ex) {
            Logger.getLogger(WishlistController.class.getName()).log(Level.SEVERE, null, ex);
            builder.add("success", false);

        }
        JsonObject object = builder.build();
        return object;
    }

    

}

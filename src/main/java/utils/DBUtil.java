/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iwuvhugs
 */
public class DBUtil {

    /**
     *
     * @return @throws SQLException
     */
    public static Connection getConnection() {
        Connection connection;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            String host = "localhost";
            String port = "3306";
            String db = "wishlist";
            String user = "root";
            String pass = "";
            String jdbc = "jdbc:mysql://" + host + ":" + port + "/" + db;

            connection = DriverManager.getConnection(jdbc, user, pass);
        } catch (Exception e) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, e);
            try {
                String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
                String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
                String name = "wishlist";
                String url = "jdbc:mysql://" + host + ":" + port + "/" + name;
                String username = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
                String password = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");

                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
                connection = null;
            }
        }
        return connection;
    }

}

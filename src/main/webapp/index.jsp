<%-- 
    Document   : index
    Created on : Apr 9, 2016, 2:41:11 AM
    Author     : Abdul
--%>

<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="utils.DBUtil"%>
<%@page import="java.sql.*"%>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wishlist</title>
        <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
        <link rel="stylesheet" type="text/css" href="styles/main.css">
    </head>
    <body> 
        <!--implementing my class-->
        <%!
            public class Wishlist {

                public Connection con() {
                    Connection connection = null;
                    try {
                        connection = DBUtil.getConnection();
                    } catch (Exception e) {

                        System.out.println("Failed to connect to database");
                        Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, e);
                    }

                    return connection;
                }
                Connection connection = con();
                PreparedStatement insertWishlist = null;
                ResultSet resultSet = null;

                public Wishlist() {
                    try {
                        insertWishlist = connection.prepareStatement("INSERT INTO USER"
                                + "(first_name,last_name,email,password)"
                                + "VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }

                public int setWishlist(String first, String last, String email, String password) {
                    int result = 0;
                    try {
                        insertWishlist.setString(1, first);
                        insertWishlist.setString(2, last);
                        insertWishlist.setString(3, email);
                        insertWishlist.setString(4, password);
                        result = insertWishlist.executeUpdate();

                        if (result != 0) {
                            resultSet = insertWishlist.getGeneratedKeys();
                            if (resultSet.next()) {
                                int user_id = resultSet.getInt(1);

                            }

                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return result;
                }
            }

        %>
        <%//            creating object of active class
            int result = 0;

//            checking for the submit parameteri.e if d submit button is pushed
//before running the code within it
            if (request.getParameter("submit") != null) {

                String firstName = new String();
                String lastName = new String();
                String email = new String();
                String password = new String();

                if (request.getParameter("first") != null && request.getParameter("last") != null
                        && request.getParameter("email") != null && request.getParameter("password") != null) {
                    firstName = request.getParameter("first");
                    lastName = request.getParameter("last");
                    email = request.getParameter("email");
                    password = request.getParameter("password");
                }

                Wishlist wish = new Wishlist();
                result = wish.setWishlist(firstName, lastName, email, password);
            }
        %>
        <form action="user.html?id=3" method="POST" name="login">
            <div class="login-form">
                <h1>Wishlist</h1>
                <div class="form-group ">
                    <input type="text" class="form-control" placeholder="First Name " name="first">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group ">
                    <input type="text" class="form-control" placeholder="Last Name " name="last">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group ">
                    <input type="text" class="form-control" placeholder="Email " name="email">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group log-status">
                    <input type="password" class="form-control" placeholder="Password" name="password">
                    <i class="fa fa-lock"></i>
                </div>
                <span class="alert">Invalid Credentials</span>

                <input type="submit" value="submit" name="submit" class="log-btn"/>
            </div>
        </form>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src="js/index.js"></script>
    </body>
</html>

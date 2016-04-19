/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controller.WishlistController;
import java.io.StringReader;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author iwuvhugs
 */
@ApplicationScoped
@Path("/wishlists")
public class WishlistsService {

    @Inject
    WishlistController controller;

    @GET
    @Produces("application/json")
    public Response getAll() {
        JsonObject object = controller.getAllWishlists();
        if (object.getBoolean("success")) {
            return Response.ok(object.getString("data")).build();
        } else {
            return Response.status(404).entity("Error").build();
        }
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Response getByUserId(@PathParam("id") int id) {
        JsonObject object = controller.getUserWishlists(id);
        if (object.getBoolean("success")) {
            return Response.ok(object.getString("data")).build();
        } else {
            return Response.status(404).entity("Error").build();
        }
    }

    /**
     *
     * @param str
     * @return JSON array of all messages
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response add(String str) {
        JsonObject json = Json.createReader(new StringReader(str)).readObject();
        int theme_id = Integer.parseInt(json.getString("id_theme"));
        int user_id = Integer.parseInt(json.getString("id_user"));
        JsonObject object = controller.addNewWishlist(theme_id, user_id);
        if (object.getBoolean("success")) {
            return Response.ok(object).build();
        } else {
            return Response.status(404).entity("Error").build();
        }

    }
    
        /**
     *
     * @param id
     * @return JSON array of all messages
     */
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {

        if (controller.deleteWishlist(id)) {
            return Response.ok("Hi").build();
        } else {
            return Response.status(404).entity("Message not deleted").build();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controller.WishlistController;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
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
            return Response.ok(object.getString("data").toString()).build();
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
            return Response.ok(object.getString("data").toString()).build();
        } else {
            return Response.status(404).entity("Error").build();
        }
    }

}

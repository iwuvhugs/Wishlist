/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controller.UserController;
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
@Path("/users")
public class UserService {

    @Inject
    UserController controller;

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") int id) {
        JsonObject object = controller.getUserById(id);
        if (object.getBoolean("success")) {
            return Response.ok(object.toString()).build();
        } else {
            return Response.status(404).entity("Message not found").build();
        }

    }
}

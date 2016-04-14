/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controller.ThemeController;
import java.io.StringReader;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author iwuvhugs
 */
@ApplicationScoped
@Path("/themes")
public class ThemeService {

    @Inject
    ThemeController controller;

    @GET
    @Produces("application/json")
    public Response getAll() {
//        System.out.println("getAll");
        JsonObject object = controller.getAllThemes();
        if (object.getBoolean("success")) {
            return Response.ok(object.get("data")).build();
//            
        } else {
            return Response.status(404).entity("Error").build();
        }
    }



}

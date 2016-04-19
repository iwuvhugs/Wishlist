/*
 * Copyright (C) 2016 iwuvhugs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package services;

import controller.WishlistController;
import java.io.StringReader;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
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
@Path("/products")
public class ProductService {

    @Inject
    WishlistController controller;

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Response getByUserId(@PathParam("id") int id) {
        JsonObject object = controller.getWishlistProducts(id);
        System.out.println(object.toString());
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
   
        JsonObject object = controller.addNewProductToWishlist(json);
        if (object.getBoolean("success")) {
            System.out.println("OK");
            return Response.ok(object).build();
        } else {
            System.out.println("NOT OK");
            return Response.status(404).entity("Error").build();
        }

    }

}

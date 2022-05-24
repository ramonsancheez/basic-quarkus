package edu.poniperro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/adios")
public class VariableResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String hello(String name) {
        return "Bye from RESTEasy Reactive \n" + name;
    }
}
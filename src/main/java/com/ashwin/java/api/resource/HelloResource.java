package com.ashwin.java.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {
    @GET
    public Response hello() {
        return Response.ok("Hello world").build();
    }
}

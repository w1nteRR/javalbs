package company.rest;

import company.SportsObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/sportsobject")
public class Service {
    private static Map<Integer, SportsObject> sportsobjectMap = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final SportsObject getSportsObject(final @PathParam("id") Integer id) {
        return sportsobjectMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createSportsObject(final SportsObject sportsobject) {
        sportsobjectMap.put(sportsobject.getId(), sportsobject);
        return Response.status(200).entity("Good").build();
    }

    @POST
    public final Response deleteSportsObject(final SportsObject sportsobject) {
        sportsobjectMap.replace(sportsobject.getId(), sportsobject);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response replaceSportsObject(final @PathParam("id") Integer id) {
        sportsobjectMap.remove(id);
        return Response.status(200).entity("Good").build();
    }
}
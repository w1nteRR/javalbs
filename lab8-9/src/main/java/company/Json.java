package company;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/sportsobjects")

public class Json {
    private static Map<Integer, SportsObject> sportsObjectMap = new HashMap<>();
    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final SportsObject getSportsObject(final @PathParam("id") Integer id) {
        return sportsObjectMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createSportsObject(final SportsObject sportsObject) {
        sportsObjectMap.put(sportsObject.getId(), sportsObject);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response replaceSportsObject(final @PathParam("id") Integer id) {
        sportsObjectMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Path("{id}/")
    public final Response deleteSportsObject(final @PathParam("id") Integer id, final SportsObject sportsObject) {
        sportsObjectMap.replace(id, sportsObject);
        return Response.status(200).entity("Good").build();
    }
}

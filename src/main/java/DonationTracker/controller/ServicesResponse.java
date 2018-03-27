package DonationTracker.controller;

import DonationTracker.entity.User;
import DonationTracker.persistence.UserDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/access")
public class ServicesResponse {
    @Path("/users")
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces("text/plain")
    public Response getUsersService() { ;
        //UserDao userDao = new UserDao();
        //List<User> results = userDao.getAllUsers();
        String test = "test";
        return Response.status(200).entity(test).build();

    }
}

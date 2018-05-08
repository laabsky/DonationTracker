package DonationTracker.service;

import DonationTracker.entity.User;
import DonationTracker.persistence.UserDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/users")
public class UserService {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsersService() throws JsonProcessingException { ;
        UserDao userDao = new UserDao();
        List<User> results = userDao.getAllUsers();

        ObjectMapper objectMapper = new ObjectMapper();
        //Set pretty printing of json
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        //1. Convert List of Person objects to JSON
        String arrayToJson = objectMapper.writeValueAsString(results);

        return Response.status(200).entity(arrayToJson).build();

    }
}

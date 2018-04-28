package DonationTracker.controller;

import CharityNavigator.Response;
import CharityNavigator.ResponseList;
import DonationTracker.entity.User;
import DonationTracker.persistence.UserDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A servlet to forward to profile page.
 * @author jlaabs
 */

@WebServlet(
        urlPatterns = {"/toProfileServlet"}
)

public class ToProfileServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getRemoteUser();
        UserDao dao = new UserDao();
        request.setAttribute("users", dao.getByPropertyEqual("userName", userName));
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.data.charitynavigator.org/v2/Organizations?app_id=af6bdcf3&app_key=092ed7ffde8aa8c3818496c099b6dc1a&rated=true&state=WI&city=madison&minRating=3");
        String initResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        String configResponse = "{\"responseList\": " + initResponse + "}";
        ObjectMapper mapper = new ObjectMapper();
        ResponseList results = mapper.readValue(configResponse, ResponseList.class);
        List<String> charityNames = new ArrayList<String>();
        for (Response item : results.getResponseList()) {
            String charityName = item.getCharityName();
            charityNames.add(charityName);
        }
        request.setAttribute("charityNames", charityNames);
        String url = "/profile.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}


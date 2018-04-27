package DonationTracker.controller;

import CharityNavigator.Response;
import CharityNavigator.ResponseList;
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
 * A test servlet for outputting values.
 * @author jlaabs
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String searchTerm = req.getParameter("searchTerm");
        if(searchTerm != null && !searchTerm.isEmpty()) {
            req.setAttribute("users", userDao.getUsersByLastName(searchTerm));
        } else {
            req.setAttribute("users", userDao.getAllUsers());
        }
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.data.charitynavigator.org/v2/Organizations?app_id=af6bdcf3&app_key=092ed7ffde8aa8c3818496c099b6dc1a&rated=true&state=WI&city=madison&minRating=3");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        String configResponse = "{\"responseList\": " + response + "}";
        ObjectMapper mapper = new ObjectMapper();
        ResponseList results = mapper.readValue(configResponse, ResponseList.class);
        List<String> charityNames = new ArrayList<String>();
        for (Response item : results.getResponseList()) {
            String charityName = item.getCharityName();
            charityNames.add(charityName);
        }
        req.setAttribute("charityNames", charityNames);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}
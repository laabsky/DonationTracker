package DonationTracker.controller;

import CharityNavigator.Response;
import CharityNavigator.ResponseList;
import DonationTracker.entity.Role;
import DonationTracker.entity.User;
import DonationTracker.persistence.ItemDao;
import DonationTracker.persistence.RoleDao;
import DonationTracker.persistence.UserDao;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import java.util.Properties;

/**
 * A servlet for forwarding to add item page.
 * @author jlaabs
 */

@WebServlet(
        urlPatterns = {"/toAddItemServlet"}
)

public class ToAddItemServlet extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    private Properties properties;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        loadProperties();
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(properties.getProperty("url"));
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
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addItem.jsp");
        dispatcher.forward(req, resp);
    }

    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("/api.properties"));
        } catch (IOException ioe) {
            logger.error(ioe);
        } catch (Exception e) {
            logger.error(e);
        }

    }
}

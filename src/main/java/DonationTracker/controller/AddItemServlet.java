package DonationTracker.controller;

import CharityNavigator.Response;
import CharityNavigator.ResponseList;
import DonationTracker.entity.Item;
import DonationTracker.entity.Role;
import DonationTracker.entity.User;
import DonationTracker.persistence.ItemDao;
import DonationTracker.persistence.RoleDao;
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
 * A servlet for adding an item.
 * @author jlaabs
 */

@WebServlet(
        urlPatterns = {"/addItemServlet"}
)

public class AddItemServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getRemoteUser();
        UserDao userDao = new UserDao();
        User user = userDao.getByPropertyEqual("userName", userName).get(0);
        String  description = req.getParameter("description");
        double amount = Double.parseDouble(req.getParameter("amount"));
        String charity = req.getParameter("charity");
        String date = req.getParameter("date");

        ItemDao dao = new ItemDao();
        Item item = new Item(user, description, amount, charity, date);
        user.addItem(item);
        int id = dao.insert(item);

        RequestDispatcher dispatcher = req.getRequestDispatcher("toProfileServlet");
        dispatcher.forward(req, resp);
    }
}

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
 * A servlet for deleting an item.
 * @author jlaabs
 */

@WebServlet(
        urlPatterns = {"/deleteUserServlet"}
)

public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userId = Integer.parseInt(req.getParameter("id"));
        UserDao userDao = new UserDao();
        userDao.delete(userDao.getUserById(userId));

        RequestDispatcher dispatcher = req.getRequestDispatcher("toAdminServlet");
        dispatcher.forward(req, resp);
    }
}


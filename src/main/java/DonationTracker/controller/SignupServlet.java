package DonationTracker.controller;

import CharityNavigator.Response;
import CharityNavigator.ResponseList;
import DonationTracker.entity.Role;
import DonationTracker.entity.User;
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
 * A servlet for creating a new user.
 * @author jlaabs
 */

@WebServlet(
        urlPatterns = {"/signupServlet"}
)

public class SignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url;
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        if(firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty() &&
                userName != null && !userName.isEmpty() && password != null && !password.isEmpty() &&
                email != null && !email.isEmpty()) {
            User newUser = new User(firstName, lastName, userName, password, email);
            UserDao userDao = new UserDao();
            int userId = userDao.insert(newUser);
            User insertedUser = userDao.getUserById(userId);
            Role newRole = new Role(insertedUser, "user", insertedUser.getUserName());
            RoleDao roleDao = new RoleDao();
            int roleId = roleDao.insert(newRole);
            url = "toProfileServlet";
        } else {
            url = "/signup.jsp";
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher(url);
        dispatcher.forward(req, resp);
    }
}

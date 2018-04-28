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
 * A servlet to forward to admin page.
 * @author jlaabs
 */

@WebServlet(
        urlPatterns = {"/toAdminServlet"}
)

public class ToAdminServlet extends HttpServlet {

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

        UserDao userDao = new UserDao();
        String searchTerm = request.getParameter("searchTerm");
        request.setAttribute("users", userDao.getAllUsers());
        String url = "/admin.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
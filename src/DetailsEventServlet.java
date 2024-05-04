import db.DbConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/event-details")

public class DetailsEventServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        request.setAttribute("event_one", DbConnector.getEventById(id));
        request.setAttribute("event_details", DbConnector.getAllEvents());

        request.getRequestDispatcher("/html/event-details.jsp").forward(request, response);
    }
}

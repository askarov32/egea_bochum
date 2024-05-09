import Models.Event;
import Models.News;
import db.DbConnector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-event")
public class AddEventServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("events_add", DbConnector.getAllEvents());
        req.getRequestDispatcher("/html/admin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("eventName");
        String content = req.getParameter("eventContent");
        String date = req.getParameter("eventDate");

        Event event = new Event();
        event.setName(name);
        event.setContent(content);
        event.setDate(date);

        DbConnector.addEvent(event);
        resp.sendRedirect("/admin");
    }
}


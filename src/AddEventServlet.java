import Models.Event;
import Models.News;
import db.DbConnector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
        String[] imageUrls = req.getParameterValues("eventImages");
        ArrayList<String> images = new ArrayList<>();
        if(imageUrls != null) {
            images.addAll(Arrays.asList(imageUrls));
        }
        Event event = new Event();
        event.setName(name);
        event.setContent(content);
        event.setDate(date);
        event.setImages(images);

        DbConnector.addEvent(event);
        resp.sendRedirect("/admin");
    }
}


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

@WebServlet(value = "/event-update")
public class UpdateEventServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("eventId"));
        String name = req.getParameter("eventName");
        String content = req.getParameter("eventContent");
        String date = req.getParameter("eventDate");
        String[] imageUrls = req.getParameterValues("eventImages");

        ArrayList<String> images = new ArrayList<>();
        if (imageUrls != null) {
            images.addAll(Arrays.asList(imageUrls));
        }
        Event event = DbConnector.getEventById(id);

        event.setName(name);
        event.setContent(content);
        event.setDate(date);
        event.setImages(images);
        DbConnector.updateEvent(event);
        System.out.println(event.toString());

        resp.sendRedirect("/admin");

    }
}

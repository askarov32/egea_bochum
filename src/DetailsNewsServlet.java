import db.DbConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/news-details")

public class DetailsNewsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        request.setAttribute("new", DbConnector.getNewsById(id));
        request.setAttribute("news_details", DbConnector.getAllNews());

        request.getRequestDispatcher("/html/news-details.jsp").forward(request, response);
    }
}

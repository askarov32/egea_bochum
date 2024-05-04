import Models.News;
import db.DbConnector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-news")
public class AddNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("news_add", DbConnector.getAllNews());
        req.getRequestDispatcher("/html/admin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("newsName");
        String content = req.getParameter("newsContent");

        News news = new News();
        news.setName(name);
        news.setContent(content);

        DbConnector.addNews(news);
        resp.sendRedirect("/admin");
    }
}


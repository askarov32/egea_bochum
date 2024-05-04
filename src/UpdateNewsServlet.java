import Models.News;
import db.DbConnector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/news-update")
public class UpdateNewsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("newsId"));
        String name = req.getParameter("newsName");
        String content = req.getParameter("newsContent");
        News news = DbConnector.getNewsById(id);

        news.setName(name);
        news.setContent(content);

        DbConnector.updateNews(news);

        resp.sendRedirect("/main");

    }
}

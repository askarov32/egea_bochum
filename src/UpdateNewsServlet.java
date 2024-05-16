import Models.News;
import db.DbConnector;

import db.DbManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(value = "/news-update")
public class UpdateNewsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("newsId"));
        String name = req.getParameter("newsName");
        String content = req.getParameter("newsContent");
        String date = req.getParameter("newsDate");
        String[] imageUrls = req.getParameterValues("newsImages");

        ArrayList<String> images = new ArrayList<>();
        if (imageUrls != null) {
            images.addAll(Arrays.asList(imageUrls));
        }
        News news = DbConnector.getNewsById(id);

        news.setName(name);
        news.setContent(content);
        news.setDate(date);
        news.setImages(images);

        DbConnector.updateNews(news);

        resp.sendRedirect("/admin");

    }
}

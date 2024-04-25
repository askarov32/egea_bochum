import db.DbConnector;
import db.DbManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/task-details")

public class DetailsTaskServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        request.setAttribute("task", DbConnector.getTaskById(id));
        request.setAttribute("taski", DbConnector.getAllTasks());

        request.getRequestDispatcher("/html/task-details.jsp").forward(request, response);
    }
}

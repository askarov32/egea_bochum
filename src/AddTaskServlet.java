import Models.Task;
import db.DbConnector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-task")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object DBConnector;
        req.setAttribute("tasks", DbConnector.getAllTasks());
        req.getRequestDispatcher(("/html/add-task.jsp"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("taskName");
        String description = req.getParameter("taskDescription");
        String deadlineDate = req.getParameter("taskDeadline");
        String status = req.getParameter("taskStatus");

        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        task.setDeadlineDate(deadlineDate);
        task.setStatus(status);

        DbConnector.addTask(task);
        resp.sendRedirect("/main");
    }
}

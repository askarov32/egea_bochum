import Models.Task;
import db.DbConnector;
import db.DbManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/task-update")
public class UpdateTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("taskId"));
        String name = req.getParameter("taskName");
        String description = req.getParameter("taskDescription");
        String deadline = req.getParameter("taskDeadLine");
        String status = req.getParameter("taskStatus");

        Task task = DbManager.getTask(id);

        task.setName(name);
        task.setDescription(description);
        task.setStatus(status);
        task.setDeadlineDate(deadline);

        DbConnector.updateTask(task);

        resp.sendRedirect("/main");

    }
}

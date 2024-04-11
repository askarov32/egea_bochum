package Tasks;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-worker")

public class AddWorkerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("workerName");
        String surname = req.getParameter("workerSurname");
        String department = req.getParameter("workerDepartment");
        Integer salary = Integer.parseInt(req.getParameter("workerSalary"));

        Worker worker = new Worker();
        worker.setName(name);
        worker.setSurname(surname);
        worker.setDepartment(department);
        worker.setSalary(salary);

        DbManager.addWorker(worker);
    }

}

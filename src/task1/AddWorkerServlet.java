package task1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddWorkerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("humanName");
        String surname = req.getParameter("humanSurname");
        String department = req.getParameter("humanDepartment");
        Integer salary = Integer.parseInt(req.getParameter("humanSalary"));

        Worker worker = new Worker();
        worker.setName(name);
        worker.setSurname(surname);
        worker.setDepartment(department);
        worker.setSalary(salary);
    }
}

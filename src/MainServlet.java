import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import task1.DbManager;
import task1.Worker;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(value = "/main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
            out.print("<html>");
            out.print("<head>");
            out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">");
            out.print("<meta charset=\"UTF-8\">");
            out.print("<title>Title</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<table class='table table-striped'>");
            out.print("<thead>");
            out.print("<tr>");
            out.print("<th>NAME</th>");
            out.print("<th>SURNAME</th>");
            out.print("<th>DEPARTMENT</th>");
            out.print("<th>SALARY</th>");
            out.print("</tr>");
            out.print("</thead>");
            out.print("<tbody>");
            for (Worker worker: DbManager.workers) {
                out.print("<tr>");
                out.print("<td>" + worker.name + "</td>");
                out.print("<td>" + worker.surname + "</td>");
                out.print("<td>" + worker.department + "</td>");
                out.print("<td>" + worker.salary + "</td>");
                out.print("</tr>");
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</body>");
            out.print("</html>");

    }
}

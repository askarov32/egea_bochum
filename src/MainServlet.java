import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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

        out.print("<form action='/register' method ='post'>");
        out.print("NAME: <input type='text' name = 'humanName' class='form-control w-50 mb-3'>");
        out.print("SURNAME: <input type='text' name = 'humanSurname' class='form-control w-50 mb-3'>");
        out.print("<label class ='mb-3'>Gender:</label>");
        out.print("<select class=\"form-select\" name = 'humanGender' aria-label=\"Default select example\">");
        out.print("<option selected>Choose your gender</option>");
        out.print("<option>Male</option>");
        out.print("<option>Female</option>");
        out.print("</select>");
        out.print("<br>");
        out.print("<button type=\"btn\" class=\"btn btn-secondary\">SEND</button>\n");
        out.print("</form>");

        out.print("</body>");
        out.print("</html>");

    }
}

package Tasks;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/create-order")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("clientName");
        String surname = req.getParameter("clientSurname");
        String food = req.getParameter("clientFood");
        Order order = new Order();
        order.setName(name);
        order.setSurname(surname);
        order.setFood(food);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>" + name + " " + surname + " ordered " + food + "</h1>");
    }
}

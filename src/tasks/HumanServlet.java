package tasks;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/register")
public class HumanServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("humanName");
        String surname = req.getParameter("humanSurname");
        String gender = req.getParameter("humanGender");

        Human human = new Human();
        human.setName(name);
        human.setSurname(surname);
        human.setGender(gender);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (gender.equals("Male")) {
            out.print("<h2>HELLO Dear Mister " + name + " " + surname + "!</h2>");
        }
        if (gender.equals("Female")) {
            out.print("<h2>HELLO Dear Miss " + name + " " + surname + "!</h2>");
        }
    }
}

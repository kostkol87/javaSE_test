package ru.test;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("yourName");
        PrintWriter writer = resp.getWriter();
        String html;
        resp.setContentType("text/html;charset=UTF-8");
        if (name != null) {
            html = "<html><head><title>Hello</title></head></html><body><h1> Hello " +name+ "</h1></body></html>";

        } else {
            html = "<html><head><title>Hello</title></head></html><body><h1> No username </h1></body></html>";
        }

        writer.write(html);

        writer.close();
    }
}

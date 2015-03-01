package ru.test.view;

import ru.test.db.Cache;
import ru.test.service.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Константин on 15.08.2014.
 */
public class GetAmount extends HttpServlet{
    private Service service = new Service();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer userID = Integer.valueOf(req.getParameter("userID"));

        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("Your amount is " +service.getAmount(userID) );
    }
}

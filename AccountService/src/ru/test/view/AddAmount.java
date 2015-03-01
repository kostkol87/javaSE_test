package ru.test.view;

import ru.test.service.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Константин on 15.08.2014.
 */
public class AddAmount extends HttpServlet {
    Service service = new Service();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer userID = Integer.valueOf(req.getParameter("userID"));
        Long userAmount = Long.valueOf(req.getParameter("userAmount"));
        service.addAmount(userID,userAmount);
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("you have successfully add " + userAmount);

    }
}

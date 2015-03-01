package ru.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet (name  = "BookServlet", urlPatterns = "/books")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside book servlet");

        List<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book(11L, "123aaa","Java book 1", new Date()));
        bookList.add(new Book(22L, "234bbb","Java book 2", new Date()));
        bookList.add(new Book(33L, "345ccc","Java book 3", new Date()));
        bookList.add(new Book(44L, "456ddd","Java book 4", new Date()));
        bookList.add(new Book(55L, "567eee","Java book 5", new Date()));
        bookList.add(new Book(66L, "789fff","Java book 6", new Date()));
        bookList.add(new Book(77L, "890ggg","Java book 7", new Date()));

        req.setAttribute("books", bookList); //sending to sjp

        getServletContext().getRequestDispatcher("/books.jsp").forward(req,resp); //отдаем управление jsp с указанными параметрами
    }
}

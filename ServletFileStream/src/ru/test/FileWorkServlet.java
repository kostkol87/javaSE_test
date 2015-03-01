package ru.test;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class FileWorkServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fName = req.getParameter("fName");
        File file = new File(fName);
        if (!file.exists()) {
//            resp.getWriter().print("Such file does not exist");
            resp.sendError(404);
        } else {
            ServletOutputStream out = resp.getOutputStream();
            //kidding browser with file type
            resp.setContentType("audio/mpeg");
            //only firefox has been trying to open it in WMP =))
            resp.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
            byte[] buff = new byte[4096];
            DataInputStream in = new DataInputStream(new FileInputStream(file));
            int length = 0;
            while ((length = in.read(buff)) != -1) {
                out.write(buff, 0, length);
            }

            in.close();
            out.flush();
            out.close();

        }
    }
}

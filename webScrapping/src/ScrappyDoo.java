import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ScrappyDoo extends HttpServlet{
    ParseLine pl = new ParseLine();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String commandLine = req.getParameter("commandLine");
        PrintWriter writer = resp.getWriter();
        ArrayList<String> urlContent = pl.parseUrl(commandLine);

        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req,resp);
//
//        for (String x: urlContent){
//            writer.print(x);
//        }
    }
}

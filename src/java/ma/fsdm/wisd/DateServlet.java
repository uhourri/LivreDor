package ma.fsdm.wisd;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DateServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        PrintWriter out = rep.getWriter();
        out.println("<html><head><title>Bonjour</title></head>");
        out.println("<body><h1> Bonjour à tous </h1>");
        out.println("<h2>Il est : " + new java.util.Date().toString() + "</h2>");
        out.println("</body></html>");
        rep.setHeader("refresh", "3");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        doGet(req, rep);
    }
}

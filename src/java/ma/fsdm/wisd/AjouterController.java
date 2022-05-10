package ma.fsdm.wisd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.fsdm.wisd.model.Appreciation;
import ma.fsdm.wisd.services.Service;

public class AjouterController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Appreciation app = new Appreciation();
        
        app.setAuteur(request.getParameter("auteur"));
        app.setEmail(request.getParameter("email"));
        app.setContenu(request.getParameter("app"));
        
        Service service = new Service();   
        service.ajouterAppreciation(app);
        ArrayList<Appreciation> apps = service.recupererAppreciations();
        
        HttpSession session = request.getSession();
        session.setAttribute("apps", apps);
        session.setAttribute("variable", new Random().nextInt());
        request.getRequestDispatcher("afficher.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
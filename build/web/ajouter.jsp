<%-- 
    Document   : ajouter
    Created on : Dec 14, 2021, 4:48:48 PM
    Author     : UNES
--%>

<%@page import="ma.fsdm.wisd.model.Appreciation"%>
<%@page import="ma.fsdm.wisd.services.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="ma.fsdm.wisd.*"
        %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String auteur = request.getParameter("auteur");
            String email = request.getParameter("email");
            String app = request.getParameter("app");
            
            Appreciation appreciation = new Appreciation(auteur, email, app);
            Service service = new Service();
            boolean result = service.ajouterAppreciation(appreciation);
            
            if(result){
                session.setAttribute("appreciation", appreciation);
                response.sendRedirect("afficher.jsp");
                out.println("OK :)");
            }else{
                out.println("NOT OK !!");
            }
            
        %>
    </body>
</html>

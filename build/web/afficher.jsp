<%-- 
    Document   : afficher
    Created on : Dec 14, 2021, 5:12:30 PM
    Author     : UNES
--%>

<%@page import="ma.fsdm.wisd.model.Appreciation"%>
<%@page import="ma.fsdm.wisd.services.Service"%>
<%@page import="ma.fsdm.wisd.*" 
        import="java.util.*" %>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, th, td {
                border: 1px solid black;
                border-radius: 10px;
                text-align: center;
                font-size: 30px;
            }
        </style>
    </head>
    <body>
        
        <h1 style="text-align:center">Liste des appreciations</h1>
        
        <%!
            Service service = new Service();
            ArrayList<Appreciation> appreciations = service.recupererAppreciations();
        %>

        <table style="width:100%">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Auteur</th>
                    <th>Email</th>
                    <th>Contenu</th>
                    <th>Date</th>
                </tr>
            </thead>

            <tbody>                
                <core:forEach items="${sessionScope.apps}" var="app">
                    <tr>
                        <td><core:out value="${app.id}"/></td>
                        <td><core:out value="${app.auteur}"/></td>
                        <td><core:out value="${app.email}"/></td>
                        <td><core:out value="${app.contenu}"/></td>
                        <td><core:out value="${app.date}"/></td>
                    </tr>
                </core:forEach>
            </tbody>

        </table>
        
        <h1>
            <%= Math.random()%>
        </h1>
        
</body>
</html>

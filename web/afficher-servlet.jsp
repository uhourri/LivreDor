<%-- 
    Document   : afficher-servlet
    Created on : Dec 21, 2021, 5:13:44 PM
    Author     : UNES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            out.println(session.getAttribute("nom"));
        %></h1>
        <h2>${nom}</h2>
    </body>
</html>

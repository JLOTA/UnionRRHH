<%-- 
    Document   : vistaArea
    Created on : 26-sep-2022, 12:33:54
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="presentacion.modeloArea" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Areas</h1>
        <%
            modeloArea modAr = (modeloArea) session.getAttribute("modAr");
        %>
        <form action="controlArea" method="post">
            <!id<input type="text" name="id" value='<%= modAr.getIdArea()%>'>
            area<input type="text" name="are" value='<%= modAr.getArea()%>'>
            descripcion<input type="text" name="des" value='<%= modAr.getDescripcion()%>'>
            <%= modAr.getMsg()%>
            <input type="submit" name="acc" value="Grabar">
        </form>
    </body>
</html>

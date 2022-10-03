<%-- 
    Document   : vistaPuestoLaboral
    Created on : 02-oct-2022, 17:41:18
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="presentacion.modeloHorario" %>
<%@page import="presentacion.modeloArea" %>
<%@page import="presentacion.modeloPuestoLaboral" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Puesto laboral</h1>
        <%
            modeloHorario modHo = (modeloHorario) session.getAttribute("modHo");
            modeloPuestoLaboral modPu = (modeloPuestoLaboral) session.getAttribute("modPu");
            modeloArea modAr = (modeloArea) session.getAttribute("modAr");

        %>
        <form action="controlPuestoLaboral" method="post">
            <!id<input type="text" name="id" value='<%= modPu.getIdPuestoLaboral()%>'>
            <% Object[] f3 = modHo.get();%>
            
            
            id area<input type="text" name="idAr" value='<%= modPu.getIdArea()%>'>
            id horario<input type="text" name="idHo" value='<%= modPu.getIdHorario()%>'>
            nombre<input type="text" name="nom" value='<%= modPu.getPuestoLaboral()%>'>
            descripcion<input type="text" name="des" value='<%= modPu.getDescripcion()%>'>
            <%= modPu.getMsg()%>
            <input type="submit" name="acc" value="Grabar">
        </form>
    </body>
</html>

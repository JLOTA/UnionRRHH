<%-- 
    Document   : vistaHorario
    Created on : 02-oct-2022, 16:51:39
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="presentacion.modeloHorario" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Horarios</h1>
        <%
            modeloHorario modHo = (modeloHorario) session.getAttribute("modHo");
        %>
        <form action="controlHorario" method="post">
            <!id<input type="text" name="id" value='<%= modHo.getIdHorario()%>'>
            horario<input type="text" name="hor" value='<%= modHo.getHorario()%>'>
            hora inicio<input type="time" name="horIni" value='<%= modHo.getHoraInicio()%>'>
            hora fin<input type="time" name="horFin" value='<%= modHo.getHoraFin()%>'>
            <%= modHo.getMsg()%>
            <input type="submit" name="acc" value="Grabar">
        </form>
    </body>
</html>

<%-- 
    Document   : horarioEditar
    Created on : 03-oct-2022, 18:16:01
    Author     : usuario
--%>

<%@page import="negocio.horario"%>
<%@page import="persistencia.daoHorarioImp"%>
<%@page import="persistencia.daoHorario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
         daoHorario horDao = new daoHorarioImp();
         int id= Integer.parseInt((String)request.getAttribute("idHor"));
         horario h=(horario)horDao.leer(id);
        %>
        <div class="container">
            <div class="col-lg-6">
        <h1>Hello World!</h1>
        <form>
            <table>
                <tr style="display: none">
                    <td>ID</td>
                    <td><input type="text" name="idHor" value="<%=h.getIdHorario() %>"></td>
                </tr>
                <tr>
                    <td>Horario</td>
                    <td><input class="form-control" type="text" name="ho" value="<%=h.getHorario() %>"></td>
                </tr>
                <tr>
                    <td>Hora Entrada</td>
                    <td><input class="form-control" type="time" name="horIni" value=''></td>
                </tr>
                <tr>
                    <td>Hora Salida</td>
                    <td><input class="form-control" type="time" name="horFin" value=''></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input class="btn btn-primary" type="submit" name="accion" value="Actualizar Horario">
                        <a href="horarioControl?accion=horarioListar">Regresar</a>
                    </td>
                </tr>
            </table>
        </form>
            </div>
        </div>
    </body>
</html>

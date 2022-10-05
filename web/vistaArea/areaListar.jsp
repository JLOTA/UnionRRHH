<%-- 
    Document   : areaListar
    Created on : 03-oct-2022, 22:38:49
    Author     : usuario
--%>

<%@page import="java.util.*"%>
<%@page import="negocio.area"%>
<%@page import="persistencia.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Areas</h1>
            <a class="btn btn-success" href="areaControl?accion=areaAgregar">Agregar Area</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Area</th>
                        <th class="text-center">Descripcion</th>
                    </tr>
                </thead>
                <%
                    daoArea horDao = new daoAreaImp();
                    List<area> horLis = horDao.listar();
                    Iterator<area> horIte = horLis.iterator();
                    area hor = null;
                    while (horIte.hasNext()) {
                        hor = horIte.next();


                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= hor.getIdArea()%></td>
                        <td class="text-center"><%= hor.getArea()%></td>
                        <td class="text-center"><%= hor.getDescripcion()%></td>
                        <td class="text-center"><a class="btn btn-warning" href="areaControl?accion=areaEditar&id=<%= hor.getIdArea()%>">Modificar</a></td>
                        <td class="text-center"><a class="btn btn-danger" href="areaControl?accion=areaEliminar&id=<%= hor.getIdArea()%>">Eliminar</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

<%-- 
    Document   : estadoListar
    Created on : 04-oct-2022, 20:28:52
    Author     : usuario
--%>

<%@page import="java.util.*"%>
<%@page import="negocio.estado"%>
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
            <h1>Estados</h1>
            <a class="btn btn-success" href="estadoControl?accion=estadoAgregar">Agregar Estado</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Estado</th>
                        <th class="text-center">Descripcion</th>
                        <th colspan="2"></th>
                    </tr>
                </thead>
                <%
                    daoEstado horDao = new daoEstadoImp();
                    List<estado> horLis = horDao.listar();
                    Iterator<estado> horIte = horLis.iterator();
                    estado hor = null;
                    while (horIte.hasNext()) {
                        hor = horIte.next();


                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= hor.getIdEstado()%></td>
                        <td class="text-center"><%= hor.getEstado()%></td>
                        <td class="text-center"><%= hor.getDescripcion()%></td>
                        <td class="text-center"><a class="btn btn-warning" href="estadoControl?accion=estadoEditar&id=<%= hor.getIdEstado()%>">Modificar</a></td>
                        <td class="text-center"><a class="btn btn-danger" href="estadoControl?accion=estadoEliminar&id=<%= hor.getIdEstado()%>">Eliminar</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

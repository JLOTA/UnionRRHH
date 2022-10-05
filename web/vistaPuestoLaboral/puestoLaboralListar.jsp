<%-- 
    Document   : puestoLaboralListar
    Created on : 04-oct-2022, 17:03:29
    Author     : usuario
--%>

<%@page import="negocio.area"%>
<%@page import="java.util.*"%>
<%@page import="negocio.puestoLaboral"%>
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
            <h1>Puestos</h1>
            <a class="btn btn-success" href="puestoLaboralControl?accion=puestoLaboralAgregar">Agregar Puesto</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Area</th>
                        <th class="text-center">Nombre del Cargo</th>
                        <th class="text-center">Descripcion</th>
                    </tr>
                </thead>
                <%
                    daoPuestoLaboral horDao = new daoPuestoLaboralImp();
                    List<puestoLaboral> horLis = horDao.listar();
                    Iterator<puestoLaboral> horIte = horLis.iterator();
                    puestoLaboral hor = null;
                    while (horIte.hasNext()) {
                        hor = horIte.next();


                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= hor.getIdPuestoLaboral()%></td>
                        <%
            daoArea arDao = new daoAreaImp();
            area h = (area) arDao.leer(hor.getIdArea());
        %>
                        <td class="text-center">
                            
                            <%= h.getArea()%>
                        </td>
                        
                        <td class="text-center"><%= hor.getPuestoLaboral()%></td>
                        <td class="text-center"><%= hor.getDescripcion()%></td>
                        <td class="text-center"><a class="btn btn-warning" href="puestoLaboralControl?accion=puestoLaboralEditar&id=<%= hor.getIdPuestoLaboral()%>">Modificar</a></td>
                        <td class="text-center"><a class="btn btn-danger" href="puestoLaboralControl?accion=puestoLaboralEliminar&id=<%= hor.getIdPuestoLaboral()%>">Eliminar</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

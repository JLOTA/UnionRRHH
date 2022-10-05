<%-- 
    Document   : contratoListar
    Created on : 04-oct-2022, 21:10:17
    Author     : usuario
--%>

<%@page import="java.util.*"%>
<%@page import="negocio.*"%>
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
            <h1>Contratos</h1>
            <a class="btn btn-success" href="contratoControl?accion=contratoAgregar">Agregar Contrato</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Tipo</th>                        
                        <th class="text-center">Descripcion</th>
                        <th class="text-center">Fecha Inicio</th>
                        <th class="text-center">Fecha Fin</th>
                    </tr>
                </thead>
                <%
                    daoContrato horDao = new daoContratoImp();
                    List<contrato> horLis = horDao.listar();
                    Iterator<contrato> horIte = horLis.iterator();
                    contrato hor = null;
                    while (horIte.hasNext()) {
                        hor = horIte.next();


                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= hor.getIdContrato()%></td>
                        <%
                            tipoContrato h = (tipoContrato) horDao.leerTipo(hor.getIdTipoContrato());
                        %>
                        <td class="text-center">

                            <%= h.getTipoContrato()%>
                        </td>
                        <td class="text-center"><%= hor.getDescripcion()%></td>
                        <td class="text-center"><%= hor.getFechaInicio()%></td>
                        <td class="text-center"><%= hor.getFechaFin()%></td>
                        <td class="text-center"><a class="btn btn-warning" href="contratoControl?accion=contratoEditar&id=<%= hor.getIdContrato()%>">Modificar</a></td>
                        <td class="text-center"><a class="btn btn-danger" href="contratoControl?accion=contratoEliminar&id=<%= hor.getIdContrato()%>">Eliminar</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

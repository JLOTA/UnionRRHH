<%-- 
    Document   : contratoAgregar
    Created on : 04-oct-2022, 21:09:59
    Author     : usuario
--%>

<%@page import="java.util.*"%>
<%@page import="negocio.tipoContrato"%>
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
            <div class="col-lg-6">
                <h1>Agregar Cargo</h1>
                <form>
                    <table>
                        <tr style="display: none">
                            <td>ID</td>
                            <td><input type="text" name="idPul"></td>
                        </tr>
                        <tr>
                            <td>Tipo</td>
                            <td>           
                                <select class="form-select" name="idAr">
                                    <%
                                        daoContrato horDao = new daoContratoImp();
                                        List<tipoContrato> horLis = horDao.listarTipo();
                                        Iterator<tipoContrato> horIte = horLis.iterator();
                                        tipoContrato hor = null;
                                        while (horIte.hasNext()) {
                                            hor = horIte.next();


                                    %>
                                    <option value="<%= hor.getIdTipoContrato()%>"><%= hor.getTipoContrato()%>     
                                    </option>  <%}%>       
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Descripcion</td>
                            <td><input class="form-control" type="text" name="des"></td>
                        </tr>
                        <tr>
                            <td>Fecha Inicio</td>
                            <td><input class="form-control" type="date" name="fecIni"></td>
                        </tr>
                        <tr>
                        <tr>
                            <td>Fecha Fin</td>
                            <td><input class="form-control" type="date" name="fecFin"></td>
                        </tr>
                            <td colspan="2">
                                <input class="btn btn-primary" type="submit" name="accion" value="Registrar Contrato">
                                <a href="contratoControl?accion=contratoListar">Regresar</a>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>

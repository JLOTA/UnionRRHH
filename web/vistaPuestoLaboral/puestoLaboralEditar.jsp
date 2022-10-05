<%@page import="persistencia.*"%>
<%@page import="java.util.*"%>
<%@page import="negocio.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            daoPuestoLaboral pulDao = new daoPuestoLaboralImp();
            int id = Integer.parseInt((String) request.getAttribute("idPul"));
            puestoLaboral h = (puestoLaboral) pulDao.leer(id);
        %>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Cargo</h1>
                <form>
                    <table>
                        <tr style="display: none">
                            <td>ID</td>
                            <td><input type="text" name="idPul" value="<%=h.getIdPuestoLaboral() %>"></td>
                        </tr>
                        <tr>
                            <td>Area</td>
                            <td>           
                                <select name="idAr">
                                    <%
                                        daoArea horDao = new daoAreaImp();
                                        List<area> horLis = horDao.listar();
                                        Iterator<area> horIte = horLis.iterator();
                                        area hor = null;
                                        while (horIte.hasNext()) {
                                            hor = horIte.next();
                                    %>
                                    <option value="<%= hor.getIdArea()%>"><%= hor.getArea()%>
                                    </option>    
                                    <%}%>       
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Cargo</td>
                            <td><input class="form-control" type="text" name="car" value="<%=h.getPuestoLaboral() %>"></td>
                        </tr>
                        <tr>
                            <td>Descripcion</td>
                            <td><input class="form-control" type="text" name="des" value="<%=h.getDescripcion() %>"></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar Cargo">
                                <a href="puestoLaboralControl?accion=puestoLaboralListar">Regresar</a>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>

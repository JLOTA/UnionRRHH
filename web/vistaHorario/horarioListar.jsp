<%@page import="java.util.List"%>
<%@page import="negocio.horario"%>
<%@page import="java.util.Iterator"%>
<%@page import="persistencia.daoHorarioImp"%>
<%@page import="persistencia.daoHorario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Horarios</h1>
            <a class="btn btn-success" href="horarioControl?accion=horarioAgregar">Agregar Horario</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Horario</th>
                        <th class="text-center">Hora Entrada</th>
                        <th class="text-center">Hora Salida</th>
                    </tr>
                </thead>
                <%
                    daoHorario horDao = new daoHorarioImp();
                    List<horario> horLis = horDao.listar();
                    Iterator<horario> horIte = horLis.iterator();
                    horario hor = null;
                    while (horIte.hasNext()) {
                        hor = horIte.next();


                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= hor.getIdHorario()%></td>
                        <td class="text-center"><%= hor.getHorario()%></td>
                        <td class="text-center"><%= hor.getHoraInicio()%></td>
                        <td class="text-center"><%= hor.getHoraFin()%></td>
                        <td class="text-center"><a class="btn btn-warning" href="horarioControl?accion=horarioEditar&id=<%= hor.getIdHorario()%>">Modificar</a></td>
                        <td class="text-center"><a class="btn btn-danger" href="horarioControl?accion=horarioEliminar&id=<%= hor.getIdHorario()%>">Eliminar</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

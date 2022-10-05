<%@page import="negocio.*"%>
<%@page import="java.util.*"%>
<%@page import="negocio.trabajador"%>
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
            <a class="btn btn-success" href="trabajadorControl?accion=trabajadorAgregar">Agregar Trabajador</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Puesto Laboral</th>
                        <th class="text-center">Contrato</th>
                        <th class="text-center">Horario</th>
                        <th class="text-center">Estado</th>
                        <th class="text-center">DNI</th>
                        <th class="text-center">Nombres</th>
                        <th class="text-center">Apellido Paterno</th>
                        <th class="text-center">Apellido Materno</th>
                        <th class="text-center">Fecha de Nacimiento</th>
                        <th class="text-center">Telefono</th>
                        <th class="text-center">Correo</th>
                        <th class="text-center">Direccion</th>
                        <th colspan="2"></th>
                    </tr>
                </thead>
                <%
                    daoTrabajador traDao = new daoTrabajadorImp();
                    List<trabajador> traLis = traDao.listar();
                    Iterator<trabajador> traIte = traLis.iterator();
                    trabajador tra = null;
                    while (traIte.hasNext()) {
                        tra = traIte.next();


                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= tra.getIdTrabajador()%></td>
                        <%
                            daoPuestoLaboral pulDao = new daoPuestoLaboralImp();
                            puestoLaboral pl = (puestoLaboral) pulDao.leer(tra.getIdPuestoLaboral());
                            
                            daoContrato coDao= new daoContratoImp();
                            contrato c= (contrato)coDao.leer(tra.getIdContrato());
                            
                            daoHorario hoDao = new daoHorarioImp();
                            horario h= (horario) hoDao.leer(tra.getIdHorario());
                            
                            daoEstado esDao = new daoEstadoImp();
                            estado e=(estado)esDao.leer(tra.getIdEstado());
                        %>
                        <td class="text-center"><%= pl.getPuestoLaboral()%></td>                       
                        <td class="text-center"><%= c.getIdContrato() %></td>
                        <td class="text-center"><%= h.getHorario()%></td>
                        <td class="text-center"><%= e.getEstado()%></td>
                        <td class="text-center"><%= tra.getDni()%></td>
                        <td class="text-center"><%= tra.getNombres()%></td>
                        <td class="text-center"><%= tra.getApePat()%></td>
                        <td class="text-center"><%= tra.getApeMat()%></td>
                        <td class="text-center"><%= tra.getFecNac()%></td>
                        <td class="text-center"><%= tra.getTelefono()%></td>
                        <td class="text-center"><%= tra.getCorreo()%></td>
                        <td class="text-center"><%= tra.getDireccion()%></td>
                        <td class="text-center"><a class="btn btn-warning" href="trabajadorControl?accion=trabajadorEditar&id=<%= tra.getIdTrabajador()%>">Modificar</a></td>
                        <td class="text-center"><a class="btn btn-danger" href="trabajadorControl?accion=trabajadorEliminar&id=<%= tra.getIdTrabajador()%>">Eliminar</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>        
    </body>
</html>

<%@page import="negocio.*"%>
<%@page import="java.util.*"%>
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
        <%@include file="../navBar.jsp" %>
        <%
            daoTrabajador traDao = new daoTrabajadorImp();
            int id = Integer.parseInt((String) request.getAttribute("idT"));
            trabajador t = (trabajador) traDao.leer(id);
        %>
        <div class="container">
            <h1>Editar Trabajador</h1>
            <form>
                <div class="form-group row">
                    <h2>Datos Personales</h2>
                    <div class="col">
                        <input type="text" name="nom" value="<%=t.getNombres()%>"class="form-control form-control-sm" placeholder="Nombres">
                    </div>
                    <div class="col">
                        <input type="text" name="apePat" value="<%=t.getApePat()%>" class="form-control form-control-sm" placeholder="Apellido Paterno">
                    </div>
                    <div class="col">
                        <input type="text" name="apeMat" value="<%=t.getApeMat()%>" class="form-control form-control-sm" placeholder="Apellido Materno">
                    </div>
                </div><br>
                <div class="form-group row">
                    <div class="col">
                        <label>Documento de identidad</label>
                        <input type="text" name="dni" value="<%=t.getDni()%>" class="form-control form-control-sm" placeholder="DNI">
                    </div>
                    <div class="col">
                        <label>Fecha de Nacimiento</label>
                        <input type="date" name="fecNac" class="form-control form-control-sm">
                    </div>
                    <div class="col">
                        <label>Domicilio</label>
                        <input type="text" value="<%=t.getDireccion()%>" name="dir" class="form-control form-control-sm" placeholder="Direccion">
                    </div>
                </div><br>
                <div class="form-group row">
                    <div class="col">
                        <label>Telefono</label>
                        <input type="text" name="tel" value="<%=t.getTelefono()%>" class="form-control form-control-sm" placeholder="Telefono">
                    </div>
                    <div class="col">
                        <label>Correo</label>
                        <input type="text" name="cor" value="<%=t.getCorreo()%>" class="form-control form-control-sm" placeholder="Correo">
                    </div>
                </div>
                <div class="form-group row">
                    <h2>Apartado Negocio</h2>
                    <input type="hidden" name="idTra" value="<%=t.getIdTrabajador() %>">
                    <div class="col">
                        <label>Cargo Laboral</label>
                        <select class="form-control custom-select form-control-sm" name="idPul" >
                            <%
                                daoPuestoLaboral pulDao = new daoPuestoLaboralImp();
                                List<puestoLaboral> pulLis = pulDao.listar();
                                Iterator<puestoLaboral> pulIte = pulLis.iterator();
                                puestoLaboral p = null;
                                while (pulIte.hasNext()) {
                                    p = pulIte.next();
                            %>
                            <option value="<%= p.getIdPuestoLaboral()%>"><%= p.getPuestoLaboral()%>     
                            </option>  <%}%>       
                        </select>
                    </div>
                    <div class="col">
                        <label>Contrato</label>
                        <select class="form-control custom-select form-control-sm" name="idCon" >
                            <%
                                daoContrato conDao = new daoContratoImp();
                                List<contrato> conLis = conDao.listar();
                                Iterator<contrato> conIte = conLis.iterator();
                                contrato c = null;
                                while (conIte.hasNext()) {
                                    c = conIte.next();
                            %>
                            <option value="<%= c.getIdContrato()%>"><%= c.getDescripcion()%>     
                            </option>  <%}%>       
                        </select>
                    </div>
                    <div class="col">
                        <label>Turno Laboral</label>
                        <select class="form-control custom-select form-control-sm" name="idHor" >
                            <%
                                daoHorario horDao = new daoHorarioImp();
                                List<horario> horLis = horDao.listar();
                                Iterator<horario> horIte = horLis.iterator();
                                horario h = null;
                                while (horIte.hasNext()) {
                                    h = horIte.next();
                            %>
                            <option value="<%= h.getIdHorario()%>"><%= h.getHorario()%>     
                            </option>  <%}%>       
                        </select>
                    </div>
                    <div class="col">
                        <label>Estado</label>
                        <select class="form-control custom-select form-control-sm" name="idEst" >
                            <%
                                daoEstado estDao = new daoEstadoImp();
                                List<estado> estLis = estDao.listar();
                                Iterator<estado> estIte = estLis.iterator();
                                estado e = null;
                                while (estIte.hasNext()) {
                                    e = estIte.next();
                            %>
                            <option value="<%= e.getIdEstado()%>"><%= e.getEstado()%>     
                            </option>  <%}%>       
                        </select>
                    </div>
                </div><br>
                <div class="form-group row">
                    <div class="col-lg-6">
                        <input class="btn btn-primary" type="submit" name="accion" value="Actualizar Trabajador">
                    </div>
                    <div class="col">
                        <a href="trabajadorControl?accion=trabajadorListar">Regresar</a>
                    </div>                   
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>

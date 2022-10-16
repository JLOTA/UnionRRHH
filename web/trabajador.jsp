<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Union RRHH | Trabajadores</title>
    </head>
    <body>
        <div class="text-bg-light text-center p-3">
            <h1>Gestionar empleados</h1>
        </div>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="control?menu=trabajador" method="post">
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" name="nom" class="form-control form-control-sm" value="${trabajador.getNombres()}">
                        </div>
                        <div class="form-group">
                            <label>Apelido Paterno</label>
                            <input type="text" name="apePat" class="form-control form-control-sm" value="${trabajador.getApePat()}">
                        </div>
                        <div class="form-group">
                            <label>Apellido Materno</label>
                            <input type="text" name="apeMat" class="form-control form-control-sm" value="${trabajador.getApeMat()}">
                        </div>
                        <div class="form-group">
                            <label>DNI</label>
                            <input type="text" name="dni" class="form-control form-control-sm" value="${trabajador.getDni()}">
                        </div>
                        <div class="form-group">
                            <label>Fecha de Nacimiento</label>
                            <input type="date" name="fecNac" class="form-control form-control-sm" value="${trabajador.getFecNac()}">
                        </div>
                        <div class="form-group">
                            <label>Correo</label>
                            <input type="text" name="cor" class="form-control form-control-sm" value="${trabajador.getCorreo()}">
                        </div>
                        <div class="form-group">
                            <label>Telefono</label>
                            <input type="text" name="tel" class="form-control form-control-sm" value="${trabajador.getTelefono()}">
                        </div>
                        <div class="form-group">
                            <label>Direccion</label>
                            <input type="text" name="dir" class="form-control form-control-sm" value="${trabajador.getDireccion()}">
                        </div>
                        <div class="form-group">
                            <label>Cargo</label>
                            <select class="form-select form-select-sm" name="idPue">
                                <c:forEach var="pu" items="${puestos}">
                                    <option value="${pu.getIdPuestoLaboral()}">${pu.getPuestoLaboral()}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Horario</label>
                            <select class="form-select form-select-sm" name="idHor">
                                <c:forEach var="ho" items="${horarios}">
                                    <option value="${ho.getIdHorario()}">${ho.getHorario()}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Contrato</label>
                            <select class="form-select form-select-sm" name="idCon">
                                <c:forEach var="co" items="${contratos}">
                                    <option value="${co.getIdContrato()}">${co.getDescripcion()}</option>
                                </c:forEach>
                            </select>
                        </div><br>
                        <input type="submit" name="acc" value="Agregar" class="btn btn-info btn-outline-light">
                        <input type="submit" name="acc" value="Actualizar" class="btn btn-success btn-outline-light">
                    </form>
                </div>
            </div>
            <div class="col">
                <table class="table table-hover table-sm align-middle" style="font-size: 0.8em">
                    <thead>
                        <tr class="table-info">
                            <th>DNI</th>
                            <th>NOMBRES</th>
                            <th>APELLIDO PATERNO</th>
                            <th>APELLIDO MATERNO</th>
                            <th>TELEFONO</th>
                            <th>CORREO</th>
                            <th>ESTADO</th>
                            <th colspan="2"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="tr" items="${trabajadores}">
                            <tr>
                                <td>${tr.getDni()}</td>
                                <td>${tr.getNombres()}</td>
                                <td>${tr.getApePat()}</td>
                                <td>${tr.getApeMat()}</td>
                                <td>${tr.getTelefono()}</td>
                                <td>${tr.getCorreo()}</td>
                                <td>${tr.getEst().getEstado()}</td>
                                <td>
                                    <a class="btn btn-outline-warning" href="control?menu=trabajador&acc=editar&id=${tr.getIdTrabajador()}"><i class="bi bi-pencil-square"></i></a>
                                </td>
                                <td>
                                    <a class="btn btn-outline-danger" href="control?menu=trabajador&acc=eliminar&id=${tr.getIdTrabajador()}"><i class="bi bi-trash"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>

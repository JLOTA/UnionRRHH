<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Union RRHH | Puestos Laborales</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="control?menu=puestoLaboral" method="post">
                        <div class="form-group">
                            <label>Area</label>
                            <select class="form-select" name="idAre">
                                <c:forEach var="ar" items="${areas}">
                                    <option value="${ar.getIdArea()}">${ar.getArea()}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Cargo</label>
                            <input type="text" name="pue" class="form-control" value="${puesto.getPuestoLaboral()}">
                        </div>
                        <div class="form-group">
                            <label>Descripcion</label>
                            <input type="text" name="des" class="form-control" value="${puesto.getDescripcion()}">
                        </div><br>
                        <input type="submit" name="acc" value="Agregar" class="btn btn-info btn-outline-light">
                        <input type="submit" name="acc" value="Actualizar" class="btn btn-success btn-outline-light">
                    </form>
                </div>
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-6">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>AREA</th>
                            <th>CARGO</th>
                            <th>DESCRIPCION</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pu" items="${puestos}">
                            <tr>
                                <td>${pu.getArea()}</td>
                                <td>${pu.getPuestoLaboral()}</td>
                                <td>${pu.getDescripcion()}</td>
                                <td>
                                    <a class="btn btn-warning" href="control?menu=puestoLaboral&acc=editar&id=${pu.getIdPuestoLaboral()}">Editar</a>
                                    <a class="btn btn-danger" href="control?menu=puestoLaboral&acc=eliminar&id=${pu.getIdPuestoLaboral()}">Eliminar</a>
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

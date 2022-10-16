<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Union RRHH | Puestos Laborales</title>
    </head>
    <body>
        <div class="text-bg-light text-center p-3">
            <h1>Gestionar puestos laborales</h1>
        </div>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="control?menu=puestoLaboral" method="post">
                        <div class="form-group">
                            <label>Area</label>
                            <select class="form-select form-select-sm" name="idAre">
                                <c:forEach var="ar" items="${areas}">
                                    <option value="${ar.getIdArea()}">${ar.getArea()}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Cargo</label>
                            <input type="text" name="pue" class="form-control form-control-sm" value="${puesto.getPuestoLaboral()}">
                        </div>
                        <div class="form-group">
                            <label>Descripcion</label>
                            <textarea name="des" class="form-control form-control-sm" rows="5">${puesto.getDescripcion()}</textarea>
                        </div><br>
                        <input type="submit" name="acc" value="Agregar" class="btn btn-info btn-outline-light">
                        <input type="submit" name="acc" value="Actualizar" class="btn btn-success btn-outline-light">
                    </form>
                </div>
            </div>
            <div class="col-sm-1"></div>
            <div class="col">
                <table class="table table-hover table-sm align-middle" style="font-size: 0.8em">
                    <thead>
                        <tr class="table-info">
                            <th>AREA</th>
                            <th>CARGO</th>
                            <th>DESCRIPCION</th>
                            <th colspan="2"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pu" items="${puestos}">
                            <tr>
                                <td>${pu.getArea()}</td>
                                <td>${pu.getPuestoLaboral()}</td>
                                <td>${pu.getDescripcion()}</td>
                                <td>
                                    <a class="btn btn-outline-warning" href="control?menu=puestoLaboral&acc=editar&id=${pu.getIdPuestoLaboral()}"><i class="bi bi-pencil-square"></i></a>
                                </td>
                                <td>
                                    <a class="btn btn-outline-danger" href="control?menu=puestoLaboral&acc=eliminar&id=${pu.getIdPuestoLaboral()}"><i class="bi bi-trash"></i></a>
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

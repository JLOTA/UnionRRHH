<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Union RRHH | Permisos</title>
    </head>
    <body>
        <div class="text-bg-light text-center p-3">
            <h1>Gestionar permisos</h1>
        </div>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="control?menu=permiso" method="post">
                        <div class="form-group">
                            <label>Categoria</label>
                            <input type="text" value="${area.getArea()}" name="tipCat" class="form-control form-control-sm">
                        </div>
                        <div class="form-group">
                            <label>Empleado</label>
                            <input type="text" value="${area.getArea()}" name="tra" class="form-control form-control-sm">
                        </div>
                        <div class="form-group">
                            <label>Fecha Permiso</label>
                            <input type="date" value="${area.getArea()}" name="fecPer" class="form-control form-control-sm">
                        </div>
                        <div class="form-group">
                            <label>Adjunto</label>
                            <input type="text" value="${area.getArea()}" name="adj" class="form-control form-control-sm">
                        </div>
                        <div class="form-group">
                            <label>Descripcion</label>
                            <textarea name="des" class="form-control form-control-sm" rows="5">${area.getDescripcion()}</textarea>
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
                            <th>CATEGORIA</th>
                            <th>EMPLEADO</th>
                            <th>FECHA PERMISO</th>
                            <th>DESCRIPCION</th>
                            <th colspan="2"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pe" items="${permisos}">
                            <tr>
                                <td>${pe.getTipPer().getTipoPermiso()}</td>
                                <td>${pe.gteTra().getNombres()}</td>
                                <td>${pe.getFechaPermiso()}</td>
                                <td>${pe.getDetalle()}</td>
                                <td>
                                    <a class="btn btn-outline-warning" href="control?menu=area&acc=editar&id=${pe.getIdPermiso()}"><i class="bi bi-pencil-square"></i></a>
                                </td>
                                <td>
                                    <a class="btn btn-outline-danger" href="control?menu=area&acc=eliminar&id=${pe.getIdPermiso()}"><i class="bi bi-trash"></i></a>
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

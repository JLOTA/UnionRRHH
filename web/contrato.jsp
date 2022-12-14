<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Union RRHH | Contratos</title>
    </head>
    <body>
        <div class="text-bg-light text-center p-3">
            <h1>Gestionar contratos</h1>
        </div>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="control?menu=contrato" method="post">
                        <div class="form-group">
                            <label>Tipo Contrato</label>
                            <select class="form-select form-select-sm" name="idTip">
                                <c:forEach var="t" items="${tipos}">
                                    <option value="${t.getIdTipoContrato()}">${t.getTipoContrato()}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" value="${contrato.getDescripcion()}" name="des" class="form-control form-control-sm">
                        </div>
                        <div class="form-group">
                            <label>Fecha de inicio</label>
                            <input type="date" value="${contrato.getFechaInicio()}" name="fecIni" class="form-control form-control-sm">
                        </div>
                        <div class="form-group">
                            <label>Fecha de termino</label>
                            <input type="date" value="${contrato.getFechaFin()}" name="fecFin" class="form-control form-control-sm">
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
                            <th>CATEGORIA</th>
                            <th>NOMBRE</th>
                            <th>FECHA DE INICIO</th>
                            <th>FECHA DE TERMINO</th>
                            <th colspan="2"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="c" items="${contratos}">
                            <tr>
                                <td>${c.getTipCon().getTipoContrato()}</td>
                                <td>${c.getDescripcion()}</td>
                                <td>${c.getFechaInicio()}</td>
                                <td>${c.getFechaFin()}</td>
                                <td>
                                    <a class="btn btn-outline-warning" href="control?menu=contrato&acc=editar&id=${c.getIdContrato()}"><i class="bi bi-pencil-square"></i></a>
                                </td>
                                <td>
                                    <a class="btn btn-outline-danger" href="control?menu=contrato&acc=eliminar&id=${c.getIdContrato()}"><i class="bi bi-trash"></i></a>
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

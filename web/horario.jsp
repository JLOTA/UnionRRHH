<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Union RRHH | Horarios</title>
    </head>
    <body>
        <div class="text-bg-light text-center p-3">
            <h1>Gestionar horarios</h1>
        </div>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="control?menu=horario" method="post">
                        <div class="form-group">
                            <label>Horario</label>
                            <input type="text" value="${horario.getHorario()}" name="hor" class="form-control form-control-sm">
                        </div>
                        <div class="form-group">
                            <label>Hora de ingreso</label>
                            <input type="time" name="horIni" class="form-control form-control-sm" value="${horario.getHoraInicio()}">
                        </div>
                        <div class="form-group">
                            <label>Hora de salida</label>
                            <input type="time" name="horFin" class="form-control form-control-sm" value="${horario.getHoraFin()}">
                        </div><br>
                        <input type="submit" name="acc" value="Agregar" class="btn btn-info btn-outline-light">
                        <input type="submit" name="acc" value="Actualizar" class="btn btn-success btn-outline-light">
                    </form>
                </div>
            </div>
            <div class="col-sm-1"></div>
            <div class="col">
                <table class="table table-hover">
                    <thead>
                        <tr class="table-info">
                            <th>HORARIO</th>
                            <th>HORA DE INGRESO</th>
                            <th>HORA DE SALIDA</th>
                            <th colspan="2"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="ho" items="${horarios}">
                            <tr>
                                <td>${ho.getHorario()}</td>
                                <td>${ho.getHoraInicio()}</td>
                                <td>${ho.getHoraFin()}</td>
                                <td>
                                    <a class="btn btn-warning" href="control?menu=horario&acc=editar&id=${ho.getIdHorario()}">Editar</a>
                                </td>
                                <td>
                                    <a class="btn btn-danger" href="control?menu=horario&acc=eliminar&id=${ho.getIdHorario()}">Eliminar</a>
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

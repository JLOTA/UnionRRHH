<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Union RRHH | Areas</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="control?menu=area" method="post">
                        <div class="form-group">
                            <label>Area</label>
                            <input type="text" value="${area.getArea()}" name="are" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Descripcion</label>
                            <textarea name="des" class="form-control">${area.getDescripcion()}</textarea>
                            <!input type="text" name="des" class="form-control">
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
                            <th>DESCRIPCION</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="ar" items="${areas}">
                            <tr>
                                <td>${ar.getArea()}</td>
                                <td>${ar.getDescripcion()}</td>
                                <td>
                                    <a class="btn btn-warning" href="control?menu=area&acc=editar&id=${ar.getIdArea()}">Editar</a>
                                    <a class="btn btn-danger" href="control?menu=area&acc=eliminar&id=${ar.getIdArea()}">Eliminar</a>
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

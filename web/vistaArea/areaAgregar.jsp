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
            <div class="col-lg-6">
                <h1>Agregar Area</h1>
                <form>
                    <table>
                        <tr style="display: none">
                            <td>ID</td>
                            <td><input type="text" name="idAr"></td>
                        </tr>
                        <tr>
                            <td>Area</td>
                            <td><input class="form-control" type="text" name="ar"></td>
                        </tr>
                        <tr>
                            <td>Descripcion</td>
                            <td><input class="form-control" type="text" name="des"></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input class="btn btn-primary" type="submit" name="accion" value="Registrar Area">
                                <a href="areaControl?accion=areaListar">Regresar</a>
                            </td>
                        </tr>
                    </table>
                </form>

            </div>
        </div>
    </body>
</html>

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
                <h1>Agregar Horario</h1>
                <form>
                    <table>
                        <tr style="display: none">
                            <td>ID</td>
                            <td><input type="text" name="idHor"></td>
                        </tr>
                        <tr>
                            <td>Horario</td>
                            <td><input class="form-control" type="text" name="ho"></td>
                        </tr>
                        <tr>
                            <td>Hora Entrada</td>
                            <td><input class="form-control" type="time" name="horIni"></td>
                        </tr>
                        <tr>
                            <td>Hora Salida</td>
                            <td><input class="form-control" type="time" name="horFin"></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input class="btn btn-primary" type="submit" name="accion" value="Registrar Horario">
                                <a href="horarioControl?accion=horarioListar">Regresar</a>
                            </td>
                        </tr>
                    </table>
                </form>

            </div>
        </div>
    </body>
</html>

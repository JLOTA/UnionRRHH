<%@page import="presentacion.modeloArea"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu | Union RRHH</title>
    </head>
    <body>
        <h1>renombrar</h1>
        
        <form action="controlArea" method="post">
            <input type="submit" name="acc" value="Areas">
        </form>
        <form action="controlHorario" method="post">
            <input type="submit" name="acc" value="Horarios">
        </form>
        <form action="" method="post">
            <input type="submit" name="acc" value="Empleados">
        </form>
        <form action="controlPuestoLaboral" method="post">
            <input type="submit" name="acc" value="Puestos Laborales">
        </form>
        <form action="" method="post">
            <input type="submit" name="acc" value="Asistencia">
        </form>
        <form action="" method="post">
            <input type="submit" name="acc" value="Permisos">
        </form>
        <form action="" method="post">
            <input type="submit" name="acc" value="Contratos">
        </form>
    </body>
</html>

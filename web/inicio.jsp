<%-- 
    Document   : menu
    Created on : 10-oct-2022, 17:29:52
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Union RRHH | Inicio</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-info">
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">Inicio</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Personas
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="control?menu=trabajador" target="myFrame">Empleados</a></li>
                            <li><a class="dropdown-item" href="#" target="myFrame">Familiares</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Empresa
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="control?menu=area&acc=listar" target="myFrame">Areas</a></li>
                            <li><a class="dropdown-item" href="control?menu=puestoLaboral&acc=listar" target="myFrame">Puestos Laborales</a></li>
                            <li><a class="dropdown-item" href="control?menu=horario&acc=listar" target="myFrame">Horarios</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Tramites
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#" target="myFrame">Permisos</a></li>
                            <li><a class="dropdown-item" href="#" target="myFrame">Vacaciones</a></li>
                            <li><a class="dropdown-item" href="#" target="myFrame">Pagos</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Informes
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#" target="myFrame">Asistencia</a></li>
                            <li><a class="dropdown-item" href="control?menu=contrato" target="myFrame">Contratos</a></li>
                        </ul>
                    </li>                    
                </ul>    
            </div>
            <div class="dropdown">
                <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                    ${trabajador.getNombres()} ${trabajador.getApePat()}
                </button>
                <div class="dropdown-menu text-center">
                    <a class="dropdown-item" href="#">
                        <img src="img/usuario.png" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">${administrador.getUsuario()}</a>
                    <a class="dropdown-item" href="#">${trabajador.getCorreo()}</a>
                    <div>
                        <form action="validar" method="post">
                            <button name="acc" value="Salir" class="dropdown-item">Salir</button>
                        </form>
                    </div>
                </div>
            </div>
        </nav>
        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%">

            </iframe>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>

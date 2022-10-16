<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Union RRHH</title>
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
                            <li><a class="dropdown-item" href="control?menu=trabajador&acc=listar" target="myFrame">Empleados</a></li>
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
                            <li><a class="dropdown-item" href="control?menu=contrato&acc=listar" target="myFrame">Contratos</a></li>
                        </ul>
                    </li>                    
                </ul>    
            </div>
            <div class="btn-group drop-start">
                <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" data-bs-toggle="dropdown" data-bs-auto-close="inside" aria-expanded="false">
                    ${administrador.getUsuario()}
                </button>
                <ul class="dropdown-menu text-center">
                    <li><a class="dropdown-item" href="#">
                        <img src="img/usuario.png" alt="60" width="60"/>
                    </a></li>
                    <li><a class="dropdown-item" href="#">${trabajador.getNombres()} ${trabajador.getApePat()}</a></li>
                    <li><a class="dropdown-item" href="#">${trabajador.getCorreo()}</a></li>
                    <li><hr class="dropdown-divider"></li>
                    <li>
                        <form action="validar" method="post">
                            <button name="acc" value="Salir" class="dropdown-item">Salir</button>
                        </form>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%">

            </iframe>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <link rel="icon" href="img/logo-union.png"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Union RRHH</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-info">
            <div class="container-fluid" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">
                            <i class="bi bi-house"></i> Inicio</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="bi bi-people-fill"></i> Personas
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="control?menu=trabajador&acc=listar" target="myFrame">Empleados</a></li>
                            <li><a class="dropdown-item" href="#" target="myFrame">Familiares</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="bi bi-building"></i> Empresa
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="control?menu=area&acc=listar" target="myFrame">Areas</a></li>
                            <li><a class="dropdown-item" href="control?menu=puestoLaboral&acc=listar" target="myFrame">Puestos Laborales</a></li>
                            <li><a class="dropdown-item" href="control?menu=horario&acc=listar" target="myFrame">Horarios</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="bi bi-file-earmark-text-fill"></i> Tramites
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="control?menu=permiso&acc=listar" target="myFrame">Permisos</a></li>
                            <li><a class="dropdown-item" href="#" target="myFrame">Vacaciones</a></li>
                            <li><a class="dropdown-item" href="#" target="myFrame">Pagos</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="bi bi-file-bar-graph-fill"></i> Informes
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#" target="myFrame">Asistencia</a></li>
                            <li><a class="dropdown-item" href="control?menu=contrato&acc=listar" target="myFrame">Contratos</a></li>
                        </ul>
                    </li>                    
                </ul>    
                <div class="btn-group">
                    <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" data-bs-toggle="dropdown" data-bs-auto-close="inside" aria-expanded="false">
                        <i class="bi bi-person-circle"></i> ${administrador.getUsuario()}
                    </button>
                    <ul class="dropdown-menu dropdown-menu-end text-center">
                        <li>
                            <i class="bi bi-person-circle" style="font-size: 5em"></i>
                        </li>
                        <li class="dropdown-item">${trabajador.getNombres()} ${trabajador.getApePat()}</li>
                        <li class="dropdown-item">${trabajador.getCorreo()}</li>
                        <li><hr class="dropdown-divider"></li>
                        <li>
                            <form action="validar" method="post">
                                <button name="acc" value="Salir" class="dropdown-item"><i class="bi bi-box-arrow-right"></i> Salir</button>
                            </form>
                        </li>
                    </ul>
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

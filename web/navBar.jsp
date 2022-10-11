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
                    <li><a class="dropdown-item" href="trabajadorControl?accion=trabajadorListar">Empleados</a></li>
                    <li><a class="dropdown-item" href="#">Familiares</a></li>
                </ul>
            </li>
            <li class="nav-item dropdown">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Empresa
                </a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="areaControl?accion=areaListar">Areas</a></li>
                    <li><a class="dropdown-item" href="puestoLaboralControl?accion=puestoLaboralListar">Puestos Laborales</a></li>
                    <li><a class="dropdown-item" href="horarioControl?accion=horarioListar">Horarios</a></li>
                </ul>
            </li>
            <li class="nav-item dropdown">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Tramites
                </a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">Permisos</a></li>
                    <li><a class="dropdown-item" href="#">Vacaciones</a></li>
                    <li><a class="dropdown-item" href="#">Pagos</a></li>
                </ul>
            </li>
            <li class="nav-item dropdown">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Informes
                </a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">Asistencia</a></li>
                    <li><a class="dropdown-item" href="contratoControl?accion=contratoListar">Contratos</a></li>
                </ul>
            </li>                    
        </ul>    
    </div>
    <div class="dropdown">
        <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
            Usuario Ingresado
        </button>
        <div class="dropdown-menu text-center">
            <a class="dropdown-item" href="#">
                <img src="img/usuario.png" alt="60" width="60"/>
            </a>
            <a class="dropdown-item" href="#">Usuario</a>
            <a class="dropdown-item" href="#">Correo</a>
            <div>
                <a class="dropdown-item" href="#">Salir</a>
            </div>
        </div>
    </div>
</nav>
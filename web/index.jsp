<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" method="post" action="validar">
                        <div class="form-group text-center">
                            <h3>Login</h3>
                            <img class="rounded-circle" src="img/logo-union.png" alt="70" width="170"/><br>
                            <label>Bienvenidos al sistema</label>
                        </div>
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="usu" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Contraseña</label>
                            <input type="password" name="pas" class="form-control">
                        </div><br>
                        <input type="submit" name="acc" value="Ingresar" class="btn btn-primary form-control">
                    </form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>

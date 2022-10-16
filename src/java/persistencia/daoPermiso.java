package persistencia;

import java.util.*;
import negocio.*;

public interface daoPermiso {
    public void Registrar(permiso permiso);
    public List<permiso> listar();
    public void actualizar(permiso permiso);
    public permiso leer(int idPermiso );
    public void eliminar(int idPermiso);
    
    public tipoPermiso leerTipo(int idTipo);
    public List<tipoPermiso> listarTipo();
}

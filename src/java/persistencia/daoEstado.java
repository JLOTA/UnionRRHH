package persistencia;

import java.util.List;
import negocio.estado;

/**
 *
 * @author usuario
 */
public interface daoEstado {
    public void Registrar(estado estado);
    public List<estado> listar();
    public void actualizar(estado estado);
    public estado leer(int idEstado );
    public void eliminar(int idEstado);
}

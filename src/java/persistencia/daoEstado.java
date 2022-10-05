package persistencia;

import java.util.List;
import negocio.estado;

/**
 *
 * @author usuario
 */
public interface daoEstado {
    public void Registrar(estado estado) throws Exception;
    public List<estado> listar() throws Exception;
    public void actualizar(estado estado) throws Exception;
    public estado leer(int idEstado ) throws Exception;
    public void eliminar(int idEstado) throws Exception;
}

package persistencia;

import java.util.List;
import negocio.area;

public interface daoArea {
    public void Registrar(area area);
    public List<area> listar();
    public void actualizar(area area);
    public area leer(int idArea );
    public void eliminar(int idArea);
}

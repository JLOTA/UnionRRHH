package persistencia;

import negocio.trabajador;

public interface trabajadorDao {
    public String grabarTrabajador(trabajador tra);
    public String editarTrabajador(trabajador tra);
    public trabajador buscarTrabajador(String dni);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.puestoLaboral;

/**
 *
 * @author usuario
 */
public interface daoPuestoLaboral {
    public void Registrar(puestoLaboral puestoLaboral) throws Exception;
    public List<puestoLaboral> listar() throws Exception;
    public void actualizar(puestoLaboral puestoLaboral) throws Exception;
    public puestoLaboral leer(int idPuestoLaboral ) throws Exception;
    public void eliminar(int idPuestoLaboral) throws Exception;
}

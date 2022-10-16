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
    public void Registrar(puestoLaboral puestoLaboral);
    public List<puestoLaboral> listar();
    public void actualizar(puestoLaboral puestoLaboral);
    public puestoLaboral leer(int idPuestoLaboral );
    public void eliminar(int idPuestoLaboral);
}

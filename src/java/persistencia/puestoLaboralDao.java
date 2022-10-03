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
public interface puestoLaboralDao {
    public String grabarPuestoLaboral(puestoLaboral pul);
    public String editarPuestoLaboral(puestoLaboral pul);
    public String borrarPuestoLaboral(puestoLaboral pul);
    public List listarPuestoLaboral();
    public puestoLaboral buscarPuestoLaboral(String pul);
}

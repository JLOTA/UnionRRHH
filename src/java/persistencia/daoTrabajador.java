/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.trabajador;

/**
 *
 * @author usuario
 */
public interface daoTrabajador {
    public void Registrar(trabajador trabajador);
    public List<trabajador> listar();
    public void actualizar(trabajador trabajador);
    public trabajador leer(int idTrabajador );
    public trabajador leerDni(String dni );
    public void eliminar(int idTrabajador);
}

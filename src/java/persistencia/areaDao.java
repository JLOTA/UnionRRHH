/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;
import java.util.List;
import negocio.area;
/**
 *
 * @author usuario
 */
public interface areaDao {
    public String grabarArea(area are);
    public String editarArea(area are);
    public List listarArea();
    public area buscarArea(String are);
}

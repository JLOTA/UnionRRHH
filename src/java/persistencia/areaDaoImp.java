/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.area;

/**
 *
 * @author usuario
 */
public class areaDaoImp implements areaDao {

    @Override
    public String grabarArea(area are) {
        String sql = "insert into area values (null,'" + are.getArea() + "','" + are.getDescripcion() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String editarArea(area are) {
        String sql = "update area set descripcion = '" + are.getDescripcion() + "', area= '" + are.getArea() + "' where idArea = " + are.getIdArea() + " ";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listarArea() {
        List lis = new ArrayList();
        String sql = "select * from area";
        List lista = Operacion.listar(sql);
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                Object[] fil = (Object[]) lista.get(i);
                area ar = new area();
                ar.setIdArea((int) fil[0]);
                ar.setArea(fil[1].toString());
                ar.setDescripcion(fil[2].toString());
                lis.add(ar);
            }
            return lis;
        }
        return null;
    }

    @Override
    public area buscarArea(String are) {
        String sql = "select * from area where area = '" + are + "'";
        Object[] fila = Operacion.buscar(sql);
        if (fila != null) {
            area ar = new area();
            ar.setIdArea((int) fila[0]);
            ar.setArea(fila[1].toString());
            ar.setDescripcion(fila[2].toString());
            return ar;
        }
        return null;
    }

}

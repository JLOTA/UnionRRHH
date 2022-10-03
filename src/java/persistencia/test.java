/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import negocio.area;

/**
 *
 * @author usuario
 */
public class test {
    public static void main(String[] args) {
        /*conexion con = new conexion();
        Connection cn = con.getConexion();
        if (cn!=null) {
            System.out.println("Hay conexion");
        } else {
            System.out.println("No hay conexion");
        }*/
        areaDao areDao = new areaDaoImp();
        area are = new area(2,"Operaciones", "Area multiproposito.");
        String msg = areDao.editarArea(are);
        System.out.println(msg);
    }
}

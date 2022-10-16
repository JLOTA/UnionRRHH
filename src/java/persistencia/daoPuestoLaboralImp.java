/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import negocio.area;
import negocio.puestoLaboral;
import util.utilEmpresa;

/**
 *
 * @author usuario
 */
public class daoPuestoLaboralImp implements daoPuestoLaboral{
    @Override
    public void Registrar(puestoLaboral puestoLaboral){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into puestoLaboral "
                + "Values(0, '"
                + puestoLaboral.getArea().getIdArea()+ "', '"
                + puestoLaboral.getPuestoLaboral()+ "', '"
                + puestoLaboral.getDescripcion()+ "')";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public List<puestoLaboral> listar(){
        List<puestoLaboral> puestos = null;
        puestoLaboral hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from puestoLaboral";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            puestos = new ArrayList<>();
            while (rs.next() == true) {
                hor = new puestoLaboral();
                hor.setIdPuestoLaboral(rs.getInt("idPuestoLaboral"));
                area a= new area();
                daoArea da = new daoAreaImp();
                a=da.leer(rs.getInt("idArea"));
                hor.setArea(a);
                hor.setPuestoLaboral(rs.getString("puestoLaboral"));
                hor.setDescripcion(rs.getString("descripcion"));

                puestos.add(hor);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoPuestoLaboralImp.listar()");
        } 
        return puestos;
    }

    @Override
    public void actualizar(puestoLaboral puestoLaboral){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE puestoLaboral SET idArea = "
                + puestoLaboral.getArea().getIdArea()+ ", puestoLaboral = '"
                + puestoLaboral.getPuestoLaboral()+ "', descripcion = '"
                + puestoLaboral.getDescripcion()+ "' WHERE idPuestoLaboral = " + puestoLaboral.getIdPuestoLaboral();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoPuestoLaboralImp.actualizar()");
        } 
    }

    @Override
    public puestoLaboral leer(int idPuestoLaboral){
        puestoLaboral hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from puestoLaboral WHERE idPuestoLaboral = " + idPuestoLaboral;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new puestoLaboral();
                hor.setIdPuestoLaboral(rs.getInt("idPuestoLaboral"));
                area a= new area();
                daoArea da = new daoAreaImp();
                a=da.leer(rs.getInt("idArea"));
                hor.setArea(a);
                hor.setPuestoLaboral(rs.getString("puestoLaboral"));
                hor.setDescripcion(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoPuestoLaboralImp.leer()");
        } 
        return hor;
    }

    @Override
    public void eliminar(int idPuestoLaboral){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM puestolaboral WHERE idPuestoLaboral=" + idPuestoLaboral;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoPuestoLaboralImp.eliminar()");
            System.out.println(sql);
            System.out.println(e);
        }
    }
}

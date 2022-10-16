/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import negocio.area;

/**
 *
 * @author usuario
 */
public class daoAreaImp implements daoArea{

    @Override
    public void Registrar(area area){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into Area (idArea, area, descripcion) "
                + "Values(0, '"
                + area.getArea()+ "', '"
                + area.getDescripcion()+ "')";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoAreaImp.Registrar()");
        } 
    }

    @Override
    public List<area> listar() {
        List<area> horarios = null;
        area hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from Area";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            horarios = new ArrayList<>();
            while (rs.next() == true) {
                hor = new area();
                hor.setIdArea(rs.getInt("idArea"));
                hor.setArea(rs.getString("area"));
                hor.setDescripcion(rs.getString("descripcion"));

                horarios.add(hor);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoAreaImp.listar()");
        } 
        return horarios;
    }

    @Override
    public void actualizar(area area){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE Area SET area = '"
                + area.getArea()+ "', descripcion = '"
                + area.getDescripcion()+ "' WHERE idArea = " + area.getIdArea();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoAreaImp.actualizar()");
        } 
    }

    @Override
    public area leer(int idArea){
        area hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from Area WHERE idArea = " + idArea;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new area();
                hor.setIdArea(rs.getInt("idArea"));
                hor.setArea(rs.getString("area"));
                hor.setDescripcion(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoAreaImp.leer()");
        } 
        return hor;
    }

    @Override
    public void eliminar(int idArea){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM Area WHERE idArea=" + idArea;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoAreaImp.eliminar()");
        }
    }
    
}

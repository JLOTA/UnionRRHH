/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.*;
import negocio.estado;

/**
 *
 * @author usuario
 */
public class daoEstadoImp implements daoEstado{
    
    @Override
    public void Registrar(estado estado) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into estado (idEstado, estado, descripcion) "
                + "Values(0, '"
                + estado.getEstado()+ "', '"
                + estado.getDescripcion()+ "')";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoEstadoImp.Registrar()");
        }
    }

    @Override
    public List<estado> listar() {
        List<estado> estados = null;
        estado hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from estado";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            estados = new ArrayList<>();
            while (rs.next() == true) {
                hor = new estado();
                hor.setIdEstado(rs.getInt("idEstado"));
                hor.setEstado(rs.getString("estado"));
                hor.setDescripcion(rs.getString("descripcion"));

                estados.add(hor);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoEstadoImp.listar()");
        }
        return estados;
    }

    @Override
    public void actualizar(estado estado) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE estado SET estado = '"
                + estado.getEstado()+ "', descripcion = '"
                + estado.getDescripcion()+ "' WHERE idEstado = " + estado.getIdEstado();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoEstadoImp.actualizar()");
        }
    }

    @Override
    public estado leer(int idEstado) {
        estado hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from estado WHERE idEstado = " + idEstado;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new estado();
                hor.setIdEstado(rs.getInt("idEstado"));
                hor.setEstado(rs.getString("estado"));
                hor.setDescripcion(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoEstadoImp.leer()");
        }
        return hor;
    }

    @Override
    public void eliminar(int idEstado) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM estado WHERE idEstado=" + idEstado;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoEstadoImp.eliminar()");
        }
    }
    
}

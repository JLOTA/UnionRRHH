/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import negocio.puestoLaboral;

/**
 *
 * @author usuario
 */
public class daoPuestoLaboralImp implements daoPuestoLaboral{
    @Override
    public void Registrar(puestoLaboral puestoLaboral) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into puestoLaboral "
                + "Values(0, '"
                + puestoLaboral.getIdArea()+ "', '"
                + puestoLaboral.getPuestoLaboral()+ "', '"
                + puestoLaboral.getDescripcion()+ "')";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
    }

    @Override
    public List<puestoLaboral> listar() throws Exception {
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
                hor.setIdArea(rs.getInt("idArea"));
                hor.setPuestoLaboral(rs.getString("puestoLaboral"));
                hor.setDescripcion(rs.getString("descripcion"));

                puestos.add(hor);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null && rs.isClosed() == false) {
                rs.close();
            }
            rs = null;
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
        return puestos;
    }

    @Override
    public void actualizar(puestoLaboral puestoLaboral) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE puestoLaboral SET idArea = "
                + puestoLaboral.getIdArea()+ ", puestoLaboral = '"
                + puestoLaboral.getPuestoLaboral()+ "', descripcion = '"
                + puestoLaboral.getDescripcion()+ "' WHERE idPuestoLaboral = " + puestoLaboral.getIdPuestoLaboral();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
    }

    @Override
    public puestoLaboral leer(int idPuestoLaboral) throws Exception {
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
                hor.setIdArea(rs.getInt("idArea"));
                hor.setPuestoLaboral(rs.getString("puestolaboral"));
                hor.setDescripcion(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null && rs.isClosed() == false) {
                rs.close();
            }
            rs = null;
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
        return hor;
    }

    @Override
    public void eliminar(int idPuestoLaboral) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM puestoLaboral WHERE idPuestoLaboral=" + idPuestoLaboral;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}

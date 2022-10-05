/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.*;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import negocio.trabajador;

/**
 *
 * @author usuario
 */
public class daoTrabajadorImp implements daoTrabajador{
    @Override
    public void Registrar(trabajador trabajador) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into trabajador "
                + "Values(0, '"
                + trabajador.getIdPuestoLaboral()+ "', '"
                + trabajador.getIdContrato()+ "', '"
                + trabajador.getIdHorario()+ "', '"
                + trabajador.getIdEstado()+ "', '"
                + trabajador.getDni()+ "', '"
                + trabajador.getNombres()+ "', '"
                + trabajador.getApePat()+ "', '"
                + trabajador.getApeMat()+ "', '"
                + trabajador.getFecNac()+ "', '"
                + trabajador.getTelefono()+ "', '"
                + trabajador.getCorreo()+ "', '"
                + trabajador.getDireccion()+ "')";

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
    public List<trabajador> listar() throws Exception {
        List<trabajador> trabajadores = null;
        trabajador hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from trabajador";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            trabajadores = new ArrayList<>();
            while (rs.next() == true) {
                hor = new trabajador();
                hor.setIdTrabajador(rs.getInt("idTrabajador"));
                hor.setIdPuestoLaboral(rs.getInt("idPuestoLaboral"));
                hor.setIdContrato(rs.getInt("idContrato"));
                hor.setIdHorario(rs.getInt("idHorario"));
                hor.setIdEstado(rs.getInt("idEstado"));
                hor.setDni(rs.getString("dni"));
                hor.setNombres(rs.getString("nombres"));
                hor.setApePat(rs.getString("apellidoPaterno"));
                hor.setApeMat(rs.getString("apellidoMaterno"));
                hor.setFecNac(rs.getString("fechaNacimiento"));
                hor.setTelefono(rs.getString("telefono"));
                hor.setCorreo(rs.getString("correo"));
                hor.setDireccion(rs.getString("direccion"));

                trabajadores.add(hor);
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
        return trabajadores;
    }

    @Override
    public void actualizar(trabajador trabajador) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE trabajador SET idPuestoLaboral = "
                + trabajador.getIdPuestoLaboral()+ ", idContrato = "
                + trabajador.getIdContrato()+ ", idHorario = '"
                + trabajador.getIdHorario()+ ", idEstado = '"
                + trabajador.getIdEstado()+ ", dni = '"
                + trabajador.getDni()+ "', nombres = '"
                + trabajador.getNombres()+ "', apellidoPaterno = '"
                + trabajador.getApePat()+ "', apellidoMaterno = '"
                + trabajador.getApeMat()+ "', fechaNacimiento = '"
                + trabajador.getFecNac()+ "', telefono = '"
                + trabajador.getTelefono()+ "', correo = '"
                + trabajador.getCorreo()+ "', direccion = '"
                + trabajador.getDireccion()+ "' WHERE idTrabajador = " + trabajador.getIdTrabajador();

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
    public trabajador leer(int idTrabajador) throws Exception {
        trabajador hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from trabajador WHERE idTrabajador = " + idTrabajador;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor=new trabajador();
                hor.setIdTrabajador(rs.getInt("idTrabajador"));
                hor.setIdPuestoLaboral(rs.getInt("idPuestoLaboral"));
                hor.setIdContrato(rs.getInt("idContrato"));
                hor.setIdHorario(rs.getInt("idHorario"));
                hor.setIdEstado(rs.getInt("idEstado"));
                hor.setDni(rs.getString("dni"));
                hor.setNombres(rs.getString("nombres"));
                hor.setApePat(rs.getString("apellidoPaterno"));
                hor.setApeMat(rs.getString("apellidoMaterno"));
                hor.setFecNac(rs.getString("fechaNacimiento"));
                hor.setTelefono(rs.getString("telefono"));
                hor.setCorreo(rs.getString("correo"));
                hor.setDireccion(rs.getString("direccion"));
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
    public void eliminar(int idTrabajador) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM trabajador WHERE idTrabajador=" + idTrabajador;
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

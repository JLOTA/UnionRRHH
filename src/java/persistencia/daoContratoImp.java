/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import negocio.contrato;
import negocio.tipoContrato;

/**
 *
 * @author usuario
 */
public class daoContratoImp implements daoContrato{

    @Override
    public void RegistrarTipo(tipoContrato tipoContrato) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into tipoContrato (idTipoContrato, tipoContrato, descripcion) "
                + "Values(0, '"
                + tipoContrato.getTipoContrato()+ "', '"
                + tipoContrato.getDescripcion()+ "')";

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
    public List<tipoContrato> listarTipo() throws Exception {
        List<tipoContrato> tipos = null;
        tipoContrato hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from tipoContrato";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            tipos = new ArrayList<>();
            while (rs.next() == true) {
                hor = new tipoContrato();
                hor.setIdTipoContrato(rs.getInt("idTipoContrato"));
                hor.setTipoContrato(rs.getString("tipoContrato"));
                hor.setDescripcion(rs.getString("descripcion"));

                tipos.add(hor);
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
        return tipos;
    }

    @Override
    public void actualizarTipo(tipoContrato tipoContrato) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE tipoContrato SET tipoContrato = '"
                + tipoContrato.getTipoContrato()+ "', descripcion = '"
                + tipoContrato.getDescripcion()+ "' WHERE idArea = " + tipoContrato.getIdTipoContrato();

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
    public tipoContrato leerTipo(int idTipo) throws Exception {
        tipoContrato hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from tipoContrato WHERE idTipoContrato = " + idTipo;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new tipoContrato();
                hor.setIdTipoContrato(rs.getInt("idTipoContrato"));
                hor.setTipoContrato(rs.getString("tipoContrato"));
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
    public void eliminarTipo(int idtipo) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM tipoContrato WHERE idTipoContrato=" + idtipo;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void Registrar(contrato contrato) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into contrato "
                + "Values(0, '"
                + contrato.getIdTipoContrato()+ "', '"
                + contrato.getDescripcion()+ "', '"
                + contrato.getFechaInicio()+ "', '"
                + contrato.getFechaFin()+ "')";

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
    public List<contrato> listar() throws Exception {
        List<contrato> contratos = null;
        contrato hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from contrato";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            contratos = new ArrayList<>();
            while (rs.next() == true) {
                hor = new contrato();
                hor.setIdContrato(rs.getInt("idContrato"));
                hor.setIdTipoContrato(rs.getInt("idTipoContrato"));
                hor.setDescripcion(rs.getString("descripcion"));
                hor.setFechaInicio(rs.getString("fechaInicio"));
                hor.setFechaFin(rs.getString("fechaFin"));

                contratos.add(hor);
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
        return contratos;
    }

    @Override
    public void actualizar(contrato contrato) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE contrato SET idTipoContrato = "
                + contrato.getIdTipoContrato()+ ", descripcion = '"
                + contrato.getDescripcion()+ "', fechaInicio = '"
                + contrato.getFechaInicio()+ "', fechaFin = '"
                + contrato.getFechaFin()+ "' WHERE idContrato = " + contrato.getIdContrato();

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
    public contrato leer(int idContrato) throws Exception {
        contrato hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from contrato WHERE idContrato = " + idContrato;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new contrato();
                hor.setIdContrato(rs.getInt("idContrato"));
                hor.setIdTipoContrato(rs.getInt("idTipoContrato"));
                hor.setDescripcion(rs.getString("descripcion"));
                hor.setFechaInicio(rs.getString("fechaInicio"));
                hor.setFechaFin(rs.getString("fechaFin"));
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
    public void eliminar(int idContrato) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM contrato WHERE idContrato=" + idContrato;
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

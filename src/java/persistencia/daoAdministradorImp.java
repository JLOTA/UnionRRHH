package persistencia;

import java.sql.*;
import java.util.List;
import negocio.administrador;

public class daoAdministradorImp implements daoAdministrador {

    @Override
    public administrador validar(String usuario, String clave) throws Exception {
        administrador adm = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "select * from administrador where usuario='" + usuario
                + "' and clave='" + clave + "'";
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                adm = new administrador();
                adm.setIdAdministrador(rs.getInt("idAdministrador"));
                adm.setIdTrabajador(rs.getInt("idTrabajador"));
                adm.setUsuario(rs.getString("usuario"));
                adm.setClave(rs.getString("clave"));
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
        return adm;
    }

    @Override
    public void Registrar(administrador administrador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<administrador> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(administrador administrador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public administrador leer(int idAdministrador) throws Exception {
        administrador adm = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from administrador WHERE idAdministrador = " + idAdministrador;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                adm = new administrador();
                adm.setIdAdministrador(rs.getInt("idAdministrador"));
                adm.setIdTrabajador(rs.getInt("idTrabajador"));
                adm.setUsuario(rs.getString("usuario"));
                adm.setClave(rs.getString("clave"));
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
        return adm;
    }

    @Override
    public void eliminar(int idAdministrador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

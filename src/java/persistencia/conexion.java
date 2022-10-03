package persistencia;

import java.sql.*;

public class conexion {
    private final String URL = "jdbc:mysql://localhost/union-db";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String USER = "root";
    private final String PASS = "";
    public Connection getConexion(){
        Connection cn;
        try {
            Class.forName(DRIVER).newInstance();
            cn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            cn = null;
        }    
    return cn;
    }
}

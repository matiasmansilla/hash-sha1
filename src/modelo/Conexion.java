
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dardomatiasmansilla
 */
public class Conexion {
    
    private final String dbUsuario = "cachin";
    private final String user = "testuser";
    private final String password = "admin";
    private final String url = "jdbc:mysql://207.246.78.25:3306/" + dbUsuario;
    private Connection con = null;
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    System.out.println(con.toString());
    return con;
    
    
    }
    
}

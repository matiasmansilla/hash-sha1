package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dardomatiasmansilla
 */
public class SqlUsuarios extends Conexion {

    public boolean registrar(Usuarios usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuario (usuario, password, nombre, mail, idTipo) VALUES(?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,usr.getUsuario());
            ps.setString(2,usr.getPassword());
            ps.setString(3,usr.getNombre());
            ps.setString(4,usr.getMail());
            ps.setInt(5,usr.getId_tipo());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}

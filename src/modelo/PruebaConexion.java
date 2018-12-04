/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;

/**
 *
 * @author dardomatiasmansilla
 */
public class PruebaConexion extends Conexion {
    
      public boolean testear() {

        
        Connection con = getConexion();
        return true;
           
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rodri Santillana
 */
public class conexion_mysql {

      
    private String user = "root";
    private String password = "";
    private String DB_name = "agenda_base";
    private String host = "localhost";
    
    private Connection conectar = null;
    
    private final String URL = "jdbc:mysql://" + host + ":3306/" + DB_name;

       public Connection obtener_conexion() {
        try {
            conectar = DriverManager.getConnection(URL, user, password);
        } catch (SQLException ex) {
            System.out.println("Error al intentar conectarse a la base de datos!! " + ex);
        }
        if (conectar != null) {
            System.out.println("Conectado a la base de datos");
        }
        return conectar;
    }

   


}
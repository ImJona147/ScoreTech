package com.scoretech.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * @author ScoreTech Programadores
 * 
 * Clase Conexión que controla la conexión
 * a la base de datos del sistema escolar.
 */
public class Conexion {
    /**
     * Estlece un objeto de la clase Connection
     */
    private static Connection conexion;
    
    /**
     * El método sirve para establecer la conexión
     * a la base de datos establecida
     */
    public static void conectar() {
        try {
            String baseDatos = "scoretech";
            String host = "localhost";
            String usuario = "root";
            String password = "";
            String puerto = "3306";
            String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDatos;
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);
        } catch(SQLException e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡Hubo un error al conectar con la base de datos!");
        }
    }
    
    /**
     * El método sirve para cerrar la conexión
     * a la base de datos establecida
     */
    public static void cerrar() {
        try {
            if (conexion != null) {
                if (!conexion.isClosed())
                    conexion.close();
            }
        } catch(SQLException e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡No se pudo cerrar la conexión!");
        }
    }
    
    /**
     * Obtiene la conexión ya establecida, de esta manera
     * podemos realizar las consultas más rápidas
     * 
     * @return La conexión establecida previamente
     * 
     */
    public static Connection getConexion() {
        return conexion;
    }
}

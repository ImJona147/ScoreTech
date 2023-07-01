package com.scoretech.objetos;

import java.sql.PreparedStatement;

import com.scoretech.utils.Conexion;
import java.sql.SQLException;

public class Alumno extends Conexion {
    private int id;
    private String nombre;
    private String apellidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }
    
    public void crearNuevoAlumno() {
        try {
            conectar();
            String consulta = "INSERT INTO alumno(nombre, apellidos) VALUES (?,?)";
            try (PreparedStatement ps = getConexion().prepareStatement(consulta)) {
                ps.setString(1, nombre);
                ps.setString(2, apellidos);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            cerrar();
        }
    }
    
    public void modificarAlumno() {
        try {
            conectar();
            String consulta = "UPDATE alumno SET nombre=?, apellidos=? WHERE id_alumno=?";
            try (PreparedStatement ps = getConexion().prepareStatement(consulta)) {
                ps.setString(1, nombre);
                ps.setString(2, apellidos);
                ps.setInt(3, id);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            cerrar();
        }
    }
}

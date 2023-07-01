package com.scoretech.objetos;

import java.sql.PreparedStatement;

import com.scoretech.utils.Conexion;
import java.sql.SQLException;

public class Materia {
    private int id;
    private String nombre;
    private int id_docente;
    
    public Materia() {}
    
    public Materia(String nombre) {
        this.nombre = nombre;
    }
    
    public Materia(String nombre, int id_docente) {
        this.nombre = nombre;
        this.id_docente = id_docente;
    }
    
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

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }
    
    public void darAlta() {
        try {
            Conexion.conectar();
            String consulta = "INSERT INTO materia(nombre, id_usuario) VALUES (?,?)";
            PreparedStatement ps = Conexion.getConexion().prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setInt(2, id_docente);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            Conexion.cerrar();
        }
    }
    
    public void modificar() {
        try {
            Conexion.conectar();
            String consulta = "UPDATE materia SET nombre=?, id_usuario=? WHERE id_materia=?";
            PreparedStatement ps = Conexion.getConexion().prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setInt(2, id_docente);
            ps.setInt(3, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            Conexion.cerrar();
        }
    }
}

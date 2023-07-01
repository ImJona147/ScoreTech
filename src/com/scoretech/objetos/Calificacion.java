package com.scoretech.objetos;

import java.sql.PreparedStatement;
import static com.scoretech.utils.Conexion.cerrar;
import static com.scoretech.utils.Conexion.conectar;
import static com.scoretech.utils.Conexion.getConexion;
import java.sql.SQLException;

public class Calificacion {
    private double promedio;
    private int id_alumno;
    private int id_materia;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }
    
    public void darCalificacion() {
        try {
            conectar();
            String consulta = "INSERT INTO calificacion (id_alumno, id_materia, promedio) VALUES(?,?,?)";
            PreparedStatement ps = getConexion().prepareStatement(consulta);
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_materia);
            ps.setDouble(3, promedio);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            cerrar();
        }
    }
    
    public void actualizarCalificacion() {
        try {
            conectar();
            String consulta = "UPDATE calificacion SET id_alumno=?, id_materia=?, promedio=? WHERE id_alumno=? AND id_materia=?";
            try (PreparedStatement ps = getConexion().prepareStatement(consulta)) {
                ps.setInt(1, id_alumno);
                ps.setInt(2, id_materia);
                ps.setDouble(3, promedio);
                ps.setInt(4, id_alumno);
                ps.setInt(5, id_materia);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            cerrar();
        }
    }
}

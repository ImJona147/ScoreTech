package com.scoretech.objetos;

import static com.scoretech.utils.Conexion.cerrar;
import static com.scoretech.utils.Conexion.conectar;
import static com.scoretech.utils.Conexion.getConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MateriaAlumno {
    private int id_materia;
    private int id_alumno;

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }
    
    public void darAlta() {
        try {
            conectar();
//            String consulta = "INSERT INTO materia_alumno (id_materia, id_alumno) " +
//                              "SELECT ?, ? " +
//                              "WHERE NOT EXISTS ( " +
//                              "    SELECT * FROM materia_alumno " +
//                              "    WHERE id_materia = ? AND id_alumno = ? " +
//                              ")";
            String consulta = "INSERT INTO materia_alumno(id_materia, id_alumno) VALUES(?,?)";
            try (PreparedStatement ps = getConexion().prepareStatement(consulta)) {
                ps.setInt(1, id_materia);
                ps.setInt(2, id_alumno);
                //ps.setInt(3, id_materia);
                //ps.setInt(4, id_alumno);
                ps.executeUpdate();
            }
        } catch(SQLException e) {
            System.out.println(e);
        } finally {
            cerrar();
        }
    }
    
    public void darBaja() {
        try {
            conectar();
            String consulta = "DELETE FROM materia_alumno WHERE id_materia=? AND id_alumno=?";
            try (PreparedStatement ps = getConexion().prepareStatement(consulta)) {
                ps.setInt(1, id_materia);
                ps.setInt(2, id_alumno);
                ps.executeUpdate();
            }
        } catch(SQLException e) {
            System.out.println(e);
        } finally {
            cerrar();
        }
    }
}

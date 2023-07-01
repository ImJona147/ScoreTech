package com.scoretech;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.scoretech.diseños.LoginFrame;
import com.scoretech.objetos.Alumno;
import com.scoretech.objetos.Calificacion;
import com.scoretech.objetos.Materia;
import com.scoretech.objetos.MateriaAlumno;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.Conexion;
import static com.scoretech.utils.Conexion.cerrar;
import static com.scoretech.utils.Conexion.conectar;
import static com.scoretech.utils.Conexion.getConexion;
import com.scoretech.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScoreTech {

    public static void main(String[] args) {
        FlatMaterialLighterIJTheme.setup();
        new LoginFrame().setVisible(true);
    }
    
    public static List<Usuario> getUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            conectar();
            String consulta = "SELECT * FROM usuario";
            PreparedStatement ps = getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            Usuario usuario;
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contrasena"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setPuesto(rs.getString("puesto"));
                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡Hubo un error al cargar los usuarios!");
        } finally {
            cerrar();
        }
        return listaUsuarios;
    }
    
    public static List<Usuario> getDocentes() {
        List<Usuario> lista = new ArrayList<>();
        try {
            getUsuarios().forEach(u -> {
                if (u.getPuesto().equals("Docente"))
                    lista.add(u);
            });
        } catch (Exception e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡Hubo un error al cargar los docentes!");
        } 
        return lista;
    }
    
    public static List<Materia> getMaterias() {
        List<Materia> lista = new ArrayList<>();
        try {
            conectar();
            String consulta = "SELECT * FROM materia";
            PreparedStatement ps = Conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            Materia ma;
            while (rs.next()) {
                ma = new Materia(rs.getString("nombre"),
                        rs.getInt("id_usuario"));
                ma.setId(rs.getInt("id_materia"));
                lista.add(ma);
            }
        } catch (SQLException e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡Hubo un error al cargar las materias!");
        } finally {
            cerrar();
        }
        return lista;
    }
    
    public static List<Alumno> getAlumnos() {
        List<Alumno> lista = new ArrayList<>();
        try {
            conectar();
            String consulta = "SELECT * FROM alumno";
            PreparedStatement ps = getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setId(rs.getInt("id_alumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellidos(rs.getString("apellidos"));
                lista.add(alumno);
            }
        } catch (SQLException e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡Hubo un error al cargar los alumnos!");
        } finally {
            cerrar();
        }
        return lista;
    }
    
    public static List<MateriaAlumno> getMateriasAlumno() {
        List<MateriaAlumno> lista = new ArrayList<>();
        try {
            conectar();
            String consulta = "SELECT * FROM materia_alumno";
            PreparedStatement ps = getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            MateriaAlumno ma;
            while (rs.next()) {
                ma = new MateriaAlumno();
                ma.setId_materia(rs.getInt("id_materia"));
                ma.setId_alumno(rs.getInt("id_alumno"));
                lista.add(ma);
            }
        } catch(SQLException e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡Hubo un error al cargar las materias de los alumnos!");
        } finally {
            cerrar();
        }
        return lista;
    }
    
    public static List<Calificacion> getCalificaciones() {
        List<Calificacion> lista = new ArrayList<>();
        try {
            conectar();
            String consulta = "SELECT * FROM calificacion";
            PreparedStatement ps = getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            Calificacion cal;
            while (rs.next()) {
                cal = new Calificacion();
                cal.setPromedio(rs.getDouble("promedio"));
                cal.setId_alumno(rs.getInt("id_alumno"));
                cal.setId_materia(rs.getInt("id_materia"));
                lista.add(cal);
            }
        } catch(SQLException e) {
            Utils.mostrarAvisoError("¡Conexión!", "¡Hubo un error al cargar las calificaciones!");
        } finally {
            cerrar();
        }
        return lista;
    }
}

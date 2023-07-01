package com.scoretech.utils;

import static com.scoretech.ScoreTech.getAlumnos;
import static com.scoretech.ScoreTech.getCalificaciones;
import static com.scoretech.ScoreTech.getDocentes;
import static com.scoretech.ScoreTech.getMaterias;
import static com.scoretech.ScoreTech.getMateriasAlumno;
import static com.scoretech.ScoreTech.getUsuarios;
import com.scoretech.objetos.Alumno;
import com.scoretech.objetos.Calificacion;
import com.scoretech.objetos.Materia;
import com.scoretech.objetos.MateriaAlumno;
import com.scoretech.objetos.Usuario;

public class ScoreTechAPI {
    private static Usuario usuarioActual;
    
    public ScoreTechAPI() {}
    
    public ScoreTechAPI(Usuario usuario) {
        ScoreTechAPI.usuarioActual = usuario;
    }
    
    public static boolean esUsuarioYContrasenaValida(
            String usuario, 
            String contraseña) {
        for (Usuario user : getUsuarios()) {
            if (user != null && user.getUsuario().equals(usuario)
                    && user.getContraseña().equals(contraseña))
                return true;
        }
        return false;
    }
    
    public static boolean esAlumnoExistente(String nombreCompleto) {
        for (Alumno a : getAlumnos()) {
            if (a != null && a.getNombreCompleto().equals(nombreCompleto))
                return true;
        }
        return false;
    }
    
    public static boolean esDocenteExistente(String nombre, String apellidos) {
        for (Usuario d : getDocentes()) {
            if (d != null && d.getNombre().equals(nombre) &&
                    d.getApellidos().equals(apellidos))
                return true;
        }
        return false;
    }
    
    public static Usuario getUsuario(String usuario) {
        for (Usuario user : getUsuarios()) {
            if (user != null && user.getUsuario().equals(usuario))
                return user;
        }
        return null;
    }
    
    public static Usuario getDocente(String nombreCompleto) {
        for (Usuario d : getDocentes()) {
            String nc = d.getNombre() + " " + d.getApellidos();
            if (nc.equals(nombreCompleto))
                return d;
        }
        return null;
    }
    
    public static Usuario getUsuario(int id) {
        for (Usuario user : getUsuarios()) {
            if (user != null && user.getId() == id)
                return user;
        }
        return null;
    }

    public static Usuario getUsuarioActual() {
        if (usuarioActual != null)
            return usuarioActual;
        return null;
    }
    
    public static void setUsuarioActual(Usuario usuario) {
        ScoreTechAPI.usuarioActual = usuario;
    }
    
    public static Materia getMateria(int id) {
        for (Materia materia : getMaterias()) {
            if (materia != null && materia.getId() == id)
                return materia;
        }
        return null;
    }
    
    public static Materia getMateria(String materia) {
        for (Materia m : getMaterias()) {
            if (m != null && m.getNombre().equals(materia))
                return m;
        }
        return null; 
    }
    
    public static MateriaAlumno getMateriaAlumno(int id_alumno, int id_materia) {
        for (MateriaAlumno ma : getMateriasAlumno()) {
            if (ma != null && ma.getId_alumno() == id_alumno && ma.getId_materia()
                    == id_materia)
                return ma;
        }
        return null;
    }
    
    public static Alumno getAlumno(int id) {
        for (Alumno a : getAlumnos()) {
            if (a != null && a.getId() == id)
                return a;
        }
        return null;
    }
    
    public static Calificacion getCalificacion(int id_alumno, int id_materia) {
        for (Calificacion c : getCalificaciones()) {
            if (c != null && c.getId_alumno() == id_alumno &&
                    c.getId_materia() == id_materia)
                return c;
        }
        return null;
    }
}

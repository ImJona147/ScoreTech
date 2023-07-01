package com.scoretech.objetos;

import com.scoretech.utils.Conexion;
import static com.scoretech.utils.Conexion.cerrar;
import static com.scoretech.utils.Conexion.getConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 
 * @author ScoreTech Programadores
 * 
 * Clase Usuario en donde se crearán varios usuarios
 * con sus respectivos atributos y puedan ser usados por el
 * resto del programa
 */
public class Usuario {
    /**
     * Atributo ID de tipo numérico
     * Sirve para guardar el ID que se encuentra dicho
     * 'Usuario' registrado en la base de datos
     */
    private int id;
    /**
     * Atributo nombre
     * Se guarda el(los) nombre(s) de los usuarios
     */
    private String nombre;
    /**
     * Atributo apellidos
     * Se guarda los apellidos de los usuarios
     */
    private String apellidos;
    /**
     * Atributo Usuario
     * Se guarda el usuario otorgado
     */
    private String usuario;
    /**
     * Atributo Contraseña
     * Se guarda la contraseña otorgada
     */
    private String contraseña;
    /**
     * Atributo Puesto
     * Se guarda el puesto del usuario
     * si es docente, se guarda docente o 
     * si es administrador, se guarda administrador
     */
    private String puesto;

    /**
     * Obtén el id otorgado al usuario
     * 
     * @return id otorgado por la base de datos
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id dado por la base de datos
     * (esto solo se invoca cuando se cargan los usuarios
     * por primera vez al iniciar el programa)
     * 
     * @param id valor numérico
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * 
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * 
     * @return 
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * 
     * @param usuario 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    /**
     * 
     * @return 
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * 
     * @param contraseña 
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * 
     * @return 
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * 
     * @param puesto 
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void setNombreApellidos(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public void setUsuarioContrasena(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contraseña = contrasena;
    }
    
    /**
     * Crea un nuevo usuario insertandolo en la base de datos
     * con los datos que se otorgaron a la hora de crear el objeto
     * y establecerle los datos a los setter's
     */
    public void crearUsuario() {
        try {
            Conexion.conectar();
            String consulta = "INSERT INTO usuario(usuario, contrasena, nombre, apellidos, puesto) VALUES(?,?,?,?,?)";
            PreparedStatement ps = getConexion().prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2,contraseña);
            ps.setString(3,nombre);
            ps.setString(4, apellidos);
            ps.setString(5,puesto);
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            System.out.println(e);
        } finally {
            cerrar();
        }
    }
    
    /**
     * Actualiza la información del usuario en la base de datos
     * con los valores establecidos en los setter's
     */
    public void modificarUsuario() {
        try {
            Conexion.conectar();
            String consulta = "UPDATE usuario SET usuario=?, contrasena=?, nombre=?, apellidos=?, puesto=? WHERE id_usuario=?";
            try (PreparedStatement ps = getConexion().prepareStatement(consulta)) {
                ps.setString(1, usuario);
                ps.setString(2,contraseña);
                ps.setString(3,nombre);
                ps.setString(4, apellidos);
                ps.setString(5,puesto);
                ps.setInt(6, id);
                ps.executeUpdate();
            }            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

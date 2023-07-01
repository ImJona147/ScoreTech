package com.scoretech.diseños;

import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import java.awt.event.KeyEvent;

public class LoginFrame extends javax.swing.JFrame {
    
    public LoginFrame() {
        Utils.aplicarIcono(this);
        Utils.aplicarDiseño();
        initComponents();
        txt_usuario.requestFocus();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_header = new javax.swing.JPanel();
        lb_imagotipo = new javax.swing.JLabel();
        tb_contenido = new javax.swing.JTabbedPane();
        tb_usuarios = new javax.swing.JPanel();
        lb_estudiantes = new javax.swing.JLabel();
        lb_icon_usuario = new javax.swing.JLabel();
        lb_icon_candado = new javax.swing.JLabel();
        txt_usuario = new com.imjona.ui.TextField();
        txt_contrasena = new com.imjona.ui.PasswordField();
        btn_iniciar_sesion = new javax.swing.JButton();
        tb_tutor = new javax.swing.JPanel();
        lb_estudiantes1 = new javax.swing.JLabel();
        lb_icon_usuario1 = new javax.swing.JLabel();
        txt_alumno = new com.imjona.ui.TextField();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ScoreTech");
        setBackground(new java.awt.Color(191, 220, 221));

        tb_header.setBackground(new java.awt.Color(191, 220, 221));

        lb_imagotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_imagotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_logo_scoretech.png"))); // NOI18N

        javax.swing.GroupLayout tb_headerLayout = new javax.swing.GroupLayout(tb_header);
        tb_header.setLayout(tb_headerLayout);
        tb_headerLayout.setHorizontalGroup(
            tb_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb_headerLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(lb_imagotipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(293, 293, 293))
        );
        tb_headerLayout.setVerticalGroup(
            tb_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb_headerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_imagotipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tb_contenido.setBackground(new java.awt.Color(191, 220, 221));
        tb_contenido.setForeground(new java.awt.Color(0, 0, 0));
        tb_contenido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tb_contenido.setOpaque(true);

        tb_usuarios.setBackground(new java.awt.Color(191, 220, 221));

        lb_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_logo_estudiantes2.png"))); // NOI18N

        lb_icon_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_usuario.png"))); // NOI18N

        lb_icon_candado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_candado.png"))); // NOI18N

        txt_usuario.setBackground(new java.awt.Color(191, 220, 221));
        txt_usuario.setForeground(new java.awt.Color(0, 0, 0));
        txt_usuario.setCaretColor(new java.awt.Color(102, 102, 255));
        txt_usuario.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_usuario.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_usuario.setLabelText("Usuario");
        txt_usuario.setOpaque(true);
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });

        txt_contrasena.setBackground(new java.awt.Color(191, 220, 221));
        txt_contrasena.setForeground(new java.awt.Color(0, 0, 0));
        txt_contrasena.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_contrasena.setLabelText("Contraseña");
        txt_contrasena.setOpaque(true);
        txt_contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contrasenaKeyPressed(evt);
            }
        });

        btn_iniciar_sesion.setBackground(new java.awt.Color(127, 127, 213));
        btn_iniciar_sesion.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_iniciar_sesion.setForeground(new java.awt.Color(0, 0, 0));
        btn_iniciar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_entrar.png"))); // NOI18N
        btn_iniciar_sesion.setText("Iniciar Sesión");
        btn_iniciar_sesion.setBorderPainted(false);
        btn_iniciar_sesion.setHideActionText(true);
        btn_iniciar_sesion.setIconTextGap(10);
        btn_iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tb_usuariosLayout = new javax.swing.GroupLayout(tb_usuarios);
        tb_usuarios.setLayout(tb_usuariosLayout);
        tb_usuariosLayout.setHorizontalGroup(
            tb_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb_usuariosLayout.createSequentialGroup()
                .addComponent(lb_estudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(tb_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_icon_usuario)
                    .addComponent(lb_icon_candado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tb_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_iniciar_sesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_contrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );
        tb_usuariosLayout.setVerticalGroup(
            tb_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb_usuariosLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(tb_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tb_usuariosLayout.createSequentialGroup()
                        .addComponent(lb_estudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(72, 72, 72))
                    .addGroup(tb_usuariosLayout.createSequentialGroup()
                        .addGroup(tb_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tb_usuariosLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lb_icon_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(tb_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tb_usuariosLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lb_icon_candado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tb_contenido.addTab("Usuarios", tb_usuarios);

        tb_tutor.setBackground(new java.awt.Color(191, 220, 221));

        lb_estudiantes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_logo_estudiantes.png"))); // NOI18N

        lb_icon_usuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_usuario.png"))); // NOI18N

        txt_alumno.setBackground(new java.awt.Color(191, 220, 221));
        txt_alumno.setForeground(new java.awt.Color(0, 0, 0));
        txt_alumno.setCaretColor(new java.awt.Color(102, 102, 255));
        txt_alumno.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_alumno.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_alumno.setLabelText("Alumno");
        txt_alumno.setOpaque(true);
        txt_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_alumnoKeyPressed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(127, 127, 213));
        btn_buscar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_entrar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorderPainted(false);
        btn_buscar.setHideActionText(true);
        btn_buscar.setIconTextGap(10);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tb_tutorLayout = new javax.swing.GroupLayout(tb_tutor);
        tb_tutor.setLayout(tb_tutorLayout);
        tb_tutorLayout.setHorizontalGroup(
            tb_tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb_tutorLayout.createSequentialGroup()
                .addComponent(lb_estudiantes1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(lb_icon_usuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tb_tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );
        tb_tutorLayout.setVerticalGroup(
            tb_tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb_tutorLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(tb_tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tb_tutorLayout.createSequentialGroup()
                        .addGroup(tb_tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tb_tutorLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lb_icon_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_estudiantes1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        tb_contenido.addTab("Tutor", tb_tutor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tb_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(tb_contenido))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarsesion();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_contrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarsesion();
        }
    }//GEN-LAST:event_txt_contrasenaKeyPressed

    private void txt_alumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alumnoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarAlumno();
        }
    }//GEN-LAST:event_txt_alumnoKeyPressed

    private void btn_iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_sesionActionPerformed
        iniciarsesion();
    }//GEN-LAST:event_btn_iniciar_sesionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscarAlumno();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void buscarAlumno() {
        String nombre = txt_alumno.getText().trim();
        if (nombre.isEmpty()) {
            txt_alumno.setHelperText("¡Por favor, rellena este campo vacío!");
            txt_alumno.requestFocus();
            return;
        }
        if (!ScoreTechAPI.esAlumnoExistente(nombre)) {
            Utils.mostrarAvisoError("Alumno no encontrado", "¡No se encontro un alumno con esos datos!");
            txt_alumno.requestFocus();
            return;
        }
        TutorFrame tf = new TutorFrame(nombre);
        dispose();
        Utils.ajustarPantallas(tf, this);
        tf.setVisible(true);
    }
    
    private void iniciarsesion() {
        String usuario = txt_usuario.getText().trim();
        String contrasena = String.valueOf(txt_contrasena.getPassword()).trim();
        /**
        * Si los textField están vacíos se enviará el siguiente
        * aviso a la hora de intentar ingresar al panel principal.
        */
        if (usuario.isEmpty()) {
            txt_usuario.setHelperText("¡Por favor, rellena este campo vacío!");
            txt_usuario.grabFocus();
            return;
        }
        txt_usuario.setHelperText("");
        if (contrasena.isEmpty()) {
            txt_contrasena.setHelperText("¡Por favor, rellena este campo vacío!");
            txt_contrasena.grabFocus();
            return;
        }
         txt_contrasena.setHelperText("");
        /**
        * Si los datos ingresados son incorrectos o simplemente no existe
        * se enviará un mensaje de error.
        */
        if (!ScoreTechAPI.esUsuarioYContrasenaValida(usuario, contrasena)) {
            Utils.mostrarAvisoError("¡Credenciales incorrectas!", "¡Por favor, verifica que los datos sean correctos!");
            return;
        }
        /**
        * Si todo esta correcto, pasa al siguiente panel
        */
        ScoreTechAPI.setUsuarioActual(ScoreTechAPI.getUsuario(usuario));
        dispose();
        UsuariosFrame admin = new UsuariosFrame();
        Utils.ajustarPantallas(admin, this);
        admin.setVisible(true);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_iniciar_sesion;
    private javax.swing.JLabel lb_estudiantes;
    private javax.swing.JLabel lb_estudiantes1;
    private javax.swing.JLabel lb_icon_candado;
    private javax.swing.JLabel lb_icon_usuario;
    private javax.swing.JLabel lb_icon_usuario1;
    private javax.swing.JLabel lb_imagotipo;
    private javax.swing.JTabbedPane tb_contenido;
    private javax.swing.JPanel tb_header;
    private javax.swing.JPanel tb_tutor;
    private javax.swing.JPanel tb_usuarios;
    private com.imjona.ui.TextField txt_alumno;
    private com.imjona.ui.PasswordField txt_contrasena;
    private com.imjona.ui.TextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}

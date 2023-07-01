package com.scoretech.diseños.panel.otro;

import com.scoretech.diseños.panel.AlumnoPanel;
import com.scoretech.objetos.Alumno;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import java.awt.event.KeyEvent;

public class AlumnoAction extends javax.swing.JPanel {
    private final boolean modificando;
    private final int id;
    
    public AlumnoAction(int id, boolean modificando) {
        initComponents();
        txt_nombre.requestFocus();
        this.modificando = modificando;
        this.id = id;
        
        if (modificando) {
            Alumno alumno = ScoreTechAPI.getAlumno(id);
            lb_mensaje.setText("Modificar Alumno");
            lb_mensaje1.setText("¡En esta sección podrás modificar la información");
            lb_mensaje2.setText("de un alumno que ya existe en el sistema!");
            btn_accion.setText("Modificar");
            btn_accion.setIcon(Utils.getIcon("img_icon_actualizar"));
            this.txt_nombre.setText(alumno.getNombre());
            this.txt_apellidos.setText(alumno.getApellidos());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        txt_nombre = new com.imjona.ui.TextField();
        txt_apellidos = new com.imjona.ui.TextField();
        lb_mensaje = new javax.swing.JLabel();
        lb_imagen = new javax.swing.JLabel();
        lb_imagen2 = new javax.swing.JLabel();
        lb_mensaje1 = new javax.swing.JLabel();
        lb_mensaje2 = new javax.swing.JLabel();
        btn_accion = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(191, 220, 221));

        btn_regresar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_regresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        btn_regresar.setBorderPainted(false);
        btn_regresar.setContentAreaFilled(false);
        btn_regresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        txt_nombre.setBackground(new java.awt.Color(191, 220, 221));
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setCaretColor(new java.awt.Color(102, 102, 255));
        txt_nombre.setLabelText("Nombre(s)");
        txt_nombre.setOpaque(true);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
        });

        txt_apellidos.setBackground(new java.awt.Color(191, 220, 221));
        txt_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidos.setCaretColor(new java.awt.Color(102, 102, 255));
        txt_apellidos.setLabelText("Apellidos");
        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyPressed(evt);
            }
        });

        lb_mensaje.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lb_mensaje.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje.setText("Nuevo Alumno");

        lb_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_docente3.png"))); // NOI18N

        lb_imagen2.setIcon(Utils.getIcon("img_logo_estudiantes5", 400, 350));

        lb_mensaje1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lb_mensaje1.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje1.setText("¡Darás de alta a nuevos alumnos en");

        lb_mensaje2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lb_mensaje2.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje2.setText("el sistema escolar!");

        btn_accion.setBackground(new java.awt.Color(127, 127, 213));
        btn_accion.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_accion.setForeground(new java.awt.Color(0, 0, 0));
        btn_accion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_agregar.png"))); // NOI18N
        btn_accion.setText("Agregar");
        btn_accion.setBorderPainted(false);
        btn_accion.setHideActionText(true);
        btn_accion.setIconTextGap(7);
        btn_accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lb_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_mensaje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_mensaje1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_accion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lb_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(67, 67, 67)
                .addComponent(lb_imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lb_imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lb_mensaje)
                        .addGap(12, 12, 12)
                        .addComponent(lb_mensaje1)
                        .addGap(1, 1, 1)
                        .addComponent(lb_mensaje2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_imagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_accion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Utils.mostrarContenidoEnPanel(new AlumnoPanel());
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accionActionPerformed
        accionParaAlumno();
    }//GEN-LAST:event_btn_accionActionPerformed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionParaAlumno();
        }
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_apellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionParaAlumno();
        }
    }//GEN-LAST:event_txt_apellidosKeyPressed

    private void accionParaAlumno() {
        String nombre = txt_nombre.getText().trim();
        String apellidos = txt_apellidos.getText().trim();
        if (nombre.isEmpty()) {
            txt_nombre.setHelperText("¡Por favor, rellena este campo vacío!");
            txt_nombre.grabFocus();
            return;
        }
        txt_nombre.setHelperText("");
        if (apellidos.isEmpty()) {
            txt_apellidos.setHelperText("¡Por favor, rellena este campo vacío!");
            txt_apellidos.grabFocus();
            return;
        } 
        txt_apellidos.setHelperText("");
        if (apellidos.split(" ").length != 2) {
            txt_apellidos.setHelperText("¡Por favor, escribe ambos apellidos!");
            txt_apellidos.grabFocus();
            return;
        }
        txt_apellidos.setHelperText("");
        Alumno al;
        
        if (modificando) {
            al = ScoreTechAPI.getAlumno(id);
            al.setNombre(nombre);
            al.setApellidos(apellidos);
            al.modificarAlumno();   
            Utils.mostrarAviso("¡Alumno Modificado!", "Se ha modificado el alumno correctamente");
            Utils.mostrarContenidoEnPanel(new AlumnoPanel());
            return;
        }
        al = new Alumno();
        al.setNombre(nombre);
        al.setApellidos(apellidos);
        if (ScoreTechAPI.esAlumnoExistente(nombre + " " +apellidos)) {
            Utils.mostrarAvisoError("¡Alumno existente!", "¡Ya hay un alumno con esos datos!");
        } else {
            al.crearNuevoAlumno();
            Utils.mostrarAviso("¡Nuevo Alumno!", "¡Se ha dado de alta a " + al.getNombre() + " " + al.getApellidos() + "!");
            Utils.mostrarContenidoEnPanel(new AlumnoPanel()); 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accion;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_imagen;
    private javax.swing.JLabel lb_imagen2;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_mensaje1;
    private javax.swing.JLabel lb_mensaje2;
    private com.imjona.ui.TextField txt_apellidos;
    private com.imjona.ui.TextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}

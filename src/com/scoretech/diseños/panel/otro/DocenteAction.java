package com.scoretech.diseños.panel.otro;

import com.scoretech.diseños.panel.DocentesPanel;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import java.awt.event.KeyEvent;
import java.util.Random;

public class DocenteAction extends javax.swing.JPanel {
    private final int id;
    private final boolean modificando;
    
    public DocenteAction(int id, boolean modificando) {
        initComponents();
        this.id = id;
        this.modificando = modificando;
        
        if (modificando) {
            Usuario doc = ScoreTechAPI.getUsuario(id);
            lb_mensaje.setText("Modificar Docente");
            lb_mensaje1.setText("¡En esta sección podrás modificar la información");
            lb_mensaje2.setText("de un docente que ya existe en el sistema!");
            btn_accion.setText("Modificar");
            btn_accion.setIcon(Utils.getIcon("img_icon_actualizar"));
            this.txt_nombre.setText(doc.getNombre());
            this.txt_apellidos.setText(doc.getApellidos());
        }
        txt_nombre.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        txt_nombre = new com.imjona.ui.TextField();
        txt_apellidos = new com.imjona.ui.TextField();
        lb_mensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_mensaje1 = new javax.swing.JLabel();
        lb_mensaje2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        lb_mensaje.setText("Nuevo Docente");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_docente2.png"))); // NOI18N

        lb_mensaje1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lb_mensaje1.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje1.setText("¡En esta sección podrás dar de alta a");

        lb_mensaje2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lb_mensaje2.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje2.setText("un nuevo docente para impartir clases!");

        jLabel2.setIcon(Utils.getIcon("img_logo_estudiantes3", 400, 300)
        );

        btn_accion.setBackground(new java.awt.Color(127, 127, 213));
        btn_accion.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_accion.setForeground(new java.awt.Color(0, 0, 0));
        btn_accion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_agregar.png"))); // NOI18N
        btn_accion.setText("Agregar");
        btn_accion.setBorderPainted(false);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_mensaje1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_mensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_regresar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_accion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lb_mensaje2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                        .addGap(58, 58, 58)))
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lb_mensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_mensaje1)
                .addGap(1, 1, 1)
                .addComponent(lb_mensaje2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_accion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
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
        Utils.mostrarContenidoEnPanel(new DocentesPanel());
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accionActionPerformed
        accionParaDocente();
    }//GEN-LAST:event_btn_accionActionPerformed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionParaDocente();
        }
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_apellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionParaDocente();
        }
    }//GEN-LAST:event_txt_apellidosKeyPressed

    private void accionParaDocente() {
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
        Usuario doc;
        if (modificando) {
            doc = ScoreTechAPI.getUsuario(id);
            doc.setNombreApellidos(nombre, apellidos);
            doc.modificarUsuario();
            Utils.mostrarAviso("¡Docente Modificado!", "¡Se ha modificado el docente corectamente!");
            Utils.mostrarContenidoEnPanel(new DocentesPanel());
            return;
        }
        doc = new Usuario();
        doc.setNombreApellidos(nombre, apellidos);
        doc.setUsuarioContrasena(generarUsuario(nombre, apellidos), generarContraseña());
        doc.setPuesto("Docente");
        if (ScoreTechAPI.esDocenteExistente(nombre, apellidos)) {
            Utils.mostrarAvisoError("¡Docente existente!", "¡Ya hay un docente con esos datos!");
        } else {
            doc.crearUsuario();
            Utils.mostrarAviso("¡Nuevo Docente!", "¡Se ha dado de alta a " + doc.getNombre() + " " + doc.getApellidos() + "!");
            Utils.mostrarContenidoEnPanel(new DocentesPanel());
        }
    }
    
    public String generarUsuario(String nombre, String apellido) {
        String usuario = "";
        String[] apellidos = apellido.split(" ");
        //Jonathan = JO
        usuario += nombre.substring(0, 2).toUpperCase();
        //Hernandez = HE
        usuario += apellidos[0].substring(0, 2).toUpperCase();
        //Santos = SA
        usuario += apellidos[1].substring(0, 2).toUpperCase();
        usuario += "DOC"; //= JOHESADOC
        return usuario;
    }
    
    public String generarContraseña() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String contraseña = "";

        for (int i = 0; i <= 6; i++) {
            int index = random.nextInt(caracteres.length());
            contraseña += caracteres.charAt(index);
        }

        return contraseña;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accion;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_mensaje1;
    private javax.swing.JLabel lb_mensaje2;
    private com.imjona.ui.TextField txt_apellidos;
    private com.imjona.ui.TextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}

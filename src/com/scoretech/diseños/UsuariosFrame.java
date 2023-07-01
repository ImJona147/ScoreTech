package com.scoretech.diseños;

import com.imjona.ui.drawer.Drawer;
import com.imjona.ui.drawer.DrawerController;
import com.imjona.ui.drawer.DrawerItem;
import com.imjona.ui.drawer.EventDrawer;
import com.imjona.ui.Header;
import com.scoretech.diseños.panel.AlumnoPanel;
import com.scoretech.diseños.panel.DocentesPanel;
import com.scoretech.diseños.panel.InicioPanel;
import com.scoretech.diseños.panel.MateriaPanel;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import javax.swing.ImageIcon;

public class UsuariosFrame extends javax.swing.JFrame {
    private final DrawerController drawer;
    
    public UsuariosFrame() {
        Utils.aplicarIcono(this);
        initComponents();
        Utils.mostrarContenidoEnPanel(new InicioPanel());
        Usuario usuario = ScoreTechAPI.getUsuarioActual();
        Header header = new Header()
                .setNombreCompleto(usuario.getNombre() + " " + usuario.getApellidos())
                .setUsuario(usuario.getUsuario())
                .setTipo(usuario.getPuesto());
        drawer = Drawer.newDrawer(UsuariosFrame.this)
                .backgroundTransparent(0)
                .enableScroll(true)
                .enableScrollUI(true)
                .header(header)
                .space(20)
                
                .addChild(new DrawerItem("Inicio")
                        .icon(new ImageIcon(getClass().getResource("/resource/img_icon_inicio.png")))
                        .build())
                .addChild(usuario.getPuesto().equals("Administrador"),new DrawerItem("Docentes")
                        .icon(new ImageIcon(getClass().getResource("/resource/img_icon_docente.png")))
                        .build())
                .addChild(new DrawerItem("Materias")
                        .icon(new ImageIcon(getClass().getResource("/resource/img_icon_materia.png")))
                        .build())
                .addChild(new DrawerItem("Alumnos")
                        .icon(new ImageIcon(getClass().getResource("/resource/img_icon_alumno.png")))
                        .build())
                .addFooter(new DrawerItem("Cerrar sesión")
                        .icon(new ImageIcon(getClass().getResource("/resource/img_icon_cerrar.png")))
                        .build())
                
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                        switch (item.getText()) {
                            case "Inicio" -> {
                                Utils.mostrarContenidoEnPanel(new InicioPanel());
                                drawer.hide();
                            }
                            case "Docentes" -> {
                                Utils.mostrarContenidoEnPanel(new DocentesPanel());
                                drawer.hide();
                            }
                            case "Materias" -> {
                                Utils.mostrarContenidoEnPanel(new MateriaPanel());
                                drawer.hide();
                            }
                            case "Alumnos" -> {
                                Utils.mostrarContenidoEnPanel(new AlumnoPanel());
                                drawer.hide();
                            }
                            case "Cerrar sesión" -> {
                                ScoreTechAPI.setUsuarioActual(null);
                                dispose();
                                LoginFrame lf = new LoginFrame();
                                Utils.ajustarPantallas(lf, UsuariosFrame.this);
                                lf.setVisible(true);
                            }
                            default -> {
                            }
                                
                        }
                    }
        }).build();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_fondo = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        pnl_contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ScoreTech");
        setBackground(new java.awt.Color(191, 220, 221));

        pn_fondo.setBackground(new java.awt.Color(0, 170, 182));

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_menu.png"))); // NOI18N
        btn_menu.setBorder(null);
        btn_menu.setBorderPainted(false);
        btn_menu.setContentAreaFilled(false);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        pnl_contenido.setBackground(new java.awt.Color(191, 220, 221));

        javax.swing.GroupLayout pnl_contenidoLayout = new javax.swing.GroupLayout(pnl_contenido);
        pnl_contenido.setLayout(pnl_contenidoLayout);
        pnl_contenidoLayout.setHorizontalGroup(
            pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        pnl_contenidoLayout.setVerticalGroup(
            pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_fondoLayout = new javax.swing.GroupLayout(pn_fondo);
        pn_fondo.setLayout(pn_fondoLayout);
        pn_fondoLayout.setHorizontalGroup(
            pn_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pn_fondoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pnl_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_fondoLayout.setVerticalGroup(
            pn_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_menu)
            .addComponent(pnl_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_btn_menuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UsuariosFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JPanel pn_fondo;
    public static javax.swing.JPanel pnl_contenido;
    // End of variables declaration//GEN-END:variables
}

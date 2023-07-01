package com.scoretech.diseños;

import static com.scoretech.ScoreTech.getAlumnos;
import com.scoretech.diseños.panel.otro.AlumnoView;
import com.scoretech.objetos.Alumno;
import com.scoretech.utils.Utils;
import java.awt.BorderLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class TutorFrame extends javax.swing.JFrame {
    private int id;
    
    public TutorFrame(){}
    
    public TutorFrame(String nombreCompleto) {
        Utils.aplicarIcono(this);
        initComponents();
        for (Alumno a : getAlumnos()) {
            if (a != null && a.getNombreCompleto().equals(nombreCompleto))
                this.id = a.getId();
        }
        aplicarPanel();
    }
    
    private void aplicarPanel() {
        pn_fondo.setLayout(new BorderLayout(HEIGHT, WIDTH));
        pn_fondo.setSize(WIDTH, HEIGHT);
        
        pn_fondo.removeAll();
        pn_fondo.add(new AlumnoView(id, true));
        pn_fondo.revalidate();
        pn_fondo.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresar = new javax.swing.JButton();
        pn_fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_regresar1 = new javax.swing.JButton();

        btn_regresar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_regresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.setBorder(null);
        btn_regresar.setBorderPainted(false);
        btn_regresar.setContentAreaFilled(false);
        btn_regresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ScoreTech");
        setBackground(new java.awt.Color(191, 220, 221));

        pn_fondo.setBackground(new java.awt.Color(191, 220, 221));

        javax.swing.GroupLayout pn_fondoLayout = new javax.swing.GroupLayout(pn_fondo);
        pn_fondo.setLayout(pn_fondoLayout);
        pn_fondoLayout.setHorizontalGroup(
            pn_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_fondoLayout.setVerticalGroup(
            pn_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(191, 220, 221));

        btn_regresar1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_regresar1.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_regresar.png"))); // NOI18N
        btn_regresar1.setText("Regresar");
        btn_regresar1.setBorder(null);
        btn_regresar1.setBorderPainted(false);
        btn_regresar1.setContentAreaFilled(false);
        btn_regresar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_regresar1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar1)
                .addGap(0, 724, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar1ActionPerformed
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        Utils.ajustarPantallas(lf, this);
        dispose();
    }//GEN-LAST:event_btn_regresar1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TutorFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_regresar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pn_fondo;
    // End of variables declaration//GEN-END:variables
}

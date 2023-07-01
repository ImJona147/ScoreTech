package com.scoretech.diseños.panel.otro;

import static com.scoretech.ScoreTech.getAlumnos;
import static com.scoretech.ScoreTech.getMaterias;
import static com.scoretech.ScoreTech.getMateriasAlumno;
import com.scoretech.diseños.panel.DocentesPanel;
import com.scoretech.objetos.Alumno;
import com.scoretech.objetos.Materia;
import com.scoretech.objetos.MateriaAlumno;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class DocenteView extends javax.swing.JPanel {
    private final int id;
    
    public DocenteView(int id) {
        this.id = id;
        initComponents();
        cargarMateriasDocente();
        modificar();
        Utils.aplicarDiseñoTabla(tb_materias_docente);
    }
    
    public void modificar() {
        Usuario d = ScoreTechAPI.getUsuario(id);
        lb_mensaje.setText(d.getNombre().toUpperCase());
        lb_nombre_completo.setText(d.getNombre() + " " + d.getApellidos());
    }
    
    public void cargarMateriasDocente() {
        try {
            DefaultTableModel model = (DefaultTableModel) tb_materias_docente.getModel();
            Usuario d = ScoreTechAPI.getUsuario(id);
            for (Materia m : getMaterias()) {
                if (m.getId_docente() == d.getId()) {
                    model.addRow(new Object[]{m.getNombre(), obtenerNumeroAlumnosMateria(m.getId())});
                }
            }
        } catch (Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en la tabla!");
        }
    }
    
    private int obtenerNumeroAlumnosMateria(int idMateria) {
        int noAlumnos = 0;
        for (MateriaAlumno ma : getMateriasAlumno()) {
            if (ma.getId_materia() == idMateria) {
                for (Alumno a : getAlumnos()) {
                    if (ma.getId_alumno() == a.getId()) 
                        noAlumnos++;
                }
            }
        }
        return noAlumnos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        lb_info = new javax.swing.JLabel();
        lb_mensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_nombre_completo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materias_docente = new javax.swing.JTable();
        btn_credenciales = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(191, 220, 221));

        btn_regresar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_regresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        btn_regresar.setBorderPainted(false);
        btn_regresar.setContentAreaFilled(false);
        btn_regresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_regresar.setIconTextGap(3);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        lb_info.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lb_info.setForeground(new java.awt.Color(0, 0, 0));
        lb_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_info.setText("INFORMACIÓN DE");

        lb_mensaje.setFont(new java.awt.Font("Monospaced", 1, 19)); // NOI18N
        lb_mensaje.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje.setText("NOMBRE");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_docente_view.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre completo:");

        lb_nombre_completo.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        lb_nombre_completo.setForeground(new java.awt.Color(0, 0, 0));
        lb_nombre_completo.setText("Nombre ApellidoPaterno ApellidoMaterno");

        tb_materias_docente.setBackground(new java.awt.Color(255, 255, 255));
        tb_materias_docente.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tb_materias_docente.setForeground(new java.awt.Color(0, 0, 0));
        tb_materias_docente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materias", "No. Alumnos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_materias_docente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_materias_docente.setSelectionBackground(new java.awt.Color(145, 234, 228));
        tb_materias_docente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_materias_docente);
        if (tb_materias_docente.getColumnModel().getColumnCount() > 0) {
            tb_materias_docente.getColumnModel().getColumn(0).setResizable(false);
            tb_materias_docente.getColumnModel().getColumn(1).setResizable(false);
        }

        btn_credenciales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_view_2.png"))); // NOI18N
        btn_credenciales.setToolTipText("Ver credenciales");
        btn_credenciales.setBorderPainted(false);
        btn_credenciales.setContentAreaFilled(false);
        btn_credenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_credencialesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_mensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(324, 324, 324))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_credenciales)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombre_completo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_credenciales))
                .addGap(7, 7, 7)
                .addComponent(lb_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre_completo)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Utils.mostrarContenidoEnPanel(new DocentesPanel());
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_credencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_credencialesActionPerformed
        Usuario user = ScoreTechAPI.getUsuarioActual();
        Usuario d = ScoreTechAPI.getUsuario(id);
        String contrasena = JOptionPane.
                showInputDialog(null, "Ingresa tu contraseña para continuar", "Administrador", 0);
        if (!user.getContraseña().equals(contrasena)) {
            Utils.mostrarAvisoError("¡Contraseña incorrecta!", "¡La contraseña no coincide!");
            return;
        }
        Utils.mostrarAviso("Credenciales de " + d.getNombre(), "Usuario: " + d.getUsuario() + "\nContraseña: " + d.getContraseña());
    }//GEN-LAST:event_btn_credencialesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_credenciales;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_info;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_nombre_completo;
    private javax.swing.JTable tb_materias_docente;
    // End of variables declaration//GEN-END:variables

}

package com.scoretech.diseños.panel.otro;

import static com.scoretech.ScoreTech.getMateriasAlumno;
import com.scoretech.diseños.panel.AlumnoPanel;
import com.scoretech.objetos.Alumno;
import com.scoretech.objetos.Calificacion;
import com.scoretech.objetos.Materia;
import com.scoretech.objetos.MateriaAlumno;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import javax.swing.table.DefaultTableModel;

public final class AlumnoView extends javax.swing.JPanel {
    private final int id;
    
    public AlumnoView(int id, boolean view) {
        this.id = id;
        initComponents();
        cargarMateriasAlumno();
        modificar();
        if (view) 
            btn_regresar.setVisible(false);
        Utils.aplicarDiseñoTabla(tb_materias_alumno);
    }
    
    public void modificar() {
        Alumno alumno = ScoreTechAPI.getAlumno(id);
        lb_mensaje.setText("INFORMACIÓN DE " + alumno.getNombre().toUpperCase());
        lb_nombre_completo.setText(alumno.getNombre() + " " + alumno.getApellidos());
    }
    
    public void cargarMateriasAlumno() {
        try {
            DefaultTableModel model = (DefaultTableModel) tb_materias_alumno.getModel();
            Alumno a = ScoreTechAPI.getAlumno(id);
            
            for (MateriaAlumno ma : getMateriasAlumno()) {
                Materia m = ScoreTechAPI.getMateria(ma.getId_materia());
                Usuario d = ScoreTechAPI.getUsuario(m.getId_docente());
                Calificacion c = ScoreTechAPI.getCalificacion(ma.getId_alumno(), ma.getId_materia());
                if (ma.getId_alumno() == a.getId() && ma.getId_materia() == m.getId()) {
                    model.addRow(new Object[]{d.getNombre() + " " + d.getApellidos(), m.getNombre(), c != null ? c.getPromedio() : "Sin Promedio"});
                }
            }
        } catch (Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en la tabla!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        lb_mensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_nombre_completo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materias_alumno = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(191, 220, 221));

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
                btn_regresarActionPerformed(evt);
            }
        });

        lb_mensaje.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lb_mensaje.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje.setText("INFORMACIÓN DE NOMBRE_ALUMNO");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_docente3.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre completo:");

        lb_nombre_completo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lb_nombre_completo.setForeground(new java.awt.Color(0, 0, 0));
        lb_nombre_completo.setText("Nombre ApellidoPaterno ApellidoMaterno");

        tb_materias_alumno.setBackground(new java.awt.Color(255, 255, 255));
        tb_materias_alumno.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tb_materias_alumno.setForeground(new java.awt.Color(0, 0, 0));
        tb_materias_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docente", "Materia", "Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_materias_alumno.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_materias_alumno.setSelectionBackground(new java.awt.Color(145, 234, 228));
        tb_materias_alumno.setShowHorizontalLines(true);
        tb_materias_alumno.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_materias_alumno);
        if (tb_materias_alumno.getColumnModel().getColumnCount() > 0) {
            tb_materias_alumno.getColumnModel().getColumn(0).setResizable(false);
            tb_materias_alumno.getColumnModel().getColumn(1).setResizable(false);
            tb_materias_alumno.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_mensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_regresar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(371, 371, 371))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nombre_completo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre_completo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addGap(24, 24, 24))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_nombre_completo;
    private javax.swing.JTable tb_materias_alumno;
    // End of variables declaration//GEN-END:variables
}

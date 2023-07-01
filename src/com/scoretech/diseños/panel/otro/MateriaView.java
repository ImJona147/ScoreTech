package com.scoretech.diseños.panel.otro;

import com.scoretech.ScoreTech;
import static com.scoretech.ScoreTech.getCalificaciones;
import com.scoretech.diseños.panel.MateriaPanel;
import com.scoretech.objetos.Alumno;
import com.scoretech.objetos.Calificacion;
import com.scoretech.objetos.Materia;
import com.scoretech.objetos.MateriaAlumno;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class MateriaView extends javax.swing.JPanel {
    private final int id;
    
    public MateriaView(int id) {
        this.id = id;
        initComponents();
        btn_promediar.setVisible(false);
        cargarAlumnosEnMateria();
        lb_mensaje.setText(ScoreTechAPI.getMateria(id).getNombre());
        Utils.aplicarDiseñoTabla(tb_materias_docente);
        if (ScoreTechAPI.getUsuarioActual().getPuesto().equals("Administrador")) {
            btn_promediar.setVisible(false);
        }
    }
    
    public void cargarAlumnosEnMateria() {
        try {
            DefaultTableModel model = (DefaultTableModel) tb_materias_docente.getModel();
            Materia materia = ScoreTechAPI.getMateria(id);
            for (Alumno a : ScoreTech.getAlumnos()) {
                MateriaAlumno ma = ScoreTechAPI.getMateriaAlumno(a.getId(), materia.getId());
                Calificacion c = ScoreTechAPI.getCalificacion(a.getId(), id);
                if (ma != null && ma.getId_alumno() == a.getId() && ma.getId_materia() == materia.getId()) {
                    model.addRow(new Object[]{a.getId() , a.getNombre(), a.getApellidos(), c != null ? c.getPromedio() : "Sin Promedio"});
                }
            }
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        lb_info = new javax.swing.JLabel();
        lb_mensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materias_docente = new javax.swing.JTable();
        lb_info1 = new javax.swing.JLabel();
        btn_promediar = new javax.swing.JButton();

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
        lb_info.setText("INFORMACIÓN");

        lb_mensaje.setFont(new java.awt.Font("Monospaced", 1, 19)); // NOI18N
        lb_mensaje.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje.setText("NOMBRE_MATERIA");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(Utils.getIcon("img_icon_materia3", 80, 70));

        tb_materias_docente.setBackground(new java.awt.Color(255, 255, 255));
        tb_materias_docente.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tb_materias_docente.setForeground(new java.awt.Color(0, 0, 0));
        tb_materias_docente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre(s)", "Apellidos", "Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        tb_materias_docente.setShowHorizontalLines(true);
        tb_materias_docente.getTableHeader().setReorderingAllowed(false);
        tb_materias_docente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_materias_docenteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_materias_docente);
        if (tb_materias_docente.getColumnModel().getColumnCount() > 0) {
            tb_materias_docente.getColumnModel().getColumn(0).setResizable(false);
            tb_materias_docente.getColumnModel().getColumn(1).setResizable(false);
            tb_materias_docente.getColumnModel().getColumn(2).setResizable(false);
            tb_materias_docente.getColumnModel().getColumn(3).setResizable(false);
        }

        lb_info1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lb_info1.setForeground(new java.awt.Color(0, 0, 0));
        lb_info1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_info1.setText("Alumnos");

        btn_promediar.setBackground(new java.awt.Color(127, 127, 213));
        btn_promediar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_promediar.setForeground(new java.awt.Color(0, 0, 0));
        btn_promediar.setText("Promediar");
        btn_promediar.setBorderPainted(false);
        btn_promediar.setHideActionText(true);
        btn_promediar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promediarActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_info1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_promediar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lb_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_promediar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(30, 30, 30))
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
        Utils.mostrarContenidoEnPanel(new MateriaPanel());
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void tb_materias_docenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_materias_docenteMousePressed
        if (tb_materias_docente.getSelectedRow() != -1 && !ScoreTechAPI.getUsuarioActual().getPuesto().equals("Administrador")) {
            btn_promediar.setVisible(true);
        }
    }//GEN-LAST:event_tb_materias_docenteMousePressed

    private void btn_promediarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promediarActionPerformed
        int rowSelected = tb_materias_docente.getSelectedRow();
        if (rowSelected == -1) {
            Utils.mostrarAvisoError("Error", "Por favor selecciona un alumno");
            return;
        }
        
        int id_alumno = (int) tb_materias_docente.getValueAt(rowSelected, 0);
        Alumno a = ScoreTechAPI.getAlumno(id_alumno);
        double promedio;
        try {
            promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el promedio: ", "Promedio de " + a.getNombreCompleto(), 1));
        } catch (NumberFormatException | NullPointerException e) {
            //Utils.mostrarAvisoError("Error", "¡Solo puedes ingresar números!");
            return;
        }
        
        if (promedio < 0.0 || promedio > 100.0) {
            Utils.mostrarAvisoError("Error", "El promedio debe estar entre 0 y 100");
            return;
        }
        boolean calificacionEncontrada = false;
        for (Calificacion c : getCalificaciones()) {
            if (c != null && c.getId_alumno() == id_alumno && c.getId_materia() == id) {
                c.setPromedio(promedio);
                c.actualizarCalificacion();
                calificacionEncontrada = true;
                break;
            }
        }

        if (!calificacionEncontrada) {
            Calificacion ca = new Calificacion();
            ca.setId_alumno(id_alumno);
            ca.setId_materia(id);
            ca.setPromedio(promedio);
            ca.darCalificacion();
        }
        DefaultTableModel model =  (DefaultTableModel) tb_materias_docente.getModel();
        model.setRowCount(0);
        cargarAlumnosEnMateria();
    }//GEN-LAST:event_btn_promediarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_promediar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_info;
    private javax.swing.JLabel lb_info1;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JTable tb_materias_docente;
    // End of variables declaration//GEN-END:variables
}

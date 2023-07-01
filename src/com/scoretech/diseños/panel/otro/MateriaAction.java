package com.scoretech.diseños.panel.otro;

import static com.scoretech.ScoreTech.getAlumnos;
import static com.scoretech.ScoreTech.getDocentes;
import static com.scoretech.ScoreTech.getMateriasAlumno;
import com.scoretech.diseños.panel.MateriaPanel;
import com.scoretech.objetos.Alumno;
import com.scoretech.objetos.Materia;
import com.scoretech.objetos.MateriaAlumno;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MateriaAction extends javax.swing.JPanel {
    private final boolean modificando;
    private boolean tablaPorMateria;
    private final int id;
    private final DefaultTableModel model;
    
    public MateriaAction(int id, boolean modificando) {
        initComponents();
        btn_dar_baja.setVisible(false);
        cargarDocenteEnCombo();
        this.modificando = modificando;
        this.id = id;
        this.tablaPorMateria = true;
        lb_imagen2.setVisible(false);
        model = (DefaultTableModel) tb_alumnos.getModel();
        txt_buscador.putClientProperty("JTextField.placeholderText", "Buscar alumno..");
        Materia materia = ScoreTechAPI.getMateria(id);
        if (modificando) {
            lb_mensaje.setText("Modificar Materia");
            lb_mensaje1.setText("¡En esta sección podrás modificar");
            lb_mensaje2.setText("la información de una materia!");
            btn_accion.setText("Modificar");
            btn_accion.setIcon(Utils.getIcon("img_icon_actualizar"));
            Usuario d = ScoreTechAPI.getUsuario(materia.getId_docente());
            txt_nombre_materia.setText(materia.getNombre());
            cb_docentes.setSelectedItem(d.getNombre() + " " + d.getApellidos());
            if (ScoreTechAPI.getUsuarioActual().getPuesto().equals("Docente")) {
                txt_nombre_materia.setEditable(false);
                cb_docentes.setEditable(false);
                jLabel3.setVisible(false);
                cb_docentes.setEnabled(false);
            }
        }
        cargarAlumnosEnTabla();
        if (ScoreTechAPI.getUsuarioActual().getPuesto().equals("Administrador")) {
            lb_alumnos.setVisible(false);
            jScrollPane1.setVisible(false);
            txt_buscador.setVisible(false);
            btn_todos.setVisible(false);
            btn_materia.setVisible(false);
            btn_dar_baja.setVisible(false);
            lb_imagen2.setVisible(true);
        }
        Utils.aplicarDiseñoTabla(tb_alumnos);
    }

    private void cargarDocenteEnCombo() {
        try {
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_docentes.getModel();
            getDocentes().forEach(d -> modelo.addElement(d.getNombre() + " " + d.getApellidos()));
        } catch(Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en el menú desplegable!");
        }
    }
    
    private void cargarAlumnosEnTabla() {
        try {
            for (Alumno a : getAlumnos()) {
                MateriaAlumno ma = ScoreTechAPI.getMateriaAlumno(a.getId(), id);
                if (!tablaPorMateria || (ma != null && ma.getId_alumno() == a.getId() 
                        && ma.getId_materia() == id)) {
                    model.addRow(new Object[]{a.getId(), a.getNombre(), a.getApellidos()});
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
        txt_nombre_materia = new com.imjona.ui.TextField();
        lb_mensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_docentes = new javax.swing.JComboBox<>();
        lb_mensaje1 = new javax.swing.JLabel();
        lb_mensaje2 = new javax.swing.JLabel();
        btn_accion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_alumnos = new javax.swing.JTable();
        lb_alumnos = new javax.swing.JLabel();
        txt_buscador = new javax.swing.JTextField();
        btn_todos = new javax.swing.JButton();
        btn_materia = new javax.swing.JButton();
        btn_dar_baja = new javax.swing.JButton();
        lb_imagen2 = new javax.swing.JLabel();

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

        txt_nombre_materia.setBackground(new java.awt.Color(191, 220, 221));
        txt_nombre_materia.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre_materia.setCaretColor(new java.awt.Color(102, 102, 255));
        txt_nombre_materia.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_nombre_materia.setLabelText("Nombre de la materia");
        txt_nombre_materia.setOpaque(true);
        txt_nombre_materia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombre_materiaKeyPressed(evt);
            }
        });

        lb_mensaje.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lb_mensaje.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje.setText("Nueva Materia");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_materia4.png"))); // NOI18N

        cb_docentes.setBackground(new java.awt.Color(255, 255, 255));
        cb_docentes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cb_docentes.setForeground(new java.awt.Color(0, 0, 0));
        cb_docentes.setMaximumRowCount(10);
        cb_docentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cb_docentes.setOpaque(true);

        lb_mensaje1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lb_mensaje1.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje1.setText("¡En esta sección podrás dar de alta una");

        lb_mensaje2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lb_mensaje2.setForeground(new java.awt.Color(0, 0, 0));
        lb_mensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje2.setText("nueva materia para todos los alumnos");

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

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Docente:");

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tb_alumnos.setBackground(new java.awt.Color(255, 255, 255));
        tb_alumnos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tb_alumnos.setForeground(new java.awt.Color(0, 0, 0));
        tb_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre(s)", "Apellidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        tb_alumnos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_alumnos.setSelectionBackground(new java.awt.Color(145, 234, 228));
        tb_alumnos.setShowHorizontalLines(true);
        tb_alumnos.getTableHeader().setReorderingAllowed(false);
        tb_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_alumnosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_alumnos);
        if (tb_alumnos.getColumnModel().getColumnCount() > 0) {
            tb_alumnos.getColumnModel().getColumn(0).setResizable(false);
            tb_alumnos.getColumnModel().getColumn(1).setResizable(false);
            tb_alumnos.getColumnModel().getColumn(2).setResizable(false);
        }

        lb_alumnos.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lb_alumnos.setForeground(new java.awt.Color(0, 0, 0));
        lb_alumnos.setText("ALUMNOS DADOS DE ALTA");

        txt_buscador.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscador.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_buscador.setForeground(new java.awt.Color(0, 0, 0));
        txt_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscadorKeyReleased(evt);
            }
        });

        btn_todos.setBackground(new java.awt.Color(127, 127, 213));
        btn_todos.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_todos.setForeground(new java.awt.Color(0, 0, 0));
        btn_todos.setText("TODOS");
        btn_todos.setBorderPainted(false);
        btn_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todosActionPerformed(evt);
            }
        });

        btn_materia.setBackground(new java.awt.Color(127, 127, 213));
        btn_materia.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_materia.setForeground(new java.awt.Color(0, 0, 0));
        btn_materia.setText("MATERIA");
        btn_materia.setBorderPainted(false);
        btn_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materiaActionPerformed(evt);
            }
        });

        btn_dar_baja.setBackground(new java.awt.Color(127, 127, 213));
        btn_dar_baja.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_dar_baja.setForeground(new java.awt.Color(0, 0, 0));
        btn_dar_baja.setText("DAR BAJA");
        btn_dar_baja.setBorderPainted(false);
        btn_dar_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dar_bajaActionPerformed(evt);
            }
        });

        lb_imagen2.setIcon(Utils.getIcon("img_logo_estudiantes4", 450, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_regresar)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_mensaje1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(lb_mensaje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addComponent(txt_nombre_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(cb_docentes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_accion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_todos)
                        .addGap(18, 18, 18)
                        .addComponent(btn_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_dar_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_buscador)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_alumnos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lb_imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(2, 2, 2)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_mensaje)
                        .addGap(6, 6, 6)
                        .addComponent(lb_mensaje1)
                        .addGap(2, 2, 2)
                        .addComponent(lb_mensaje2)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(cb_docentes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_accion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lb_alumnos)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_todos)
                        .addComponent(btn_materia))
                    .addComponent(btn_dar_baja))
                .addGap(33, 33, 33))
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

    private void btn_accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accionActionPerformed
        accionParaMateria();
    }//GEN-LAST:event_btn_accionActionPerformed

    private void txt_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscadorKeyReleased
        try {
            String buscar = txt_buscador.getText().toLowerCase();
            String nombreCompleto;
            model.setRowCount(0);
            for (Alumno a : getAlumnos()) {
                nombreCompleto = (a.getNombre() + " " + a.getApellidos()).toLowerCase();
                MateriaAlumno ma = ScoreTechAPI.getMateriaAlumno(a.getId(), id);
                if (nombreCompleto.contains(buscar.toLowerCase()) && (!tablaPorMateria || 
                        (ma != null && ma.getId_alumno() == a.getId() && ma.getId_materia() == id))) {
                    model.addRow(new Object[]{a.getId(), a.getNombre(), a.getApellidos()});
                }
            }
        } catch (Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en la tabla!");
        }     
    }//GEN-LAST:event_txt_buscadorKeyReleased

    private void txt_nombre_materiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_materiaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionParaMateria();
        }
    }//GEN-LAST:event_txt_nombre_materiaKeyPressed

    private void btn_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todosActionPerformed
        tablaPorMateria = false;
        btn_dar_baja.setVisible(false);
        lb_alumnos.setText("TODOS LOS ALUMNOS");
        model.setRowCount(0);
        cargarAlumnosEnTabla();
    }//GEN-LAST:event_btn_todosActionPerformed

    private void btn_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materiaActionPerformed
        tablaPorMateria = true;
        lb_alumnos.setText("ALUMNOS DADOS DE ALTA");
        model.setRowCount(0);
        cargarAlumnosEnTabla();
    }//GEN-LAST:event_btn_materiaActionPerformed

    private void btn_dar_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dar_bajaActionPerformed
        List<MateriaAlumno> alumnosDadosBaja = new ArrayList<>();
        if (tb_alumnos.getSelectedRows().length < 1) {
            Utils.mostrarAvisoError("¡Error!", "¡Por favor, selecciona una fila o más!");
            return;
        }
        for (int i : tb_alumnos.getSelectedRows()) {
            int id_alumno = (int) tb_alumnos.getValueAt(i, 0);
            MateriaAlumno ma = ScoreTechAPI.getMateriaAlumno(id_alumno, id);
            alumnosDadosBaja.add(ma);
        }
        int darBaja = 1;
        if (alumnosDadosBaja.size() == 1) {
            darBaja = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres dar de baja a este alumno?");
            if (darBaja == 0) {
                Alumno a = ScoreTechAPI.getAlumno(alumnosDadosBaja.get(0).getId_alumno());
                MateriaAlumno ma = ScoreTechAPI.getMateriaAlumno(a.getId(), id);
                Utils.mostrarAviso("¡Alumno Dado de Baja!", "¡Se ha dado de baja a " + a.getNombreCompleto() + "!");
                ma.darBaja();
            }
        } else if (alumnosDadosBaja.size() > 1) {
            darBaja = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres dar de baja a " + alumnosDadosBaja.size() + " alumnos?");
            if (darBaja == 0) {
                Utils.mostrarAviso("¡Alumnos Dados de Baja!", "¡Se han dado de baja a " + alumnosDadosBaja.size() + " alumnos!");
                alumnosDadosBaja.forEach(ma -> ma.darBaja());
            }
        }
        model.setRowCount(0);
        cargarAlumnosEnTabla();
    }//GEN-LAST:event_btn_dar_bajaActionPerformed

    private void tb_alumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_alumnosMousePressed
        if (tb_alumnos.getSelectedRow() != -1 && tablaPorMateria) {
            btn_dar_baja.setVisible(true);
        }
    }//GEN-LAST:event_tb_alumnosMousePressed

    private void accionParaMateria() {
        List<Alumno> alumnosDuplicados = new ArrayList<>();
        List<MateriaAlumno> alumnosDadosAlta = new ArrayList<>();
        boolean accionRealizadaCorrectamente = true;
        String nombre = txt_nombre_materia.getText().trim();
        String nombreDocente = cb_docentes.getSelectedItem().toString().trim();
        if (nombre.isEmpty()) {
            txt_nombre_materia.setHelperText("¡Por favor, rellena este campo vacío!");
            txt_nombre_materia.grabFocus();
            return;
        }
        if (nombreDocente.equals("Seleccionar")) {
            Utils.mostrarAvisoError("¡Error!", "¡Por favor, selecciona un docente!");
            return;
        }
        Usuario doc = ScoreTechAPI.getDocente(nombreDocente);
        Materia materia;
        if (modificando) {
            materia = ScoreTechAPI.getMateria(id);
            materia.setNombre(nombre);
            materia.setId_docente(doc.getId());
            for (int i : tb_alumnos.getSelectedRows()) {
                MateriaAlumno ma = new MateriaAlumno();
                int id_alumno = (int) tb_alumnos.getValueAt(i, 0);
                ma.setId_alumno(id_alumno);
                ma.setId_materia(id);
                boolean alumnoPertenece = false;
                for (MateriaAlumno m : getMateriasAlumno()) {
                    if (m.getId_alumno() == id_alumno && m.getId_materia() == id) {
                        alumnoPertenece = true;
                        break;
                    }
                }
                if (!alumnoPertenece) {
                    alumnosDadosAlta.add(ma);
                    ma.darAlta();
                } else {
                    Alumno a = ScoreTechAPI.getAlumno(id_alumno);
                    alumnosDuplicados.add(a);
                }
            }
            if (!tablaPorMateria) {
                int cantidadDuplicados = alumnosDuplicados.size();
                if (cantidadDuplicados == 1) {
                    Alumno alumnoDuplicado = alumnosDuplicados.get(0);
                    accionRealizadaCorrectamente = false;
                    Utils.mostrarAvisoError("¡Error!", "¡El alumno " + alumnoDuplicado.getNombreCompleto() + " ya está dado de alta!");
                } else if (cantidadDuplicados > 1) {
                    Utils.mostrarAvisoError("¡Error!", "¡Hay " + cantidadDuplicados + " alumnos que ya están dados de alta en esta materia! \n"
                                                           + "¡Se darán de alta a los demás alumnos!");
                }
            }
            if (alumnosDadosAlta.size() == 1) {
                Alumno a = ScoreTechAPI.getAlumno(alumnosDadosAlta.get(0).getId_alumno());
                Utils.mostrarAviso("¡Nuevo Alumno!", "¡Se ha dado de alta a " + a.getNombreCompleto() + "!");
            } else if (alumnosDadosAlta.size() > 1) {
                Utils.mostrarAviso("¡Nuevos Alumno!", "¡Se han dado de alta a " + alumnosDadosAlta.size() + " alumnos!");
            }
            if (accionRealizadaCorrectamente) {
                materia.modificar();
                Utils.mostrarAviso("Materia modificado", "Se ha modificado la materia " + materia.getNombre());
                Utils.mostrarContenidoEnPanel(new MateriaPanel());
            }
            return;
        }
        if (ScoreTechAPI.getMateria(nombre) != null) {
            Utils.mostrarAvisoError("¡Datos repetidos!", "¡Ya hay una materia con ese nombre!");
            return;
        }
        materia = new Materia(nombre, doc.getId());
        materia.darAlta();
        Utils.mostrarAviso("Materia creada", "Se ha creado la materia " + materia.getNombre());
        Utils.mostrarContenidoEnPanel(new MateriaPanel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accion;
    private javax.swing.JButton btn_dar_baja;
    private javax.swing.JButton btn_materia;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_todos;
    private javax.swing.JComboBox<String> cb_docentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_alumnos;
    private javax.swing.JLabel lb_imagen2;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_mensaje1;
    private javax.swing.JLabel lb_mensaje2;
    private javax.swing.JTable tb_alumnos;
    private javax.swing.JTextField txt_buscador;
    private com.imjona.ui.TextField txt_nombre_materia;
    // End of variables declaration//GEN-END:variables
}

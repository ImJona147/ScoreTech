package com.scoretech.diseños.panel;

import com.imjona.ui.table.TableActionCellEditor;
import com.imjona.ui.table.TableActionRenderer;
import com.imjona.ui.table.event.TableActionEvent;
import static com.scoretech.ScoreTech.getMaterias;
import com.scoretech.diseños.panel.otro.MateriaAction;
import com.scoretech.diseños.panel.otro.MateriaView;
import com.scoretech.objetos.Materia;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.ScoreTechAPI;
import com.scoretech.utils.Utils;
import javax.swing.table.DefaultTableModel;

public final class MateriaPanel extends javax.swing.JPanel {
    private final DefaultTableModel model;
    
    public MateriaPanel() {
        initComponents();
        model = (DefaultTableModel) tb_materias.getModel();
        cargarMateriasEnTabla();
        txt_buscador.putClientProperty("JTextField.placeholderText", "Buscar materia...");
        
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void alModificar(int row) {
               Utils.mostrarContenidoEnPanel(new MateriaAction((int) tb_materias.getValueAt(row, 0), true));
            }

            @Override
            public void alMirar(int row) {
                Utils.mostrarContenidoEnPanel(new MateriaView((int) tb_materias.getValueAt(row, 0)));
            }
        };
        
        
        if (ScoreTechAPI.getUsuarioActual().getPuesto().equals("Docente")) {
            btn_agregar.setVisible(false);
        }
        
        tb_materias.getColumnModel().getColumn(3).setCellRenderer(new TableActionRenderer());
        tb_materias.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));
        Utils.aplicarDiseñoTabla(tb_materias);
    }

    public void cargarMateriasEnTabla() {
        try {
            for (Materia m : getMaterias()) {
                Usuario d = ScoreTechAPI.getUsuario(m.getId_docente());
                Usuario u = ScoreTechAPI.getUsuarioActual();
                if (u.getPuesto().equals("Administrador") || 
                   (u.getId() == m.getId_docente() && u.getPuesto().equals("Docente"))) {
                    model.addRow(new Object[]{m.getId(), m.getNombre(), d.getNombre() + " " + d.getApellidos()});
                }
            }
        } catch(Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en la tabla!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materias = new javax.swing.JTable();
        txt_buscador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 535));

        jPanel1.setBackground(new java.awt.Color(191, 220, 221));

        tb_materias.setBackground(new java.awt.Color(255, 255, 255));
        tb_materias.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tb_materias.setForeground(new java.awt.Color(0, 0, 0));
        tb_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Docente", "Acciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_materias.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_materias.setRowHeight(40);
        tb_materias.setSelectionBackground(new java.awt.Color(145, 234, 228));
        tb_materias.setShowHorizontalLines(true);
        tb_materias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_materias);
        if (tb_materias.getColumnModel().getColumnCount() > 0) {
            tb_materias.getColumnModel().getColumn(0).setResizable(false);
            tb_materias.getColumnModel().getColumn(1).setResizable(false);
            tb_materias.getColumnModel().getColumn(2).setResizable(false);
            tb_materias.getColumnModel().getColumn(3).setResizable(false);
        }

        txt_buscador.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscador.setForeground(new java.awt.Color(0, 0, 0));
        txt_buscador.setCaretColor(new java.awt.Color(102, 102, 255));
        txt_buscador.setSelectionColor(new java.awt.Color(76, 204, 255));
        txt_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscadorKeyReleased(evt);
            }
        });

        jLabel1.setIcon(Utils.getIcon("img_icon_materia2", 120, 95)
        );

        btn_agregar.setBackground(new java.awt.Color(127, 127, 213));
        btn_agregar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_agregar.png"))); // NOI18N
        btn_agregar.setText("Nuevo Materia");
        btn_agregar.setBorderPainted(false);
        btn_agregar.setIconTextGap(5);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar))
                    .addComponent(txt_buscador)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(21, 21, 21))
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

    private void txt_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscadorKeyReleased
        try {
            String buscar = txt_buscador.getText().toLowerCase();
            model.setRowCount(0);
            for (Materia m : getMaterias()) {
                if (m.getNombre().toLowerCase().contains(buscar)) {
                    Usuario d = ScoreTechAPI.getUsuario(m.getId_docente());
                    Usuario u = ScoreTechAPI.getUsuarioActual();
                    if (u.getPuesto().equals("Administrador") || 
                   (u.getId() == m.getId_docente() && u.getPuesto().equals("Docente"))) {
                    model.addRow(new Object[]{m.getId(), m.getNombre(), d.getNombre() + " " + d.getApellidos()});
                }
                }
            }
        } catch (Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en la tabla!");
        }
    }//GEN-LAST:event_txt_buscadorKeyReleased

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Utils.mostrarContenidoEnPanel(new MateriaAction(-1, false));
    }//GEN-LAST:event_btn_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_materias;
    private javax.swing.JTextField txt_buscador;
    // End of variables declaration//GEN-END:variables
}

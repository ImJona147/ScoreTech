package com.scoretech.diseños.panel;

import com.imjona.ui.table.TableActionCellEditor;
import com.imjona.ui.table.TableActionRenderer;
import com.imjona.ui.table.event.TableActionEvent;
import static com.scoretech.ScoreTech.getDocentes;
import com.scoretech.diseños.panel.otro.DocenteAction;
import com.scoretech.diseños.panel.otro.DocenteView;
import com.scoretech.objetos.Usuario;
import com.scoretech.utils.Utils;
import javax.swing.table.DefaultTableModel;

public class DocentesPanel extends javax.swing.JPanel {
    private final DefaultTableModel model;
    
    public DocentesPanel() {
        initComponents();
        model = (DefaultTableModel) tb_docentes.getModel();
        cargarDocentesEnTabla();
        lb_mensaje3.setText("Hay " + String.valueOf(getDocentes().size()) + " docentes actualmente");
        txt_buscador.putClientProperty("JTextField.placeholderText", "Buscar docente..");

        TableActionEvent event = new TableActionEvent() {
            @Override
            public void alModificar(int row) {
                Utils.mostrarContenidoEnPanel(new DocenteAction((int) tb_docentes.getValueAt(row, 0), true));
            }

            @Override
            public void alMirar(int row) {
                Utils.mostrarContenidoEnPanel(new DocenteView((int) tb_docentes.getValueAt(row, 0)));
            }
        };
        
        tb_docentes.getColumnModel().getColumn(3).setCellRenderer(new TableActionRenderer());
        tb_docentes.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));
        Utils.aplicarDiseñoTabla(tb_docentes);
    }

    private void cargarDocentesEnTabla() {
        try {
            getDocentes().forEach(d -> model.addRow(new Object[]{d.getId(), d.getNombre(), d.getApellidos()}));
        } catch (Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en la tabla!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_docentes = new javax.swing.JTable();
        txt_buscador = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        lb_imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_mensaje1 = new javax.swing.JLabel();
        lb_mensaje2 = new javax.swing.JLabel();
        lb_mensaje3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(191, 220, 221));

        jPanel1.setBackground(new java.awt.Color(191, 220, 221));

        tb_docentes.setBackground(new java.awt.Color(255, 255, 255));
        tb_docentes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tb_docentes.setForeground(new java.awt.Color(0, 0, 0));
        tb_docentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre(s)", "Apellidos", "Acciones"
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
        tb_docentes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_docentes.setOpaque(false);
        tb_docentes.setRowHeight(40);
        tb_docentes.setSelectionBackground(new java.awt.Color(145, 234, 228));
        tb_docentes.setShowGrid(true);
        tb_docentes.setShowHorizontalLines(true);
        tb_docentes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_docentes);
        if (tb_docentes.getColumnModel().getColumnCount() > 0) {
            tb_docentes.getColumnModel().getColumn(0).setResizable(false);
            tb_docentes.getColumnModel().getColumn(1).setResizable(false);
            tb_docentes.getColumnModel().getColumn(2).setResizable(false);
            tb_docentes.getColumnModel().getColumn(3).setResizable(false);
        }

        txt_buscador.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscador.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_buscador.setForeground(new java.awt.Color(0, 0, 0));
        txt_buscador.setCaretColor(new java.awt.Color(102, 102, 255));
        txt_buscador.setSelectionColor(new java.awt.Color(76, 204, 255));
        txt_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscadorKeyReleased(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(127, 127, 213));
        btn_agregar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_agregar.png"))); // NOI18N
        btn_agregar.setText("Nuevo Docente");
        btn_agregar.setBorderPainted(false);
        btn_agregar.setIconTextGap(5);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        lb_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_docente1.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(150, 180, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        lb_mensaje1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lb_mensaje1.setForeground(new java.awt.Color(255, 255, 255));
        lb_mensaje1.setText("Docentes");

        lb_mensaje2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lb_mensaje2.setForeground(new java.awt.Color(255, 255, 255));
        lb_mensaje2.setText("Lista de docentes en el sistema");

        lb_mensaje3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lb_mensaje3.setForeground(new java.awt.Color(255, 255, 255));
        lb_mensaje3.setText("Hay 0 docentes actualmente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_mensaje1)
                    .addComponent(lb_mensaje2)
                    .addComponent(lb_mensaje3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_mensaje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_mensaje2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_mensaje3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(btn_agregar))
                    .addComponent(txt_buscador)
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregar)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
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
            String buscador = txt_buscador.getText().toLowerCase();
            String nombre, apellidos, nombreCompleto;
            model.setRowCount(0);
            for (Usuario d : getDocentes()) {
                nombre = d.getNombre().toLowerCase();
                apellidos = d.getApellidos().toLowerCase();
                nombreCompleto = nombre + " " + apellidos;
                if (apellidos.contains(buscador) || nombre.contains(buscador) || 
                        nombreCompleto.contains(buscador)) {
                    model.addRow(new Object[]{d.getId(), d.getNombre(), d.getApellidos()});
                }
            }
        } catch (Exception e) {
            Utils.mostrarAvisoError("¡Error!", "¡No se pudo cargar los datos en la tabla!");
        }
    }//GEN-LAST:event_txt_buscadorKeyReleased

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Utils.mostrarContenidoEnPanel(new DocenteAction(-1, false));
    }//GEN-LAST:event_btn_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_imagen;
    private javax.swing.JLabel lb_mensaje1;
    private javax.swing.JLabel lb_mensaje2;
    private javax.swing.JLabel lb_mensaje3;
    private javax.swing.JTable tb_docentes;
    private javax.swing.JTextField txt_buscador;
    // End of variables declaration//GEN-END:variables
}

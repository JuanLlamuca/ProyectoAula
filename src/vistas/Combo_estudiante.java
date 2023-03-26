/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import conexion.Conexion;
import controlador.Ctrl_Postulante;
import controlador.Ctrl_carreras;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Carreras;
import modelo.Postulante;

public class Combo_estudiante extends javax.swing.JPanel {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;

    public Combo_estudiante() {
        initComponents();
        mostrarCarrera();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_numeroP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_numeroD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_educacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_nacimiento = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JCalendar();
        jLabel12 = new javax.swing.JLabel();
        combo_carrera = new javax.swing.JComboBox<>();
        btn_insertar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_postulante = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();

        setBackground(new java.awt.Color(225, 227, 229));
        setForeground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(854, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_miniatura.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresar datos ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cédula:");

        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombres:");

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellidos:");

        jLabel6.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono 1:");

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Teléfono 2:");

        jLabel8.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Corréo:");

        jLabel9.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dirección:");

        jLabel10.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Educación:");

        jLabel11.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha Nacimiento:");

        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Carrera:");

        btn_insertar.setBackground(new java.awt.Color(1, 53, 103));
        btn_insertar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        btn_insertar.setForeground(new java.awt.Color(255, 255, 255));
        btn_insertar.setText("Ingresar datos");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(1, 53, 103));
        btn_modificar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(1, 53, 103));
        btn_eliminar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        tabla_postulante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Teléfono 1", "Teléfono 2", "Corréo", "Dirección", "Educación", "Fecha de nacimiento", "Carrera", "Clave"
            }
        ));
        tabla_postulante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_postulanteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_postulante);

        jLabel13.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccion)
                            .addComponent(txt_correo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_numeroD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_educacion, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(combo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btn_insertar)
                                .addGap(81, 81, 81)
                                .addComponent(btn_modificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_numeroP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                                    .addComponent(txt_apellidos))))))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_numeroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_numeroD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_educacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange
        if (evt.getOldValue() != null) {
            SimpleDateFormat ff = new SimpleDateFormat("yyyy/MM/dd");
            txt_nacimiento.setText(ff.format(calendario.getCalendar().getTime()));
        }
    }//GEN-LAST:event_calendarioPropertyChange

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        Postulante postulante = new Postulante();
        Ctrl_Postulante controlPostulante = new Ctrl_Postulante();

        if (!txt_cedula.getText().isEmpty() && !txt_nombres.getText().isEmpty() && !txt_apellidos.getText().isEmpty() && !txt_numeroP.getText().isEmpty()
                && !txt_numeroD.getText().isEmpty() && !txt_correo.getText().isEmpty() && !txt_direccion.getText().isEmpty() && !txt_direccion.getText().isEmpty()
                && !txt_nacimiento.getText().isEmpty()) {
            postulante.setCedula(Integer.parseInt(txt_cedula.getText()));
            postulante.setNombres(txt_nombres.getText());
            postulante.setApellidos(txt_apellidos.getText());
            postulante.setTelefonoP(Integer.parseInt(txt_numeroP.getText()));
            postulante.setTelefonoD(Integer.parseInt(txt_numeroD.getText()));
            postulante.setCorreo(txt_correo.getText());
            postulante.setDireccion(txt_direccion.getText());
            postulante.setEduacion(txt_educacion.getText());
            postulante.setNacimiento(txt_nacimiento.getText());

            if (controlPostulante.eliminarEstudiante(postulante)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos sus datos");
        }

        //limpiar campo
        txt_cedula.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_numeroP.setText("");
        txt_numeroD.setText("");
        txt_correo.setText("");
        txt_direccion.setText("");
        txt_educacion.setText("");
        txt_nacimiento.setText("");


    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        // TODO add your handling code here:
        insertar();
        
        
        
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void tabla_postulanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_postulanteMouseClicked
        // TODO add your handling code here:
        int fila = tabla_postulante.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecione una fila");
        } else {
            int cedula = Integer.parseInt((String) tabla_postulante.getValueAt(fila, 0).toString());
            String nombres = (String) tabla_postulante.getValueAt(fila, 1);
            String apellidos = (String) tabla_postulante.getValueAt(fila, 2);
            int numero1 = Integer.parseInt((String) tabla_postulante.getValueAt(fila, 3).toString());
            int numero2 = Integer.parseInt((String) tabla_postulante.getValueAt(fila, 4).toString());
            String correo = (String) tabla_postulante.getValueAt(fila, 5);
            String direccion = (String) tabla_postulante.getValueAt(fila, 6);
            String educacion = (String) tabla_postulante.getValueAt(fila, 7);
            String nacimiento = (String) tabla_postulante.getValueAt(fila, 8);

            txt_cedula.setText("" + cedula);
            txt_nombres.setText(nombres);
            txt_apellidos.setText(apellidos);
            txt_numeroP.setText("" + numero1);
            txt_numeroD.setText("" + numero2);
            txt_correo.setText(correo);
            txt_direccion.setText(direccion);
            txt_educacion.setText(educacion);
            txt_nacimiento.setText(nacimiento);
        }
    }//GEN-LAST:event_tabla_postulanteMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        Postulante postulante = new Postulante();
        Ctrl_Postulante controlPostulante = new Ctrl_Postulante();

        if (!txt_cedula.getText().isEmpty() && !txt_nombres.getText().isEmpty() && !txt_apellidos.getText().isEmpty() && !txt_numeroP.getText().isEmpty()
                && !txt_numeroD.getText().isEmpty() && !txt_correo.getText().isEmpty() && !txt_direccion.getText().isEmpty() && !txt_direccion.getText().isEmpty()
                && !txt_nacimiento.getText().isEmpty()) {
            postulante.setCedula(Integer.parseInt(txt_cedula.getText()));
            postulante.setNombres(txt_nombres.getText());
            postulante.setApellidos(txt_apellidos.getText());
            postulante.setTelefonoP(Integer.parseInt(txt_numeroP.getText()));
            postulante.setTelefonoD(Integer.parseInt(txt_numeroD.getText()));
            postulante.setCorreo(txt_correo.getText());
            postulante.setDireccion(txt_direccion.getText());
            postulante.setEduacion(txt_educacion.getText());
            postulante.setNacimiento(txt_nacimiento.getText());
            postulante.setClave(txt_clave.getText());
            

            if (controlPostulante.modificarEstudiante(postulante)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos sus datos");
        }

        //limpiar campo
        txt_cedula.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_numeroP.setText("");
        txt_numeroD.setText("");
        txt_correo.setText("");
        txt_direccion.setText("");
        txt_educacion.setText("");
        txt_nacimiento.setText("");
        txt_clave.setText("");

    }//GEN-LAST:event_btn_modificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_modificar;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JComboBox<String> combo_carrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_postulante;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_educacion;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numeroD;
    private javax.swing.JTextField txt_numeroP;
    // End of variables declaration//GEN-END:variables

    public void mostrarCarrera() {
        Ctrl_carreras carreras = new Ctrl_carreras();
        ArrayList<Carreras> lista = carreras.obtenerCarreras();
        combo_carrera.addItem("Seleccione ");
        for (int i = 0; i < lista.size(); i++) {
            combo_carrera.addItem(lista.get(i).toString());
        }
    }

    public void llenarTabla() {
        String sql = "select * from postulante";
        try {
            cn = mysql.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] postulante = new Object[11];
             modelo= (DefaultTableModel) tabla_postulante.getModel();
            while (rs.next()) {
                postulante[0] = rs.getInt("post_cedula");
                postulante[1] = rs.getString("post_nombres");
                postulante[2] = rs.getString("post_apellidos");
                postulante[3] = rs.getInt("post_telefonoP");
                postulante[4] = rs.getInt("post_telefonoD");
                postulante[5] = rs.getString("post_correo");
                postulante[6] = rs.getString("post_direccion");
                postulante[7] = rs.getString("post_educacion");
                postulante[8] = rs.getString("post_feNacimiento");
                postulante[9] = rs.getInt("carr_id");
                postulante[10]=rs.getString("post_clave");
                modelo.addRow(postulante);
            }
            tabla_postulante.setModel(modelo);
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llenar tabla " + e);
        }
    }
    
    public void insertar(){
        Postulante postulante = new Postulante();
        Ctrl_Postulante controlPostulante = new Ctrl_Postulante();

        String cadenaCompleta = (String) combo_carrera.getSelectedItem();
        int posicion = cadenaCompleta.indexOf("-");

        if (!txt_cedula.getText().isEmpty() && !txt_nombres.getText().isEmpty() && !txt_apellidos.getText().isEmpty() && !txt_numeroP.getText().isEmpty()
                && !txt_numeroD.getText().isEmpty() && !txt_correo.getText().isEmpty() && !txt_direccion.getText().isEmpty() && !txt_direccion.getText().isEmpty()
                && !txt_nacimiento.getText().isEmpty() && !combo_carrera.getSelectedItem().toString().isEmpty()) {

            postulante.setCedula(Integer.parseInt(txt_cedula.getText()));
            postulante.setNombres(txt_nombres.getText());
            postulante.setApellidos(txt_apellidos.getText());
            postulante.setTelefonoP(Integer.parseInt(txt_numeroP.getText()));
            postulante.setTelefonoD(Integer.parseInt(txt_numeroD.getText()));
            postulante.setCorreo(txt_correo.getText());
            postulante.setDireccion(txt_direccion.getText());
            postulante.setEduacion(txt_educacion.getText());
            postulante.setNacimiento(txt_nacimiento.getText());
            postulante.setCarrera(posicion);
            postulante.setClave(txt_clave.getText());

            if (controlPostulante.InsertarPostulante(postulante)) {
                JOptionPane.showMessageDialog(null, "Ingresado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Escoja una linea");
        }
       

        //limpiar campo
        txt_cedula.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_numeroP.setText("");
        txt_numeroD.setText("");
        txt_correo.setText("");
        txt_direccion.setText("");
        txt_educacion.setText("");
        txt_nacimiento.setText("");
        combo_carrera.setSelectedItem("Seleccione");
        txt_clave.setText("");
    }

}

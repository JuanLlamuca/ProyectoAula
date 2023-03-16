package vistas;

import conexion.Conexion;
import controlador.Ctrl_Postulante;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.Postulante;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class ModificarEstudiante extends javax.swing.JFrame {
    
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;
    
    public ModificarEstudiante() {
        initComponents();
        setLocationRelativeTo(null);
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_numeroP = new javax.swing.JTextField();
        txt_numeroD = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_educacion = new javax.swing.JTextField();
        txt_nacimiento = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btn_guardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_postulante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cédula:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Teléfono 1:");

        jLabel5.setText("Teléfono 2:");

        jLabel6.setText("Corréo:");

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jLabel7.setText("Modificar Estudiante");

        jLabel8.setText("Dirección:");

        jLabel9.setText("Educación:");

        jLabel10.setText("Fecha nacimiento:");

        txt_cedula.setEditable(false);
        txt_cedula.setEnabled(false);
        txt_cedula.setFocusable(false);

        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar Cambios");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        tabla_postulante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Teléfono 1", "Teléfono 2", "Corréo", "Dirección", "Educación", "Fecha de nacimiento", "Carrera"
            }
        ));
        tabla_postulante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_postulanteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_postulante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_apellidos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_direccion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(25, 25, 25)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_correo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_numeroD, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_educacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_numeroP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGap(0, 56, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_numeroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_numeroD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_educacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11)
                                .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
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
        
    }//GEN-LAST:event_btn_guardarActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_educacion;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numeroD;
    private javax.swing.JTextField txt_numeroP;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla() {
        String sql = "select * from lista_postulante";
        try {
            cn = mysql.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
            Object[] postulante = new Object[10];
            DefaultTableModel modelo = (DefaultTableModel) tabla_postulante.getModel();
            
            modelo = (DefaultTableModel) tabla_postulante.getModel();
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
                modelo.addRow(postulante);
            }
            tabla_postulante.setModel(modelo);
            cn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ModificarEstudiante " + e);
        }
    }
    
}

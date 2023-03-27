package vistas_empleador;

import com.mysql.jdbc.CallableStatement;
import java.sql.ResultSet;
import conexion.Conexion;
import controlador.Ctrl_Empleador_j;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import modelo.Empleador_j;


public class P_modificaEmpleador extends javax.swing.JFrame {
    
    public P_modificaEmpleador() {
        initComponents();
        setLocationRelativeTo(null);
        txt_recibeced.setText(P_loginEmpleador.cedula); //Variable static que envía los datos a otro Jframse 
        this.Visualizar();
    }
       
    int xMouse, yMouse;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_fondo = new javax.swing.JPanel();
        P_fondo1 = new javax.swing.JPanel();
        P_head = new javax.swing.JPanel();
        lbl_logo1 = new javax.swing.JLabel();
        lbl_registrodeempleador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_informaciondela1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_nombre = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_apellido = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_email = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_labor = new javax.swing.JTextPane();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_nEmpresa = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_ubiEmp = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt_telefono = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt_emailEmp = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextPane();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_informaciondela4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Panel_registrar = new javax.swing.JPanel();
        lbl_guardar = new javax.swing.JLabel();
        lbl_comentario1 = new javax.swing.JLabel();
        txt_recibeced = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_fondo.setBackground(new java.awt.Color(253, 253, 253));
        P_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_fondo1.setBackground(new java.awt.Color(225, 227, 229));
        P_fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_head.setBackground(new java.awt.Color(1, 53, 103));
        P_head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_headMouseDragged(evt);
            }
        });
        P_head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_headMousePressed(evt);
            }
        });
        P_head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P_head.add(lbl_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        lbl_registrodeempleador.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        lbl_registrodeempleador.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrodeempleador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_registrodeempleador.setText("Editar Perfil");
        P_head.add(lbl_registrodeempleador, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 60));

        P_fondo1.add(P_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));
        P_fondo1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 990, 10));

        lbl_informaciondela1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        lbl_informaciondela1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_informaciondela1.setText("Información de la empresa perteneciente");
        P_fondo1.add(lbl_informaciondela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Labor en la empresa:");
        P_fondo1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 30));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Clave de cuenta:");
        P_fondo1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, 30));

        jScrollPane2.setViewportView(txt_nombre);

        P_fondo1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, -1));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombres:");
        P_fondo1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jScrollPane3.setViewportView(txt_apellido);

        P_fondo1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 210, -1));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellidos:");
        P_fondo1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jScrollPane4.setViewportView(txt_email);

        P_fondo1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 210, -1));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email:");
        P_fondo1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jScrollPane5.setViewportView(txt_labor);

        P_fondo1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, -1));
        P_fondo1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 990, 10));

        jScrollPane6.setViewportView(txt_nEmpresa);

        P_fondo1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 210, -1));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre de la empresa:");
        P_fondo1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, 20));

        jScrollPane7.setViewportView(txt_ubiEmp);

        P_fondo1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 290, -1));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ubicación:");
        P_fondo1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, 20));

        jScrollPane8.setViewportView(txt_telefono);

        P_fondo1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 290, -1));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contacto:");
        P_fondo1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, 20));

        jScrollPane9.setViewportView(txt_emailEmp);

        P_fondo1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 290, -1));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email:");
        P_fondo1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, 20));

        jScrollPane10.setViewportView(txt_descripcion);

        P_fondo1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 290, -1));
        P_fondo1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 990, 10));

        lbl_informaciondela4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        lbl_informaciondela4.setForeground(new java.awt.Color(0, 0, 0));
        lbl_informaciondela4.setText("Información de la persona gestora de la cuenta");
        P_fondo1.add(lbl_informaciondela4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nro. cédula:");
        P_fondo1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        Panel_registrar.setBackground(new java.awt.Color(1, 53, 103));
        Panel_registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_guardar.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lbl_guardar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_guardar.setText("Guardar");
        lbl_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_guardarMouseExited(evt);
            }
        });
        Panel_registrar.add(lbl_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        P_fondo1.add(Panel_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, 30));

        lbl_comentario1.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lbl_comentario1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_comentario1.setText("Aquí podrás editar alguna información personal que te hayas equivocado al registrar tu cuenta.");
        P_fondo1.add(lbl_comentario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_recibeced.setEditable(false);
        P_fondo1.add(txt_recibeced, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 30));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripción:");
        P_fondo1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, 20));

        txt_clave.setEditable(false);
        P_fondo1.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 180, -1));

        P_fondo.add(P_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 520));

        getContentPane().add(P_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseExited
        Panel_registrar.setBackground(new Color(1, 53, 103));
    }//GEN-LAST:event_lbl_guardarMouseExited

    private void lbl_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseEntered
        Panel_registrar.setBackground(new Color(27, 107, 184));
    }//GEN-LAST:event_lbl_guardarMouseEntered

    private void lbl_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseClicked
        this.Modificar();
    }//GEN-LAST:event_lbl_guardarMouseClicked

    private void P_headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_headMousePressed
         xMouse = evt.getX();
        yMouse = evt.getY();       
    }//GEN-LAST:event_P_headMousePressed

    private void P_headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);    
    }//GEN-LAST:event_P_headMouseDragged

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
            java.util.logging.Logger.getLogger(P_modificaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P_modificaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P_modificaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P_modificaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P_modificaEmpleador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_fondo;
    private javax.swing.JPanel P_fondo1;
    private javax.swing.JPanel P_head;
    private javax.swing.JPanel Panel_registrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_comentario1;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_informaciondela1;
    private javax.swing.JLabel lbl_informaciondela4;
    private javax.swing.JLabel lbl_logo1;
    private javax.swing.JLabel lbl_registrodeempleador;
    private javax.swing.JTextPane txt_apellido;
    private javax.swing.JPasswordField txt_clave;
    private javax.swing.JTextPane txt_descripcion;
    private javax.swing.JTextPane txt_email;
    private javax.swing.JTextPane txt_emailEmp;
    private javax.swing.JTextPane txt_labor;
    private javax.swing.JTextPane txt_nEmpresa;
    private javax.swing.JTextPane txt_nombre;
    public static javax.swing.JTextField txt_recibeced;
    private javax.swing.JTextPane txt_telefono;
    private javax.swing.JTextPane txt_ubiEmp;
    // End of variables declaration//GEN-END:variables
 
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    
    private void Visualizar() {
    
    // Apartado para visualizar
    int ced = Integer.parseInt(txt_recibeced.getText());//envio automatico de la cedula

    try{

        CallableStatement visualizar = (CallableStatement) cn.prepareCall("{CALL sp_mostrarEmpleador(?)}");
        visualizar.setInt(1, ced);

        ResultSet rs = visualizar.executeQuery();

        if(rs.next()) {
            txt_nombre.setText(rs.getString("emp_nombres"));
            txt_apellido.setText(rs.getString("emp_apellidos"));
            txt_email.setText(rs.getString("emp_correo"));
            txt_labor.setText(rs.getString("emp_laboCum"));
            txt_nEmpresa.setText(rs.getString("emp_nomEmpresa"));
            txt_ubiEmp.setText(rs.getString("emp_ubiEmpresa"));
            txt_telefono.setText(String.valueOf(rs.getInt("emp_telEmpresa")));
            txt_emailEmp.setText(rs.getString("emp_correoEmpresa"));
            txt_descripcion.setText(rs.getString("emp_desEmpresa"));
            txt_clave.setText(rs.getString("emp_clave"));
        }else{
            JOptionPane.showMessageDialog(this, "No se encontraron datos para la cédula ingresada.");
        }
        cn.close();
        
    }catch (SQLException e) {
        // Si se produce un error en la consulta, mostrar el mensaje de error correspondiente
        JOptionPane.showMessageDialog(this, "Error al obtener los datos: " + e.getMessage());
        }    
    }
    
    private void Modificar() {
    
        Empleador_j empleador = new Empleador_j();
        Ctrl_Empleador_j controlE = new Ctrl_Empleador_j();
        
        if(!txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_descripcion.getText().isEmpty() && !txt_email.getText().isEmpty() && !txt_emailEmp.getText().isEmpty() && !txt_labor.getText().isEmpty() &&
           !txt_nEmpresa.getText().isEmpty() && !txt_recibeced.getText().isEmpty() && !txt_telefono.getText().isEmpty() && !txt_ubiEmp.getText().isEmpty()) {
            
                empleador.setEmp_ced(Integer.parseInt(txt_recibeced.getText()));
                empleador.setEmp_nombre(txt_nombre.getText().trim());
                empleador.setEmp_apellido(txt_apellido.getText().trim());
                empleador.setEmp_correo(txt_email.getText().trim());
                empleador.setEmp_nomEmp(txt_nEmpresa.getText());
                empleador.setEmp_laboCum(txt_labor.getText().trim());
                empleador.setEmp_ubiEmp(txt_ubiEmp.getText().trim());
                empleador.setEmp_telfEmp(Integer.parseInt(txt_telefono.getText().trim()));
                empleador.setEmp_corrEmp(txt_emailEmp.getText().trim());
                empleador.setEmp_desEmp(txt_descripcion.getText().trim());
                empleador.setEmp_clave(String.valueOf(txt_clave.getPassword()));
                

            if (controlE.ModificarEmpleador(empleador)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");
                
                //Limpiar los campos
                txt_apellido.setText("");
                txt_descripcion.setText("");
                txt_email.setText("");
                txt_emailEmp.setText("");
                txt_labor.setText("");
                txt_nEmpresa.setText("");
                txt_nombre.setText("");
                txt_telefono.setText("");
                txt_ubiEmp.setText("");
                txt_clave.setText("");
                
            }else {
                JOptionPane.showMessageDialog(null, "Error de modificacion");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No deje ningún campo vacío");
        }
    
    }
}

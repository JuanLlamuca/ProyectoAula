package vistas_empleador;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Empleador_j;
import controlador.Ctrl_Empleador_j;


public class P_creaEmpleador extends javax.swing.JFrame {

  
    public P_creaEmpleador() {
        initComponents();
    }

        int xMouse, yMouse;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_fondo = new javax.swing.JPanel();
        P_barraopciones = new javax.swing.JPanel();
        P_salir = new javax.swing.JPanel();
        lbl_salir = new javax.swing.JLabel();
        P_head = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_registrodeempleador = new javax.swing.JLabel();
        lbl_logo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_comentario = new javax.swing.JLabel();
        lbl_informaciondela = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_cedula = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_nombre = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_apellido = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_correo = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_labor = new javax.swing.JTextPane();
        lbl_informaciondela1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_nombreEmpresa = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_ubicacion = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt_contacto = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt_correoEmp = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextPane();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_informaciondela2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane11 = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        txt_validaclave = new javax.swing.JPasswordField();
        Panel_registrar = new javax.swing.JPanel();
        lbl_guardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_fondo.setBackground(new java.awt.Color(253, 253, 253));
        P_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_barraopciones.setBackground(new java.awt.Color(225, 227, 229));
        P_barraopciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_barraopcionesMouseDragged(evt);
            }
        });
        P_barraopciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_barraopcionesMousePressed(evt);
            }
        });
        P_barraopciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_salir.setBackground(new java.awt.Color(225, 227, 229));
        P_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_salir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl_salir.setForeground(new java.awt.Color(0, 0, 0));
        lbl_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_salir.setText("X");
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_salirMouseExited(evt);
            }
        });
        P_salir.add(lbl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        P_barraopciones.add(P_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, -1));

        P_fondo.add(P_barraopciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 20));

        P_head.setBackground(new java.awt.Color(1, 53, 103));
        P_head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P_head.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        lbl_registrodeempleador.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        lbl_registrodeempleador.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrodeempleador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_registrodeempleador.setText("Registro de empleador");
        P_head.add(lbl_registrodeempleador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 60));

        lbl_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo tercero negativo.png"))); // NOI18N
        P_head.add(lbl_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        P_fondo.add(P_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 990, 60));
        P_fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 990, 10));

        lbl_comentario.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lbl_comentario.setForeground(new java.awt.Color(0, 0, 0));
        lbl_comentario.setText("En esta área podrá crear una cuenta tipo empleador para poder publicar sus ofertas laborales.");
        P_fondo.add(lbl_comentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 560, 20));

        lbl_informaciondela.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        lbl_informaciondela.setForeground(new java.awt.Color(0, 0, 0));
        lbl_informaciondela.setText("Información de la empresa perteneciente");
        P_fondo.add(lbl_informaciondela, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Labor en la empresa:");
        P_fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 30));

        jScrollPane1.setViewportView(txt_cedula);

        P_fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 180, -1));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripción:");
        P_fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, 20));

        jScrollPane2.setViewportView(txt_nombre);

        P_fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, -1));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombres:");
        P_fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jScrollPane3.setViewportView(txt_apellido);

        P_fondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 210, -1));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellidos:");
        P_fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jScrollPane4.setViewportView(txt_correo);

        P_fondo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 210, -1));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email:");
        P_fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jScrollPane5.setViewportView(txt_labor);

        P_fondo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, -1));

        lbl_informaciondela1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        lbl_informaciondela1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_informaciondela1.setText("Información de acceso a la cuenta");
        P_fondo.add(lbl_informaciondela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));
        P_fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 990, 10));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Repita la clave:");
        P_fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, 30));

        jScrollPane6.setViewportView(txt_nombreEmpresa);

        P_fondo.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 210, -1));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre de la empresa:");
        P_fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 20));

        jScrollPane7.setViewportView(txt_ubicacion);

        P_fondo.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 290, -1));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ubicación:");
        P_fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, 20));

        jScrollPane8.setViewportView(txt_contacto);

        P_fondo.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 240, -1));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contacto:");
        P_fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, 20));

        jScrollPane9.setViewportView(txt_correoEmp);

        P_fondo.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 240, -1));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email:");
        P_fondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, 20));

        jScrollPane10.setViewportView(txt_descripcion);

        P_fondo.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 290, -1));
        P_fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 990, 10));

        lbl_informaciondela2.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        lbl_informaciondela2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_informaciondela2.setText("Información de la persona gestora de la cuenta");
        P_fondo.add(lbl_informaciondela2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nro. cédula:");
        P_fondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextPane11.setEditable(false);
        jTextPane11.setText("Su usuario será el nro. cédula con el que se registró");
        jScrollPane11.setViewportView(jTextPane11);

        P_fondo.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 310, -1));

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usuario:");
        P_fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));
        P_fondo.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 190, -1));

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cree la clave:");
        P_fondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, 30));
        P_fondo.add(txt_validaclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 190, -1));

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

        P_fondo.add(Panel_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, 30));

        getContentPane().add(P_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void lbl_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseEntered
        // TODO add your handling code here:
        P_salir.setBackground(Color.red);
        lbl_salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_salirMouseEntered

    private void lbl_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseExited
        // TODO add your handling code here:
        P_salir.setBackground(new Color(225, 227, 229));
        lbl_salir.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_salirMouseExited

    private void P_barraopcionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_barraopcionesMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_P_barraopcionesMouseDragged

    private void P_barraopcionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_barraopcionesMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_barraopcionesMousePressed

    private void lbl_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseClicked
        // TODO add your handling code here:
        //Metodos
        insertar();
    }//GEN-LAST:event_lbl_guardarMouseClicked

    private void lbl_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseEntered
        // TODO add your handling code here:
        Panel_registrar.setBackground(new Color(27, 107, 184));
    }//GEN-LAST:event_lbl_guardarMouseEntered

    private void lbl_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseExited
        // TODO add your handling code here:
        Panel_registrar.setBackground(new Color(1, 53, 103));
    }//GEN-LAST:event_lbl_guardarMouseExited

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
            java.util.logging.Logger.getLogger(P_creaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P_creaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P_creaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P_creaEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P_creaEmpleador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_barraopciones;
    private javax.swing.JPanel P_fondo;
    private javax.swing.JPanel P_head;
    private javax.swing.JPanel P_salir;
    private javax.swing.JPanel Panel_registrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
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
    private javax.swing.JTextPane jTextPane11;
    private javax.swing.JLabel lbl_comentario;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_informaciondela;
    private javax.swing.JLabel lbl_informaciondela1;
    private javax.swing.JLabel lbl_informaciondela2;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_logo1;
    private javax.swing.JLabel lbl_registrodeempleador;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JTextPane txt_apellido;
    private javax.swing.JTextPane txt_cedula;
    private javax.swing.JPasswordField txt_clave;
    private javax.swing.JTextPane txt_contacto;
    private javax.swing.JTextPane txt_correo;
    private javax.swing.JTextPane txt_correoEmp;
    private javax.swing.JTextPane txt_descripcion;
    private javax.swing.JTextPane txt_labor;
    private javax.swing.JTextPane txt_nombre;
    private javax.swing.JTextPane txt_nombreEmpresa;
    private javax.swing.JTextPane txt_ubicacion;
    private javax.swing.JPasswordField txt_validaclave;
    // End of variables declaration//GEN-END:variables

    public void insertar() {
        Empleador_j empleador = new Empleador_j();
        Ctrl_Empleador_j controlEmpleador = new Ctrl_Empleador_j();

        if (!txt_cedula.getText().isEmpty() && !txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_correo.getText().isEmpty()
                && !txt_nombreEmpresa.getText().isEmpty() && !txt_labor.getText().isEmpty() && !txt_ubicacion.getText().isEmpty() && !txt_contacto.getText().isEmpty()
                && !txt_correoEmp.getText().isEmpty() && !txt_descripcion.getText().isEmpty() && !String.valueOf(txt_clave.getPassword()).isEmpty() && !String.valueOf(txt_validaclave.getPassword()).isEmpty()) {
            
            if(txt_clave.getText().equals(txt_validaclave.getText())) {
                
                empleador.setEmp_ced(Integer.parseInt(txt_cedula.getText()));
                empleador.setEmp_nombre(txt_nombre.getText().trim());
                empleador.setEmp_apellido(txt_apellido.getText().trim());
                empleador.setEmp_correo(txt_correo.getText().trim());
                empleador.setEmp_nomEmp(txt_nombreEmpresa.getText());
                empleador.setEmp_laboCum(txt_labor.getText().trim());
                empleador.setEmp_ubiEmp(txt_ubicacion.getText().trim());
                empleador.setEmp_telfEmp(Integer.parseInt(txt_contacto.getText().trim()));
                empleador.setEmp_corrEmp(txt_correoEmp.getText().trim());
                empleador.setEmp_desEmp(txt_descripcion.getText().trim());
                empleador.setEmp_clave(String.valueOf(txt_clave.getPassword()).trim());
                
                if (controlEmpleador.InsertarEmpleador(empleador)) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    
                    //Limpiar los campos
                    
                    txt_cedula.setText("");
                    txt_nombre.setText("");
                    txt_apellido.setText("");
                    txt_correo.setText("");
                    txt_nombreEmpresa.setText("");
                    txt_labor.setText("");
                    txt_ubicacion.setText("");
                    txt_contacto.setText("");
                    txt_correoEmp.setText("");
                    txt_descripcion.setText("");
                    txt_clave.setText("");
                    txt_validaclave.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Error de registro de usuario");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos en los campos");
        }
        
    }
}

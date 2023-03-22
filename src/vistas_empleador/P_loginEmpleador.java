package vistas_empleador;

import controlador.Ctrl_Empleador_j;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Empleador_j;

public class P_loginEmpleador extends javax.swing.JFrame {
         
    public static String cedula ="0"; //La variable tipo static que se envía a cualquier Jframe la información
    
    int xMouse, yMouse;
    
    public P_loginEmpleador() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_fondo = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_iniciodesesion = new javax.swing.JLabel();
        lbl_clave = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        obten_clave = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        p_barraOpciones = new javax.swing.JPanel();
        Panel_salir = new javax.swing.JPanel();
        lbl_salir = new javax.swing.JLabel();
        lbl_Logo_imagen = new javax.swing.JLabel();
        lbl_logo2 = new javax.swing.JLabel();
        lbl_imagen = new javax.swing.JLabel();
        P_Alerta = new javax.swing.JPanel();
        lbl_alerta = new javax.swing.JLabel();
        obten_user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_fondo.setBackground(new java.awt.Color(253, 253, 253));
        Panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo principal.png"))); // NOI18N
        Panel_fondo.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 110));

        lbl_iniciodesesion.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        lbl_iniciodesesion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_iniciodesesion.setText("Inicio de sesión");
        Panel_fondo.add(lbl_iniciodesesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 50));

        lbl_clave.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lbl_clave.setForeground(new java.awt.Color(0, 0, 0));
        lbl_clave.setText("Clave:");
        Panel_fondo.add(lbl_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(0, 0, 0));
        lbl_usuario.setText("Usuario:");
        Panel_fondo.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        obten_clave.setBackground(new java.awt.Color(255, 255, 255));
        obten_clave.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        obten_clave.setForeground(new java.awt.Color(0, 0, 0));
        obten_clave.setBorder(null);
        Panel_fondo.add(obten_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 390, 30));

        btn_entrar.setBackground(new java.awt.Color(27, 107, 184));
        btn_entrar.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setText("ENTRAR");
        btn_entrar.setBorder(null);
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_entrarMouseExited(evt);
            }
        });
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        Panel_fondo.add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 390, 40));

        p_barraOpciones.setBackground(new java.awt.Color(225, 227, 229));
        p_barraOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_barraOpciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p_barraOpcionesMouseDragged(evt);
            }
        });
        p_barraOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_barraOpcionesMousePressed(evt);
            }
        });
        p_barraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_salir.setBackground(new java.awt.Color(225, 227, 229));
        Panel_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel_salir.add(lbl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        p_barraOpciones.add(Panel_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, -1));

        Panel_fondo.add(p_barraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 20));

        lbl_Logo_imagen.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        lbl_Logo_imagen.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Logo_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo_imagen.setText("SITIO EMPLEADORES");
        Panel_fondo.add(lbl_Logo_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 350, 80));

        lbl_logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo secundario positivo.png"))); // NOI18N
        Panel_fondo.add(lbl_logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 350, 90));

        lbl_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/imagen ogin.png"))); // NOI18N
        Panel_fondo.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 350, 480));

        P_Alerta.setBackground(new java.awt.Color(255, 255, 255));
        P_Alerta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_alerta.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        lbl_alerta.setForeground(new java.awt.Color(0, 0, 0));
        lbl_alerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P_Alerta.add(lbl_alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        Panel_fondo.add(P_Alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 390, 40));

        obten_user.setBackground(new java.awt.Color(255, 255, 255));
        obten_user.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        obten_user.setForeground(new java.awt.Color(0, 0, 0));
        obten_user.setBorder(null);
        obten_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obten_userActionPerformed(evt);
            }
        });
        Panel_fondo.add(obten_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 390, 30));
        Panel_fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 390, 10));
        Panel_fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 390, 10));

        getContentPane().add(Panel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_barraOpcionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_barraOpcionesMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_p_barraOpcionesMousePressed

    private void p_barraOpcionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_barraOpcionesMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x -xMouse, y -yMouse);
    }//GEN-LAST:event_p_barraOpcionesMouseDragged

    private void lbl_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseExited
        // TODO add your handling code here:
        Panel_salir.setBackground(new Color(225, 227, 229));
        lbl_salir.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_salirMouseExited

    private void lbl_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseEntered
        // TODO add your handling code here:
        Panel_salir.setBackground(Color.red);
        lbl_salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_salirMouseEntered

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void btn_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseExited
        // TODO add your handling code here:
        btn_entrar.setBackground(new Color(27, 107, 184));
        btn_entrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_entrarMouseExited

    private void btn_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseEntered
        // TODO add your handling code here:
        btn_entrar.setBackground(new Color(202, 159, 78));
        btn_entrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_entrarMouseEntered

    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked
        // TODO add your handling code here:
        //programmer();
        this.login();
    }//GEN-LAST:event_btn_entrarMouseClicked

    private void obten_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obten_userActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_obten_userActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(P_loginEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P_loginEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P_loginEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P_loginEmpleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P_loginEmpleador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_Alerta;
    private javax.swing.JPanel Panel_fondo;
    private javax.swing.JPanel Panel_salir;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_Logo_imagen;
    private javax.swing.JLabel lbl_alerta;
    private javax.swing.JLabel lbl_clave;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_iniciodesesion;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_logo2;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPasswordField obten_clave;
    private javax.swing.JTextField obten_user;
    private javax.swing.JPanel p_barraOpciones;
    // End of variables declaration//GEN-END:variables

//Coding space for declare methods that after using
    
    private void login() {
    
    Empleador_j empleador = new Empleador_j();
    Ctrl_Empleador_j controlEmpleador = new Ctrl_Empleador_j();
    
    String pass = String.valueOf(obten_clave.getPassword());
   
    if(!obten_user.getText().isEmpty() && !obten_clave.getText().isEmpty()){
        
        empleador.setEmp_ced(Integer.parseInt(obten_user.getText().trim())); //el .trim elimina espacios al final o inicio de la cadena de texto
        empleador.setEmp_clave(pass.trim());  
        
        if (controlEmpleador.ValidaEmpleador(empleador)){
            
             JOptionPane.showMessageDialog(null, "Sesión iniciada...");
               
             this.setVisible(false);
             //Paso al menú principal
             P_menu m = new P_menu();
             m.setVisible(true);             
        
            //Aquí envío mi cedula al panel de modificar con la cedula registrada y poder VISUALIZAR/Mostrar  
                
                int info = empleador.getEmp_ced();
                cedula = String.valueOf(info);
               
                
            }
        else{
            JOptionPane.showMessageDialog(null, "Error de inicio de sesión");
        }
        }
    else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
    }
}
  
}

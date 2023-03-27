package vistas_empleador;

import java.awt.Color;
import vistas.Login_Administrador;

public class P_bienvenida extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public P_bienvenida() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_fondo = new javax.swing.JPanel();
        Comentario = new javax.swing.JLabel();
        comentarioUno = new javax.swing.JLabel();
        comentarioDos = new javax.swing.JLabel();
        iniciar = new javax.swing.JLabel();
        lbl_log = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        P_Head = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        P_inicio = new javax.swing.JPanel();
        lbl_inciar = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MB_postulante = new javax.swing.JMenu();
        MI_inicio_p = new javax.swing.JMenuItem();
        MB_empleador = new javax.swing.JMenu();
        MI_inicio_e = new javax.swing.JMenuItem();
        MI_registro_e = new javax.swing.JMenuItem();
        MB_informacion = new javax.swing.JMenu();
        MI_informacion = new javax.swing.JMenuItem();
        MI_contacto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_fondo.setBackground(new java.awt.Color(253, 253, 253));
        Panel_fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_fondoMouseDragged(evt);
            }
        });
        Panel_fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_fondoMousePressed(evt);
            }
        });
        Panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Comentario.setFont(new java.awt.Font("Calisto MT", 1, 48)); // NOI18N
        Comentario.setForeground(new java.awt.Color(255, 255, 255));
        Comentario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comentario.setText("Explora Ofertas Laborales");
        Panel_fondo.add(Comentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 580, 70));

        comentarioUno.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        comentarioUno.setForeground(new java.awt.Color(255, 255, 255));
        comentarioUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comentarioUno.setText("Conecta directamente con empleadores que requieren profesionales por medio de ");
        Panel_fondo.add(comentarioUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 840, 30));

        comentarioDos.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        comentarioDos.setForeground(new java.awt.Color(255, 255, 255));
        comentarioDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comentarioDos.setText("la Bolsa de Empleo del Instituto Superior Tecnológico 17 de Julio.");
        Panel_fondo.add(comentarioDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 700, -1));

        iniciar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciar.setText("Explorar");
        iniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarMouseExited(evt);
            }
        });
        Panel_fondo.add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 90, 40));

        lbl_log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo_grande.png"))); // NOI18N
        Panel_fondo.add(lbl_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, 340, 240));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Bienvenidaa.png"))); // NOI18N
        Panel_fondo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 1280, 510));

        P_Head.setBackground(new java.awt.Color(225, 227, 229));
        P_Head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_HeadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_HeadMouseExited(evt);
            }
        });
        P_Head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo tercero positivo.png"))); // NOI18N
        P_Head.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 70));

        P_inicio.setBackground(new java.awt.Color(225, 227, 229));
        P_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_inciar.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lbl_inciar.setForeground(new java.awt.Color(0, 0, 0));
        lbl_inciar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_inciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/candadoo.png"))); // NOI18N
        lbl_inciar.setText("Admin: Iniciar Sesión");
        lbl_inciar.setBorder(null);
        lbl_inciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_inciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_inciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_inciarMouseExited(evt);
            }
        });
        P_inicio.add(lbl_inciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        P_Head.add(P_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 160, 30));

        Panel_fondo.add(P_Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 70));

        getContentPane().add(Panel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 680));

        MenuBar.setBackground(new java.awt.Color(225, 227, 229));
        MenuBar.setBorder(null);
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuBarMouseDragged(evt);
            }
        });
        MenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuBarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuBarMousePressed(evt);
            }
        });

        MB_postulante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/MenuUnoo-removebg-preview.png"))); // NOI18N
        MB_postulante.setText("Para postulantes");
        MB_postulante.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MB_postulante.setPreferredSize(new java.awt.Dimension(150, 35));
        MB_postulante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MB_postulanteMouseEntered(evt);
            }
        });

        MI_inicio_p.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MI_inicio_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/login-removebg-preview.png"))); // NOI18N
        MI_inicio_p.setText("Iniciar Sesion");
        MI_inicio_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_inicio_pActionPerformed(evt);
            }
        });
        MB_postulante.add(MI_inicio_p);

        MenuBar.add(MB_postulante);

        MB_empleador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/MenuDoss-removebg-preview.png"))); // NOI18N
        MB_empleador.setText("Para empleadores");
        MB_empleador.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MB_empleador.setPreferredSize(new java.awt.Dimension(150, 35));
        MB_empleador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MB_empleadorMouseEntered(evt);
            }
        });

        MI_inicio_e.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MI_inicio_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/login-removebg-preview.png"))); // NOI18N
        MI_inicio_e.setText("Iniciar Sesion");
        MI_inicio_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_inicio_eActionPerformed(evt);
            }
        });
        MB_empleador.add(MI_inicio_e);

        MI_registro_e.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MI_registro_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/registrarse-removebg-preview.png"))); // NOI18N
        MI_registro_e.setText("Registrarse");
        MI_registro_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_registro_eActionPerformed(evt);
            }
        });
        MB_empleador.add(MI_registro_e);

        MenuBar.add(MB_empleador);

        MB_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/MenuTress-removebg-preview.png"))); // NOI18N
        MB_informacion.setText("Información");
        MB_informacion.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MB_informacion.setPreferredSize(new java.awt.Dimension(150, 35));

        MI_informacion.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MI_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Acerca-removebg-preview.png"))); // NOI18N
        MI_informacion.setText("Acerca del sistema");
        MB_informacion.add(MI_informacion);

        MI_contacto.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        MI_contacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Contacto-removebg-preview.png"))); // NOI18N
        MI_contacto.setText("Contacto");
        MI_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_contactoActionPerformed(evt);
            }
        });
        MB_informacion.add(MI_contacto);

        MenuBar.add(MB_informacion);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_fondoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_fondoMousePressed

    private void Panel_fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_fondoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_fondoMouseDragged

    private void iniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseEntered
        // TODO add your handling code here:
        iniciar.setForeground(Color.BLACK);
        iniciar.setBackground(Color.BLACK);
    }//GEN-LAST:event_iniciarMouseEntered

    private void iniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseExited
        // TODO add your handling code here:
        iniciar.setForeground(Color.WHITE);
        iniciar.setBackground(Color.WHITE);
    }//GEN-LAST:event_iniciarMouseExited

    private void iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarMouseClicked

    private void MenuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MenuBarMousePressed

    private void MenuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x -xMouse, y -yMouse);
    }//GEN-LAST:event_MenuBarMouseDragged

    private void MenuBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMouseEntered
    }//GEN-LAST:event_MenuBarMouseEntered

    private void P_HeadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_HeadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_P_HeadMouseEntered

    private void P_HeadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_HeadMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_P_HeadMouseExited

    private void lbl_inciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inciarMouseEntered
        // TODO add your handling code here:
        P_inicio.setBackground(new Color(253, 253, 253));
    }//GEN-LAST:event_lbl_inciarMouseEntered

    private void lbl_inciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inciarMouseExited
        // TODO add your handling code here:
        P_inicio.setBackground(new Color(225, 227, 229));
    }//GEN-LAST:event_lbl_inciarMouseExited

    private void lbl_inciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inciarMouseClicked
        // TODO add your handling code here:
        P_inicio.setBackground(new Color(27, 107, 184));
        //Conectar al login administrador
        Login_Administrador adm = new Login_Administrador();
        adm.setVisible(true);
    }//GEN-LAST:event_lbl_inciarMouseClicked

    private void MB_postulanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MB_postulanteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MB_postulanteMouseEntered

    private void MB_empleadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MB_empleadorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MB_empleadorMouseEntered

    private void MI_registro_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_registro_eActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        P_creaEmpleador e = new P_creaEmpleador();
        e.setVisible(true);
    }//GEN-LAST:event_MI_registro_eActionPerformed

    private void MI_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_contactoActionPerformed

    private void MI_inicio_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_inicio_eActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        P_loginEmpleador e = new P_loginEmpleador();
        e.setVisible(true);
    }//GEN-LAST:event_MI_inicio_eActionPerformed

    private void MI_inicio_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_inicio_pActionPerformed
        // TODO add your handling code here:
        JF_loginPostulante post = new JF_loginPostulante();
        post.setVisible(true);
    }//GEN-LAST:event_MI_inicio_pActionPerformed

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
            java.util.logging.Logger.getLogger(P_bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P_bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P_bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P_bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P_bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Comentario;
    private javax.swing.JMenu MB_empleador;
    private javax.swing.JMenu MB_informacion;
    private javax.swing.JMenu MB_postulante;
    private javax.swing.JMenuItem MI_contacto;
    private javax.swing.JMenuItem MI_informacion;
    private javax.swing.JMenuItem MI_inicio_e;
    private javax.swing.JMenuItem MI_inicio_p;
    private javax.swing.JMenuItem MI_registro_e;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel P_Head;
    private javax.swing.JPanel P_inicio;
    private javax.swing.JPanel Panel_fondo;
    private javax.swing.JLabel comentarioDos;
    private javax.swing.JLabel comentarioUno;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel iniciar;
    private javax.swing.JLabel lbl_inciar;
    private javax.swing.JLabel lbl_log;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}

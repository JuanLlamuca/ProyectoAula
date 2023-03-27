/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import vistas_empleador.JF_loginPostulante;
import vistas_empleador.P_loginEmpleador;

/**
 *
 * @author juanl
 */
public class Vis_Postulante extends javax.swing.JFrame {

    /**
     * Creates new form Postulante
     */
    public Vis_Postulante() {
        initComponents();
        this.setLocationRelativeTo(null);
        lbl_recibeced.setText(JF_loginPostulante.cedula);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_crearHoja = new javax.swing.JButton();
        btn_postular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_recibeced = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 53, 103));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido al Sistema de Bolsa de Emplos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel2)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 0, 1270, 80));

        jPanel2.setBackground(new java.awt.Color(1, 53, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_crearHoja.setBackground(new java.awt.Color(225, 229, 227));
        btn_crearHoja.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        btn_crearHoja.setForeground(new java.awt.Color(0, 0, 0));
        btn_crearHoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearhojavida.png"))); // NOI18N
        btn_crearHoja.setText("Crear hoja de vida");
        btn_crearHoja.setBorder(null);
        btn_crearHoja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_crearHoja.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_crearHoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearHojaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_crearHoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 55));

        btn_postular.setBackground(new java.awt.Color(225, 227, 229));
        btn_postular.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        btn_postular.setForeground(new java.awt.Color(0, 0, 0));
        btn_postular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/postularempleos.png"))); // NOI18N
        btn_postular.setText("Postular empleos.");
        btn_postular.setBorder(null);
        btn_postular.setMinimumSize(new java.awt.Dimension(12, 23));
        btn_postular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_postularActionPerformed(evt);
            }
        });
        jPanel2.add(btn_postular, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 310, 300, 55));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 60));

        jButton1.setBackground(new java.awt.Color(225, 227, 229));
        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-clipboard-approve-50.png"))); // NOI18N
        jButton1.setText("Visualizar postulaciones");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 380, 270, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_miniatura_negativo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 110));

        lbl_recibeced.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lbl_recibeced.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_recibeced, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 220, 890));

        contenedor.setBackground(new java.awt.Color(225, 227, 229));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BOLSA DE EMPLEOS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_grande.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel4))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(488, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 1260, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearHojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearHojaActionPerformed
        // TODO add your handling code here:
        ////hoja.setVisible(true);
        CrearHojadeVida hoja = new CrearHojadeVida();
        hoja.setSize(1260, 810);
        hoja.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(hoja, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btn_crearHojaActionPerformed

    private void btn_postularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_postularActionPerformed
        // TODO add your handling code here:
        ofertasPostulante oferta = new ofertasPostulante();
        oferta.setSize(1260, 810);
        oferta.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(oferta, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btn_postularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VisualizarPostulaciones postulaciones = new VisualizarPostulaciones();
        postulaciones.setSize(1260, 810);
        postulaciones.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(postulaciones, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vis_Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vis_Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vis_Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vis_Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vis_Postulante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearHoja;
    private javax.swing.JButton btn_postular;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_recibeced;
    // End of variables declaration//GEN-END:variables

}

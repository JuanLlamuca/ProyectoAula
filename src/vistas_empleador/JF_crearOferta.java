/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas_empleador;

import java.text.SimpleDateFormat;

/**
 *
 * @author Josue
 */
public class JF_crearOferta extends javax.swing.JFrame {

    /**
     * Creates new form JF_crearOferta
     */
    public JF_crearOferta() {
        initComponents();
        setLocationRelativeTo(null);
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
        P_head = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_comentario1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_titulo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        box_area = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ubi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_conocimientos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        box_jornada = new javax.swing.JComboBox<>();
        P_guardar = new javax.swing.JPanel();
        lbl_guardar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_recibenom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_finicio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        C_calendario = new com.toedter.calendar.JCalendar();
        txt_fechaFin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_head.setBackground(new java.awt.Color(1, 53, 103));
        P_head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo secundario negativo.png"))); // NOI18N
        P_head.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 80));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear oferta");
        P_head.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 220, 80));

        jPanel1.add(P_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        lbl_comentario1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        lbl_comentario1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_comentario1.setText("Espacio para crear la oferta que deseas ofertar a los postulantes");
        jPanel1.add(lbl_comentario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ubicación:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 30));

        box_titulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Selecccione)", "TERCER NIVEL" }));
        box_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_tituloActionPerformed(evt);
            }
        });
        jPanel1.add(box_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 30));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Información de la oferta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1010, 10));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre de la empresa:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        box_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "....", "Item 3", "Item 4" }));
        jPanel1.add(box_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 30));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Área requerida:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 30));
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 790, -1));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripción de oferta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));
        jPanel1.add(txt_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 80, -1));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jornada:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 60, 30));
        jPanel1.add(txt_ubi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 290, -1));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Conocimientos requeridos:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, 30));
        jPanel1.add(txt_conocimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 390, -1));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha finalización:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 120, 30));

        box_jornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "Medio Tiempo", "Tiempo Completo" }));
        jPanel1.add(box_jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 180, 30));

        P_guardar.setBackground(new java.awt.Color(1, 53, 103));
        P_guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_guardar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lbl_guardar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/icons8-guardar-40.png"))); // NOI18N
        lbl_guardar.setText("Crear");
        P_guardar.add(lbl_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanel1.add(P_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 130, 30));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Título requerido:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        txt_recibenom.setEditable(false);
        jPanel1.add(txt_recibenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 180, -1));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Salario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 60, 30));

        txt_finicio.setEditable(false);
        jPanel1.add(txt_finicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 120, -1));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha publicación:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 120, 30));

        C_calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                C_calendarioPropertyChange(evt);
            }
        });
        jPanel1.add(C_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, 190));

        txt_fechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaFinActionPerformed(evt);
            }
        });
        jPanel1.add(txt_fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_tituloActionPerformed

    private void txt_fechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaFinActionPerformed

    private void C_calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_C_calendarioPropertyChange
        if (evt.getOldValue() != null) {
            SimpleDateFormat ff = new SimpleDateFormat("yyyy/MM/dd");
            txt_fechaFin.setText(ff.format(C_calendario.getCalendar().getTime()));
        }
        
    }//GEN-LAST:event_C_calendarioPropertyChange

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
            java.util.logging.Logger.getLogger(JF_crearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_crearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_crearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_crearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_crearOferta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar C_calendario;
    private javax.swing.JPanel P_guardar;
    private javax.swing.JPanel P_head;
    private javax.swing.JComboBox<String> box_area;
    private javax.swing.JComboBox<String> box_jornada;
    private javax.swing.JComboBox<String> box_titulo;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_comentario1;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JTextField txt_conocimientos;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_fechaFin;
    private javax.swing.JTextField txt_finicio;
    private javax.swing.JTextField txt_recibenom;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_ubi;
    // End of variables declaration//GEN-END:variables
}

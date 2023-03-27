package vistas_empleador;

import com.mysql.jdbc.CallableStatement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JF_ofertaPostulantes extends javax.swing.JFrame {

    public JF_ofertaPostulantes() {
        initComponents();
        this.setLocationRelativeTo(null);
        //traido el id de oferta
        txt_id_oferta.setText(JF_mostrarOfertas.codigo);
        //metodo para visualizar postulantes
        this.Visualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_fondo = new javax.swing.JPanel();
        P_head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_postulantes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_id_oferta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_fondo.setBackground(new java.awt.Color(225, 227, 229));
        P_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_head.setBackground(new java.awt.Color(255, 255, 255));
        P_head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de Postulantes");
        P_head.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        P_fondo.add(P_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 100));

        table_postulantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cedula", "Apellido/s", "Nombre/s", "Fecha de postulacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_postulantes);

        P_fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 570));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Oferta Nro.");
        P_fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 90, 30));

        txt_id_oferta.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        txt_id_oferta.setForeground(new java.awt.Color(0, 0, 0));
        P_fondo.add(txt_id_oferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 110, 150, 30));

        getContentPane().add(P_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JF_ofertaPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_ofertaPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_ofertaPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_ofertaPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_ofertaPostulantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_fondo;
    private javax.swing.JPanel P_head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_postulantes;
    private javax.swing.JLabel txt_id_oferta;
    // End of variables declaration//GEN-END:variables


    //Conexion
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();

    private void Visualizar(){
        Object[] postulantes = new Object[5];
        DefaultTableModel modelo = (DefaultTableModel) table_postulantes.getModel();
         //cn = mysql.conectar();
            int cod = Integer.parseInt(JF_mostrarOfertas.codigo);
        
        try{
        
            CallableStatement visualizar = (CallableStatement) cn.prepareCall("{CALL mostrarPostulantes(?)}");
            visualizar.setInt(1, cod);
            
            ResultSet rs = visualizar.executeQuery();
            
            while(rs.next()) {
                postulantes[0] = rs.getInt("pi.pcion_id");
                postulantes[1] = rs.getInt("pi.post_cedula");
                postulantes[2] = rs.getString("p.post_apellidos");
                postulantes[3] = rs.getString("p.post_nombres");
                postulantes[4] = rs.getDate("pi.pcion_fePostulacion");
                
                modelo.addRow(postulantes);
            }
            table_postulantes.setModel(modelo);
            //cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en mostrar postulantes " + e);
        }
        
    }
}

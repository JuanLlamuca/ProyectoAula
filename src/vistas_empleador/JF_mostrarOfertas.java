package vistas_empleador;

import com.mysql.jdbc.CallableStatement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JF_mostrarOfertas extends javax.swing.JFrame {
    
    //Para que las filas de la tabla sean automáticas
    
            

    public JF_mostrarOfertas() {
        initComponents();
        setLocationRelativeTo(null);
        this.Visualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        P_fondo = new javax.swing.JPanel();
        P_head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        P_tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_ofertas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_fondo.setBackground(new java.awt.Color(225, 227, 229));
        P_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de Ofertas");
        P_head.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 310, 50));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo secundario positivo.png"))); // NOI18N
        P_head.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

        P_fondo.add(P_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 70));

        P_tabla.setBackground(new java.awt.Color(225, 227, 229));
        P_tabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_ofertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Area necesitada", "Título solicitado", "Descripción", "Ubicación", "Requisitos", "Salario", "Fecha publicación", "Fecha de vencimiento", "Jornada"
            }
        ));
        Table_ofertas.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(Table_ofertas);

        P_tabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 490));

        P_fondo.add(P_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1260, 500));

        jButton1.setBackground(new java.awt.Color(1, 53, 103));
        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        P_fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 70, -1, 30));

        P_fondo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, 200, 30));

        getContentPane().add(P_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 600));

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
            java.util.logging.Logger.getLogger(JF_mostrarOfertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_mostrarOfertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_mostrarOfertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_mostrarOfertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_mostrarOfertas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_fondo;
    private javax.swing.JPanel P_head;
    private javax.swing.JPanel P_tabla;
    private javax.swing.JTable Table_ofertas;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JLabel lbl_logo;
    // End of variables declaration//GEN-END:variables

    //metodos//
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    
    
    private void Visualizar() {
        Object[] ofertas = new Object[9];
        DefaultTableModel modelo = (DefaultTableModel) Table_ofertas.getModel();
    
        int cedula = Integer.parseInt(P_loginEmpleador.cedula);   
        
        try{
        
            CallableStatement visualizar = (CallableStatement) cn.prepareCall("{CALL sp_consultaOfertas(?)}");
            visualizar.setInt(1, cedula);
            
            ResultSet rs = visualizar.executeQuery();
            
            while(rs.next()) {
                ofertas[0] = rs.getString("ofer_areaNec");
                ofertas[1] = rs.getString("ofer_tituloReq");
                ofertas[2] = rs.getString("ofer_descripcion");
                ofertas[3] = rs.getString("ofer_ubicacion");
                ofertas[4] = rs.getString("ofer_requisito");
                ofertas[5] = rs.getDouble("ofer_salario");
                ofertas[6] = rs.getDate("ofer_fePublicacion");
                ofertas[7] = rs.getDate("ofer_fechaFinaliza");
                ofertas[8] = rs.getString("ofer_jornada");
                
                modelo.addRow(ofertas);
            }
            Table_ofertas.setModel(modelo);
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en mostrar ofertas " + e);
        }
    }
}

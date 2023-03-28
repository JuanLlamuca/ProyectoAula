package vistas;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistas_empleador.JF_loginPostulante.cedula;

public class VisualizarPostulaciones extends javax.swing.JPanel {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;

    public VisualizarPostulaciones() {
        initComponents();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ofertas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 227, 229));
        setForeground(new java.awt.Color(225, 227, 229));

        tabla_ofertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo requerido", "Área necesitada", "Descripción", "Ubicación", "Requisitos", "Salario", "Fecha publicación", "Jornada", "Fecha finalización"
            }
        ));
        tabla_ofertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ofertasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ofertas);

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ofertas laborales que aplicaste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(504, 504, 504))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_ofertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ofertasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_ofertasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_ofertas;
    // End of variables declaration//GEN-END:variables

    public void mostrar() {

        try {
              cn = mysql.conectar();
            CallableStatement insertar = cn.prepareCall("{CALL sp_visualizarPostulaciones(?,?)}");
            
         
            insertar.setInt(1,0);
            insertar.setInt(2,Integer.parseInt(cedula));
            ResultSet rs = insertar.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Titulo Requerido");
            modelo.addColumn("Area Necesaria");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Ubicacion");
            modelo.addColumn("Requisitos");
            modelo.addColumn("Salario");
            modelo.addColumn("Fecha de Publicacion");
            modelo.addColumn("Jornada");
   
            modelo.addColumn("Fecha de Finalizacion");

            while (rs.next()) {
                Object[] fila = new Object[9];
              
                fila[0] = rs.getString("ofer_tituloReq");
                fila[1] = rs.getString("ofer_areaNec");
                fila[2] = rs.getString("ofer_descripcion");
                fila[3] = rs.getString("ofer_ubicacion");
                fila[4] = rs.getString("ofer_requisito");
                fila[5] = rs.getString("ofer_salario");
                fila[6] = rs.getString("ofer_fePublicacion");
                fila[7] = rs.getString("ofer_jornada");
                fila[8] = rs.getString("ofer_fechaFinaliza");

                modelo.addRow(fila);
            }

            tabla_ofertas.setModel(modelo);
            insertar.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

}

package vistas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ofertas_postulante extends javax.swing.JFrame {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;

    public Ofertas_postulante() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ofertasLaborales = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_tituloRequerido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_areaNecesitada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JEditorPane();
        jLabel6 = new javax.swing.JLabel();
        txt_ubicacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_requisitos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_fechaPublicacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_jornada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_cedulaEmpleador = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_cantidadVacantes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_fechaFinalizacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ofertas laborales disponibles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(541, 541, 541))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel1.setText("Detalle oferta trabajo");

        tabla_ofertasLaborales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo requerido", "Ubicación", "Requisito", "Salario", "Fecha publicación"
            }
        ));
        tabla_ofertasLaborales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ofertasLaboralesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ofertasLaborales);

        jLabel3.setText("Titulo requerido");

        jLabel4.setText("Área necesitada");

        jLabel5.setText("Descripción");

        jScrollPane2.setViewportView(txt_descripcion);

        jLabel6.setText("Ubicación");

        jLabel7.setText("Requisitos");

        jLabel8.setText("Salario");

        jLabel9.setText("Fecha publicación");

        jLabel10.setText("Jornada");

        jLabel11.setText("Cédula empleador");

        jLabel12.setText("Cantidad de vacantes ");

        jLabel13.setText("Fecha finalización");

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aplicar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel4)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tituloRequerido)
                                    .addComponent(txt_areaNecesitada)
                                    .addComponent(jScrollPane2)
                                    .addComponent(txt_requisitos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(247, 247, 247)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_cantidadVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel10)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel11)))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cedulaEmpleador, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_fechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 250, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_tituloRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_areaNecesitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_requisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_fechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txt_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_cedulaEmpleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_cantidadVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_ofertasLaboralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ofertasLaboralesMouseClicked
        // TODO add your handling code here:
       
        String sql = "select ofer_tituloReq, ofer_areaNec, ofer_descripcion, ofer_ubicacion, ofer_requisito, ofer_salario, ofer_fePublicacion, ofer_jornada, emp_cedula, ofer_solicitud, ofer_fechaFinaliza from oferta_laboral;";

        String titulo;
        String area;
        String descripcion;
        String ubicacion;
        String requisitos;
        String salario;
        String fpublicacion;
        String jornada;
        int cedula;
        String solicitud;
        String fFinaliza;

        try {
            cn = mysql.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                titulo = rs.getString("ofer_tituloReq");
                area = rs.getString("ofer_areaNec");
                descripcion = rs.getString("ofer_descripcion");
                ubicacion = rs.getString("ofer_ubicacion");
                requisitos = rs.getString("ofer_requisito");
                salario = rs.getString("ofer_salario");
                fpublicacion = rs.getString("ofer_fePublicacion");
                jornada = rs.getString("ofer_jornada");
                cedula = rs.getInt("emp_cedula");
                solicitud = rs.getString("ofer_solicitud");
                fFinaliza = rs.getString("ofer_fechaFinaliza");

                txt_tituloRequerido.setText(titulo);
                txt_areaNecesitada.setText(area);
                txt_descripcion.setText(descripcion);
                txt_ubicacion.setText(ubicacion);
                txt_requisitos.setText(requisitos);
                txt_salario.setText(salario);
                txt_fechaPublicacion.setText(fpublicacion);
                txt_jornada.setText(jornada);
                txt_cedulaEmpleador.setText("" + cedula);
                txt_cantidadVacantes.setText(solicitud);
                txt_fechaFinalizacion.setText(fFinaliza);

            }
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error obtener datos_ ofertasPostulantes " + e);
        } 
        
    }//GEN-LAST:event_tabla_ofertasLaboralesMouseClicked

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
            java.util.logging.Logger.getLogger(Ofertas_postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ofertas_postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ofertas_postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ofertas_postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ofertas_postulante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_ofertasLaborales;
    private javax.swing.JTextField txt_areaNecesitada;
    private javax.swing.JTextField txt_cantidadVacantes;
    private javax.swing.JTextField txt_cedulaEmpleador;
    private javax.swing.JEditorPane txt_descripcion;
    private javax.swing.JTextField txt_fechaFinalizacion;
    private javax.swing.JTextField txt_fechaPublicacion;
    private javax.swing.JTextField txt_jornada;
    private javax.swing.JTextField txt_requisitos;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_tituloRequerido;
    private javax.swing.JTextField txt_ubicacion;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla() {
        String sql = "select * from lista_ofertaspostulantes;";
        try {
            cn = mysql.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] ofertas = new Object[5];
            DefaultTableModel modelo = (DefaultTableModel) tabla_ofertasLaborales.getModel();

            modelo = (DefaultTableModel) tabla_ofertasLaborales.getModel();
            while (rs.next()) {
                ofertas[0] = rs.getString("ofer_tituloReq");
                ofertas[1] = rs.getString("ofer_ubicacion");
                ofertas[2] = rs.getString("ofer_requisito");
                ofertas[3] = rs.getString("ofer_salario");
                ofertas[4] = rs.getString("ofer_fePublicacion");
                modelo.addRow(ofertas);
            }
            tabla_ofertasLaborales.setModel(modelo);
            cn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ModifcarCarreras: " + e);
        }
    }

    
    /*
    public void llenarDatos() {
        String sql = "select ofer_tituloReq, ofer_areaNec, ofer_descripcion, ofer_ubicacion, ofer_requisito, ofer_salario, ofer_fePublicacion, ofer_jornada, emp_cedula, ofer_solicitud, ofer_fechaFinaliza from oferta_laboral;";

        String titulo;
        String area;
        String descripcion;
        String ubicacion;
        String requisitos;
        String salario;
        String fpublicacion;
        String jornada;
        int cedula;
        String solicitud;
        String fFinaliza;

        try {
            cn = mysql.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                titulo = rs.getString("ofer_tituloReq");
                area = rs.getString("ofer_areaNec");
                descripcion = rs.getString("ofer_descripcion");
                ubicacion = rs.getString("ofer_ubicacion");
                requisitos = rs.getString("ofer_requisito");
                salario = rs.getString("ofer_salario");
                fpublicacion = rs.getString("ofer_fePublicacion");
                jornada = rs.getString("ofer_jornada");
                cedula = rs.getInt("emp_cedula");
                solicitud = rs.getString("ofer_solicitud");
                fFinaliza = rs.getString("ofer_fechaFinaliza");

                txt_tituloRequerido.setText(titulo);
                txt_areaNecesitada.setText(area);
                txt_descripcion.setText(descripcion);
                txt_ubicacion.setText(ubicacion);
                txt_requisitos.setText(requisitos);
                txt_salario.setText(salario);
                txt_fechaPublicacion.setText(fpublicacion);
                txt_jornada.setText(jornada);
                txt_cedulaEmpleador.setText("" + cedula);
                txt_cantidadVacantes.setText(solicitud);
                txt_fechaFinalizacion.setText(fFinaliza);

            }
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error obtener datos_ ofertasPostulantes " + e);
        }

    }

*/
}

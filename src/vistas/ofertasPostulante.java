/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ofertasPostulante extends javax.swing.JPanel {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;
    public ofertasPostulante() {
        initComponents();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ofertasLaborales = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tituloRequerido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_areaNecesitada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JEditorPane();
        jLabel7 = new javax.swing.JLabel();
        txt_ubicacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_requisitos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_fechaPublicacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_jornada = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_cedulaEmpleador = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_cantidadVacantes = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_fechaFinalizacion = new javax.swing.JTextField();
        btn_aplicar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1260, 810));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ofertas laborales disponibles");

        tabla_ofertasLaborales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo requerido", "Ubicación", "Requisito", "Salario", "Fecha publicación", "Vacantes"
            }
        ));
        tabla_ofertasLaborales.getTableHeader().setReorderingAllowed(false);
        tabla_ofertasLaborales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ofertasLaboralesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ofertasLaborales);

        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Detalle oferta trabajo");

        jLabel4.setText("Titulo requerido");

        jLabel5.setText("Área necesitada");

        jLabel6.setText("Descripción");

        jScrollPane2.setViewportView(txt_descripcion);

        jLabel7.setText("Ubicación");

        jLabel8.setText("Requisitos");

        jLabel9.setText("Salario");

        jLabel10.setText("Fecha publicación");

        jLabel11.setText("Jornada");

        jLabel12.setText("Cédula empleador");

        jLabel13.setText("Cantidad de vacantes ");

        jLabel14.setText("Fecha finalización");

        btn_aplicar.setBackground(new java.awt.Color(0, 51, 255));
        btn_aplicar.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        btn_aplicar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aplicar.setText("Aplicar");
        btn_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicarActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_grande.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_requisitos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cantidadVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_cedulaEmpleador, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_fechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txt_areaNecesitada)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tituloRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(btn_aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84)))
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jLabel2)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(jLabel1)
                            .addGap(154, 154, 154)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(212, 212, 212)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_tituloRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_areaNecesitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_requisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_fechaPublicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_jornada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_cedulaEmpleador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_cantidadVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_ofertasLaboralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ofertasLaboralesMouseClicked
        // TODO add your handling code here:

        String sql = "select * from lista_oferta;";

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

    private void btn_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicarActionPerformed
        // TODO add your handling code here:

        cn = mysql.conectar();
        /*
        try {

            CallableStatement insert = cn.prepareCall("{CALL sp_Postulacion(?, ?)}");
            insert.setInt(1, );
            insert.setString(2, );
            insert.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "TrabajoAplicado");

        } catch (SQLException e) {
            System.out.println("Error Ctrl_carreras" + e);
        }
        */
    }//GEN-LAST:event_btn_aplicarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aplicar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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

            Object[] ofertas = new Object[6];
            DefaultTableModel modelo = (DefaultTableModel) tabla_ofertasLaborales.getModel();

            modelo = (DefaultTableModel) tabla_ofertasLaborales.getModel();
            while (rs.next()) {
                ofertas[0] = rs.getString("ofer_tituloReq");
                ofertas[1] = rs.getString("ofer_ubicacion");
                ofertas[2] = rs.getString("ofer_requisito");
                ofertas[3] = rs.getString("ofer_salario");
                ofertas[4] = rs.getString("ofer_fePublicacion");
                ofertas[5] = rs.getString("ofer_solicitud");
                
                modelo.addRow(ofertas);
            }
            tabla_ofertasLaborales.setModel(modelo);
            cn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ModifcarCarreras: " + e);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistas_empleador.JF_loginPostulante.cedula;

public class ofertasPostulante extends javax.swing.JPanel {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;

    public ofertasPostulante() {
        initComponents();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ofertas = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1260, 810));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ofertas laborales disponibles");

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

        tabla_ofertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Titulo requerido", "Área necesitada", "Descripción", "Ubicación", "Requisitos", "Salario", "Fecha publicación", "Jornada", "Cedula empleador", "Solicitud", "Fecha finalización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_ofertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ofertasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ofertas);
        if (tabla_ofertas.getColumnModel().getColumnCount() > 0) {
            tabla_ofertas.getColumnModel().getColumn(0).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(1).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(2).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(3).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(4).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(5).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(6).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(7).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(8).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(10).setResizable(false);
            tabla_ofertas.getColumnModel().getColumn(11).setResizable(false);
        }

        jLabel16.setText("Número: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_areaNecesitada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(129, 129, 129))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tituloRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_requisitos, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                        .addGap(309, 309, 309)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_fechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cedulaEmpleador, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cantidadVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btn_aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_tituloRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7)))
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_areaNecesitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))))))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_fechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_cedulaEmpleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txt_cantidadVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_requisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicarActionPerformed

       AplicarOferta();
    }//GEN-LAST:event_btn_aplicarActionPerformed

    private void tabla_ofertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ofertasMouseClicked
        // TODO add your handling code here:
        int id;
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

        int fila = tabla_ofertas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecione una fila");
        } else {
            id = Integer.parseInt((String) tabla_ofertas.getValueAt(fila, 0).toString());
            titulo = (String) tabla_ofertas.getValueAt(fila, 1);
            area = (String) tabla_ofertas.getValueAt(fila, 2);
            descripcion = (String) tabla_ofertas.getValueAt(fila, 3);
            ubicacion = (String) tabla_ofertas.getValueAt(fila, 4);
            requisitos = (String) tabla_ofertas.getValueAt(fila, 5);
            salario = (String) tabla_ofertas.getValueAt(fila, 6);
            fpublicacion = (String) tabla_ofertas.getValueAt(fila, 7);
            jornada = (String) tabla_ofertas.getValueAt(fila, 8);
            cedula = Integer.parseInt((String) tabla_ofertas.getValueAt(fila, 9).toString());
            solicitud = (String) tabla_ofertas.getValueAt(fila, 10);
            fFinaliza = (String) tabla_ofertas.getValueAt(fila, 11);

            txt_id.setText(String.valueOf(id));
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
    }//GEN-LAST:event_tabla_ofertasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aplicar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTable tabla_ofertas;
    private javax.swing.JTextField txt_areaNecesitada;
    private javax.swing.JTextField txt_cantidadVacantes;
    private javax.swing.JTextField txt_cedulaEmpleador;
    private javax.swing.JEditorPane txt_descripcion;
    private javax.swing.JTextField txt_fechaFinalizacion;
    private javax.swing.JTextField txt_fechaPublicacion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jornada;
    private javax.swing.JTextField txt_requisitos;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_tituloRequerido;
    private javax.swing.JTextField txt_ubicacion;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla() {
        String sql = "select * from lista_oferta";
        try {
            cn = mysql.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] ofertas = new Object[12];
            DefaultTableModel modelo = (DefaultTableModel) tabla_ofertas.getModel();

            modelo = (DefaultTableModel) tabla_ofertas.getModel();
            while (rs.next()) {
                ofertas[0] = rs.getInt("ofer_id");
                ofertas[1] = rs.getString("ofer_tituloReq");
                ofertas[2] = rs.getString("ofer_areaNec");
                ofertas[3] = rs.getString("ofer_descripcion");
                ofertas[4] = rs.getString("ofer_ubicacion");
                ofertas[5] = rs.getString("ofer_requisito");
                ofertas[6] = rs.getString("ofer_salario");
                ofertas[7] = rs.getString("ofer_fePublicacion");
                ofertas[8] = rs.getString("ofer_jornada");
                ofertas[9] = rs.getInt("emp_cedula");
                ofertas[10] = rs.getString("ofer_solicitud");
                ofertas[11] = rs.getString("ofer_fechaFinaliza");
                modelo.addRow(ofertas);
            }
            tabla_ofertas.setModel(modelo);
            cn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }

    public void AplicarOferta() {
       int numero=Integer.parseInt(txt_id.getText());
       
       
       cn = mysql.conectar();
        try {
            CallableStatement insertar = cn.prepareCall("{CALL sp_Postulacion(?, ?)}");
            insertar.setInt(1,Integer.parseInt(cedula));
            insertar.setInt(2, numero);
            insertar.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Oferta aplicada");
        } catch (SQLException e) {
            System.out.println("Error aplicar "+e);
        }
       
    }

   
}

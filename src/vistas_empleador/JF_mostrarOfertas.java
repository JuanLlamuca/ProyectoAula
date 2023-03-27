package vistas_empleador;

import com.mysql.jdbc.CallableStatement;
import conexion.Conexion;
import controlador.Ctrl_emp_ofertas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.OfertaLaboral_j;


public class JF_mostrarOfertas extends javax.swing.JFrame {
    
    //variable public static
    public static String codigo ="";
    
            

    public JF_mostrarOfertas() {
        initComponents();
        setLocationRelativeTo(null);
        //Para ver reportes
        this.Visualizar();
        //para enviar fecha local
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        txt_finicio.setText(formato.format(fecha));
        //Para traer las carreras al comboBox
        this.Combobox();
        //recibe cedula
        lbl_recibeced.setText(P_loginEmpleador.cedula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        P_fondo = new javax.swing.JPanel();
        P_head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_ofertas = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        C_calendario = new com.toedter.calendar.JCalendar();
        txt_fechaFin = new javax.swing.JTextField();
        txt_finicio = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();
        txt_conocimientos = new javax.swing.JTextField();
        txt_ubi = new javax.swing.JTextField();
        box_area = new javax.swing.JComboBox<>();
        box_titulo1 = new javax.swing.JComboBox<>();
        box_jornada = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lbl_recibeced = new javax.swing.JLabel();
        btn_insertar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextPane();
        lbl_id = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        btn_restablecer = new javax.swing.JButton();
        btn_ver_postulantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_fondo.setBackground(new java.awt.Color(225, 227, 229));
        P_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de Ofertas");
        P_head.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 310, 50));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_j/Logo_miniatura.png"))); // NOI18N
        P_head.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 90));

        P_fondo.add(P_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 90));

        Table_ofertas.setBackground(new java.awt.Color(225, 227, 229));
        Table_ofertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "código", "Area necesitada", "Título solicitado", "Descripción", "Ubicación", "Requisitos", "Salario", "Fecha publicación", "Fecha de vencimiento", "Jornada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_ofertas.setSelectionBackground(new java.awt.Color(0, 102, 204));
        Table_ofertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ofertasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_ofertas);

        P_fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1200, 240));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        P_fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1200, 10));

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Información de la oferta");
        P_fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Título requerido:");
        P_fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Área requerida:");
        P_fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 30));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripción de oferta:");
        P_fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 30));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dirección:");
        P_fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 30));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Conocimientos requeridos:");
        P_fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 180, 30));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Salario:");
        P_fondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 60, 30));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha publicación:");
        P_fondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 120, 30));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fecha finalización:");
        P_fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 130, 30));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jornada:");
        P_fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 60, 30));

        C_calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                C_calendarioPropertyChange(evt);
            }
        });
        P_fondo.add(C_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 320, 170));

        txt_fechaFin.setEditable(false);
        txt_fechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaFinActionPerformed(evt);
            }
        });
        P_fondo.add(txt_fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 130, -1));

        txt_finicio.setEditable(false);
        P_fondo.add(txt_finicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 120, -1));
        P_fondo.add(txt_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 60, -1));
        P_fondo.add(txt_conocimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 390, -1));
        P_fondo.add(txt_ubi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 860, -1));

        box_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        box_area.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                box_areaMouseDragged(evt);
            }
        });
        box_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                box_areaFocusGained(evt);
            }
        });
        box_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_areaMousePressed(evt);
            }
        });
        box_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_areaActionPerformed(evt);
            }
        });
        P_fondo.add(box_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 820, 30));

        box_titulo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccionar)", "TERCER NIVEL" }));
        box_titulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_titulo1ActionPerformed(evt);
            }
        });
        P_fondo.add(box_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 250, 30));

        box_jornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccionar)", "Completa", "Parcial", "Flexible", "Nocturna", "Rotativa", "Turnos fijos", "Distancia-Remoto", "Por proyecto", " " }));
        P_fondo.add(box_jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 240, 30));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("0.00$");
        P_fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 50, 30));

        lbl_recibeced.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        lbl_recibeced.setForeground(new java.awt.Color(0, 0, 0));
        P_fondo.add(lbl_recibeced, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 200, 30));

        btn_insertar.setBackground(new java.awt.Color(1, 53, 103));
        btn_insertar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn_insertar.setForeground(new java.awt.Color(255, 255, 255));
        btn_insertar.setText("Crear oferta");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });
        P_fondo.add(btn_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 110, -1));

        txt_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txt_descripcion);

        P_fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 790, 30));

        lbl_id.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(0, 0, 0));
        P_fondo.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, 20));

        btn_modificar.setBackground(new java.awt.Color(1, 53, 103));
        btn_modificar.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Actualizar oferta");
        btn_modificar.setEnabled(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        P_fondo.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, 30));

        btn_restablecer.setBackground(new java.awt.Color(1, 53, 103));
        btn_restablecer.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        btn_restablecer.setForeground(new java.awt.Color(255, 255, 255));
        btn_restablecer.setText("Restablecer");
        btn_restablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restablecerActionPerformed(evt);
            }
        });
        P_fondo.add(btn_restablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 110, 30));

        btn_ver_postulantes.setBackground(new java.awt.Color(1, 53, 103));
        btn_ver_postulantes.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        btn_ver_postulantes.setForeground(new java.awt.Color(255, 255, 255));
        btn_ver_postulantes.setText("Mostrar Postulantes");
        btn_ver_postulantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_postulantesActionPerformed(evt);
            }
        });
        P_fondo.add(btn_ver_postulantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1043, 448, 150, 30));

        getContentPane().add(P_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_C_calendarioPropertyChange
        if (evt.getOldValue() != null) {
            SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
            txt_fechaFin.setText(ff.format(C_calendario.getCalendar().getTime()));
        }

    }//GEN-LAST:event_C_calendarioPropertyChange

    private void txt_fechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaFinActionPerformed

    private void box_areaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_areaMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_box_areaMouseDragged

    private void box_areaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_box_areaFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_box_areaFocusGained

    private void box_areaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_areaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_areaMousePressed

    private void box_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_areaActionPerformed

    private void box_titulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_titulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_titulo1ActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        this.InsertarOferta();
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void Table_ofertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ofertasMouseClicked
        // TODO add your handling code here:
        int fila = Table_ofertas.getSelectedRow();
        //Pongo al boton de actualizar de nuevo a enable true
        btn_modificar.setEnabled(true);
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Selecione una fila");
        }else{
             //datos que obtengo al seleccionar la tabla
             //primero debo traerles a todos en String
            int idCodigo = Integer.parseInt(Table_ofertas.getValueAt(fila, 0).toString());
            String area = (String) Table_ofertas.getValueAt(fila, 1);
            String titulo =(String) Table_ofertas.getValueAt(fila, 2);
            String descripcion = (String) Table_ofertas.getValueAt(fila, 3);
            String direccion = (String) Table_ofertas.getValueAt(fila, 4);
            String conocimientos = (String) Table_ofertas.getValueAt(fila, 5);
            Double salario = (Double) Table_ofertas.getValueAt(fila, 6);
            Date fecini = (Date) Table_ofertas.getValueAt(fila, 7);
            Date fecfin = (Date) Table_ofertas.getValueAt(fila, 8);
            String jornada = (String) Table_ofertas.getValueAt(fila, 9);
        
            //guardo para enviar mi id_oferta a mi variable static
            codigo = String.valueOf(idCodigo);

            //Datos que muestro a los contenedores del panlel
            //comboBox titulo
            box_titulo1.removeAllItems();
            box_titulo1.addItem(titulo);
            //comboBox area
            box_area.removeAllItems();
            box_area.addItem(area);
            //comboBox jorndad
            box_jornada.removeAllItems();
            box_jornada.addItem(jornada);
            //text field
            lbl_id.setText(""+idCodigo);
            txt_descripcion.setText(descripcion);
            txt_ubi.setText(direccion);
            txt_conocimientos.setText(conocimientos);
            txt_salario.setText(""+salario);
            txt_finicio.setText(""+fecini);
            txt_fechaFin.setText(""+fecfin);   
            
            //después bloquear los campos que no se podrán editar de la oferta
            txt_descripcion.setEditable(false);
            txt_conocimientos.setEditable(false);
            txt_ubi.setEditable(false);
            txt_salario.setEditable(false);
            btn_insertar.setEnabled(false);
        }
    }//GEN-LAST:event_Table_ofertasMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        this.ModificarOferta();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_restablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restablecerActionPerformed
        //Primero desbloqueo los campos y el boton de crear:
            txt_descripcion.setEditable(true);
            txt_conocimientos.setEditable(true);
            txt_ubi.setEditable(true);
            txt_salario.setEditable(true);
            btn_insertar.setEnabled(true);
        //segundo limpio los comboBox y campos
            box_area.removeAllItems();
            
        //traigo los campos de area para el comboBox
            this.Combobox();
            
    }//GEN-LAST:event_btn_restablecerActionPerformed

    private void btn_ver_postulantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_postulantesActionPerformed
        if (!lbl_id.getText().isEmpty()){
            this.setVisible(false);
            JF_ofertaPostulantes ver = new JF_ofertaPostulantes();
            ver.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Primero seleccione la oferta en la tabla");
        }
        
    }//GEN-LAST:event_btn_ver_postulantesActionPerformed

    //convertir las fechas de String a date
            //SimpleDateFormat formatofech = new SimpleDateFormat("dd/MM/yyyy");
            //Date fechun = formatofech.parse(fecini);
            //Date fechdo = formatofech.parse(fecfin);
    
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
    private com.toedter.calendar.JCalendar C_calendario;
    private javax.swing.JPanel P_fondo;
    private javax.swing.JPanel P_head;
    private javax.swing.JTable Table_ofertas;
    private javax.swing.JComboBox<String> box_area;
    private javax.swing.JComboBox<String> box_jornada;
    private javax.swing.JComboBox<String> box_titulo1;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_restablecer;
    private javax.swing.JButton btn_ver_postulantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_recibeced;
    private javax.swing.JTextField txt_conocimientos;
    private javax.swing.JTextPane txt_descripcion;
    private javax.swing.JTextField txt_fechaFin;
    private javax.swing.JTextField txt_finicio;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_ubi;
    // End of variables declaration//GEN-END:variables

    //metodos//
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    
    
    private void Visualizar() {
        Object[] ofertas = new Object[10];
        DefaultTableModel modelo = (DefaultTableModel) Table_ofertas.getModel();
         cn = mysql.conectar();
        int cedula = Integer.parseInt(P_loginEmpleador.cedula);   
        
        try{
        
            CallableStatement visualizar = (CallableStatement) cn.prepareCall("{CALL sp_consultaOfertas(?)}");
            visualizar.setInt(1, cedula);
            
            ResultSet rs = visualizar.executeQuery();
            
            while(rs.next()) {
                ofertas[0] = rs.getInt("ofer_id");
                ofertas[1] = rs.getString("ofer_areaNec");
                ofertas[2] = rs.getString("ofer_tituloReq");
                ofertas[3] = rs.getString("ofer_descripcion");
                ofertas[4] = rs.getString("ofer_ubicacion");
                ofertas[5] = rs.getString("ofer_requisito");
                ofertas[6] = rs.getDouble("ofer_salario");
                ofertas[7] = rs.getDate("ofer_fePublicacion");
                ofertas[8] = rs.getDate("ofer_fechaFinaliza");
                ofertas[9] = rs.getString("ofer_jornada");
                
                modelo.addRow(ofertas);
            }
            Table_ofertas.setModel(modelo);
            //cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en mostrar ofertas " + e);
        }
    }
    
    
    
    
        private void Combobox() {    
    try {
        box_area.removeAllItems(); //Actualizar todo el combo area
        CallableStatement combobox = (CallableStatement) cn.prepareCall("{CALL sp_mostrarCarrera_combobx(0)}");
        ResultSet rs = combobox.executeQuery();
        
        box_area.addItem("(Seleccionar)");
        
        while(rs.next()) {
            box_area.addItem(rs.getString("carr_nombre"));
        }
        cn.close();
    } catch (SQLException e) {
        box_area.addItem("error");
        //System.out.println("Error: "+e);
        JOptionPane.showMessageDialog(null, "Error"+e);
    }
 }
      
        
        
        private void InsertarOferta() {
        OfertaLaboral_j oferta = new OfertaLaboral_j();
        Ctrl_emp_ofertas controlofertas = new Ctrl_emp_ofertas();

        //Guardo lo que selecciono del combobox
        String titulo = box_titulo1.getSelectedItem().toString();
        String area = box_area.getSelectedItem().toString();
        String jornada = box_jornada.getSelectedItem().toString();
        
        //Guardo las fechas
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicio = txt_finicio.getText();
        String fechaFin = txt_fechaFin.getText();
        
        if(!titulo.isEmpty() && !area.isEmpty() && !jornada.isEmpty() && !lbl_recibeced.getText().isEmpty() && !txt_descripcion.getText().isEmpty() && !txt_ubi.getText().isEmpty() && !txt_conocimientos.getText().isEmpty() &&
                !txt_salario.getText().isEmpty() && !fechaInicio.isEmpty() && !fechaFin.isEmpty()){
            
            try {
            //Cambio las fechas a tipo DATE
            
            java.sql.Date fechaIn = new java.sql.Date(formato.parse(fechaInicio).getTime());
            java.sql.Date fechaOut = new java.sql.Date(formato.parse(fechaFin).getTime());
            System.out.println("fecha: "+fechaOut);
            
            if(fechaIn != null && fechaOut != null) {
            
            
            if(fechaOut.compareTo(fechaIn)<0) {
                JOptionPane.showMessageDialog(null, "Error: la fecha de estimación no puede ser menor a la fecha actual");
            }else {
           
            oferta.setTitulo(titulo);
            oferta.setArea(area);
            oferta.setDescripcion(txt_descripcion.getText());
            oferta.setUbicacion(txt_ubi.getText());
            oferta.setRequisitos(txt_conocimientos.getText());
            oferta.setSalario(Double.valueOf(txt_salario.getText().trim()));
            oferta.setFechaInicio(fechaIn);
            oferta.setFechaFin(fechaOut);
            oferta.setJornada(jornada);
            oferta.setCedulaEmpleador(Integer.parseInt(lbl_recibeced.getText()));
            oferta.setSolicitud("0");
            
            if (controlofertas.insertOferta(oferta)){
               JOptionPane.showMessageDialog(null, "Oferta creada de manera exitosa");
               
               System.out.println(fechaOut);
               
               //Limpio los campos
               txt_descripcion.setText("");
               txt_ubi.setText("");
               txt_conocimientos.setText("");
               txt_salario.setText("");
               txt_fechaFin.setText("");
               
               
            }else{
               JOptionPane.showMessageDialog(null, "Error al crear la oferta");  
            }
            } 
            }else{
               JOptionPane.showMessageDialog(null, "Las fechas están siendo nulas");   
            }
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al convertir las fechas: "+ex);
        }  
    }else{
        JOptionPane.showMessageDialog(null, "Asegúrese de no dejar ningún espacio en blanco");
        }
    }
 
        
        
        //metodo para actualizar
        private void ModificarOferta() {
        OfertaLaboral_j oferta = new OfertaLaboral_j();
        Ctrl_emp_ofertas controlofertas = new Ctrl_emp_ofertas();

        //Guardo lo que selecciono del combobox
        String titulo = box_titulo1.getSelectedItem().toString();
        String area = box_area.getSelectedItem().toString();
        String jornada = box_jornada.getSelectedItem().toString();
        
        //Guardo las fechas
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicio = txt_finicio.getText();
        String fechaFin = txt_fechaFin.getText();
        
        if(!titulo.isEmpty() && !area.isEmpty() && !jornada.isEmpty() && !lbl_recibeced.getText().isEmpty() && !txt_descripcion.getText().isEmpty() && !txt_ubi.getText().isEmpty() && !txt_conocimientos.getText().isEmpty() &&
                !txt_salario.getText().isEmpty() && !fechaInicio.isEmpty() && !fechaFin.isEmpty()){
            
            try {
            //Cambio las fechas a tipo DATE
            
            java.sql.Date fechaIn = new java.sql.Date(formato.parse(fechaInicio).getTime());
            java.sql.Date fechaOut = new java.sql.Date(formato.parse(fechaFin).getTime());
            System.out.println("fecha: "+fechaOut);
            
            if(fechaIn != null && fechaOut != null) {
            
            
            if(fechaOut.compareTo(fechaIn)<0) {
                JOptionPane.showMessageDialog(null, "Error: la fecha de estimación no puede ser menor a la fecha actual");
            }else {
           
            oferta.setId(Integer.parseInt(lbl_id.getText()));
            oferta.setTitulo(titulo);
            oferta.setArea(area);
            oferta.setDescripcion(txt_descripcion.getText());
            oferta.setUbicacion(txt_ubi.getText());
            oferta.setRequisitos(txt_conocimientos.getText());
            oferta.setSalario(Double.valueOf(txt_salario.getText().trim()));
            oferta.setFechaInicio(fechaIn);
            oferta.setFechaFin(fechaOut);
            oferta.setJornada(jornada);
            oferta.setCedulaEmpleador(Integer.parseInt(lbl_recibeced.getText()));
            oferta.setSolicitud("5");
            
            if (controlofertas.modificarOferta(oferta)){
               JOptionPane.showMessageDialog(null, "Oferta actualizada de manera exitosa");
               
               System.out.println(fechaOut);
               
               //Limpio los campos
               txt_descripcion.setText("");
               txt_ubi.setText("");
               txt_conocimientos.setText("");
               txt_salario.setText("");
               txt_fechaFin.setText("");
               
               
            }else{
               JOptionPane.showMessageDialog(null, "Error al actualizar la oferta");  
            }
            } 
            }else{
               JOptionPane.showMessageDialog(null, "Las fechas están siendo nulas");   
            }
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al convertir las fechas: "+ex);
        }  
    }else{
        JOptionPane.showMessageDialog(null, "Asegúrese de no dejar ningún espacio en blanco");
        }
    }
         
         
         private void Reestablecer(){
         
         
         
         }
}

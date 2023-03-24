/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;



import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;

import java.awt.Font;

import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.*;
import javax.swing.JMenuBar;

import javax.swing.JOptionPane;

/**
 *
 * @author juanl
 */
public class Administrador extends javax.swing.JFrame {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;

    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_añadirEstudiante = new javax.swing.JMenuItem();
        menu_modificarEstudiante = new javax.swing.JMenuItem();
        menu_mostrarEstudiante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_ofertas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_añadirCarrera = new javax.swing.JMenuItem();
        menu_modifcarCarrera = new javax.swing.JMenuItem();
        menu_eliminarCarrera = new javax.swing.JMenuItem();
        menu_mostrarCarrera = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_mostrarEmpleador = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menu_reportePostulante = new javax.swing.JMenuItem();
        menu_reporteEmpleador = new javax.swing.JMenuItem();
        menu_reporteCarrareras = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menu_estadistica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 107, 184));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 920));

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 255));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setBackground(new java.awt.Color(27, 107, 184));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Estudiante");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 30));

        menu_añadirEstudiante.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        menu_añadirEstudiante.setText("Añadir Estudiante");
        menu_añadirEstudiante.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_añadirEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_añadirEstudianteActionPerformed(evt);
            }
        });
        jMenu1.add(menu_añadirEstudiante);

        menu_modificarEstudiante.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        menu_modificarEstudiante.setText("Modificar Estudiante");
        menu_modificarEstudiante.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_modificarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_modificarEstudianteActionPerformed(evt);
            }
        });
        jMenu1.add(menu_modificarEstudiante);

        menu_mostrarEstudiante.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        menu_mostrarEstudiante.setText("Mostrar Estudiantes");
        menu_mostrarEstudiante.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_mostrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mostrarEstudianteActionPerformed(evt);
            }
        });
        jMenu1.add(menu_mostrarEstudiante);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(27, 107, 184));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Ofertas laborales");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 75));

        menu_ofertas.setText("Ver Ofertas");
        menu_ofertas.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_ofertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ofertasActionPerformed(evt);
            }
        });
        jMenu2.add(menu_ofertas);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(27, 107, 184));
        jMenu3.setText("Carreras");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 30));

        menu_añadirCarrera.setText("Añadir Carreras");
        menu_añadirCarrera.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_añadirCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_añadirCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(menu_añadirCarrera);

        menu_modifcarCarrera.setText("Modificar Carrera");
        menu_modifcarCarrera.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_modifcarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_modifcarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(menu_modifcarCarrera);

        menu_eliminarCarrera.setText("Eliminar Carrera");
        menu_eliminarCarrera.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_eliminarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_eliminarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(menu_eliminarCarrera);

        menu_mostrarCarrera.setText("Mostrar Carreras");
        menu_mostrarCarrera.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_mostrarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mostrarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(menu_mostrarCarrera);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(27, 107, 184));
        jMenu4.setText("Empleadores");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu4.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 75));

        menu_mostrarEmpleador.setText("Ver empleadores");
        menu_mostrarEmpleador.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_mostrarEmpleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mostrarEmpleadorActionPerformed(evt);
            }
        });
        jMenu4.add(menu_mostrarEmpleador);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(27, 107, 184));
        jMenu5.setText("Reportes");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(200, 30));

        menu_reportePostulante.setText("Reporte Postulantes");
        menu_reportePostulante.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_reportePostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_reportePostulanteActionPerformed(evt);
            }
        });
        jMenu5.add(menu_reportePostulante);

        menu_reporteEmpleador.setText("Reporte Empleadores");
        menu_reporteEmpleador.setPreferredSize(new java.awt.Dimension(200, 30));
        menu_reporteEmpleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_reporteEmpleadorActionPerformed(evt);
            }
        });
        jMenu5.add(menu_reporteEmpleador);

        menu_reporteCarrareras.setText("Reporte Carreras");
        menu_reporteCarrareras.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu5.add(menu_reporteCarrareras);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(27, 107, 184));
        jMenu6.setText("Estadísticas");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(200, 30));

        menu_estadistica.setText("Estadísticas");
        menu_estadistica.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(menu_estadistica);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_modificarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_modificarEstudianteActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_modificarEstudianteActionPerformed

    private void menu_mostrarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mostrarCarreraActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_mostrarCarreraActionPerformed

    private void menu_añadirEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_añadirEstudianteActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_añadirEstudianteActionPerformed

    private void menu_mostrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mostrarEstudianteActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_menu_mostrarEstudianteActionPerformed

    private void menu_ofertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ofertasActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_menu_ofertasActionPerformed

    private void menu_añadirCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_añadirCarreraActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_añadirCarreraActionPerformed

    private void menu_modifcarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_modifcarCarreraActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_modifcarCarreraActionPerformed

    private void menu_eliminarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_eliminarCarreraActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_eliminarCarreraActionPerformed

    private void menu_mostrarEmpleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mostrarEmpleadorActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_menu_mostrarEmpleadorActionPerformed

    private void menu_reportePostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_reportePostulanteActionPerformed
        // TODO add your handling code here:
        ReportePostulantes();
    }//GEN-LAST:event_menu_reportePostulanteActionPerformed

    private void menu_reporteEmpleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_reporteEmpleadorActionPerformed
        // TODO add your handling code here:
        ReporteEmpleadores();
    }//GEN-LAST:event_menu_reporteEmpleadorActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menu_añadirCarrera;
    private javax.swing.JMenuItem menu_añadirEstudiante;
    private javax.swing.JMenuItem menu_eliminarCarrera;
    private javax.swing.JMenuItem menu_estadistica;
    private javax.swing.JMenuItem menu_modifcarCarrera;
    private javax.swing.JMenuItem menu_modificarEstudiante;
    private javax.swing.JMenuItem menu_mostrarCarrera;
    private javax.swing.JMenuItem menu_mostrarEmpleador;
    private javax.swing.JMenuItem menu_mostrarEstudiante;
    private javax.swing.JMenuItem menu_ofertas;
    private javax.swing.JMenuItem menu_reporteCarrareras;
    private javax.swing.JMenuItem menu_reporteEmpleador;
    private javax.swing.JMenuItem menu_reportePostulante;
    // End of variables declaration//GEN-END:variables

    //Reporte postulantes
    public void ReportePostulantes() {
        Document documento = new Document(PageSize.A4.rotate());
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "ReportePostulantes" + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("C:\\Bolsa de empleo\\Sistema_bolsa_de_empleo\\src\\imagenes\\Logo_secundario_positivo.jpg");
            header.scaleToFit(300, 250);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion de postulantes \n\n");
            parrafo.setFont(FontFactory.getFont("Calibri Light", 8, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla_postulantes = new PdfPTable(10);
            tabla_postulantes.setWidthPercentage(100);
            tabla_postulantes.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER); // establecer la alineación horizontal
            tabla_postulantes.addCell("Cédula");
            tabla_postulantes.addCell("Nombres");
            tabla_postulantes.addCell("Apellidos");
            tabla_postulantes.addCell("Telefono 1");
            tabla_postulantes.addCell("Telefono 2");
            tabla_postulantes.addCell("Correo");
            tabla_postulantes.addCell("Direccion");
            tabla_postulantes.addCell("Educacion");
            tabla_postulantes.addCell("Fecha nacimiento");
            tabla_postulantes.addCell("carr_id");

            try {
                cn = mysql.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from postulante ");
                rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla_postulantes.addCell(rs.getString(1));
                        tabla_postulantes.addCell(rs.getString(2));
                        tabla_postulantes.addCell(rs.getString(3));
                        tabla_postulantes.addCell(rs.getString(4));
                        tabla_postulantes.addCell(rs.getString(5));
                        tabla_postulantes.addCell(rs.getString(6));
                        tabla_postulantes.addCell(rs.getString(7));
                        tabla_postulantes.addCell(rs.getString(8));
                        tabla_postulantes.addCell(rs.getString(9));
                        tabla_postulantes.addCell(rs.getString(10));
                    } while (rs.next());

                    documento.add(tabla_postulantes);
                }
                Paragraph parrafo2 = new Paragraph();
                parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo2.add("\n");
                parrafo2.add("Ofertas disponibles para el tipo de carrera");
                parrafo2.setFont(FontFactory.getFont("Calibri Light", 8, Font.BOLD, BaseColor.DARK_GRAY));

                documento.add(parrafo2);
                PdfPTable tabla_carreras = new PdfPTable(3);
                tabla_carreras.addCell("id");
                tabla_carreras.addCell("Nombre carrera");
                tabla_carreras.addCell("Descripcion Carrera");

                try {
                    Connection cn2 = mysql.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            " select * from carrera where carr_id=1");

                    ResultSet rs2 = pst2.executeQuery();

                    if (rs2.next()) {
                        do {
                            tabla_carreras.addCell(rs2.getString(1));
                            tabla_carreras.addCell(rs2.getString(2));
                            tabla_carreras.addCell(rs2.getString(3));
                        } while (rs2.next());

                        documento.add(tabla_carreras);
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al cargar carreras" + e);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar postulantes" + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte generado con exito");
        } catch (DocumentException | IOException e) {
            System.out.println("Error en pdf o ruta de imagen " + e);
            JOptionPane.showMessageDialog(null, "Error al generar el pdf");
        }
    }

    //reporte empleadores
    public void ReporteEmpleadores() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "ReporteEmpleadores" + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("C:\\Bolsa de empleo\\Sistema_bolsa_de_empleo\\src\\imagenes\\Logo_secundario_positivo.jpg");

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion de Empleadores \n\n");
            parrafo.setFont(FontFactory.getFont("Calibri Light", 8, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla_empleadores = new PdfPTable(10);
            tabla_empleadores.setWidthPercentage(100);
            tabla_empleadores.setTotalWidth(PageSize.A4.rotate().getWidth()); // Ajustar ancho de la tabla al ancho de la página
            tabla_empleadores.setLockedWidth(true); // Bloquear ancho de la tabla
            tabla_empleadores.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER); // Establecer la alineación horizontal
            tabla_empleadores.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE); // Establecer la alineación vertical
            tabla_empleadores.getDefaultCell().setFixedHeight(50); // Establecer la altura de las celdas
            tabla_empleadores.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER); // establecer la alineación horizontal
            tabla_empleadores.addCell("Cédula");
            tabla_empleadores.addCell("Nombres");
            tabla_empleadores.addCell("Apellidos");
            tabla_empleadores.addCell("Correo");
            tabla_empleadores.addCell("Nombre empresa");
            tabla_empleadores.addCell("labor que cumple");
            tabla_empleadores.addCell("Ubicacion empresa");
            tabla_empleadores.addCell("Telefono empresa");
            tabla_empleadores.addCell("Correo empresa");
            tabla_empleadores.addCell("Descripcion empresa");

            try {
                cn = mysql.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from empleador");
                rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla_empleadores.addCell(rs.getString(1));
                        tabla_empleadores.addCell(rs.getString(2));
                        tabla_empleadores.addCell(rs.getString(3));
                        tabla_empleadores.addCell(rs.getString(4));
                        tabla_empleadores.addCell(rs.getString(5));
                        tabla_empleadores.addCell(rs.getString(6));
                        tabla_empleadores.addCell(rs.getString(7));
                        tabla_empleadores.addCell(rs.getString(8));
                        tabla_empleadores.addCell(rs.getString(9));
                        tabla_empleadores.addCell(rs.getString(10));
                    } while (rs.next());

                    documento.add(tabla_empleadores);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar Empleadores" + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte generado con exito");
        } catch (DocumentException | IOException e) {
            System.out.println("Error en pdf o ruta de imagen " + e);
            JOptionPane.showMessageDialog(null, "Error al generar el pdf");
            //holamundo
        }

    }

    public void ReporteCarreras() {
        Document documento = new Document(PageSize.A4.rotate());
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "ReporteCarreras" + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("C:\\Bolsa de empleo\\Sistema_bolsa_de_empleo\\src\\imagenes\\Logo_secundario_positivo.jpg");
            header.scaleToFit(300, 250);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte de las carreras \n\n");
            parrafo.setFont(FontFactory.getFont("Calibri Light", 8, Font.ITALIC, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla_carreras = new PdfPTable(3);
            tabla_carreras.setWidthPercentage(100);
            tabla_carreras.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER); // establecer la alineación horizontal
            tabla_carreras.addCell("id carrera");
            tabla_carreras.addCell("Nombre carrera");
            tabla_carreras.addCell("Descripción Carrera");
            try {
                cn = mysql.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from carrera ");
                rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                       tabla_carreras.addCell(rs.getString(1));
                        tabla_carreras.addCell(rs.getString(2));
                       tabla_carreras.addCell(rs.getString(3));
                       
                    } while (rs.next());

                    documento.add(tabla_carreras);
                }
          
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar postulantes" + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte generado con exito");
        } catch (DocumentException | IOException e) {
            System.out.println("Error en pdf o ruta de imagen " + e);
            JOptionPane.showMessageDialog(null, "Error al generar el pdf");
        }
    }

}

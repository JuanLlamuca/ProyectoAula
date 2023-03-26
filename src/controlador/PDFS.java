
package controlador;

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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PDFS {
    
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    Statement st;
    ResultSet rs;
    
    
    
    //Reportes de postulantes
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
     
     
     
     
     //Reportes Empleadores
      public void ReporteEmpleadores() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "ReporteEmpleadores" + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("C:\\Bolsa de empleo\\Sistema_bolsa_de_empleo\\src\\imagenes\\Logo_secundario_positivo.jpg");
            header.scaleToFit(300, 250);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion de Empleadores \n\n");
            parrafo.setFont(FontFactory.getFont("Calibri Light", 8, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

             PdfPTable tabla_empleadores = new PdfPTable(10);
            tabla_empleadores.setWidthPercentage(100);
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
      
      
      
      //Reportes de carreras
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

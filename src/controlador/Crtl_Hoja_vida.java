/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.HojaVida;
import java.sql.*;

/**
 *
 * @author juanl
 */
public class Crtl_Hoja_vida {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();

    public Statement consulta;
    public ResultSet resultado;

    public boolean CrearHojadeVida(HojaVida objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {

            CallableStatement insert = cn.prepareCall("{CALL sp_HojaVida(?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            insert.setInt(1, 0);  //op
            insert.setInt(2, 0);   //id_hoja
            insert.setInt(3, objeto.getCedula());   //hoj_cedula
            insert.setString(4, objeto.getNombre());  //hoja_nombreCompleto
            insert.setString(5, objeto.getGenero());  //hoj_genero
            insert.setString(6, objeto.getEstadoCivil()); //hoj_estadoCivil
            insert.setString(7, objeto.getCanton());  //hoj_cantonResidencia
            insert.setString(8, objeto.getCiudad());   //hoj_ciudadResidencia
            insert.setString(9, objeto.getDireccion()); //hoj_direccion
            insert.setInt(10, objeto.getTelefonoPersonal()); //hoj_telefonoPersonal
            insert.setString(11, objeto.getCorreo());  //hoj_correo
            insert.setString(12, objeto.getDescripcion());  //hoj_descripcionProfesional
            insert.setString(13, objeto.getFormacion());   //hoj_formacionAcademica
            insert.setString(14, objeto.getExperiencia()); //hoj_experiencia
            insert.setInt(15, objeto.getTelreferencia1());    //hoj_telReferencia1
            insert.setInt(16, objeto.getTelreferencia2());    //hoj_telReferencia2
            insert.setString(17, objeto.getNombreReferencia1());  //hoj_nombreReferencia1
            insert.setString(18, objeto.getNombreReferencia2());  //hoj_nombreReferencia2
            insert.setString(19, objeto.getHabilidades());   //hoj_habilidades
            insert.setString(20, objeto.getAdiccional());  //hoj_adiccional
            insert.setBytes(21, objeto.getImagen()); //hoj_foto
            insert.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Hoja de vida generada con exito");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Ctrl_hoja_vida crearhojavida" + e);
        }
        return respuesta;
    }

    public ArrayList CargarImagen() {
        ArrayList imagenes = new ArrayList();

        try {
            consulta = cn.createStatement();
            resultado = consulta.executeQuery("Aqui va la lista");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Crtl_hoja_vida_mostrar Imagen");
        }

        return imagenes;
    }

}

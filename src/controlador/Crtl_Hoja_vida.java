/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.HojaVida;
import vistas.CrearHojaVida;

/**
 *
 * @author juanl
 */
public class Crtl_Hoja_vida {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();

    public boolean CrearHojaVida(HojaVida objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {

            CallableStatement insert = cn.prepareCall("{CALL sp_HojaVida(?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);}");
            insert.setInt(1, 0);
            insert.setInt(2, objeto.getCedula());
            insert.setString(3, objeto.getNombre());
            insert.setString(4, objeto.getGenero());
            insert.setString(5, objeto.getEstadoCivil());
            insert.setString(6, objeto.getCanton());
            insert.setString(7, objeto.getCiudad());
            insert.setString(8, objeto.getDireccion());
            insert.setInt(9, objeto.getTelefonoPersonal());
            insert.setString(10, objeto.getCorreo());
            insert.setString(11, objeto.getDescripcion());
            insert.setString(12, objeto.getFormacion());
            insert.setInt(13, objeto.getTelreferencia1());
            insert.setInt(14, objeto.getTelreferencia2());
            insert.setString(15, objeto.getNombreReferencia1());
            insert.setString(15, objeto.getNombreReferencia2());
            insert.setString(16, objeto.getHabilidades());
            insert.setString(17, objeto.getAdiccional());
            insert.setBlob(18, objeto.getImagen());
            insert.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Datos ingresados con exito");

        } catch (SQLException e) {
            System.out.println("Error Ctrl_hoja_vida" + e);
        }
        return respuesta;
    }

}

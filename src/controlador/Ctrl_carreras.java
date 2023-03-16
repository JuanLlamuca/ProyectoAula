/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.Carreras;
import modelo.Postulante;

/**
 *
 * @author juanl
 */
public class Ctrl_carreras {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    ResultSet rs;
    Statement st;

    public boolean InsertarCarrera(Carreras objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {

            CallableStatement insert = cn.prepareCall("{CALL `sp_carreras`(?, ?, ?, ?)}");
            insert.setInt(1, 0);
            insert.setInt(2, 0);
            insert.setString(3, objeto.getNombre());
            insert.setString(4, objeto.getDescripcion());
            insert.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Datos ingresados con exito");

        } catch (SQLException e) {
            System.out.println("Error Crtl_carreras: " + e);
        }
        return respuesta;

    }

    public boolean modificarCarreras(Carreras objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {
            CallableStatement modificar = cn.prepareCall("{CALL `sp_carreras`(?, ?, ?, ?)}");
            modificar.setInt(1, 1);
            modificar.setInt(2, objeto.getId_carrera());
            modificar.setString(3, objeto.getNombre());
            modificar.setString(4, objeto.getDescripcion());
            modificar.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Datos modificados con exito");
        } catch (SQLException e) {
            System.out.println("Error Ctrl_Carreras " + e);
        }
        return respuesta;
    }

    
     public boolean eliminarCarreras(Carreras objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {
            CallableStatement modificar = cn.prepareCall("{CALL `sp_carreras`(?, ?, ?, ?)}");
            modificar.setInt(1, 1);
            modificar.setInt(2, objeto.getId_carrera());
            modificar.setString(3, "");
            modificar.setString(4, "");
            modificar.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Carrera eliminada con exito");
        } catch (SQLException e) {
            System.out.println("Error Ctrl_Carreras " + e);
        }
        return respuesta;
    }
    
    
    public ArrayList<Carreras> obtenerCarreras() {
        ArrayList<Carreras> lista_carrera = new ArrayList<>();
        try {
            String sql = "select * from lista_carrera";
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Carreras carr = new Carreras();
                carr.setId_carrera(rs.getInt("carr_id"));
                carr.setNombre(rs.getString("carr_nombre"));
                lista_carrera.add(carr);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ctrl_carreras" + e);
        }
        return lista_carrera;
    }

}

package controlador;

import java.sql.Connection;
import modelo.Postulante;
import conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;



public class Ctrl_Postulante {

    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();

    public boolean InsertarPostulante(Postulante objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {

            CallableStatement insert = cn.prepareCall("{CALL sp_postulante(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            insert.setInt(1, 0);
            insert.setInt(2, objeto.getCedula());
            insert.setString(3, objeto.getNombres());
            insert.setString(4, objeto.getApellidos());
            insert.setInt(5, objeto.getTelefonoP());
            insert.setInt(6, objeto.getTelefonoD());
            insert.setString(7, objeto.getCorreo());
            insert.setString(8, objeto.getDireccion());
            insert.setString(9, objeto.getEduacion());
            insert.setString(10, objeto.getNacimiento());
            insert.setInt(11, objeto.getCarrera());
            insert.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Datos ingresados con exito");

        } catch (SQLException e) {
            System.out.println("Error Ctrl_carreras" + e);
        }
        return respuesta;
    }

    public boolean modificarEstudiante(Postulante objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {
            CallableStatement modificar = cn.prepareCall("{CALL sp_postulante(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            modificar.setInt(1, 1);
            modificar.setInt(2, objeto.getCedula());
            modificar.setString(3, objeto.getNombres());
            modificar.setString(4, objeto.getApellidos());
            modificar.setInt(5, objeto.getTelefonoP());
            modificar.setInt(6, objeto.getTelefonoD());
            modificar.setString(7, objeto.getCorreo());
            modificar.setString(8, objeto.getDireccion());
            modificar.setString(9, objeto.getEduacion());
            modificar.setString(10, objeto.getNacimiento());
            modificar.setInt(11, 0);
            modificar.execute();
            cn.close();
            JOptionPane.showMessageDialog(null, "Datos modificados con exito");
        } catch (SQLException e) {
            System.out.println("Error Ctrl_Postulante " + e);
        }
        return respuesta;
    }

  

    public boolean eliminarEstudiante(Postulante objeto) {
        boolean respuesta = false;
        cn = mysql.conectar();
        try {
            CallableStatement eliminar = cn.prepareCall("{CALL sp_postulante(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            eliminar.setInt(1, 2);
            eliminar.setInt(2, objeto.getCedula());
            eliminar.setString(3, objeto.getNombres());
            eliminar.setString(4, objeto.getApellidos());
            eliminar.setInt(5, objeto.getTelefonoP());
            eliminar.setInt(6, objeto.getTelefonoD());
            eliminar.setString(7, objeto.getCorreo());
            eliminar.setString(8, objeto.getDireccion());
            eliminar.setString(9, objeto.getEduacion());
            eliminar.setString(10, objeto.getNacimiento());
            eliminar.setInt(11, 0);
            eliminar.execute();
            
            cn.close();
            JOptionPane.showMessageDialog(null, "Eliminado");
        } catch (SQLException e) {
            System.out.println("Error Ctrl_Postulante " + e);
        }
        return respuesta;
    }

    public boolean ValidaPostulante(Postulante objeto) {
        Boolean respuesta = false;

        try {

            CallableStatement valid = cn.prepareCall("{CALL sp_validaPostulante(?, ?)}");

            valid.setInt(1, objeto.getCedula());
            valid.setString(2, objeto.getClave());

            if (valid.executeUpdate() != 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al consultar a la DB: " + e);
        }
        return respuesta;
    }

}

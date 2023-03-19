package controlador;

import conexion.Conexion;
import java.sql.Connection;
import modelo.Empleador_j;
import java.sql.*;
import javax.swing.JOptionPane;


public class Ctrl_Empleador_j {
   
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    
    
    //Mostrar empleador
    public boolean MostrarEmpleador(Empleador_j objeto) {
        Boolean respuesta = false;
        
        try{
        
            CallableStatement mostrar = cn.prepareCall("{CALL sp_mostrarEmpleador(?)}");
            
            mostrar.setInt(1,objeto.getEmp_ced());
            
            if(mostrar.executeUpdate()!= 0) {
                respuesta = true;
            }
            cn.close();
            JOptionPane.showMessageDialog(null, "Consultando a la BD...");
        }
        catch (SQLException e) {
            System.out.println("Error en consulta: " + e);
        }
        return respuesta;
    }
    
    
    
    //Para validar empleador
    public boolean ValidaEmpleador(Empleador_j objeto) {
        Boolean respuesta = false;
        
        try{
            
            CallableStatement valid = cn.prepareCall("{CALL sp_validarLogin(?, ?)}");
            
            valid.setInt(1, objeto.getEmp_ced());
            valid.setString(2, objeto.getEmp_clave());
            
            if (valid.executeUpdate() != 0){
                respuesta = true;
            }
            cn.close();
            JOptionPane.showMessageDialog(null, "Consultando a la BD...");
            
        }
        catch (SQLException e) {
            System.out.println("Error al consultar a la DB: " + e);
    }
        return respuesta;
    }
    
    
    
    //Para insertar al empleador
    public boolean InsertarEmpleador(Empleador_j objeto) {
        Boolean respuesta = false;
        
        try{
        CallableStatement insert = cn.prepareCall("{CALL sp_empleador(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            insert.setInt(1, 0);
            insert.setInt(2, objeto.getEmp_ced());
            insert.setString(3, objeto.getEmp_nombre());
            insert.setString(4, objeto.getEmp_apellido());
            insert.setString(5, objeto.getEmp_correo());
            insert.setString(6, objeto.getEmp_nomEmp());
            insert.setString(7, objeto.getEmp_laboCum());
            insert.setString(8, objeto.getEmp_ubiEmp());
            insert.setInt(9, objeto.getEmp_telfEmp());
            insert.setString(10, objeto.getEmp_corrEmp());
            insert.setString(11, objeto.getEmp_desEmp());
            insert.setString(12, objeto.getEmp_clave());
            
            
            if (insert.executeUpdate() != 0){
                respuesta = true;
            }
            cn.close();
            JOptionPane.showMessageDialog(null, "Consultando a la BD...");
            
        }
        catch (SQLException e) {
            System.out.println("Error al consultar a la DB: " + e);
    }
        return respuesta;
        }
        
    
    //Para modificar al empleador
    public boolean ModificarEmpleador(Empleador_j objeto) {
        Boolean respuesta = false;
        
        try{
        CallableStatement modificar = cn.prepareCall("{CALL sp_empleador(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            modificar.setInt(1, 1);
            modificar.setInt(2, objeto.getEmp_ced());
            modificar.setString(3, objeto.getEmp_nombre());
            modificar.setString(4, objeto.getEmp_apellido());
            modificar.setString(5, objeto.getEmp_correo());
            modificar.setString(6, objeto.getEmp_nomEmp());
            modificar.setString(7, objeto.getEmp_laboCum());
            modificar.setString(8, objeto.getEmp_ubiEmp());
            modificar.setInt(9, objeto.getEmp_telfEmp());
            modificar.setString(10, objeto.getEmp_corrEmp());
            modificar.setString(11, objeto.getEmp_desEmp());
            modificar.setString(12, objeto.getEmp_clave());
            
            if (modificar.executeUpdate() != 0){
                respuesta = true;
            }
            cn.close();
            JOptionPane.showMessageDialog(null, "Consultando a la BD...");
            
        }
        catch (SQLException e) {
            System.out.println("Error al consultar a la DB: " + e);
    }
        return respuesta;
        }
}

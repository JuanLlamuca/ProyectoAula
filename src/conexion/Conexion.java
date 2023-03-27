/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    public  Connection con=null;
    
    
     public void cierra_conn() throws SQLException{
      con.close();
    } 
    
    public Connection conectar(){
     String usu = "JOSUE";
     String clv = "1050227378jc";
     String server ="jdbc:mysql://localhost:3306/bd_bolsadeempleo?characterEncoding=latin1";
        try {
            Class.forName( "com.mysql.jdbc.Driver");
         try {
             con= DriverManager.getConnection(server,usu,clv);
               System.out.println("Conectado");
         } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return  con;
    }
    
    
}

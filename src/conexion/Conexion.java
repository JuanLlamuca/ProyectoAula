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
     String usu = "bolsa";
     String clv = "bolsaempleo2023";
     String server ="jdbc:mysql://localhost:3306/bolsa_empleo?characterEncoding=latin1&useConfigs=maxPerformance";
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

package controlador;

import com.mysql.jdbc.CallableStatement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.OfertaLaboral_j;





public class Ctrl_emp_ofertas {
    Conexion mysql = new Conexion();
    Connection cn = mysql.conectar();
    
    
    //metodo para agregar oferta laboral
    public boolean insertOferta(OfertaLaboral_j objeto){
        Boolean respuesta = false;
     
        try{
        CallableStatement insert = (CallableStatement) cn.prepareCall("{CALL sp_ofertaLboral(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}"); 
            insert.setInt(1, 0);
            insert.setInt(2, 0);
            insert.setString(3, objeto.getTitulo());
            insert.setString(4, objeto.getArea());
            insert.setString(5, objeto.getDescripcion());
            insert.setString(6, objeto.getUbicacion());
            insert.setString(7, objeto.getRequisitos());
            insert.setDouble(8, objeto.getSalario());
            insert.setDate(9, (Date) objeto.getFechaInicio());
            insert.setString(10, objeto.getJornada());
            insert.setInt(11, objeto.getCedulaEmpleador());
            insert.setString(12, objeto.getSolicitud());
            insert.setDate(13, (Date) objeto.getFechaInicio());
            
            if (insert.executeUpdate() != 0) {
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

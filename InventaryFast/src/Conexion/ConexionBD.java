package Conexion;

import java.sql.*;
public class ConexionBD {
    public Connection getConexion() throws SQLException{
        return conexion();
    }
    
    private static Connection conexion() throws SQLException{
        
            String url ="jdbc:mysql://168.138.149.15:3306/mydb";
            String user = "inventary_fast";
            String pass = "InventaryFast__//1";
            Connection cn = DriverManager.getConnection(url,user,pass);  
            System.out.println("Conexion Exitosa");
            try {
            return cn;
        } catch (Exception e) {
            return cn;
        }
     
    }
    public static ResultSet getTabla(String consulta) throws SQLException{
        Connection cn = conexion();
        Statement st;
        ResultSet datos = null;
        try {
            st = cn.createStatement();
            datos= st.executeQuery(consulta);
        } catch (Exception e) {
            
        }
        
        return datos;
    }
    
    public static void main(String[] args) {

                
    }
    
}

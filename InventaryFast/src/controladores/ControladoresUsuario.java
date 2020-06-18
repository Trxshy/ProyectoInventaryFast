
package controladores;

import Clases.Usuario;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControladoresUsuario {
//Usuario user = new Usuario(); 
        public void agregarUsuario(Usuario usuario) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        
        try{
        PreparedStatement ps;
        ps = cn.prepareStatement("INSERT INTO mydb.usuario (run, digitoverificador ,nomUsu, nombre,apePaterno, apeMaterno,email, clave, Ti_Usu_idTiUsu) VALUES (?,?,?,?,?,?,?,?,(select idTiUsu FROM mydb.ti_usu WHERE nomTiUsu =?))");
        ps.setString(1, usuario.getRun());
        ps.setString(2, usuario.getDv());
        ps.setString(3, usuario.getNomUsu());
        ps.setString(4, usuario.getNombre());
        ps.setString(5, usuario.getApePaterno());
        ps.setString(6, usuario.getApeMaterno());
        ps.setString(7, usuario.getEmail());
        ps.setString(8, usuario.getContrasenia());
        ps.setString(9, usuario.getCargo());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Agregado correctamente");
        }catch (SQLException ex) {
            
                }
       
    }
    public void modificarUsuario(Usuario usuario, String id) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        PreparedStatement ps = cn.prepareStatement("UPDATE mydb.usuario SET run = ?,digitoverificador = ?, nombre =?, apePaterno=?, apeMaterno=?, email=?, nomUsu=?,clave=?, Ti_Usu_idTiUsu = (select idTiUsu from ti_usu WHERE nomTiUsu = ?) WHERE mydb.usuario.idUsu = ?");
        ps.setString(1, usuario.getRun());
        ps.setString(2, usuario.getDv());
        ps.setString(3, usuario.getNombre());
        ps.setString(4, usuario.getApePaterno());
        ps.setString(5, usuario.getApeMaterno());
        ps.setString(6, usuario.getEmail());
        ps.setString(7, usuario.getNomUsu());
        ps.setString(8, usuario.getContrasenia());
        ps.setString(9, usuario.getCargo());
        ps.setString(10, id);
        ps.executeUpdate();
    }
    public void eliminarUsuario(String run) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        PreparedStatement ps = cn.prepareStatement("DELETE from mydb.usuario WHERE run = ?");
        ps.setString(1, run);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Eliminado correctamente");
    }
    
//Metodo para generar la contraseña
    public static String contrasenia(String nombre, String run){
        String contrasenia ="";
        String n = nombre.substring(0,3);
        String r = run.substring(0,8);
        contrasenia = n + r;
        return contrasenia;
        
    }
    //Metodo para generar el nombre de usuario
    public static String nomUsu(String nombre, String apellido){
        String nomusuario = "";
        String n = nombre.substring(0,3);
        String a = apellido.substring(0,3);
        nomusuario = n + a;
        return nomusuario;
    }
    public static String juntadorDeCorreos(String parte1, String parte2){
        String arroba = "@";
        String correo = parte1 + arroba + parte2;
        System.out.println(correo);
        return correo;
        
    }
}

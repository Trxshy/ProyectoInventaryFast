/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Clases.Proveedor;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class ControladoresProveedor {
  
        public void agregarProveedor(Proveedor prov) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        try{
        PreparedStatement ps = cn.prepareStatement("INSERT INTO mydb.proveedor (Run, Dv, NomProv,Direccion,numero) VALUES (?,?,?,?,?)");
        ps.setString(1, prov.getRun());
        ps.setString(2, prov.getDv());
        ps.setString(3, prov.getNombre());
        ps.setString(4, prov.getDireccion());
        ps.setString(5, prov.getNumeroContacto());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Agregado correctamente.");
        }catch (SQLException ex){
            
        }
      
    }
    public void modificarProveedor(Proveedor prov, String id)throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        try{
            PreparedStatement ps = cn.prepareStatement("UPDATE mydb.proveedor SET Run=?,Dv=?,NomProv=?, Direccion=?,numero=? WHERE idProveedor = ? ");
            ps.setString(1, prov.getRun());
            ps.setString(2, prov.getDv());
            ps.setString(3, prov.getNombre());
            ps.setString(4, prov.getDireccion());
            ps.setString(5, prov.getNumeroContacto());
            ps.setString(6, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificado correctamente.");
        }catch (SQLException ex){
            
        }
        }
    public void eliminarProveedor(String id)throws SQLException {
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        PreparedStatement ps = cn.prepareStatement("DELETE FROM mydb.proveedor WHERE idProveedor = ?");
        ps.setString(1, id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Eliminado correctamente.");
    }
}

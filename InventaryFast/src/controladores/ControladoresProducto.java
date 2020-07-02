/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Clases.Producto;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class ControladoresProducto {
 
        public void agregarProducto(Producto prod) throws SQLException, ClassNotFoundException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        
        int idStock = agregarStock(0);
        PreparedStatement ps = cn.prepareStatement("INSERT INTO mydb.producto (nbrePro,precio,codBarra,Categoria_idCateg,Stock_idStock) VALUES (?,?,?,(select idCateg FROM mydb.categoria WHERE nomCateg = ?),?)");        
        ps.setString(1, prod.getNomProd());
        ps.setInt(2, prod.getPrecio());
        ps.setString(3, prod.getCodBarra());
        ps.setString(4, prod.getCategoria());
        ps.setInt(5, idStock);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Agregado correctamente.");
    }
    public void modificarProducto(Producto prod, String id)throws SQLException, ClassNotFoundException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        PreparedStatement ps = cn.prepareStatement("UPDATE mydb.producto SET nbrePro=?,precio=?,codBarra=?, (select idCateg from mydb.categoria where nomCateg = ?) ,(select cantidad from mydb.stock where stock.idStock = producto.Stock_idStock) = ? WHERE idProd = ?");
        ps.setString(1, prod.getNomProd());
        ps.setInt(2, prod.getPrecio());
        ps.setString(3, prod.getCodBarra());
        ps.setString(4, prod.getCategoria());
        ps.setInt(5, prod.getStock());
        ps.setString(6, id);
        
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Modificado correctamnte");
    }
    public void eliminarProducto(String id)throws SQLException, ClassNotFoundException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        PreparedStatement ps = cn.prepareStatement("DELETE FROM mydb.producto WHERE idProd = ?");
        ps.setString(1, id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Eliminado correctamente.");
    
    }
    public int agregarStock (int stock) throws SQLException, ClassNotFoundException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        int valor = 0;
        PreparedStatement ps = cn.prepareStatement("INSERT INTO mydb.stock (cantidad) VALUES (?)");
        ps.setInt(1, stock);
        ps.executeUpdate();
        if(ps.getGeneratedKeys().first()){
            
            valor = ps.getGeneratedKeys().getInt(1);

        }
        return valor;
    }
}

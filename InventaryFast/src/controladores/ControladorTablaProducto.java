/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conexion.ConexionBD;
import Vistas.ModificarProductoLista;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexis
 */
public class ControladorTablaProducto {
    public void mostrar(JTable nombreTabla) throws SQLException{
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = ConexionBD.getTabla("select idProd, nbrePro, precio, codBarra, nomCateg, cantidad from mydb.producto JOIN mydb.categoria ON (mydb.producto.Categoria_idCateg = mydb.categoria.idCateg) JOIN mydb.stock ON (mydb.producto.Stock_idStock = mydb.stock.idStock)");
        model.setColumnIdentifiers(new Object[]{"id","nombre","Precio","Código de barra","Categoria","Stock"});
        try {
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("idProd"),rs.getString("nbrePro"), 
                rs.getString("precio"),rs.getString("codBarra"),rs.getString("nomCateg"),rs.getString("cantidad")});
            }
            nombreTabla.setModel(model);
        } catch (Exception e) {
            System.out.println(e);
        }
        }
public void mostrardatos(String id, JTable nombreTabla) throws SQLException{
    ConexionBD con = new ConexionBD();
    Connection cn = con.getConexion();
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("nombre");
    modelo.addColumn("Precio");
    modelo.addColumn("Código de barra");
    modelo.addColumn("Categoria");
    modelo.addColumn("Stock");


    nombreTabla.setModel(modelo);
    String sql="";
    if(id.equals(""))
    {
        
        sql="select idProd, nbrePro,precio, codBarra, nomCateg, cantidad from mydb.producto JOIN mydb.categoria ON (mydb.producto.Categoria_idCateg = mydb.categoria.idCateg) JOIN mydb.stock ON (mydb.producto.Stock_idStock = mydb.stock.idStock)";
        JOptionPane.showMessageDialog(null, "Debe ingresar un número de ID");
        
    }
    else{
        sql="select idProd, nbrePro, precio, codBarra, nomCateg, cantidad from mydb.producto JOIN mydb.categoria ON (mydb.producto.Categoria_idCateg = mydb.categoria.idCateg) JOIN mydb.stock ON (mydb.producto.Stock_idStock = mydb.stock.idStock)";
    }
 
    String []datos = new String [5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);   
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);



                modelo.addRow(datos);
            }
            nombreTabla.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProductoLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

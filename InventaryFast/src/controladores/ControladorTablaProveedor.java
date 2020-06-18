/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conexion.ConexionBD;
import Vistas.ModificarProveedorLista;
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
public class ControladorTablaProveedor {
    public void mostrar(JTable nombreTabla) throws SQLException{
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = ConexionBD.getTabla("select idProveedor, run,Dv, nomProv, Direccion, numero from mydb.proveedor ");
        model.setColumnIdentifiers(new Object[]{"id","rut","Digito verificador","nombre","dirección","numero de contacto"});
        try {
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("idProveedor"),rs.getString("run"),  rs.getString("Dv") ,rs.getString("nomProv"),
                rs.getString("Direccion"),rs.getString("numero")});
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
    modelo.addColumn("run");
    modelo.addColumn("DV");
    modelo.addColumn("nombre");
    modelo.addColumn("dirección");
    modelo.addColumn("número de contacto");


    nombreTabla.setModel(modelo);
    String sql="";
    if(id.equals(""))
    {
        
        sql="SELECT idProveedor, run,Dv, nomProv, Direccion, numero from mydb.proveedor ";
        JOptionPane.showMessageDialog(null, "Debe ingresar un número de ID");
        
    }
    else{
        sql="SELECT idProveedor, run,Dv, nomProv, Direccion, numero from mydb.proveedor WHERE idProveedor='"+id+"'";
    }
 
    String []datos = new String [6];
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
            Logger.getLogger(ModificarProveedorLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}

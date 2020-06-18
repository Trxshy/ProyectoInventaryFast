/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conexion.ConexionBD;
import Vistas.ModificarUsuarioLista;
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
public class ControladorTablaUsuario {
 
    public void mostrar(JTable nombreTabla) throws SQLException{
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = ConexionBD.getTabla("select idUsu, run,digitoverificador, nomUsu, nombre, apePaterno, apeMaterno, email, nomTiUsu from mydb.usuario join mydb.ti_usu ON (mydb.usuario.Ti_Usu_idTiUsu = mydb.ti_usu.idTiUsu)");
        model.setColumnIdentifiers(new Object[]{"id","run","Digito verificador","nombre usuario","nombre","apellido paterno","apellido materno","email","cargo"});
        try {
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("idUsu"),rs.getString("run"),  rs.getString("digitoverificador") ,rs.getString("nomUsu"),
                rs.getString("nombre"),rs.getString("apePaterno"),rs.getString("apeMaterno"),rs.getString("email"),rs.getString("nomTiUsu")});
            }
            nombreTabla.setModel(model);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void mostrardatos(String run, JTable nombreTabla) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("run");
    modelo.addColumn("DV");
    modelo.addColumn("nombre de usuario");
    modelo.addColumn("nombre");
    modelo.addColumn("apellido paterno");
    modelo.addColumn("apellido materno");
    modelo.addColumn("correo");
    modelo.addColumn("cargo");

    nombreTabla.setModel(modelo);
    String sql="";
    if(run.equals(""))
    {
        
        sql="SELECT idUsu, run,digitoverificador, nomUsu, nombre, apePaterno, apeMaterno, email,(select ti_usu.nomTiUsu from mydb.ti_usu WHERE mydb.usuario.Ti_Usu_idTiUsu = ti_usu.idTiUsu) from mydb.usuario ";
        JOptionPane.showMessageDialog(null, "Debe ingresar un run");
        
    }
    else{
        sql="SELECT idUsu, run,digitoverificador, nomUsu, nombre, apePaterno, apeMaterno, email, (select ti_usu.nomTiUsu from mydb.ti_usu WHERE mydb.usuario.Ti_Usu_idTiUsu = ti_usu.idTiUsu) from mydb.usuario WHERE run='"+run+"'";
    }
 
    String []datos = new String [9];
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
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                modelo.addRow(datos);
            }
            nombreTabla.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarUsuarioLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

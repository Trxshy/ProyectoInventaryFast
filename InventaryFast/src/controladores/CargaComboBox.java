/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Alexis
 */
public class CargaComboBox {
    
    public void cmbCargo(JComboBox cmbCargo){
        try {
            ConexionBD con = new ConexionBD();
            Connection cn = con.getConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT nomTiUsu FROM mydb.ti_usu");
            ResultSet rs = ps.executeQuery();
            
            cmbCargo.addItem("Seleccione un cargo");
            
            while(rs.next()){
            cmbCargo.addItem(rs.getString("nomTiUsu"));
            
                }
            rs.close();
        } catch (Exception e) {
        }
    }
    
    public void cmbCategoria (JComboBox cmbCategoria){
        try {
            ConexionBD con = new ConexionBD();
            Connection cn = con.getConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT nomCateg FROM mydb.categoria");
            ResultSet rs = ps.executeQuery();
            
            cmbCategoria.addItem("Seleccione una categoría");
            
            while(rs.next()){
                cmbCategoria.addItem(rs.getString("nomCateg"));
            }
            rs.close();
        } catch (Exception e) {
        }
    }
}

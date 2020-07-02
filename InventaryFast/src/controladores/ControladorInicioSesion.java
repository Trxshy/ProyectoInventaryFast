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
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alexis
 */
public class ControladorInicioSesion {

    public boolean validarUsuario(String user, String pass) throws SQLException, ClassNotFoundException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mydb.usuario WHERE nomUsu= " + "'"+user +"'"+ "AND clave = "+"'" +pass+"'");
            if (rs.first()){
                return true;
            }
            else{
                return false;
            }
    }

}

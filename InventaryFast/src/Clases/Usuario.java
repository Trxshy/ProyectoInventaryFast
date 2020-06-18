package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class Usuario {
    private String nombre;
    private String run;
    private String dv;
    private String apePaterno;
    private String apeMaterno;
    private String nomUsu;
    private String contrasenia;
    private String email;
    private String cargo;

    public Usuario(String nombre, String run, String dv, String apePaterno, String apeMaterno, String nomUsu, String contrasenia, String email, String cargo) {
        this.nombre = nombre;
        this.run = run;
        this.dv = dv;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.nomUsu = nomUsu;
        this.contrasenia = contrasenia;
        this.email = email;
        this.cargo = cargo;
    }





    public Usuario() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", run=" + run + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + ", nomUsu=" + nomUsu + ", contrasenia=" + contrasenia + ", email=" + email + '}';
    }
    
}

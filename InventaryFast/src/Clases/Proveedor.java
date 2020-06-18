package Clases;


public class Proveedor {
    private String nombre;
    private String run;
    private String Dv;
    private String numeroContacto;
    private String direccion;

    public Proveedor(String nombre, String run, String Dv, String numeroContacto, String direccion) {
        this.nombre = nombre;
        this.run = run;
        this.Dv = Dv;
        this.numeroContacto = numeroContacto;
        this.direccion = direccion;
    }



    public Proveedor() {
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
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

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nombre=" + nombre + ", run=" + run + ", numeroContacto=" + numeroContacto + ", direccion=" + direccion + '}';
    }
    
    
}

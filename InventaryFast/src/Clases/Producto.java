package Clases;


public class Producto {
    private String nomProd;
    private int precio;
    private String codBarra;
    private String categoria;
    private int stock;

    public Producto(String nomProd, int precio, String codBarra, String categoria ) {
        this.nomProd = nomProd;
        this.precio = precio;
        this.codBarra = codBarra;
        this.categoria = categoria;
    }

    public Producto(String nomProd, int precio, String codBarra, String categoria, int stock) {
        this.nomProd = nomProd;
        this.precio = precio;
        this.codBarra = codBarra;
        this.categoria = categoria;
        this.stock = stock;
    }
    



    public Producto() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String toString() {
        return "Producto{" + "nomProd=" + nomProd + ", precio=" + precio + ", codBarra=" + codBarra + '}';
    }
    
}

package upc.eetac.dsa;

public class Producte {
    String nombre;
    float precio;
    int numeroPedidos;

    public Producte(String nombre, float precio, int numeroPedidos) {
        this.nombre = nombre;
        this.precio = precio;
        this.numeroPedidos = numeroPedidos;
    }

    public Producte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroPedidos() {
        return numeroPedidos;
    }

    public void setNumeroPedidos(int numeroPedidos) {
        this.numeroPedidos = numeroPedidos;
    }
}

package upc.eetac.dsa;

public class Compra {
    String nomProducte;
    int cantidad;

    public Compra() {
    }

    public Compra(String producto, int cantidad) {
        this.nomProducte = producto;
        this.cantidad = cantidad;
    }

    public String getNomProducte() {
        return nomProducte;
    }

    public void setNom(String producto) {
        this.nomProducte = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

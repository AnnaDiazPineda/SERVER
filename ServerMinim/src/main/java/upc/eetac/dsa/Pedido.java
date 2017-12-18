package upc.eetac.dsa;

import java.util.Vector;

public class Pedido {
    Vector<Compra>productos;

    Usuario usuario;

    public Pedido() {
        this.productos = new Vector<Compra>();
    }

    public Vector<Compra> getProductos() {
        return productos;
    }

    public void setProductos(Vector<Compra> productos) {
        this.productos = productos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

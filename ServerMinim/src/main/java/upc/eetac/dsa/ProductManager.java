package upc.eetac.dsa;

import java.util.Collection;
import java.util.List;

public interface ProductManager {

    //per poder-ho asocciar
    List<Pedido> getPedidosUsuario(String nomUsuari);

    List<Producte> productesPerPreu();
    List<Producte> getProductosPorVentas();
    Pedido getPedido();
    boolean setPedido(Pedido pedido);


}

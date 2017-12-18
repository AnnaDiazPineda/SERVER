package upc.eetac.dsa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class ProductManagerImpl implements ProductManager {
    HashMap<String,Usuario> usuaris;
    Queue<Pedido> comanda;
    HashMap<String,Producte> existencies;

    static ProductManagerImpl instance;

    private static final Logger logger = LogManager.getLogger(ProductManagerImpl.class.getName());

    ProductManagerImpl() {
        usuaris = new HashMap<String, Usuario>();
        usuaris.put("marta",new Usuario("marta","marta@mail.com","1234"));
        usuaris.put("anna",new Usuario("anna","anna@mail.com","1234"));

        existencies = new HashMap<String, Producte>();
        existencies.put("ordinador",new Producte("ordinador",120.2f,1));
        existencies.put("ratoli",new Producte("clavos",1.5f,30));

        comanda = new LinkedList<Pedido>();
    }

    static public ProductManagerImpl getInstance()
    {
        if(instance==null) {
            instance = new ProductManagerImpl();

        }

        return instance;
    }







    public void setDown()
    {
        instance = null;
    }

    @Override
    public List<Pedido> getPedidosUsuario(String nomUsuari) {
        return null;
    }

    @Override
    public List<Producte> productesPerPreu() {
        return null;
    }

    @Override
    public List<Producte> getProductosPorVentas() {
        return null;
    }

    @Override
    public Pedido getPedido() {
        return null;
    }

    @Override
    public boolean setPedido(Pedido pedido) {
        return false;
    }
}

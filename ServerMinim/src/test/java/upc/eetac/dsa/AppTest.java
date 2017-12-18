package upc.eetac.dsa;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Before
    public void setUp()
    {
        ProductManagerImpl.getInstance();
    }

    @After
    public void tearDown()
    {
        ProductManagerImpl.getInstance().setDown();
    }

    @Test
    public void realizarPedido()
    {
        ProductManagerImpl productManager = ProductManagerImpl.getInstance();

        Pedido pedido = new Pedido();
        pedido.setUsuario(new Usuario("juan","juan@gmail.com","1234"));
        Vector<Compra> productos = new Vector<Compra>();
        productos.add(new Compra("silicona",3));
        productos.add(new Compra("clavos",30));
        pedido.setProductos(productos);

        assertEquals(productManager.setPedido(pedido),true);

        productos = new Vector<Compra>();
        productos.add(new Compra("patatas",3));
        productos.add(new Compra("clavos",30));
        pedido.setProductos(productos);

        assertEquals(productManager.setPedido(pedido),false);

        pedido.setUsuario(new Usuario("j","juan@gmail.com","1234"));
        productos = new Vector<Compra>();
        productos.add(new Compra("patatas",3));
        pedido.setProductos(productos);
        assertEquals(productManager.setPedido(pedido),false);
    }

    @Test
    public void servirUnpedido()
    {
        ProductManagerImpl productManager = ProductManagerImpl.getInstance();

        Pedido pedido = new Pedido();
        pedido.setUsuario(new Usuario("juan","juan@gmail.com","1234"));
        Vector<Compra> productos = new Vector<Compra>();
        productos.add(new Compra("silicona",3));
        productos.add(new Compra("clavos",30));
        pedido.setProductos(productos);
        productManager.setPedido(pedido);
        assertEquals(pedido,productManager.getPedido());
        assertNull(productManager.getPedido());
    }
}

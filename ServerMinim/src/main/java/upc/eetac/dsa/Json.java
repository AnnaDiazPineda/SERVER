package upc.eetac.dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

@Path("/json")
public class Json {

    ProductManagerImpl db;

    public Json() {
        this.db = ProductManagerImpl.getInstance();
    }
    Usuario usuario = new Usuario("anna", "anna@mail.com", "1234");

    //loggin
    @POST
    @PathParam("/Usuario/{email}")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario Login(@PathParam("email") String email, Login login){
        System.out.println(login.getPassword());
        Usuario u = new Usuario();

        try {

            u.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        if((u.getPassword().equals(login.getPassword())) && (u.getEmail().equals(login.getPassword())))
        {
            return u; //li retorno el usuario
        }
        return null;
    }


    @GET
    @Path("/ProductosPorPrecio/")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Producte> getProductosPrecio() {
        return db.productesPerPreu();
    }

    @GET
    @Path("/ProductosPorVentas/")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Producte> getVentas() {
        return db.getProductosPorVentas();
    }

    @GET
    @Path("/getPedidosusuario/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Pedido> getPedidosUsuario(@PathParam("usuario") String usuario) {
        return db.getPedidosUsuario(usuario);
    }


    @GET
    @Path("/servirPedido/")
    @Produces(MediaType.APPLICATION_JSON)
    public Pedido getPedido() {
        return db.getPedido();
    }


    @POST
    @Path("/addPedido/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPedido(Pedido pedido)
    {
        if(db.setPedido(pedido))
            return Response.status(201).entity("{\"result\":\"Añadir pedido\"}").type(MediaType.APPLICATION_JSON).build();

        return Response.status(409).entity("{\"result\":\"pedido no valido\"}").type(MediaType.APPLICATION_JSON).build();
    }
}

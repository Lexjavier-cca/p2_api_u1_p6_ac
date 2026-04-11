package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class PedidoService {
    //Logica de negocio, usar el prefijo service para las clases que se encargan de la logica de negocio
    @Inject
    private NotificadorMail notificadorMail;

    public void crear(Pedido pedido){
        System.out.println("Registrando el pedido: " + pedido);
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");
       //Sin DI:  NotificadorMail notificacion1= new NotificadorMail();
       //Con DI por el contenedor
        notificadorMail.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");
    }


}

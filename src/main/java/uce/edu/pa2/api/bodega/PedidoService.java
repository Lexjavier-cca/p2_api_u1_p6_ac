package uce.edu.pa2.api.bodega;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@Unremovable
@ApplicationScoped
public class PedidoService {
    //Logica de negocio, usar el prefijo service para las clases que se encargan de la logica de negocio
   
    //Di por constructor
   //@Inject
   // public PedidoService(NotificadorMail notificadorMail){
    //    this.notificadorMail=notificadorMail;

  //  }

   //Di por atributo
   // @Inject
   // private NotificadorMail notificadorMail;

   //DI por metodo
   /*
   private NotificadorMail notificadorMail; 
   @Inject 
   public void setNotificadorMail(NotificadorMail notificadorMail){
        this.notificadorMail=notificadorMail;
   }
   */
    @Inject
    private NotificadorSelector selector;

    @Inject
    private ComprobanteSelector compSelector;

    

    public void crear(Pedido pedido,PagoStrategy pago){
        System.out.println("Registrando el pedido: " + pedido);
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        pago.ejecutar(pedido.getTotal());
        

       //Sin DI:  NotificadorMail notificacion1= new NotificadorMail();
       //Con DI por el contenedor
        Notificador notificador=this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Su pedido ha sido registrado con exito");
        
        System.out.println("---Recibo---");
        Comprobante comp = compSelector.seleccionar(pedido);
        comp.generar(pedido.getDestino());
       

        
    }


}

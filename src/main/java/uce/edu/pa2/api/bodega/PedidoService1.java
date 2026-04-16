package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class PedidoService1 {
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




    public void crear(Pedido pedido){
        System.out.println("Registrando el pedido: " );
            
    }


}

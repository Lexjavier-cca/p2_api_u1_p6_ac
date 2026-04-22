package uce.edu.pa2.api.deber2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {
    @Inject
    private ConfiguracionAplicacion config;
       
    @Inject
    private GeneradorIDSingleton generador;

    @Inject
    private Descuento descuento;
  

    public void procesar(Pedido pedido) {
        System.out.println("Procesando el pedido en la aplicación: " + config.getNombreApp());
        System.out.println("Registrando el pedido:" );
        System.out.println("Id del pedido: " + this.generador.generar());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Subtotal: " + pedido.getTotal());
        descuento.setTotal(pedido.getTotal());
        double valorFinal = descuento.aplicarDescuento();
        System.out.println("Total con descuento: " + valorFinal);
        System.out.println("Guardando el pedido en la base de datos...");
        System.out.println("Pedido procesado exitosamente.");
        System.out.println();


    }

}

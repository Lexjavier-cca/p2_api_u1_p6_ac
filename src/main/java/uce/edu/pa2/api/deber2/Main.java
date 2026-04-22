package uce.edu.pa2.api.deber2;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

//import jakarta.inject.Inject;


@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class,args);
           
       
    }
    public static class App implements QuarkusApplication{
        @Inject
        private PedidoService pedidoService;

        @Inject 
        private Descuento descuentoTemporada;

        @Inject
        private ConfiguracionAplicacion config;
    
        @Override
        public int run(String... args) throws Exception {
            System.out.println("Bienvenidos a :  " + this.config.getNombreApp());
            Pedido pedido = new Pedido("Juan Perez", "Laptop", 1200.00, "juanp@gmail.com");
            System.out.println("Informacion del pedido: " + pedido);
            System.out.println("Descuento inicial de 10% por  temporada..."); 
            this.descuentoTemporada.setTotal(pedido.getTotal());
            double valorFinal = this.descuentoTemporada.aplicarDescuento();
            System.out.println("Total con descuento por temporada: " + valorFinal);
            pedido.setTotal(valorFinal);
            this.pedidoService.procesar(pedido);
            System.out.println();



            
            
           


            return 0;     
        }
    }

}

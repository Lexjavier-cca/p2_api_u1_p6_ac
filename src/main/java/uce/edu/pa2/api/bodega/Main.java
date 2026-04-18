package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
//import jakarta.inject.Inject;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class,args);
           
       
    }
    public static class App implements QuarkusApplication{
        //Modelos IoC
        //1. DI
    
        @Inject
        private PedidoService service;

        @Inject
        private PagoTarjeta tarjeta;

        @Inject
        private PagoEfectivo efectivo;
        
        //2. Service Locator (lookup)
        //private PedidoService service=CDI.current().select(PedidoService.class).get();
        @Override
        public int run(String... args) throws Exception {
            
            //Caso1
            Pedido pedido1 = new Pedido("Alex Caiza","Laptop",570,null);
            service.crear(pedido1,efectivo); 
             
            
            //Caso2
            Pedido pedido2 = new Pedido("Alex Caiza","Smartphone",80,"09999999");
            service.crear(pedido2,tarjeta);
            

            return 0;

            
        }
    }

}

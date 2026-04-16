package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class,args);   
       
    }
    public static class App implements QuarkusApplication{
        @Inject
        private PedidoService service;
        @Override
        public int run(String... args) throws Exception {
            //Caso1
            Pedido pedido1 = new Pedido("Alex Caiza","Laptop",150,"ales@gmail.com");
            this.service.crear(pedido1);  
            
            //Caso2
            Pedido pedido2 = new Pedido("Alex Caiza","Smartphone",80,"09999999");
            this.service.crear(pedido2);
            

            //caso3 
            Pedido pedido3= new Pedido("Alex Caiza","Audifonos",30,"09999999");
            this.service.crear(pedido3);
            return 0;

            
        }
    }

}

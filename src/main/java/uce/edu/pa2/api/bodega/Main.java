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
            Pedido pedido1 = new Pedido("Alex Caiza","Laptop",150,"ales@gmail.com");
            this.service.crear(pedido1);  
            return 0;
        }
    }

}

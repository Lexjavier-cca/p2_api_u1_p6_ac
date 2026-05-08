package uce.edu.pa2.api.bodega;

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
        private ProcesadorCompraService procesadorCompraService;

        @Override
        public int run(String... args) throws Exception {
            Compra comp1 = new Compra("Alex Caiza",Double.valueOf(100));
            this.procesadorCompraService.procesar(comp1);

            Compra comp2 = new Compra("",Double.valueOf(100));
            this.procesadorCompraService.procesar(comp2);

            Compra comp3 = new Compra("Maria Perez",Double.valueOf(0.0));
            this.procesadorCompraService.procesar(comp3);

            Compra comp4 = new Compra(null,Double.valueOf(0.0));
            this.procesadorCompraService.procesar(comp4);
            
            return 0;     
        }
    }

}

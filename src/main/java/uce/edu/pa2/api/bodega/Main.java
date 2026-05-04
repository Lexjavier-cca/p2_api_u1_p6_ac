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
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;

        @Inject
        private InventarioService inventarioService;

        @Override
        public int run(String... args) throws Exception {
            Venta v1 = new Venta("Alex Caiza", 70.00);
            this.procesadorVentaServiceTiempo.procesar(v1);
            Venta v2 = new Venta("Maria Gomez", 150.00);
            this.procesadorVentaServiceTiempo.procesar(v2);
            Venta v3 = new Venta("Juan Perez", 200.00);
            this.procesadorVentaServiceTiempo.procesar(v3);
            //this.procesadorVentaServiceTiempo.reprocesar(v1);
            //this.inventarioService.registrar(v1);


            
            return 0;     
        }
    }

}

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
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private ProcesadorVentaEnLineaService procesadorVentaEnLinea;

        @Inject 
        private EstadisticasVentasGlobales estadisticasVentasGlobales;


         
    
        @Override
        public int run(String... args) throws Exception {
            System.out.println("---Procesador Ventas---");
            Venta v1 = new Venta("Alex Caiza", 70.00);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Rita Lazo", 40.00);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Alan Brito", 20.00);
            this.procesadorVentaService.procesar(v3);

            System.out.println("---Procesador Ventas 1---");
            Venta v4 = new Venta("Alma Marcela", 20.00);
            this.procesadorVentaService1.procesar(v4);

            Venta v5 = new Venta("Fito Paez", 20.00);
            this.procesadorVentaService1.procesar(v5);

            System.out.println("---Procesador Ventas en Linea---");
            Venta v6 = new Venta("Carlos Lema", 20.00);
            this.procesadorVentaEnLinea.procesar(v6);


            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            
            return 0;     
        }
    }

}

package uce.edu.pa2.api.principal;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.Pedido;
import uce.edu.pa2.api.bodega.PedidoService;
import uce.edu.pa2.api.citas.Cita;
import uce.edu.pa2.api.citas.CitaService;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class,args);   
       
    }
    public static class App implements QuarkusApplication{
        @Inject
        private PedidoService service;
        @Inject
        private CitaService citaService;
        @Override
        public int run(String... args) throws Exception {
            System.out.println("-----Impresión para pedidos-----");
            Pedido pedido1 = new Pedido("Alex Caiza","Vitamina C",20,"ales@gmail.com");
            this.service.crear(pedido1);  
            System.out.println("-----Impresión para citas----");
            Cita cita1 = new Cita("Alan Brito","Dr.Manuel Bravo","Cardiología","2024-07-15","alan@gmail.com");
            this.citaService.agendar(cita1);

            return 0;
        }
    }

}

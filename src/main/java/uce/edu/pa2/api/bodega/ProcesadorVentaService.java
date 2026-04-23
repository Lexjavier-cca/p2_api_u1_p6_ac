package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService {
    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @Inject
    private TrakingVenta trakingVenta;

    public void procesar(Venta venta) throws InterruptedException{
        this.trakingVenta.iniciar();
        //inicia la venta
        System.out.println("Procesando pedido: " + venta);
        //consultando a la base de datos
        //consultando el stock de cada item
        //entre otras cosas
        //finaliza la venta
        try{
            Thread.sleep(100);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
         // Simula un retraso en el procesamiento
        this.trakingVenta.finalizar();

        //registrar la venta en las estadísticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }
}

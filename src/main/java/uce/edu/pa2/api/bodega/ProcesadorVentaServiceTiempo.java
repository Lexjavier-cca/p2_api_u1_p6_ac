package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {
    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;


    @MedirTiempo
    @Log
    public void procesar(Venta venta) throws InterruptedException{
        //System.out.println("Entro al metodo con los siguientes valores: " + venta.getTotal());

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


        //registrar la venta en las estadísticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del pedido");
        //this.reprocesar(venta);  //no se va a ejecutar el interceptor porque es una llamada interna
    }

    @MedirTiempo
    public void reprocesar(Venta venta){
        //inicia la venta
        System.out.println("Reprocesando pedido: " + venta);
        //consultando a la base de datos
        //consultando el stock de cada item
        //entre otras cosas
        //finaliza la venta
        try{
            Thread.sleep(250);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Finalizando el reproceso");
    }
}

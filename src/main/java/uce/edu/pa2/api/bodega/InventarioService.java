package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class InventarioService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void registrar(Venta venta) throws InterruptedException{

        //inicia la venta
        System.out.println("Registrando en el inventario la siguiente venta: " + venta);
        //consultando a la base de datos
        //consultando el stock de cada item
        //entre otras cosas
        //finaliza la venta
        try{
            Thread.sleep(500);

        }catch(InterruptedException e){
            e.printStackTrace();
        }


        //registrar la venta en las estadísticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del registro del inventario");
    }


}

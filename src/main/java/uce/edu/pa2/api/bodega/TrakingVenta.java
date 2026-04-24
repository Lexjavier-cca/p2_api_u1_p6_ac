package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
// Esta clase se encarga de medir el tiempo de ejecución de una vent
@Dependent
public class TrakingVenta {
    private long tiempoInicio = 0;
    private long tiempoFinal = 0;

    public void iniciar() {
        this.tiempoInicio =this.tiempoInicio + System.currentTimeMillis();

    }

    public void finalizar(){
        this.tiempoFinal =  this.tiempoFinal + System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - this.tiempoInicio;
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");
    }

}

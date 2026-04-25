package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TrakingVenta {
    private long tiempoInicio = 0;
    private long tiempoFinal = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones =0;


    public void iniciar() {
        this.tiempoInicio =this.tiempoInicio + System.currentTimeMillis();

    }

    public void finalizar(){
        this.tiempoFinal = this.tiempoFinal + System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - this.tiempoInicio;
        //System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");

        this.tiempoTotalAcumulado += tiempoEjecucion;
        this.numeroOperaciones++;

        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");
        System.out.println("Tiempo acumulado: " + this.tiempoTotalAcumulado + " ms");
        System.out.println("Cantidad de operaciones: " + this.numeroOperaciones  );
    }

}

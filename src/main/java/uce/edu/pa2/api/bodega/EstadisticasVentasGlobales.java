package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadisticasVentasGlobales {
    private int totalVentas = 0;
    private double montoTotalVendido = 0.0;

    public void registrarVenta(double totalVentaIndividual) {
       this.totalVentas++;
       this.montoTotalVendido += totalVentaIndividual;
    }

    public void mostrarEstadisticasGlobales() {
        System.out.println("Estadísticas globales:");
        System.out.println("Cantidad de Ventas: " + this.totalVentas);
        System.out.println("Valor total Vendido: " + this.montoTotalVendido);
    }
}

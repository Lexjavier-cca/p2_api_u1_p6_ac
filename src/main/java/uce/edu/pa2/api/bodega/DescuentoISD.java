package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoISD implements Descuento {
    @Override
    public double aplicar(double valor){
        System.out.println("Aplicando descuento ISD...");
        double valorDescuento = valor * 0.1;
        return valor - valorDescuento;
    }

}

package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoVerano implements Descuento {
    @Override
    public double aplicar(double valor){
        System.out.println("Aplicando descuento de verano...");
        double valorDescuento = valor * 0.05;
        return valor - valorDescuento;
    }


}

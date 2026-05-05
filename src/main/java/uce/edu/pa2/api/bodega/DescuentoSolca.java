package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSolca implements Descuento {
    @Override
    public double aplicar(double valor){
        System.out.println("Aplicando descuento SOLCA...");
        double valorDescuento = valor * 0.20;
        return valor - valorDescuento;
    }

}

package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class DescuentoSolca implements Descuento {
    @Override
    public double aplicar(double valor){
        System.out.println("Aplicando descuento SOLCA...");
        double valorDescuento = valor * 0.20;
        return valor - valorDescuento;
    }

}

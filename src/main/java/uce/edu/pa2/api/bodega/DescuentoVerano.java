package uce.edu.pa2.api.bodega;


import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(4)
public class DescuentoVerano implements Descuento {
    @Override
    public double aplicar(double valor){
        System.out.println("Aplicando descuento de verano...");
        double valorDescuento = valor * 0.05;
        return valor - valorDescuento;
    }


}

package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements Impuesto{

    @Override
    public double calcular(double valor) {
        System.out.println("Calculando impuesto ICE...");
        return valor * 1.10;
    }

}

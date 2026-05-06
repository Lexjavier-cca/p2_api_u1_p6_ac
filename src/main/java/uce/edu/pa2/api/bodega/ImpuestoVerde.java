package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoVerde implements Impuesto{

    @Override
    public double calcular(double valor) {
        System.out.println("Calculando impuesto verde...");
        return valor * 1.05;
    }

}

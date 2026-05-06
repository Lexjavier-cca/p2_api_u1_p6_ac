package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoArancelario implements Impuesto{

    @Override
    public double calcular(double valor) {
        System.out.println("Calculando impuesto arancelario...");
        return valor * 1.35;
    }

}

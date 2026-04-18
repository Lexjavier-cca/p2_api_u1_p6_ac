package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoEfectivo implements PagoStrategy {

    @Override
    public void ejecutar(double valor) {
        // TODO Auto-generated method stub
        System.out.println("Presentando una pantalla");
        System.out.println("Realizando Cobro");
    }

}

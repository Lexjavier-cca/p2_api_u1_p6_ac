package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped
public class ComprobantePDF implements Comprobante {

    @Override
    public void generar(String destino) {
        // TODO Auto-generated method stub
        System.out.println("Generando un comprobante digital PDF");
        System.out.println("Generado Comprobante.PDf");
    }

}

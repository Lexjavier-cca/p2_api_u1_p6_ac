package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements Comprobante{

    @Override
    public void generar(String destino) {
        // TODO Auto-generated method stub
        System.out.println("Generando un comprobante físico");
        System.out.println("Comprobante físico generado");
    }

}

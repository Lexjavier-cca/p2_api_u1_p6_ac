package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;  


@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos;

    @Inject
    private Instance<Validador> validadores;

    public void procesar(Compra compra){
        System.out.println("Procesando compra...");
        for(Validador val : validadores){

        if(!val.validar(compra)){
            System.out.println("Compra cancelada");
            return;
        }
    }

        double total = compra.getSubtotal();


        for(Descuento des : descuentos){

            total = des.aplicar(total);

            compra.setSubtotal(total);

            System.out.println("Su valor a pagar es: " + total);

            
        }
    }
}
package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;  


@ApplicationScoped
public class ProcesadorCompraService {
    @Inject
    private Instance<Descuento> descuentos;
    public void procesar(Compra compra){
        double total = compra.getSubtotal();

        for(Descuento des : descuentos){
            total = des.aplicar(total);
            //compra.setSubtotal(valorNuevo);
            System.out.println("Su valor a pagar es: " + total);
            
        }
        compra.setSubtotal(total);
    }

}

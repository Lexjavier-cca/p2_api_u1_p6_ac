package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;  


@ApplicationScoped
public class ProcesadorCompraService {
    @Inject
    private Instance<Impuesto> impuestos;
    
    public void procesar(Compra compra){
        double total = compra.getSubtotal();

        for(Impuesto imp: impuestos){
            total = imp.calcular(total);
            //compra.setSubtotal(valorNuevo);
            System.out.println("Su valor a pagar es: " + total);
            
        }
        compra.setSubtotal(total);
    }

}

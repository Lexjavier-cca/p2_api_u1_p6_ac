package uce.edu.pa2.api.bodega;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;    
@ApplicationScoped
@Priority(1)
public class ValidadorSubtotal implements Validador {

    @Override
    public boolean validar(Compra compra) {
        if(compra.getSubtotal() <= 0){
            System.out.println("El subtotal no puede ser negativo o cero");
            return false;
        }
        System.out.println("Subtotal válido: " + compra.getSubtotal());
        return true;
    }
}

   

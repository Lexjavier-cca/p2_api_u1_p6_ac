package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class ValidadorCliente implements Validador {

    @Override
    public boolean validar(Compra compra) {
        if(compra.getCliente() == null || compra.getCliente().isEmpty()){
            System.out.println("El cliente no puede ser nulo o vacío");
            return false;
        }
        System.out.println("Cliente válido: " + compra.getCliente());
        return true;
    }

}

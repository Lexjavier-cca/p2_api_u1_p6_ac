package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorMail {
    public void enviar(String correo, String mensaje) {
        // Lógica para enviar el correo electrónico
        System.out.println("Se envia el mail al correo: " + correo);
        System.out.println("con el mensaje: " + mensaje);
    }


}

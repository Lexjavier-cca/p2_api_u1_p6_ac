package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorSMS implements Notificador {
    public void enviar(String destino, String mensaje) {
        // Lógica para enviar el SMS
        System.out.println("Se envia el SMS al numero: " + destino);
        System.out.println("con el mensaje: " + mensaje);
    }
}

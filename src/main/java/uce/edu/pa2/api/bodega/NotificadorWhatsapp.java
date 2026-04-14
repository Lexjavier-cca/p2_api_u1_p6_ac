package uce.edu.pa2.api.bodega;

public class NotificadorWhatsapp implements Notificador{
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el SMS al numero: " + destino);
        System.out.println("con el mensaje: " + mensaje);
    }

}

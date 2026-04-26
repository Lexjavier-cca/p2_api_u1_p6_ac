# p2_api_u1_p6_ac

## Descripción
En este proyecto se muestran los talleres trabajados en la Unidad 1 de la materia de Programación Avanzada 2 de la Universidad Central del Ecuador,en el cual se vieron temas como Contenedores, CDI, DI, IoC, Ámbitos y contextos, entre otros más.

## Tecnologías Usadas
- Java
- Quarkus
- Maven

# Deber Número 3
## Ejemplos de uso de la anotación @Dependent
Por cada vez que se inyecte una clase con esta anotación, se creará una nueva instancia
### Ejemplo 1
``` java
import jakarta.enterprise.context.Dependent;

/**
 * Servicio de operaciones matemáticas básicas.
 */
@Dependent
public class CalculadoraService {

    /**
     * Suma dos números enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return resultado de la suma
     */
    public int sumar(int a, int b) {
        return a + b;
    }
}
```
### Ejemplo 2
``` java
import jakarta.enterprise.context.Dependent;

/**
 * Clase utilitaria para formateo de texto. 
 */
@Dependent
public class FormateadorTexto {

    /**
     * Convierte un texto a mayúsculas.
     *
     * @param texto texto de entrada
     * @return texto en mayúsculas
     */
    public String mayusculas(String texto) {
        return texto.toUpperCase();
    }
}
```
### Ejemplo 3
``` java
import jakarta.enterprise.context.Dependent;

/**
 * Componente encargado de validar direcciones de correo electrónico.
 */
@Dependent
public class ValidadorEmail {

    /**
     * Verifica si un correo electrónico tiene un formato básico válido.
     *
     * @param email correo a validar
     * @return true si contiene '@', caso contrario retorna false
     */
    public boolean esValido(String email) {
        return email.contains("@");
    }
}
```
### Ejemplo 4
```java
import jakarta.enterprise.context.Dependent;

/**
 * Clase que lleva un conteo de operaciones realizadas.
 * Cada instancia mantiene su propio contador independiente.
 */
@Dependent
public class ContadorOperacion {

    private int contador = 0;

    /**
     * Incrementa el contador en una unidad.
     */
    public void incrementar() {
        contador++;
    }

    /**
     * Obtiene el valor actual del contador.
     *
     * @return número de incrementos realizados
     */
    public int getContador() {
        return contador;
    }
}
```
### Ejemplo 5
```java
import jakarta.enterprise.context.Dependent;

/**
 * Clase encargada de realizar conversiones de moneda(dólar a euro).
 */
@Dependent
public class ConversorMoneda {

    /**
     * Convierte una cantidad en dólares a euros.
     *
     * @param dolar cantidad en dólares
     * @return equivalente en euros
     */
    public double dolarAEuro(double dolar) {
        return dolar * 0.92;
    }
}
```
### Ejemplo 6
``` java
import jakarta.enterprise.context.Dependent;
import java.util.UUID;

/**
 * Generador de identificadores únicos.
 * Cada instancia genera IDs independientes usando UUID.
 */
@Dependent
public class GeneradorId {

    /**
     * Genera un identificador único.
     *
     * @return cadena UUID generada
     */
    public String generar() {
        return UUID.randomUUID().toString();
    }
}
```
### Ejemplo 7
``` java
import jakarta.enterprise.context.Dependent;

/**
 * Clase que cuenta clics de manera independiente.
 */
@Dependent
public class ContadorClicks {

    private int clicks = 0;

    /**
     * Incrementa el número de clics.
     */
    public void click() {
        clicks++;
    }

    /**
     * Obtiene el total de clics.
     *
     * @return número de clics registrados
     */
    public int getClicks() {
        return clicks;
    }
}

```
## Ejemplos de uso de la anotación @ApplicationScoped
Al ser @ApplicationScoped,existe una sola instancia compartida para toda la aplicación.
### Ejemplo 1
``` java
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Envía notificaciones del sistema.
 */
@ApplicationScoped
public class NotificacionService {

    /**
     * Envía una notificación.
     *
     * @param mensaje contenido del mensaje
     */
    public void enviar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }
}
```
### Ejemplo 2
```java 
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Servicio de autenticación simple.
 */
@ApplicationScoped
public class AuthService {

    /**
     * Valida credenciales básicas.
     *
     * @param usuario usuario
     * @param password contraseña
     * @return true si es válido
     */
    public boolean login(String usuario, String password) {
        return "admin".equals(usuario) && "1234".equals(password);
    }
}
```
### Ejemplo 3
```java
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Calcula estadísticas globales.
 */
@ApplicationScoped
public class EstadisticasService {

    private int totalVentas = 0;

    /**
     * Registra una venta.
     */
    public void registrarVenta() {
        totalVentas++;
    }

    /**
     * Obtiene el total de ventas.
     *
     * @return número de ventas
     */
    public int getTotalVentas() {
        return totalVentas;
    }
}
```
### Ejemplo 4
``` java
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Servicio de registro de mensajes.
 */
@ApplicationScoped
public class LoggerService {

    /**
     * Imprime un mensaje en consola.
     *
     * @param mensaje texto a mostrar
     */
    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}
```
### Ejemplo 5
``` java
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Servicio de registro de mensajes.
 */
@ApplicationScoped
public class LoggerService {

    /**
     * Imprime un mensaje en consola.
     *
     * @param mensaje texto a mostrar
     */
    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}
```
### Ejemplo 6
``` java
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona usuarios en memoria.
 */
@ApplicationScoped
public class UsuarioService {

    private List<String> usuarios = new ArrayList<>();

    /**
     * Agrega un usuario.
     *
     * @param nombre nombre del usuario
     */
    public void agregarUsuario(String nombre) {
        usuarios.add(nombre);
    }

    /**
     * Lista todos los usuarios.
     *
     * @return lista de usuarios
     */
    public List<String> getUsuarios() {
        return usuarios;
    }
}
```
### Ejemplo 7
``` java 
import jakarta.enterprise.context.ApplicationScoped;

/**
 * 
 * Servicio encargado de procesar pagos dentro del sistema.
 * 
 */
@ApplicationScoped
public class PagoService {

    private double totalProcesado = 0;

    /**
     * Procesa un pago y acumula el total.
     *
     * @param monto cantidad del pago
     */
    public void procesarPago(double monto) {
        totalProcesado += monto;
        System.out.println("Pago procesado: $" + monto);
    }

    /**
     * Obtiene el total de pagos procesados.
     *
     * @return total acumulado
     */
    public double getTotalProcesado() {
        return totalProcesado;
    }
}
```
## Ejemplos de uso de la anotación @Singleton
Solo existe una instancia en toda la aplicación.
### Ejemplo 1
```java 
import jakarta.inject.Singleton;

/**
 * Clase que almacena configuraciones globales del sistema.
 * 
 * 
 */
@Singleton
public class ConfiguracionGlobal {

    private String entorno = "PRODUCCION";

    /**
     * Obtiene el entorno actual.
     *
     * @return entorno configurado
     */
    public String getEntorno() {
        return entorno;
    }
}
```
### Ejemplo 2
``` java
import jakarta.inject.Singleton;

/**
 * Servicio de logging centralizado.
 */
@Singleton
public class LoggerSingleton {

    /**
     * Registra un mensaje en consola.
     *
     * @param mensaje texto a mostrar
     */
    public void log(String mensaje) {
        System.out.println("[LOG GLOBAL] " + mensaje);
    }
}
```
### Ejemplo 3
``` java
import jakarta.inject.Singleton;

/**
 * Genera números secuenciales únicos.
 */
@Singleton
public class GeneradorSecuencia {

    private int secuencia = 0;

    /**
     * Genera el siguiente número de la secuencia.
     *
     * @return número único incremental
     */
    public int siguiente() {
        return ++secuencia;
    }
}
```
### Ejemplo 4
``` java
import jakarta.inject.Singleton;

/**
 * Simula la gestión de una conexión única (por ejemplo, a base de datos).
 */
@Singleton
public class GestorConexiones {

    private boolean conectado = false;

    /**
     * Establece la conexión.
     */
    public void conectar() {
        if (!conectado) {
            conectado = true;
            System.out.println("Conexión establecida");
        }
    }

    /**
     * Verifica si está conectado.
     *
     * @return estado de conexión
     */
    public boolean isConectado() {
        return conectado;
    }
}
```
### Ejemplo 5
``` java
import jakarta.inject.Singleton;

/**
 * Servicio global de notificaciones.
 */
@Singleton
public class NotificadorGlobal {

    /**
     * Envía una notificación del sistema.
     *
     * @param mensaje contenido del mensaje
     */
    public void notificar(String mensaje) {
        System.out.println("Notificación global: " + mensaje);
    }
}
```
### Ejemplo 6 
```java
import jakarta.inject.Singleton;

/**
 * Monitorea el estado del sistema.
 */
@Singleton
public class MonitorSistema {

    /**
     * Muestra el estado actual del sistema.
     */
    public void estado() {
        System.out.println("Sistema operativo correctamente");
    }
}
```
### Ejemplo 7
``` java
import jakarta.inject.Singleton;
import java.time.LocalDateTime;

/**
 * Proporciona la hora actual del sistema.
 */
@Singleton
public class ServicioTiempo {

    /**
     * Obtiene la fecha y hora actual.
     *
     * @return fecha y hora
     */
    public LocalDateTime ahora() {
        return LocalDateTime.now();
    }
}
``` 
## Autor 
Alex Caiza

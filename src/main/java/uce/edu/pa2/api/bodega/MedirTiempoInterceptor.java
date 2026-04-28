package uce.edu.pa2.api.bodega;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor 
public class MedirTiempoInterceptor {
    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception{
        System.out.println("Se ejecuto antes del metodo");
        long inicio = System.currentTimeMillis();
        //Inicia la ejecución del método 
        //Si no se llama al método proceed, nunca se ejecuta el método

        Object resultado = context.proceed();
        // pasa a la línea 17 una vez se termine de ejecutar el método de negocio


        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido);

        return resultado;

    }



}

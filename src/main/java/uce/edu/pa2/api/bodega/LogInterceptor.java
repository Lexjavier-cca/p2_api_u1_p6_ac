package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Log
@Interceptor
@Priority(1)
public class LogInterceptor {
    @AroundInvoke
    public Object log(InvocationContext context) throws Exception{
        System.out.println("Se ejecuto el log antes del metodo");
        System.out.println("Metodo interceptado: " + context.getMethod().getName());
        Object[] args = context.getParameters();
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumento " +  ": " + args[i]);
            Object obj = args[i];
            Venta venta = (Venta) obj;
            System.out.println(venta.getCliente());
            System.out.println(venta.getTotal());
        }
        Object resultado = context.proceed();
        return resultado;
    }

}

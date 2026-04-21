package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {
    @Inject
    private AmbitoAplicacion ambito;

    @Inject
    private AmbitoInject ambitoInject;

    @Inject
    private AmbitoSingleton ambitoSingleton;

    public void imprimirObjetoValor(){
        System.out.println(this.ambito);
        System.out.println(this.ambito.incrementar());
    }

    public void imprimirObjetoValorInject(){
        System.out.println(this.ambitoInject);
        System.out.println(this.ambitoInject.incrementar());
    }

    public void imprimirObjetoValorSingleton(){
        System.out.println(this.ambitoSingleton);
        System.out.println(this.ambitoSingleton.incrementar());
    }

}

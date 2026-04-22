package uce.edu.pa2.api.deber2;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConfiguracionAplicacion {
    private String nombreApp = "Tiendita Ec";
    public String getNombreApp(){
        
        return this.nombreApp;
    }

}

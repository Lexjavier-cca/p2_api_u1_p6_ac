package uce.edu.pa2.api.deber2;

import jakarta.enterprise.context.ApplicationScoped;
//Usando el ApplicationScoped 
@ApplicationScoped
public class ConfiguracionAplicacion {
    private String nombreApp = "Tiendita Ec";
    public String getNombreApp(){
        
        return this.nombreApp;
    }

}

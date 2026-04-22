package uce.edu.pa2.api.deber2;

import jakarta.inject.Singleton;

@Singleton
public class GeneradorIDSingleton {
    public int id = 0;
    public int generar() {
        id++;
        return id;
    }

}

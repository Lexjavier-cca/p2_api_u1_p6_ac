package uce.edu.pa2.api.deber2;

import jakarta.enterprise.context.Dependent;
//Usando el dependent
@Dependent
public class Descuento {
    private double total;
    
    public void setTotal(double total) {
        this.total = total;
    }

    public double aplicarDescuento() {
        if (total > 100) {
            return total * 0.9;
        }
        return total;
    }
}

package uce.edu.pa2.api.deber2;

import jakarta.enterprise.context.Dependent;
@Dependent
public class Pedido {
    //Atributos de las clases
    private String cliente;
    private String producto;
    private double total;
    private String destino;
    private int id;

    //Metodo constructor por defecto
    public Pedido() {
    }
    //Metodo constructor
    public Pedido(String cliente, String producto, double total, String correo) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.destino = correo;
        
    }

    //Metodos get y set
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String correo) {
        this.destino = correo;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", producto=" + producto + ", total=" + total + ", correo=" + destino
                + "]";
    }


}

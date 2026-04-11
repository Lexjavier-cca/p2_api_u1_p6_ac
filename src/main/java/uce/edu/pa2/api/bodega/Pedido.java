package uce.edu.pa2.api.bodega;

public class Pedido {
    //Atributos de las clases
    private String cliente;
    private String producto;
    private double total;
    private String correo;
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
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //Metodo constructor
    public Pedido(String cliente, String producto, double total, String correo) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.correo = correo;
    }
    //Metodo constructor por defecto
    public Pedido() {
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", producto=" + producto + ", total=" + total + ", correo=" + correo
                + "]";
    }
}

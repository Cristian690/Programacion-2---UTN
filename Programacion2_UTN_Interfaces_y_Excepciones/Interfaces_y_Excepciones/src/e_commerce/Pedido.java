package e_commerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Producto> productos;
    private String estado;
    private Cliente cliente;
    private Pago metodoPago;

    public Pedido(String estado, Cliente cliente, Pago metodoPago) {
        this.productos = new ArrayList<>();
        this.estado = estado;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
    }
    
    public void agregarProducto(Producto productos){
        this.productos.add(productos);
    }

    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        cliente.notificar("El estado de pedido es: " + nuevoEstado);
    }
    public double calcularTotal(){
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    public void procesarPedido(){
        double total = calcularTotal();
        metodoPago.procesarPago(total);
    }
}
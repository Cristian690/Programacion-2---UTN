
package TP5Ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;
    
    public Reserva(String fecha, String hora, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha != null && !fecha.trim().isEmpty()) {
            this.fecha = fecha;
        } else {
            System.out.println("Fecha inválida.");
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora != null && !hora.trim().isEmpty()) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() { 
        return "Fecha Reserva: " + fecha + "  Hora: " + hora + "\n" + mesa + "\n" + cliente;
    }
    
}

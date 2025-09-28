
package TP5Ejercicio4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;    
    
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido.");
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni != null && !dni.trim().isEmpty()) {
            this.dni = dni;
        } else {
            System.out.println("DNI inválido.");
        }
    }
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    @Override
    public String toString() {
        return "Nombre Cliente: " + nombre + " Dni: " + dni +"\n" + "Tarjeta Nro: " + tarjeta.getNumero();
    }
}

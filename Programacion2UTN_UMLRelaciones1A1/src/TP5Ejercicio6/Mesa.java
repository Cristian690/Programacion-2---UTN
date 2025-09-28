
package TP5Ejercicio6;

public class Mesa {
    private String numero;
    private String capacidad;
    
    public Mesa(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null && !numero.trim().isEmpty()) {
            this.numero = numero;
        } else {
            System.out.println("Número inválido.");
        }
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        if (capacidad != null && !capacidad.trim().isEmpty()) {
            this.capacidad = capacidad;
        } else {
            System.out.println("Capacidad inválido.");
        }
    }
    @Override
    public String toString() {
        return "Numero Mesa: " + numero + "  Capacidad: " + capacidad;
     }
    
}

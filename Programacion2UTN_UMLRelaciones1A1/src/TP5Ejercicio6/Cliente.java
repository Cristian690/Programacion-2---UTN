
package TP5Ejercicio6;

public class Cliente {
    private String nombre;
    private String telefono;   
    
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            this.telefono = telefono;
        } else {
            System.out.println("Telefono inválido.");
        }
    }
    @Override
    public String toString() {
        return "Nombre Cliente: " + nombre + "  Teléfono: " + telefono;
     }
    
}

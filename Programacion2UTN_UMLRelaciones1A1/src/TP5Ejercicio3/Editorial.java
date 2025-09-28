
package TP5Ejercicio3;

public class Editorial {
    private String nombre;
    private String direccion;
    
    
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } else {
            System.out.println("Dirección inválida");
        }
    }    
    @Override
    public String toString() {
        return "Nombre Editorial: " + nombre + " Dirección: " + direccion;
    }
    
}

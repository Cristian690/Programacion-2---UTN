
package TP5Ejercicio14;

public class Proyecto {
    private String nombre;
    private String duracionMin;
    
    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre Inválido");
        }
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(String duracionMin) {
        if(duracionMin != null && !duracionMin.trim().isEmpty()) {
            this.duracionMin = duracionMin;
        } else {
            System.out.println("Duración inválida.");
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "  Duracion: " + duracionMin;
    }
    
}

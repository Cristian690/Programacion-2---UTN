
package TP5Ejercicio4;

public class Banco {
    private String nombre;
    private String cuit;
    
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        if (cuit != null && !cuit.trim().isEmpty()) {
            this.cuit = cuit;
        } else {
            System.out.println("Cuit inválido.");
        }
    }
    @Override
    public String toString() {
        return "Nombre Banco: " + nombre + " Cuit Banco: " +cuit;
    }
}
 

package TP5Ejercicio11;

public class Artista {
    private String nombre;
    private String genero;
    
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null && !genero.trim().isEmpty()) {
            this.genero = genero;
        } else {
            System.out.println("Genero inválido.");
        }
    }
    
    @Override
    public String toString() {
        return  nombre + "  Género: " + genero;
    }
    
}

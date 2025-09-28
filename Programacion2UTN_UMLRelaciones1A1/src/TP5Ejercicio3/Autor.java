
package TP5Ejercicio3;


public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre Inválido");
        }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad != null && !nacionalidad.trim().isEmpty()) {
            this.nacionalidad = nacionalidad;
        } else {
            System.out.println("Nacionalidad Inválida");
        }
    }
    
    @Override
    public String toString() {
        return "Nombre Autor: " + nombre + " Nacionalidad: " + nacionalidad;
    }
    
    
}

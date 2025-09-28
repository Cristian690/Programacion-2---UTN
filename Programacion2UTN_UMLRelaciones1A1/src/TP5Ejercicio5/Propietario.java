
package TP5Ejercicio5;

public class Propietario {
    private String nombre;
    private String dni;
    Computadora computadora;
    
    public Propietario(String nombre, String dni) {
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
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    @Override
    public String toString() {
        return "Nombre Propietario: " + nombre + " DNI: " + dni;
    }
}


package TP5Ejercicio8;

public class Usuario {
    private String nombre;
    private String email;
    
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        } else {
            System.out.println("E-mail inválido.");
        }
    }
    
    @Override
    public String toString() {
        return "Nombre Usuario: " + nombre + "  E-Mail: " + email;
    }
    
}

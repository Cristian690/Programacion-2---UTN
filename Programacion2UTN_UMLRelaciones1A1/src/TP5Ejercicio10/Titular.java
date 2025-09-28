
package TP5Ejercicio10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    
    public Titular(String nombre, String dni) {
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

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    @Override
    public String toString(){
        return "Nombre Titular: " + nombre + "  Dni: " + dni;
    }
}

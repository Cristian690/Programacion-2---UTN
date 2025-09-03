
package TP3Ejercicio2;


public class Mascota {
    String nombre;
    String especie;
    int edad;
   
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Tiene " + edad + " años.");
    }
    
    public void cumplirAnio() {
        edad += 1;
        System.out.println("Ahora " + nombre + " tiene " + edad + " años");
    }
    
    
    
    
    
}

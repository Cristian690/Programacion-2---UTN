
package Animales;

public class Perro extends Animal{
    private String nombre;
    private String raza;
    private int edad;
    
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Guau!!!...Guau!!!");
    }
    @Override
    public String toString() {
        return "Nombre Perro: " + nombre + ", Raza: " + raza + ", Edad: " + edad;
    }
}

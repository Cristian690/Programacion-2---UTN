
package Animales;

public class Gato extends  Animal{
    private String nombre;
    private String color;
    private int edad;
    
    public Gato(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau!!!!!!.......Miau!!!!!!!");
    }
    
    @Override
    public String toString() {
        return "Nombre Gato: " + nombre + ", Color: " + color + ", Edad:" + edad;
    }
    
}

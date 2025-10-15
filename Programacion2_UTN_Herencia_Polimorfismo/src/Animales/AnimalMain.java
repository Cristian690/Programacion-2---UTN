
package Animales;

import java.util.ArrayList;

public class AnimalMain {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Roco", "Dogo", 5));
        animales.add(new Gato("Loki", "Gris", 12));
        animales.add(new Gato("Mauricio", "Amarillo", 7));
        animales.add(new Vaca("Lola", "Blanco", true));
        animales.add(new Perro("Max", "Pastor Alemán", 3));
        animales.add(new Gato("Misha", "Negro", 4));
        animales.add(new Vaca("Clarita", "Marrón", false));
        animales.add(new Perro("Bobby", "Beagle", 6));
        animales.add(new Gato("Simba", "Naranja", 2));
        animales.add(new Vaca("Daisy", "Blanco y Negro", true));
        
        for (Animal animal : animales) {
            animal.describirAnimal(animal);
            animal.hacerSonido();
            System.out.println("-------------------------------------------");
        }

    }
    
}

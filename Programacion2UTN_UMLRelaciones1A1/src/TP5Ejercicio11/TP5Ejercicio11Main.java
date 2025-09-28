
package TP5Ejercicio11;

public class TP5Ejercicio11Main {

    
    public static void main(String[] args) {
        
        Artista art1 = new Artista("Nirvana", "Grunge");
        
        Cancion cancion1 = new Cancion("Smell like Teen Spirit", art1);
        
        Reproductor play = new Reproductor();
        
        System.out.println(art1);
        System.out.println("");        
                
        play.reproducir(cancion1);
        
    }
    
}

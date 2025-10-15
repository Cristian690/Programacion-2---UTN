
package Animales;

public class Vaca extends Animal{
    private String nombre;
    private String color;
    private boolean daLeche;
    
    public Vaca(String nombre, String color, boolean daleChe) {
        this.nombre = nombre;
        this.color = color;  
        this.daLeche = daleChe;
    }
    public String lechera(boolean daLeche) {
         if (daLeche) {
             return "SI";
         } else {
             return "NO";
         }
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Muuuuuuu Muuuuuuuu");
    }
    @Override
    public String toString() {
        return "Nombre Vaca: " + nombre + ", Color: " + color + ", Da Leche: " + lechera(daLeche);
    }
}

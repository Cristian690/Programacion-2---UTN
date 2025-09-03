
package TP3Ejercicio4;


public class Gallina {
    private static int contador_gallina = 0;
    private int idgallina;
    private int edad = 0, huevosPuestos = 0;
    
    public Gallina() {
        contador_gallina++;
        this.idgallina = contador_gallina;
    }
    
    public void ponerHuevo() {
        huevosPuestos ++;
    }
    
    public void envejecer() {
        edad ++;
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina " + idgallina);
        System.out.println("Tiene " + edad + " meses.");
        System.out.println("Puso " + huevosPuestos + " huevos.");
        System.out.println("");
    }
    
}

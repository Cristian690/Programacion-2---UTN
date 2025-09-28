
package TP5Ejercicio5;


public class Tp5Ejercicio5Main {

    
    public static void main(String[] args) {
        
        Propietario p1 = new Propietario("Cristian", "30975000");
        
        Computadora pc1 = new Computadora("Lenovo", "4543oe", "Asrock kmv540", "Asus 742", p1);      
        
        
        System.out.println(pc1);
    }
    
}

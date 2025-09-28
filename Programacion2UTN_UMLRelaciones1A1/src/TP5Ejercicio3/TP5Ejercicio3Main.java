
package TP5Ejercicio3;

public class TP5Ejercicio3Main {

    public static void main(String[] args) {
        
        Autor a1 = new Autor("Gabriel García Márquez", "Colombia");
        
        Editorial edi1 = new Editorial("Debolsillo", "Santa fe 1222");
        
        Libro l1 = new Libro("La Hojarasca", "45678", a1, edi1);
        
        System.out.println(l1);
    }
    
}

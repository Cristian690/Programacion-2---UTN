
package TP5Ejercicio8;

public class TP5Ejercicio8Main {

   
    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Cristian", "cga_1984@hotmail.com");
        
        Documento doc1 = new Documento("Carta Documento", "Renuncia", "lkj55jhh44lllll00", "28/09/2025", user1);
        
        System.out.println(doc1);
        
        System.out.println("");
        System.out.println("");
        
        
        System.out.println(user1);
    }
    
}

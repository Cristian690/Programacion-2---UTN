
package TP5Ejercicio13;

public class TP5Ejercicio13Main {

    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Analia", "any690_1985@homtail.om");
        
        GeneradorQR nuevoQr = new GeneradorQR();
        
        nuevoQr.generar("aeop4456oew", user1);
    }
    
}

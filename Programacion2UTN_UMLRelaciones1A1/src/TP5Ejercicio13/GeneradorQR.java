
package TP5Ejercicio13;

public class GeneradorQR {
    
    
    public void generar(String valorCodigo, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valorCodigo, usuario);      
        
        
        System.out.println("Generando codigo para Usuario: " + usuario.getNombre());
        System.out.println();
        System.out.println("Codigo QR generado: " + codigo.getValor());
    }
}


package TP5Ejercicio14;

public class TP5Ejercicio14Main {

    public static void main(String[] args) {
        
        Proyecto proy1 = new Proyecto("Blairwitch", "90");
        
        EditorVideo edi1 = new EditorVideo();
        
        edi1.exportar("MPG", proy1);
        
    }
    
}

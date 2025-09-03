
package TP3Ejercicio5;


public class TP3Ejercicio5 {

    
    public static void main(String args[]) {
        NaveEspacial nave = new NaveEspacial("Apolo", 50);
        
        nave.despegar();
        nave.avanzar(400); // falla porque no alcanza
        
        nave.recargarCombustible(100); // recargo
        
        nave.avanzar(400); // ahora sí
        nave.mostrarEstado();
    }
}

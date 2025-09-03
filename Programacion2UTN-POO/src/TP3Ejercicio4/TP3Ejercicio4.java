
package TP3Ejercicio4;


public class TP3Ejercicio4 {

    
    public static void main(String args[]) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        Gallina g3 = new Gallina();

        g1.envejecer();
        g1.ponerHuevo();
                        
        g2.envejecer();
        g2.envejecer();
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();
        
        g3.envejecer();
        g3.envejecer();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.ponerHuevo();
        
             
        g1.mostrarEstado();
        g2.mostrarEstado();
        g3.mostrarEstado();
    }
}

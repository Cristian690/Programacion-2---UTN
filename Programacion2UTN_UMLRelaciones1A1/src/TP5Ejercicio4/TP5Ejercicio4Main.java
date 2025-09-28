
package TP5Ejercicio4;


public class TP5Ejercicio4Main {

    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Cristian Aguirre", "30994848");
        
        Banco banco1 = new Banco("Supervielle", "30-4343432323-0");
        
        TarjetaDeCredito tar1 = new TarjetaDeCredito("4545 4545 5656 7676", "28/08/2030", banco1, c1);
        
        c1.setTarjeta(tar1);
        
        System.out.println(tar1);
        System.out.println();
        
        System.out.println(c1);
        
    }
    
}

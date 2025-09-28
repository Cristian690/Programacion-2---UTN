
package TP5Ejercicio10;

public class TP5Ejercicio10Main {

    public static void main(String[] args) {
        
        Titular t1 = new Titular("Cristian Gabriel", "30976666");
        
        CuentaBancaria cuenta1 = new CuentaBancaria("8756663342", 454000, "123456", "28/05/2024", t1);
        
        System.out.println(cuenta1);
        
        System.out.println();
        System.out.println();
        
        System.out.println(t1);
        
        
    }
    
}

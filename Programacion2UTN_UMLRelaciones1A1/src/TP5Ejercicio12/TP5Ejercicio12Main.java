
package TP5Ejercicio12;

public class TP5Ejercicio12Main {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        Contribuyente cont1 = new Contribuyente("Cristian Aguirre", "20-309588394-0");
        Impuesto imp = new Impuesto(50000, cont1);
        
        System.out.println(cont1);
        
        calculadora.calcular(imp);
        
    }
    
}

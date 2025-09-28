
package TP5Ejercicio12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Monto contribuyente: " + impuesto.getMonto());
        System.out.println("Usted debe abonar:" + impuesto.getMonto() * 1.21);
    }
}

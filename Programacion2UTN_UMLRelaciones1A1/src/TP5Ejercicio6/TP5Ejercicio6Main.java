
package TP5Ejercicio6;

public class TP5Ejercicio6Main {
  
    public static void main(String[] args) {
        
        Cliente cli1 = new Cliente("Cristian", "1164098855");
        
        Mesa mesa1 = new Mesa("1", "8");
        
        Reserva r25 = new Reserva("30/09/2025", "22.00", mesa1, cli1);
        
        System.out.println(r25);
    }
    
}


package TP5Ejercicio7;

public class TP5Ejercicio7Main {

    public static void main(String[] args) {
        
        Conductor cond1 = new Conductor("Cristian", "p4535jh");
        
        Motor m1 = new Motor("Nafta", "84ijjie9994455");
        
        Vehiculo auto1 = new Vehiculo("AE445ZK", "2020", m1, cond1);               
        
        System.out.println(auto1);        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println(cond1);
        
    }
    
}

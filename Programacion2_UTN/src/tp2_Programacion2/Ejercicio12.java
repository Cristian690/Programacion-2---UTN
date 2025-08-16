package tp2_Programacion2;

public class Ejercicio12 {
    
    public static void main(String args[]) {
        double[] listaPrecios = {199.99, 299.50, 149.75, 399.00, 89.99};
        
        System.out.println("Precios originales:");
        for (double i: listaPrecios){
            System.out.println(i);
        }
        
        System.out.println("");
        
        listaPrecios[2] = 129.99;
        System.out.println("Precios Modificados:");
        
        for (double i: listaPrecios){
            System.out.println(i);
        }
        
        
    }
}

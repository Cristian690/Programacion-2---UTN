
package tp2_Programacion2;

import java.util.Scanner;

public class Ejercicio9 {   
    
    public static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional")){
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")){
            return peso * 10;
        } else {
            return 0;
        }        
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        return precioProducto + costoEnvio;
    }
    
    public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
        double pesoPaquete, precioProd;
        String zonaEnvio; 
        
        System.out.print("Ingrese el precio del producto: ");
        precioProd = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envío(Nacional/Internacional: )");
        zonaEnvio = input.nextLine();
        
        
        System.out.println("El costo de envío es: " + calcularCostoEnvio(pesoPaquete, zonaEnvio));
        
        System.out.println("El total a pagar es: " + calcularTotalCompra(precioProd, calcularCostoEnvio(pesoPaquete, zonaEnvio)));
    }

}

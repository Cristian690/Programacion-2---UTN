package tp2_Programacion2;
import java.util.Scanner;

public class Ejercicio11 {    
    
    static final double ENTRADA_SALIDA = 0.10;
    
    public static double calcularDescuentoEspecial (double precio){
         double descuentoAplicado = precio * ENTRADA_SALIDA;
        return descuentoAplicado;
    }    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("El descuento especial aplicado es: " + calcularDescuentoEspecial(precio));        
        
        System.out.println("El precio final con descuento es: " + (precio - calcularDescuentoEspecial(precio)));
        
        
    }
}

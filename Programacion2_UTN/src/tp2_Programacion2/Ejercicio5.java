
package tp2_Programacion2;
import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int numero, sumaPares = 0;
        
        System.out.print("Ingrese un número(0 para terminar): ");
        numero = Integer.parseInt(input.nextLine());
        
        while (numero != 0) {            
            if (numero % 2 == 0){
                sumaPares += numero;
            }
            System.out.print("Ingrese un número(0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}

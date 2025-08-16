
package tp2_Programacion2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese un número entero: ");
            numero = Integer.parseInt(input.nextLine());
            
            if (numero > 0){
                positivos ++;
            } else if (numero < 0){
                negativos ++;
            } else {
                ceros ++;
            }
        }
        
        System.out.println("Resultados:");
        System.out.println("Positivos:" + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        
    }
}

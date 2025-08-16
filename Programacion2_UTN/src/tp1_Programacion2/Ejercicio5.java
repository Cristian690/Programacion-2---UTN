package tp1_programacion2;


import java.util.Scanner;


public class Ejercicio5 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("La Suma es: " + (num1 + num2));
        System.out.println("La Resta es: " + (num1 - num2));
        System.out.println("La Multiplicacion es: " + (num1 * num2));
        System.out.println("La División es: " + ((double) num1 / num2));
    }
    
}

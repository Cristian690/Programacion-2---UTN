package tp1_programacion2;


import java.util.Scanner;


public class Ejercicio8b {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double num1, num2, division;
        
        System.out.print("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        division = num1 / num2;
        
        System.out.println("El resultado de la división es: " + division);
    }
    
}

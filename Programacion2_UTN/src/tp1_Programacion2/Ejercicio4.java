package tp1_programacion2;


import java.util.Scanner;



/* Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.*/

public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su Edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad);
        
    }
    
}

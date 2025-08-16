import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3, mayor;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el tercer número: ");
        numero3 = Integer.parseInt(input.nextLine());
        
        mayor = numero1;
        
        if (numero2 > numero1) {
            mayor = numero2;
        }
        
        if(numero3 > mayor) {
            mayor = numero3;
        }
        
        System.out.println("El número mayor es: " + mayor);
        
    }
}

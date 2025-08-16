import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el año para saber si es bisiesto: ");
        int anio = Integer.parseInt(input.nextLine());
        
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año" + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " No es bisiesto");
        }
         
    }
}

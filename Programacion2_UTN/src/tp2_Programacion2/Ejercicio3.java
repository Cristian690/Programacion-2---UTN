
import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        String etapaVida = "";
        
        if (edad <= 0){
            System.out.println("Ingrese una edad válida");
        } else if (edad < 12) {
            etapaVida = "Niño";
        } else if (edad <= 17){
            etapaVida = "Adolescente";
        } else if(edad <= 59){
            etapaVida = "Adulto";
        } else {
            etapaVida = "Adulto Mayor";
        }        
        
        if (edad > 0){
            
            System.out.println("Eres un " + etapaVida);     
        }
    }
    
}

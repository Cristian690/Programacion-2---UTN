package excepciones;

import java.util.Scanner;

public class Cadena_a_Numero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String numeroText;
        try {
            System.out.println("Ingrese un numero: ");
            numeroText = teclado.nextLine();

            int numero = Integer.parseInt(numeroText);
            System.out.println("El numero ingresado es: " + numero);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: el texto ingresado no es numero valido");
        }

    }

}
package excepciones;

import java.util.Scanner;

public class Division_por_Cero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese el primer numero");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese el segundo numero");
        num2 = Integer.parseInt(teclado.nextLine());

        try {
            
            if (num2 == 0) {
                throw new ArithmeticException("ERROR. No se puede dividir por cero.");
            }
            double division = (double) num1 / num2;
            System.out.println("Resultado: " + division);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}
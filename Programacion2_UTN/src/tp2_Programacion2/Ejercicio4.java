package tp2_Programacion2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String categoria;
        double precio, descuento = 0, precioFinal = 0;

        System.out.print("Ingrese la categoría del producto (A,B o C): ");
        categoria = (input.nextLine());

        System.out.print("Ingrese el precio: ");
        precio = Double.parseDouble(input.nextLine());

        if (categoria.equalsIgnoreCase("A")) {
            descuento = 10;
            precioFinal = precio - (precio * descuento) / 100;
        } else if (categoria.equalsIgnoreCase("B")) {
            descuento = 15;
            precioFinal = precio - (precio * descuento) / 100;
        } else if (categoria.equalsIgnoreCase("C")) {
            descuento = 20;
            precioFinal = precio - (precio * descuento) / 100;
        }

        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio Final: " + precioFinal);

    }
}

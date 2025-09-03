
package TP3Ejercicio3;

import java.util.Scanner;
public class TP3Ejercicio3 {

    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        String nombre;
        String autor;
        int anioLibro;
        
        System.out.print("Ingrese el nombre del libro: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese el autor: ");
        autor = input.nextLine();
        
        System.out.print("Ingrese el año de publicación: ");
        anioLibro = Integer.parseInt(input.nextLine());
        
        Libro l = new Libro();
        
        l.setTitulo(nombre);
        l.setAutor(autor);
        l.setAniopublicacion(anioLibro);
        
        System.out.println("");
        
        l.mostrarInfo();
        
        System.out.println("");
        
        System.out.println("Modificando con valor año inválido... ");
        
        System.out.print("Ingrese un año inválido: ");
        anioLibro = Integer.parseInt(input.nextLine());
        
        l.setAniopublicacion(anioLibro);
    }
}

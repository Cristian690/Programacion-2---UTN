package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura_de_Archivo {

    public static void main(String[] args) {

        File archivo = new File("C:/Users/PC/Downloads/asd.txt");

        try {
            Scanner leer = new Scanner(archivo);

            while (leer.hasNextLine()) {
                String lineas = leer.nextLine();
                System.out.println(lineas); 
            }

        } catch (FileNotFoundException fe) {
            System.out.println("ERROR. No se encontro el archivo");
        }
    }
}
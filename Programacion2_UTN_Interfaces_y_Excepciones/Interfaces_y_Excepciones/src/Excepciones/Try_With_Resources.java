package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resources {

    public static void main(String[] args) {
        
         String nombreArchivo = "Mi texto.txt";
         
         try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            String archivo;
            while ((archivo = br.readLine()) != null) {
                System.out.println(archivo);
            }

        } catch (IOException e) {
            System.err.println(" Error al leer el archivo: " + e.getMessage());
        }
    }
}
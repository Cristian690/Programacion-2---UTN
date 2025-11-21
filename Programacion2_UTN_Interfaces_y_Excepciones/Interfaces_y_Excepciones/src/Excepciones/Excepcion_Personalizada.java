package excepciones;

import java.util.Scanner;
public class Excepcion_Personalizada {

    public static void main(String[] args)  {
        
        Scanner teclado = new Scanner(System.in);
        
        int edad;
       
        try{
            System.out.println("Ingrese su edad: ");
            edad = Integer.parseInt(teclado.nextLine());
            
            if(edad < 0 || edad > 120){
                throw new Edad_Invalida_Exception("Error. La edad ingresada no es valida");
            }
            System.out.println("Su edad es: " + edad);
        }catch(Edad_Invalida_Exception e) {
            System.err.println(e.getMessage());
        }
       
        
    }

}
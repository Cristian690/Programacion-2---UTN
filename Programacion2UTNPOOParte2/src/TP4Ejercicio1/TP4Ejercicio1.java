
package TP4Ejercicio1;


public class TP4Ejercicio1 {

    
    public static void main(String args[]) {
        
        
        
        Empleado empleado1 = new Empleado("Cristian", "Backend");
        
        System.out.println(empleado1);
        empleado1.actualizarSalario();                
        System.out.println(empleado1);
        System.out.println("");
        
        
        Empleado empleado2 = new Empleado(2, "Mia", "Data Scientist", 2000000);        
        System.out.println(empleado2);
        
        empleado2.actualizarSalario(25);        
        System.out.println(empleado2);
        
        System.out.println("");
        
        System.out.println("Usted tiene " + Empleado.mostrarTotalEmpleados() + " empleados registrados");
    }
}

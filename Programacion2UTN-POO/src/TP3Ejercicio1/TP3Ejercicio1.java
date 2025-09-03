
package TP3Ejercicio1;

public class TP3Ejercicio1 {
       
    public static void main(String[] args) {
        
        Estudiante e = new Estudiante();
        
        e.nombre = "Cristian";
        e.apellido = "Aguirre";
        e.curso = "Programación 2";
        e.calificacion = 5;
        
        e.mostrarInfo();
        System.out.println("");
        
        e.bajarCalificaciones(4);
        e.mostrarInfo();
        System.out.println("");
        
        e.subirCalificaciones(9);
        e.mostrarInfo();        
        
    }
    
}


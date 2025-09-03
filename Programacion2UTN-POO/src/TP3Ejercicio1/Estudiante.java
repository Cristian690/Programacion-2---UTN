

package TP3Ejercicio1;

public class Estudiante {
        public String nombre;
        public String apellido;
        public String curso;
        public double calificacion;
        
        
        
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Curso: " + curso);
            System.out.println("Calificación: " + calificacion);
        }
        
        public void subirCalificaciones(double puntos) {
            
            calificacion += puntos;
        }
        
        public void bajarCalificaciones(double puntos) {
            calificacion -= puntos;
        }
        
    }

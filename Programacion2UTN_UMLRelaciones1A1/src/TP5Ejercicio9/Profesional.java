
package TP5Ejercicio9;

public class Profesional {
    private String nombre;
    private String especialidad;
    
    public Profesional(String nombre, String especialidad) {
       this.nombre= nombre;
       this.especialidad = especialidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido.");
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad != null && !especialidad.trim().isEmpty()) {
            this.especialidad = especialidad;
        } else {
            System.out.println("Especialidad inválida.");
        }
    }
    
    @Override
    public String toString(){
        return "Nombre Médico: " + nombre + "  Especialidad: " + especialidad;
    }
}

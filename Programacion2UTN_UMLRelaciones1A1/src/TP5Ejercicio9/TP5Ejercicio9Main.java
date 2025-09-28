
package TP5Ejercicio9;

public class TP5Ejercicio9Main {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Cristian", "Osecac");
        
        Profesional prof1 = new Profesional("Dr. Urlesaga", "Traumatólogo");
        
        CitaMedica cita1 = new CitaMedica("30/12/2025", "9.30", p1, prof1);
        
        System.out.println(cita1);
    }
    
}

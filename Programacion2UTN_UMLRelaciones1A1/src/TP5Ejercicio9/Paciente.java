
package TP5Ejercicio9;

public class Paciente {
    private String nombre;
    private String obraSocial;
    
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
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
    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        if (obraSocial != null && !obraSocial.trim().isEmpty()) {
            this.obraSocial = obraSocial;
        } else {
            System.out.println("Obra Social inválida.");
        }
    }
    @Override
    public String toString() {
        return "Nombre Paciente: " + nombre + "  Obra Social: " + obraSocial;
    }
}


package TP5Ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(String patente, String modelo,Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente != null && !patente.trim().isEmpty()) {
            this.patente = patente;
        } else {
            System.out.println("Patente inválida.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido.");
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    @Override
    public String toString() {
        return "Patente: " + patente + "  Modelo Auto: " + modelo + "\n" + motor + "\n" + conductor;
    }
}

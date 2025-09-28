
package TP5Ejercicio2;


public class Bateria {
    private String modelo;
    private int capacidad;    

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        } else {
            System.out.println("Capacidad inválida.");
        }
    }
    @Override
    public String toString() {
        return "Batería modelo: " + modelo + " - Capacidad: " + capacidad + "mAh";
    }
}
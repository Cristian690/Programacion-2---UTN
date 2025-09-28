
package TP5Ejercicio7;

public class Conductor {
    private String nombre;
    private String licencia;
    Vehiculo vehiculo;
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
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

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        if (licencia != null && !licencia.trim().isEmpty()) {
            this.licencia = licencia;
        } else {
            System.out.println("Licencia inválido.");
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    @Override
    public String toString() {
        return "Nombre Conductor: " + nombre + "  Licencia: " + licencia;
    }
}

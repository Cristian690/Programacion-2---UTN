
package TP5Ejercicio12;

public class Contribuyente {
    private String nombre;
    private String cuil;
    
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        if(cuil != null && !cuil.trim().isEmpty()) {
            this.cuil = cuil;
        }
    }
    @Override
    public String toString() {
        return "Nombre Contribuyente: " + nombre + "  Nro. CUIL: " + cuil;
    }
    
}

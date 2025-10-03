
package TP6_Biblioteca;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    public void mostrarInfo() {
        System.out.println("Id Autor: " + id + "\n" + "Nombre: " + nombre + "\n" + "Nacionalidad: " + nacionalidad);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null && !id.trim().isEmpty()){
            this.id = id;
        } else {
            System.out.println("Ingrese un id válido.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Ingrese un nombre válido.");
        }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if(nacionalidad != null && !nacionalidad.trim().isEmpty()) {
            this.nacionalidad = nacionalidad;
        } else {
            System.out.println("Ingrese una nacionalidad válida.");
        }
    }
     @Override
     public String toString() {
         return "Autor ID: " + id + "  Nombre Autor: " + nombre + "  Nacionalidad: " + nacionalidad;
     }
}

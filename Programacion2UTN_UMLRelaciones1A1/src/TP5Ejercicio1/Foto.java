
package TP5Ejercicio1;

public class Foto {
    private String imagen;
    private String formato;


    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    @Override
    public String toString() {
        return "Foto : " + imagen + " Formato: " + formato;
    }
        
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        if (imagen != null && !imagen.trim().isEmpty()) {
        this.imagen = imagen;
    } else {
        System.out.println("Imagen inválida.");
    }
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if (formato != null && (formato.equalsIgnoreCase("JPG") || formato.equalsIgnoreCase("PNG"))) {
        this.formato = formato;
    } else {
        System.out.println("Formato no soportado.");
    }
    }
    
}
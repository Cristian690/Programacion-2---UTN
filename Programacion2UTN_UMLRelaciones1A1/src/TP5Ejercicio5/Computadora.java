
package TP5Ejercicio5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composicion
    private Propietario propietario;
    
    public Computadora(String marca, String numeroSerie, String modelo, String chipset, Propietario propietario) { 
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Modelo inválido.");
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if (numeroSerie != null && !numeroSerie.trim().isEmpty()) {
            this.numeroSerie = numeroSerie;
        } else {
            System.out.println("Modelo inválido.");
        }
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    @Override
    public String toString() {
        return "Marca PC: " + marca + " Numero de serie: " + numeroSerie + "\n" + placaMadre + "\n" + propietario;
    }
    
}

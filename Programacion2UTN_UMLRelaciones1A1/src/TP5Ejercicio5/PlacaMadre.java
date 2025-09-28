
package TP5Ejercicio5;

public class PlacaMadre {
    private String modelo;
    private String chipset;
    
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
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

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        if (chipset != null && !chipset.trim().isEmpty()) {
            this.chipset = chipset;
        } else {
            System.out.println("Chipset inválido.");
        }
    }
    
    @Override
    public String toString() {
        return "Modelo Placa: " + modelo + " Chipset: " + chipset;
    }
    
    
}

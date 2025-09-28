
package TP5Ejercicio7;

public class Motor {
    private String tipo;
    private String numeroSerie;
    
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if (numeroSerie != null && !numeroSerie.trim().isEmpty()) {
            this.numeroSerie = numeroSerie;
        } else {
            System.out.println("Número de Serie inválido.");
        }
    }
    @Override
    public String toString() {
        return "Motor Tipo:" + tipo + "  Número Serie: " + numeroSerie;
    }
    
    
}

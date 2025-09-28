
package TP5Ejercicio14;

public class Render {
    private String formato;
    private Proyecto proyecto;
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if(formato != null && !formato.trim().isEmpty()) {
            this.formato = formato;
        } else {
            System.out.println("Formato inválido.");
        }
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    @Override
    public String toString() {
        return "Formato: " + formato;
    }
    
}

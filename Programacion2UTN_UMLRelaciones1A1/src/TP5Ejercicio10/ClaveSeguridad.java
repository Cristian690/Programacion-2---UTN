
package TP5Ejercicio10;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido.");
        }
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        if (ultimaModificacion != null && !ultimaModificacion.trim().isEmpty()) {
            this.ultimaModificacion = ultimaModificacion;
        } else {
            System.out.println("Ultima modificación inválida.");
        }
    }
    @Override
    public String toString() {
        return "Código: " + codigo + "  Ultima Modificación: " + ultimaModificacion;
    }
}

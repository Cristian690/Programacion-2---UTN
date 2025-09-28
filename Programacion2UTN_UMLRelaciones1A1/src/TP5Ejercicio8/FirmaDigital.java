
package TP5Ejercicio8;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;
    
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        if (codigoHash != null && !codigoHash.trim().isEmpty()) {
            this.codigoHash = codigoHash;
        } else {
            System.out.println("Código Hash inválido.");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha != null && !fecha.trim().isEmpty()) {
            this.fecha = fecha;
        } else {
            System.out.println("Fecha inválida.");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "Codigo Hash: " + codigoHash + "  Fecha: " + fecha;
    }
    
}


package TP5Ejercicio1;


public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }          
    @Override
    public String toString() {
        return "Nombre Titular: " + titular.getNombre() + "\n" +
                 " Foto: " + foto.getImagen() + " Formato: " + foto.getFormato() + "\n" +
                 "Fecha de emision: " + fechaEmision + "\n" + 
                 "Número Pasaporte: " + numero;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null && !numero.trim().isEmpty()) {
        this.numero = numero;
    } else {
        System.out.println("Número de pasaporte inválido.");
    }
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        if (fechaEmision != null && !fechaEmision.trim().isEmpty()) {
        this.fechaEmision = fechaEmision;
    } else {
        System.out.println("Fecha de emisión inválida.");
    }
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
            
}

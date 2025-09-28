
package TP5Ejercicio2;


public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;                
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        if (imei != null && !imei.trim().isEmpty()) {
            this.imei = imei;
        } else {
            System.out.println("IMEI inválido.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida.");
        }
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

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString() {
        return "Celular IMEI: " + imei + " - " + marca + " " + modelo + "\n" +
               " " + bateria + "\n" +
               " Usuario: " + (usuario != null ? usuario.getNombre() : "Sin asignar");
    }
    
    
    
}

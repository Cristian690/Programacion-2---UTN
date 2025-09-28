
package TP5Ejercicio13;

public class CodigoQR {
    private String valor;
    private Usuario usuario;
    
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        if(usuario != null) {
            this.usuario = usuario;
        }
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if(valor != null && !valor.trim().isEmpty()) {
            this.valor = valor;
        }else {
            System.out.println("Valor invalido.");
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
        return "Valor QR: " + valor + "  Usuario: " + usuario;
    }
    
}

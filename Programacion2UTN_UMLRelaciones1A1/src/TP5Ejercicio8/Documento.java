
package TP5Ejercicio8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    private Usuario usuario;
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        FirmaDigital fir1 = new FirmaDigital(codigoHash, fecha, usuario);
        this.firma = fir1;
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Titulo inválido.");
        }
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        if (contenido != null && !contenido.trim().isEmpty()) {
            this.contenido = contenido;
        } else {
            System.out.println("Contenido inválido.");
        }
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString() {
        return "Titulo Documento: " + titulo + "  Contenido Doc: " + contenido + "\n" + firma + "\n" + usuario;
    }
}

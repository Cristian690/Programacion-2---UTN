
package TP5Ejercicio11;

public class Cancion {
    private String titulo;
    private Artista artista;
    
    public Cancion(String titulo, Artista artista){
        this.titulo = titulo;        
        if(artista != null) {
            this.artista = artista;
        }
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

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    @Override
    public String toString() {
        return "Titulo Cancion: " + titulo +  "  Artista: " + artista;
    }
}

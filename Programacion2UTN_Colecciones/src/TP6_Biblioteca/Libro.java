
package TP6_Biblioteca;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        
    }
    public void mostrarInfo() {
        System.out.println("Isbn: " + isbn + "\n" + "Titulo: " + titulo + "\n" + "Año de Publicación: " + anioPublicacion + "\n" +
                "Nombre Autor: " + autor.getNombre());
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn != null && !isbn.trim().isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("Isbn incorrecto.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Titulo ingresado inválido.");
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0 ) {
            this.anioPublicacion = anioPublicacion;
        } else {
             System.out.println("Ingrese un año válido.");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "Isbn: " + isbn + "  Titulo: " + titulo + "  Año publicación: " + anioPublicacion + "  Autor:" + autor.getNombre();
    } 
}

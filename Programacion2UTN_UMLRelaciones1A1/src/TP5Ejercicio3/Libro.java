
package TP5Ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.trim().isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("Isbn inválido.");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return "Titulo Libro: " + titulo + " ISBN: " + isbn + "\n" + autor+ "\n" + editorial;
    }
    
}

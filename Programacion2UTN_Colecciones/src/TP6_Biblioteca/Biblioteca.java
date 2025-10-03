package TP6_Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();    
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
            Libro libro1 = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(libro1);
    }
    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
            System.out.println();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        while(i < libros.size() && !libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
            i++;
        }
        if(i == libros.size()) {
            return null;
        } else {
            return libros.get(i);     
        }              
    }
    public void eliminarLibro(String isbn) {
        int i = 0;
        while(i < libros.size() && !libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
            i++;
        }
        if(i == libros.size()) {
            System.out.println("No se encontro el libro para eliminar.");
        } else {
            System.out.println("Libro eliminado " + libros.get(i));
            libros.remove(i);
        }
    }
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anioPublicacion) {
        ArrayList<Libro> listaFiltrada = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anioPublicacion) {
                listaFiltrada.add(libro);
            }
        }
        return listaFiltrada;
    }
    public void mostrarAutoresDisponibles() {
        ArrayList<Autor> listaAutores = new ArrayList<>();

        for (Libro libro : libros) {
            Autor autorActual = libro.getAutor();
            boolean existe = false;

            for (Autor autor : listaAutores) {
                if (autor.getId().equalsIgnoreCase(autorActual.getId())) {
                    existe = true; 
                }
            }
            if (!existe) {
                listaAutores.add(autorActual);
            }
        }
        for (Autor autor : listaAutores) {
            System.out.println(autor);
        }
    }


}

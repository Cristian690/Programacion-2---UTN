
package TP6_Biblioteca;

public class TP6_BibliotecaMain {

    public static void main(String[] args) {
        
        // Creación biblioteca
        Biblioteca elAteneo = new Biblioteca("El Ateneo");
        
        // Creación autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A2", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A3", "Jorge Luis Borges", "Argentina");
        
        // Agrego 5 libros
        elAteneo.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, autor1);
        elAteneo.agregarLibro("ISBN002", "El Amor en los Tiempos del Cólera", 1985, autor1);
        elAteneo.agregarLibro("ISBN003", "La Casa de los Espíritus", 1982, autor2);
        elAteneo.agregarLibro("ISBN004", "Eva Luna", 1987, autor2);
        elAteneo.agregarLibro("ISBN005", "Ficciones", 1944, autor3);
        
        // Listar libros
        elAteneo.listarLibros();
        System.out.println("----------------------------------------------");
        
        // Buscar libro por ISBN
        System.out.println(elAteneo.buscarLibroPorIsbn("isbn004"));
        System.out.println("----------------------------------------------");
        
        // Mostrar por año de publicación
        System.out.println(elAteneo.filtrarLibrosPorAnio(1985));
        System.out.println("----------------------------------------------");
        
        // Eliminar libr por ISBN
        elAteneo.eliminarLibro("isbn005");
        elAteneo.listarLibros();
        System.out.println("----------------------------------------------");
        
        // MOstrar Stock total de libros en la biblioteca        
        System.out.println("El Stock de libros en la biblioteca es:  " + elAteneo.obtenerCantidadLibros());
        System.out.println("----------------------------------------------");
        
        // Listar autores
        elAteneo.mostrarAutoresDisponibles();
    }
    
}

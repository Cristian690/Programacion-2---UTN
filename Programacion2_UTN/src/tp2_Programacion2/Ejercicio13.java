package tp2_Programacion2;

public class Ejercicio13 {
        
    public static void imprimirLista(double[] lista, int indice) {
        if (indice == lista.length) {
            return; // El return sin valor sirve para salir del método.
        }
        System.out.println("Precio: " + lista[indice]);
        
        imprimirLista(lista, indice + 1);
    }
    
    public static void main(String[] args) {
        double[] listaPrecios = {199.99, 299.50, 149.75, 399.00, 89.99};
        
        System.out.println("Precios originales:");
        imprimirLista(listaPrecios, 0);   // Empieza desde el índice 0
        
        System.out.println("");
        
        listaPrecios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        imprimirLista(listaPrecios, 0);   
    }
}


package FigurasGeometricas;

import java.util.ArrayList;

public class FigurasGeometricasMain {

    public static void main(String[] args) {
        ArrayList<Figura> listaFiguras = new ArrayList<>();
        
        Circulo c1 = new Circulo(5, "Circulo1");
        Circulo c2 = new Circulo(8, "Circulo2");
        Rectangulo r1 = new Rectangulo(5, 6, "Rectangulo1");
        Circulo c3 = new Circulo(3, "Circulo3");
        Rectangulo r2 = new Rectangulo(3, 3, "Rectangulo2");
        
        listaFiguras.add(c1);
        listaFiguras.add(c2);
        listaFiguras.add(r1);
        listaFiguras.add(c3);
        listaFiguras.add(r2);
        
        for (Figura listaFigura : listaFiguras) {
            System.out.println(listaFigura);
        }
        
        
    }
    
}

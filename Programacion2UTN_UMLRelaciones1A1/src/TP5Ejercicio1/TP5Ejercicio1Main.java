
package TP5Ejercicio1;

public class TP5Ejercicio1Main {
    
    public static void main(String[] args) {
        Foto f1 = new Foto("Foto Cristian", "JPG");
        Titular t1 = new Titular("Cristian", "30975414");
        
        Pasaporte p1 = new Pasaporte("5414", "28/08/2025", f1);
        
        p1.setTitular(t1);
        t1.setPasaporte(p1);
        
        System.out.println(p1);
        
    }
    
}

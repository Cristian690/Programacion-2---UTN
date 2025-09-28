
package TP5Ejercicio2;

public class TP5Ejercicio2Main {

    public static void main(String[] args) {
        
        Bateria bat1 = new Bateria("NH$", 300);
        
        Celular cel1 = new Celular("01928394", "Motorola", "Startack", bat1);
        
        Usuario user1 = new Usuario("Cristian", "30975444");
        
        cel1.setUsuario(user1);
        user1.setCelular(cel1);
        
        System.out.println(cel1);
        System.out.println();
        
        System.out.println(user1);
        
    }
    
}

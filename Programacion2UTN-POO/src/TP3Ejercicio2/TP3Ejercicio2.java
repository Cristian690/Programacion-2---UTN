package TP3Ejercicio2;


import TP3Ejercicio2.Mascota;


public class TP3Ejercicio2 {

   
    public static void main(String args[]) {
        Mascota m1 = new Mascota();
        
        m1.nombre = "Moro";
        m1.especie = "Perro";
        m1.edad = 15;
        
        m1.mostrarInfo();
        System.out.println("");
        
        m1.cumplirAnio();
        System.out.println("");
        
        m1.cumplirAnio();
        
    }
}

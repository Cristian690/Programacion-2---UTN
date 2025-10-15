
package Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println(this);
    }
        
    @Override
    public String toString() {
        return "Marca: " + marca + " Modelo: " + modelo;
    }
}

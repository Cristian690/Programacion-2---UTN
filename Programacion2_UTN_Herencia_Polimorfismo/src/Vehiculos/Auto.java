
package Vehiculos;

public class Auto extends Vehiculo{
    private int cantidadPuertas;
    
    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {        
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return super.toString()+ "\n" + "Cantidad de Puertas: " + cantidadPuertas;
    }
}

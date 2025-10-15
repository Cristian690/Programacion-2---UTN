
package FigurasGeometricas;

public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Radio: " + radio + " Area del " + super.getNombre() + " es " + String.format("%.2f",calcularArea());
    }
}

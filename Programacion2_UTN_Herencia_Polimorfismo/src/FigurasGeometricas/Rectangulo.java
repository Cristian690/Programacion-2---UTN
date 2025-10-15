
package FigurasGeometricas;

public class Rectangulo extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }    
    
    @Override
    public String toString() {
        return "Base: " + base + " Altura: " + altura + " Area del " + super.getNombre() + " es " + String.format("%.2f",calcularArea());
    }
}

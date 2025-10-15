
package Empleados;

public class EmpleadoPlanta extends Empleado{
    
    private double sueldoMensual;
    
    public EmpleadoPlanta(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
    
    @Override
    public String toString() {
        return "Sueldo Mensual: " + sueldoMensual;
    }
    
}

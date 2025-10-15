
package Empleados;

public class EmpleadoTemporal extends Empleado{
    
    private int horasTrabajadas;
    private double valorHora;
    
    public EmpleadoTemporal(int horasTrabajadas, double valorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
    
    @Override
    public String toString() {
        return "Horas Trabajadas: " + horasTrabajadas + "\n" + "Valor hora: " + valorHora + "\n" +
                "Sueldo: " + calcularSueldo();
    }
    
}

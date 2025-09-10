
package TP4Ejercicio1;

public class Empleado {
    
    private static int totalEmleados;
    
    private int id;
    private  String nombre;
    private  String puesto;
    private double salario;
    
    // CONSTRUCTOR
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;        
    }
    
    // CONSTRUCTOR 2            
    public Empleado(String nombre, String puesto) {
        totalEmleados++;
        id+= totalEmleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000000;
        
    }
    // Metodo Estático 
    public static int mostrarTotalEmpleados() {
        return totalEmleados;
    }
    
    // METODO ACTUALIZAR SALARIO
    public void actualizarSalario(double porcAumento) {
        this.salario = this.salario + this.salario * porcAumento / 100;
        System.out.println("Aumentando un " + porcAumento +"% el salario");
    }    
    public void actualizarSalario() {
        final double aumentoFijo = 50000;
        this.salario += aumentoFijo;
        System.out.println("Aumentando fijo de $" + aumentoFijo);
    }
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: " + this.salario;
    }
    
    // SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // GETTERS
    public int getId() {
        return this.id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getPuesto() {
        return this.puesto;
    }
    public double getSalario() {
        return this.salario;
    }
}

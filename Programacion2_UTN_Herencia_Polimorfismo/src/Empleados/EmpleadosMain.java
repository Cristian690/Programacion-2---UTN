
package Empleados;
import java.util.ArrayList;

public class EmpleadosMain {

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        EmpleadoPlanta e1 = new EmpleadoPlanta(500000);
        EmpleadoTemporal e2 = new EmpleadoTemporal(150, 8500);
        EmpleadoPlanta e3 = new EmpleadoPlanta(620000);
        EmpleadoPlanta e4 = new EmpleadoPlanta(480000);
        EmpleadoTemporal e5 = new EmpleadoTemporal(120, 9000);
        EmpleadoTemporal e6 = new EmpleadoTemporal(200, 7500);
        EmpleadoPlanta e7 = new EmpleadoPlanta(550000);
        
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
        listaEmpleados.add(e6);
        listaEmpleados.add(e7);
        
        for (Empleado listaEmpleado : listaEmpleados) {
            if(listaEmpleado instanceof EmpleadoPlanta) {
                System.out.println("Empleado Planta " + listaEmpleado );
            } else {
                System.out.println("Empleado temporal " + "\n" + listaEmpleado);
            }
            System.out.println("---------------------------");
        }
        
        
    }
    
}

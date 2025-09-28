
package TP5Ejercicio12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;   
        if(contribuyente != null) {
            this.contribuyente = contribuyente;
        }
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        if(monto > 0) {
            this.monto = monto;
        }else {
            System.out.println("Ingrese un monto válido...");
        }
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    
    
}

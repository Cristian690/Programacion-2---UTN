
package TP5Ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    
    public CuentaBancaria(String cbu, double saldo,String codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
        this.titular = titular;
        if(titular != null) {
            titular.setCuenta(this);
        }
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        if (cbu != null && !cbu.trim().isEmpty()) {
            this.cbu = cbu;
        } else {
            System.out.println("Cbu inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0 ) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido.");
        }
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    @Override
    public String toString() {
        return "CBU: " + cbu + "  Saldo: " + saldo + "\n" + clave + "\n" + titular;
    }
    
}

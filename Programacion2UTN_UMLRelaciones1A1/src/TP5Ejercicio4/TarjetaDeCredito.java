
package TP5Ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null && !numero.trim().isEmpty()) {
            this.numero = numero;
        } else {
            System.out.println("Nuemro inválido.");
        }
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento != null && !fechaVencimiento.trim().isEmpty()) {
            this.fechaVencimiento = fechaVencimiento;
        } else {
            System.out.println("Fecha de Vencimiento inválido.");
        }
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        return "Número de tarjeta: " + numero + " Fecha de Vencimiento: " + fechaVencimiento + "\n"
                + banco + "\n" + cliente;
    }
    
}

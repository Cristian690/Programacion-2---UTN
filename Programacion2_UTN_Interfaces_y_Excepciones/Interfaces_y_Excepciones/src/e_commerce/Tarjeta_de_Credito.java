package e_commerce;

public class Tarjeta_de_Credito implements Pago_con_Descuento {

    private static final double DESCUENTO = 0.97;
    private String numeroTarjeta;

    public Tarjeta_de_Credito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

       @Override
    public void procesarPago(double monto) {
       System.out.println("-----------------------");
        System.out.println("Procensando pago....... $" + monto);
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * DESCUENTO;
    }

 

}
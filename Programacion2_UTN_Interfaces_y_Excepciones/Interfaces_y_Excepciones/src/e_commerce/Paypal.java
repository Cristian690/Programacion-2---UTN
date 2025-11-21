package e_commerce;

public class Paypal implements Pago_con_Descuento{

    private static final double DESCUENTO = 0.98;
    private String email;

    public Paypal() {
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * DESCUENTO;
        }

    @Override
    public void procesarPago(double monto) {
        System.out.println("*************************************");
        System.out.println("Procesando su pago: $" + monto);
         }
    
}
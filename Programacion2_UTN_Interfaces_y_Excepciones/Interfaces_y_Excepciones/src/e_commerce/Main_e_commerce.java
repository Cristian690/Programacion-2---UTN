package e_commerce;

public class Main_e_commerce {

    public static void main(String[] args) {

        // 1. Crear cliente
        Cliente cliente = new Cliente("Cristian", "CristianAguirre@hotmail.com");

        // 2. Elegir método de pago (proba cambiando a Paypal)
        Pago_con_Descuento metodoPago = new Tarjeta_de_Credito("9878-0058-1157-8989");
        // Pago_con_Descuento metodoPago = new Paypal();

        // 3. Crear el pedido
        Pedido pedido = new Pedido("Pendiente", cliente, metodoPago);

        // 4. Agregar productos
        pedido.agregarProducto(new Producto("PlayStation 5", 2100000));
        pedido.agregarProducto(new Producto("Auriculares Gamer", 250000));

        // 5. Cambiar estado → debe notificar al cliente
        pedido.cambiarEstado("Procesando...");

        // 6. Calcular total sin descuento
        double totalSinDescuento = pedido.calcularTotal();
        System.out.println("Total sin descuento: $" + totalSinDescuento);

        // 7. Aplicar descuento
        double totalConDescuento = metodoPago.aplicarDescuento(totalSinDescuento);
        System.out.println("Total con descuento aplicado: $" + totalConDescuento);

        // 8. Procesar el pago
        metodoPago.procesarPago(totalConDescuento);

        System.out.println("Pedido completado correctamente.");
    }
}

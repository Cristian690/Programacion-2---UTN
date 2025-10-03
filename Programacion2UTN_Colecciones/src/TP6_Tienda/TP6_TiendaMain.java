
package TP6_Tienda;

public class TP6_TiendaMain {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();      
                
        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("1", "Arroz", 750, 23, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "leche", 1200, 3, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("3", "Shampoo", 1850, 2, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("4", "Camisa", 18000, 2, CategoriaProducto.ROPA);
        Producto p5 = new Producto("5", "Samsung a20", 255000, 3, CategoriaProducto.ELECTRONICA);
        Producto p6 = new Producto("6", "Pan", 500, 15, CategoriaProducto.ALIMENTOS);
        Producto p7 = new Producto("7", "Televisor LG", 55000, 1, CategoriaProducto.ELECTRONICA);
        Producto p8 = new Producto("8", "Jeans", 4500, 5, CategoriaProducto.ROPA);
        Producto p9 = new Producto("9", "Aspiradora", 12000, 2, CategoriaProducto.HOGAR);
        Producto p10 = new Producto("10", "Cereal", 950, 10, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);
        inventario.agregarProducto(p8);
        inventario.agregarProducto(p9);
        inventario.agregarProducto(p10);
        
        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("Lista Productos: ");
        inventario.listarProductos();
        System.out.println("");
        
        // 3. Buscar un producto por ID y mostrar su información. 
        System.out.println("Producto buscado: ");
        Producto buscado = inventario.buscarProducto("9");
        if(buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        System.out.println("");
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica. 
        System.out.println("Lista producto por categoría: Ropa");
        inventario.mostrarLista(inventario.filtrarPorCategoria(CategoriaProducto.ROPA));
        
        System.out.println("");
        
        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("Producto eliminado");
        inventario.eliminarProducto("5").mostrarInfo();        
        System.out.println("");
        System.out.println("Lista despues de eliminar producto: ");
        inventario.listarProductos();
        
        System.out.println("");
        
        // 6. Actualizar el stock de un producto existente. 
        
        System.out.println("Actualizar Stock Producto: ");
        inventario.actualizarStock("2", 7).mostrarInfo();
        System.out.println("");
        
        // 7. Mostrar el total de stock disponible. 
        System.out.println("Stock total: " + Producto.obtenerTotalStock());
        
        System.out.println("");
        
        // 8. Obtener y mostrar el producto con mayor stock. 
        System.out.println("Producto con mayor Stock: ");
        inventario.obtenerProductoConMayorStock().mostrarInfo(); 
        System.out.println("");
        
        // 9. Filtrar productos con precios entre $1000 y $3000. 
        System.out.println("Productos entre 1000 y 3000");
        inventario.mostrarLista(inventario.filtrarProductosPorPrecio(1000, 3000));    
        System.out.println("");
        
        // 10. Mostrar las categorías disponibles con sus descripciones.
        
        System.out.println("Categorias disponibles: ");
        inventario.mostrarCategoriasDisponibles();
        
    }
    
}

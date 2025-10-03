
package TP6_Tienda;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    private static int stockTotal = 0;
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        stockTotal += cantidad;
    }
    
    // Sobrecarga de constructor
    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 1;
        this.categoria = CategoriaProducto.ALIMENTOS;
        stockTotal += cantidad;
    }
    public static int obtenerTotalStock() {
        return stockTotal;
    }
    
    // Metodo para mostrar el producto
    public void mostrarInfo() {
        System.out.println(this);
    }
    
    
    public String getId() {
        return id;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Ingrese un nombre válido");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Ingrese un precio válido.");
        }
            
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad <= 0) {
            System.out.println("No puede haber Stock negativo o cero");
        } else {
            this.cantidad = cantidad;
        }
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
    
    @Override
    public String toString() {
        return "Id Producto: " + id + "\n" + "Nombre: " + nombre + "\n" + "Precio: " + precio + "\n" +
                "Cantidad: " + cantidad + "\n" + "Categoria: " + categoria.getDescripcion();
    }
    
}

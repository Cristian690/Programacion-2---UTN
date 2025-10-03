package TP6_Tienda;

import java.util.ArrayList;


public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + "  " + producto.getCantidad()); 
        }
    }
    
    public Producto buscarProducto(String id){
        for (Producto producto : productos) {
            if(producto.getId().equalsIgnoreCase(id)){
                return producto;
            }            
        }
        return null;
    }
    public Producto buscarProductoPorNombre(String nombre) {
    for (Producto producto : productos) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            return producto;
        }
    }
    return null;
}
    
    public Producto eliminarProducto(String id) {
        int i = 0;
        boolean borrado = false;
        Producto eliminado = null;
        while(i < productos.size() && !borrado){
            if(productos.get(i).getId().equalsIgnoreCase(id)) {
                eliminado = productos.get(i);
                productos.remove(i);
                borrado = true;
            }else {
                i++;
            }            
        }
        return eliminado;
    }
    public Producto actualizarStock(String id, int cant) {
        int i = 0;
        boolean estadoActualizado = false;
        Producto prodActualizado = null;
        while(i < productos.size() && !estadoActualizado) {
            if(productos.get(i).getId().equalsIgnoreCase(id)) {
                productos.get(i).setCantidad(cant);
                estadoActualizado = true;
                prodActualizado = productos.get(i);
            } else {
                i++;
            }
        }
        return prodActualizado;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getCategoria().equals(categoria)) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    } 
    
    public int obtenerTotalStock() {
        int sumaStock = 0;
        for(Producto producto: productos) {
            sumaStock += producto.getCantidad();
        }
        return sumaStock;
    }
     public Producto obtenerProductoConMayorStock() {
         Producto mayor = null;
         int mayorCant = 0;
         for (Producto producto : productos) {
             if(producto.getCantidad() > mayorCant){
                 mayorCant = producto.getCantidad();
                 mayor = producto;
             }
         }
         return mayor;
     }
     
     public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
         ArrayList<Producto> listaPorPrecio = new ArrayList<>();         
         for (Producto producto : productos) {
             if(producto.getPrecio() > min && producto.getPrecio() < max) {
                 listaPorPrecio.add(producto);
             }
         }
         return listaPorPrecio;
     }
     
     public void mostrarCategoriasDisponibles() {
         for (CategoriaProducto categoria: CategoriaProducto.values()) {
             System.out.println(categoria.getDescripcion());
         }
         
     }
     public void mostrarLista(ArrayList<Producto> lista) {
         for (Producto producto : lista) {
             producto.mostrarInfo();
             System.out.println("-------------------------------------------");
         }
     }
}

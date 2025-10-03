
package TP6_Tienda;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos Electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");
    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public static CategoriaProducto getALIMENTOS() {
        return ALIMENTOS;
    }

    public static CategoriaProducto getELECTRONICA() {
        return ELECTRONICA;
    }

    public static CategoriaProducto getROPA() {
        return ROPA;
    }

    public static CategoriaProducto getHOGAR() {
        return HOGAR;
    }

    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public String toString() {
        return descripcion;
    }
}

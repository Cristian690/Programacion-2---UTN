
package TP5Ejercicio14;

public class EditorVideo {
    
    public void  exportar(String render, Proyecto proyecto) {
        
        Render render1 = new Render(render, proyecto);
        
        System.out.println("Exportando Formato: " + render1.getFormato() + "  Al proyecto: " 
                + proyecto.getNombre() + " Duración :" + proyecto.getDuracionMin());
    }
}

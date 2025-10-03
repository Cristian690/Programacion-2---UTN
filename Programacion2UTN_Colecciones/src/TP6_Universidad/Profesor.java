package TP6_Universidad;
import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id; 
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso) {
        int i = 0;
        while (i < cursos.size() && !cursos.get(i).equals(curso)) {
            i++;
        }
        if (i == cursos.size()) {
            cursos.add(curso);
            curso.setProfesor(this);
            System.out.println("Curso agregado: " + curso.getNombre());
        } else {
            System.out.println("El curso ya está asignado a este profesor.");
        }
    }
    
    public void eliminarCurso(Curso curso) {
        int i = 0;
        while (i < cursos.size() && !cursos.get(i).equals(curso)) {
            i++;
        }
        if (i == cursos.size()) {
            System.out.println("Curso no encontrado.");
        } else {
            cursos.remove(i);
            curso.setProfesor(null);
            System.out.println("Curso eliminado: " + curso.getNombre());
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor no tiene cursos asignados.");
        } else {
            System.out.println("Cursos dictados por " + nombre + ":");
            for (Curso curso : cursos) {
                System.out.println(curso); 
            }
        }        
    }
    public void mostrarInfo() {
        System.out.println("ID Profesor: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            System.out.println("Id inválido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    @Override
    public String toString() {
        return "ID Profesor: " + id + "  Nombre: " + nombre + "  Especialidad: " + especialidad;
    }
    

}


package TP6_Universidad;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equalsIgnoreCase(id)) {
                return profesor;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public void eliminarCurso(String codigo) {
        int i = 0;
        while (i < cursos.size() && !cursos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
            i++;
        }
        if (i < cursos.size()) {
            Curso curso = cursos.get(i);
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(i);
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void eliminarProfesor(String id) {
        int i = 0;
        while (i < profesores.size() && !profesores.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        if (i < profesores.size()) {
            Profesor profesor = profesores.get(i);
            for (Curso curso : profesor.getCursos()) {
                curso.setProfesor(null);
            }
            profesor.getCursos().clear();
            profesores.remove(i);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    @Override
    public String toString() {
        return "Universidad: " + nombre + "  Profesores: " + profesores.size() + "  Cursos: " + cursos.size();
    }

}

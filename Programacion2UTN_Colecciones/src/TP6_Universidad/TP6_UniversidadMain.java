
package TP6_Universidad;

public class TP6_UniversidadMain {

    public static void main(String[] args) {
        
        Universidad miUniversidad = new Universidad("Universidad Nacional");

        Profesor prof1 = new Profesor("P1", "Juan Pérez", "Matemática");
        Profesor prof2 = new Profesor("P2", "María López", "Historia");
        Profesor prof3 = new Profesor("P3", "Carlos Gómez", "Física");

        miUniversidad.agregarProfesor(prof1);
        miUniversidad.agregarProfesor(prof2);
        miUniversidad.agregarProfesor(prof3);

        Curso curso1 = new Curso("C001", "Álgebra", null);
        Curso curso2 = new Curso("C002", "Cálculo", null);
        Curso curso3 = new Curso("C003", "Historia Argentina", null);
        Curso curso4 = new Curso("C004", "Física I", null);
        Curso curso5 = new Curso("C005", "Geometría", null);

        miUniversidad.agregarCurso(curso1);
        miUniversidad.agregarCurso(curso2);
        miUniversidad.agregarCurso(curso3);
        miUniversidad.agregarCurso(curso4);
        miUniversidad.agregarCurso(curso5);

        miUniversidad.asignarProfesorACurso("C001", "P1");
        miUniversidad.asignarProfesorACurso("C002", "P1");
        miUniversidad.asignarProfesorACurso("C003", "P2");
        miUniversidad.asignarProfesorACurso("C004", "P3");
        miUniversidad.asignarProfesorACurso("C005", "P1");

        System.out.println("Cursos:");
        for (Curso c : miUniversidad.getCursos()) {
            c.mostrarInfo();
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Profesores:");
        for (Profesor p : miUniversidad.getProfesores()) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        miUniversidad.asignarProfesorACurso("C003", "P1");

        System.out.println("Después de cambiar profesor de C003");
        for (Curso c : miUniversidad.getCursos()) {
            c.mostrarInfo();
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        miUniversidad.eliminarCurso("C004");

        System.out.println("Después de eliminar curso C004");
        for (Profesor p : miUniversidad.getProfesores()) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        
        miUniversidad.eliminarProfesor("P2");

        System.out.println("Después de eliminar profesor P2");
        for (Curso c : miUniversidad.getCursos()) {
            c.mostrarInfo();
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        
        System.out.println("Cantidad de cursos por profesor");
        for (Profesor p : miUniversidad.getProfesores()) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
        }
    }
}


package TP5Ejercicio9;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional){
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha != null && !fecha.trim().isEmpty()) {
            this.fecha = fecha;
        } else {
            System.out.println("Fecha inválida.");
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora != null && !hora.trim().isEmpty()) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    @Override
    public String toString() {
        return "Fecha Cita: " + fecha + "  Hora: " + hora + "\n" + paciente + "\n" + profesional;
    }
    
}

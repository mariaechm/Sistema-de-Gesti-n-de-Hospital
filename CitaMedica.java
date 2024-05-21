import java.util.Date;
public class CitaMedica {
    Date fecha;
    Date hora;
    String motivo;
    String estado;
    Paciente obtenerPaciente() {
        return new Paciente();
    }
    Doctor obtenerDoctor() {
        return new Doctor();
    }
    Enfermero obtenerEnfermero() {
        return new Enfermero();
    }
    Persona obtenerPersona() {
        return new Persona();
    }
}

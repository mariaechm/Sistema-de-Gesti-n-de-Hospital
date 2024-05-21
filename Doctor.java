public class Doctor implements GestionCitas {
    EspecialidadMedica especialidad;
    String nombreEspecialidad(Paciente paciente) {
        return "Especialidad: " + especialidad;
    }
    String verPacientesAtendidos() {
        return "Pacientes atendidos";
    }

    @Override
    public void programarCitaMedica() {
    }

    @Override
    public void cancelarCitaMedica() {
    }

    @Override
    public void reprogramarCitaMedica() {
    }
}
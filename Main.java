import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases y utilizar los métodos

        // Crear un paciente
        Paciente paciente = new Paciente();
        paciente.nombre = "Carlos Medina";
        paciente.identificacion = "0705757268";

        // Crear un doctor
        Doctor doctor = new Doctor();
        doctor.especialidad = EspecialidadMedica.DERMATOLOGIA;

        // Programar una cita médica
        CitaMedica cita = new CitaMedica();
        cita.motivo = "Consulta de rutina";
        cita.fecha = new Date(); // Establecer la fecha actual
        doctor.programarCitaMedica();

        // Ejemplo: Asignar un enfermero a la cita
        Enfermero enfermero = cita.obtenerEnfermero();
        enfermero.asignarPaciente();
        enfermero.asignarDoctor();

        // Otros ejemplos de uso de las clases y métodos
        // ...
    }
}
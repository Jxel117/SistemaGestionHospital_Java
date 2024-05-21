package sistemaGestionHospital;

public class Doctor extends Persona implements GestionCitas{
    //Interfaz
    public void programarCita(){
        System.out.println("Cita programada");
    }
    public void cancelarCita(){
        System.out.println("Cita cancelada");
    }
    public void realizarCitas(){
        System.out.println("Cita realizada");
    }
    //Atributos
    private String identificacion;
    //Relaciones
    private EspecialidadMedica especialidadMedica;
    private Paciente[] pacienteList;
    private Enfermero enfermero;
    private CitaMedica[] citaMedicaList;
}

package sistemaGestionHospital;

public class Paciente extends Persona {
    //Atributos
    private String identificacion;

    //Metodos
    //Relaciones
    private Doctor[] doctorList;
    private Enfermero enfermero;
    private ExpedienteMedico expedienteMedico;
    private CitaMedica[] citaMedicaList;
}

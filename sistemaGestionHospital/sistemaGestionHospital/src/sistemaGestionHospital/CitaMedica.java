package sistemaGestionHospital;

import java.util.Date;

public class CitaMedica {
    //Atributos
    private Date fecha;
    private String hora;
    private String motivo;
    private int numeroCitas;

    //Relaciones
    private Paciente paciente;
    private Doctor doctor;
    private Enfermero enfermero;
    private Estado estado;

    public CitaMedica(Date fecha, String hora, String motivo, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }
}

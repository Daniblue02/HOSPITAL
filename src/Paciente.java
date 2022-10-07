import java.util.Date;

public class Paciente extends Persona {
    String codPaciente;
    String numeroSeguridadSocial;

    public Paciente(String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String codPaciente, String numeroSeguridadSocial) {
        super(nombre, primerApellido, segundoApellido, DNI, fechaNacimiento);
        this.codPaciente = codPaciente;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
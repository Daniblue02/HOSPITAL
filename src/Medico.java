import java.util.Date;
import java.util.List;

public class Medico extends Persona{
    String codMedico;
    List<Servicio> servicios;
    Hospital hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String codMedico, List<Servicio> servicios, Hospital hospital) {
        super(nombre, primerApellido, segundoApellido, DNI, fechaNacimiento);
        this.codMedico = codMedico;
        this.servicios = servicios;
        this.hospital = hospital;
    }
}
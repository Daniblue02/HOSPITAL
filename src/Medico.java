import java.util.Date;
import java.util.List;

public class Medico {
    String codMedico;
    List<Servicio> servicios;
    Hospital hospital;
    Persona persona;

    public Medico() {
    }

    public Medico(String codMedico, List<Servicio> servicios, Hospital hospital, Persona persona) {
        this.codMedico = codMedico;
        this.servicios = servicios;
        this.hospital = hospital;
        this.persona = persona;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codMedico='" + codMedico + '\'' +
                ", servicios=" + servicios +
                ", hospital=" + hospital +
                ", persona=" + persona +
                '}';
    }
}
import java.util.Date;

public class Paciente {
    String codPaciente;
    String numeroSeguridadSocial;
    Persona persona;

    public Paciente() {
    }

    public Paciente(String codPaciente, String numeroSeguridadSocial, Persona persona) {
        this.codPaciente = codPaciente;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.persona = persona;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codPaciente='" + codPaciente + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", persona=" + persona +
                '}';
    }
}
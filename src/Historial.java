public class Historial {
    String codHistorial;
    Paciente paciente;

    public Historial(String codHistorial, Paciente paciente) {
        this.codHistorial = codHistorial;
        this.paciente = paciente;
    }

    public Historial() {
    }

    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "codHistorial='" + codHistorial + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}

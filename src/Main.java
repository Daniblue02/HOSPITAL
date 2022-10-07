import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Date Aug23y984 = new Date();
        Date ingreso = new Date();
        Date salida = new Date();
        Date birth = new Date();

        Persona med1 = new Persona("Esteban","García","Rocha","MED100034X", birth);

        Persona pac1 = new Persona("Pedro","Flores", "Fuentes", "PAC199923X", birth);

        Hospital santaMonica = new Hospital();

        List<Hospital> hosList1 = new ArrayList<>();
        hosList1.add(santaMonica);

        Ciudad monteVideo = new Ciudad("1299990ALL","Monte Video");

        Servicio srv1 = new Servicio("1249AR00H","Fisioterapia", hosList1, 39,"Comodidad y recuperación");
        Servicio srv2 = new Servicio("120NCC00","Nebulización",hosList1, 5, "Menos personal");

        List<Servicio> serviceslist1 = new ArrayList<>();
        serviceslist1.add(srv1);
        serviceslist1.add(srv2);

        Medico docHead1 = new Medico("Roberto", "Sanchez", "Rocio", "12990001", birth, "MED01002", serviceslist1, santaMonica);

        santaMonica.setCodHospital("129ABTR00");
        santaMonica.setNombre("Santa Mónica");
        santaMonica.setCiudad(monteVideo);
        santaMonica.setTelefono(50211253);
        santaMonica.setServicios(serviceslist1);
        santaMonica.setDirector(docHead1);


        Paciente PAC001A = new Paciente("Esteban", "Garcia", "Alanis", "129888512", birth, "PAC91222", "SEC91212");

        Historial histo000x1 = new Historial("HIST-0001224", PAC001A);

        Visita visitCent1 = new Visita("12000ARRRP", ingreso, santaMonica, srv1, docHead1, "Cancer", "Quimioterapia", 2999, salida, histo000x1 );

    }
}

package colecciones.agenda;

public class MainAgenda {

    public static void main(String[] args) {

        AgendaContactos agendaContactos = new AgendaContactos();

        agendaContactos.addContacto("Daniel", 4354545);
        agendaContactos.addContacto("Maria", 4354789);
        agendaContactos.addContacto("Juan", 435498765);

        //Antes de borrar
        agendaContactos.mostrarContactos();

        System.out.println(agendaContactos.buscarContacto("Daniel"));

        agendaContactos.deleteContacto("Juan");

        //Despues de borrar
        agendaContactos.mostrarContactos();
    }
}

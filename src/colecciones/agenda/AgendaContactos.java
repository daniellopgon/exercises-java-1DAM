package colecciones.agenda;

/*
Desarrolla un programa en Java que actúe como una agenda de contactos.
Usa un HashMap<String, String> donde la clave será el nombre del contacto
y el valor será su número de teléfono. El programa debe permitir:
Añadir un nuevo contacto.
Buscar un número por nombre.
Eliminar un contacto existente.
Mostrar todos los contactos.
 */

import java.util.HashMap;

public class AgendaContactos {
    HashMap<String, Integer> contactos;

    public AgendaContactos() {
        this.contactos = new HashMap<>();
    }

    public void addContacto(String nombre, int telefono) {
        contactos.put(nombre, telefono);
    }

    public void deleteContacto(String nombre) {
        contactos.remove(nombre);
    }

    public String buscarContacto(String nombre) {

        for (String valor : contactos.keySet()) {
            if (valor.equals(nombre)) {
                return valor;
            }
        }
        return "No se ha encontrado el contacto";
    }

    public void mostrarContactos() {

        int numero = 0;

        for (String contacto : contactos.keySet()) {
            for (Integer valor : contactos.values()) {
               numero = valor;
            }
            System.out.println(" contacto: " + contacto + " numero: " + numero);
        }
    }
}

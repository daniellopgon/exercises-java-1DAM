package colecciones;

/*
Escribe un programa en Java que almacene los nombres de los
alumnos inscritos en un curso usando un Alumnos<String>. El objetivo es
evitar alumnos duplicados. El programa debe permitir:
Añadir nombres de alumnos.
Mostrar la lista completa sin duplicados.
Comprobar si un alumno ya está inscrito.
Eliminar un alumno de la lista.
 */

import java.util.HashSet;

public class Alumnos {
    static HashSet<String> alumnos;

    public static void main(String[] args) {

        alumnos = new HashSet<>();

        addAlumno("Pepe");
        addAlumno("Maria");
        addAlumno("Juan");

        imprimirLista();

        deleteAlumno("Maria");

        //Después de borrar
        imprimirLista();

        //Evitar duplicidad
        addAlumno("Pepe");
    }

    static void addAlumno(String nombre) {
        if (!buscarAlumno(nombre)) {
            alumnos.add(nombre);
        } else {
            System.out.println(" El alumno ya está en la lista ");
        }
    }

    static void deleteAlumno(String nombre) {
        if (buscarAlumno(nombre)) {
            alumnos.remove(nombre);
        } else {
            System.out.println(" El alumno no está en la lista ");
        }
    }

    static boolean buscarAlumno(String nombre) {
        return alumnos.contains(nombre);
    }

    static void imprimirLista() {
        for (String valor : alumnos) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

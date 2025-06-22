package lambda;

/*
Crea una lista de objetos Alumno, cada uno con los atributos nombre, notaMedia, y curso.

Usa funciones lambda con Stream para obtener la lista de alumnos que están en 1º DAM y tienen una nota media mayor de 8.0.

Calcula la nota media general de todos los alumnos usando un mapToDouble + average.

Ordena la lista de alumnos alfabéticamente por nombre usando una expresión lambda con Comparator.
 */

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private double notaMedia;
    private String curso;

    public Instituto(String nombre, double notaMedia, String curso) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public static void main(String[] args) {
        ArrayList<Instituto> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Instituto("Javi", 6.78, "DAM1"));
        listaAlumnos.add(new Instituto("Marcos", 8.35, "DAM1"));
        listaAlumnos.add(new Instituto("Marta", 3.82, "DAM2"));
        listaAlumnos.add(new Instituto("Laura", 5.68, "DAW1"));

        System.out.println(" ALUMNOS DE DAM1 CON > 8 DE MEDIA ");
        listaAlumnos.stream()
                .filter(a -> a.getCurso().equals("DAM1") && a.getNotaMedia() > 8)
                .forEach(i -> System.out.println(i.getCurso() + " " + i.getNombre() + " " + i.getNotaMedia()));

        System.out.println(" NOTA MEDIA ALUMNOS ");
        double notaMediaAlumnos = listaAlumnos.stream()
                .mapToDouble(Instituto::getNotaMedia)
                .average()
                .orElse(0.0);
        System.out.println("la nota media es" + notaMediaAlumnos);

        System.out.println(" ALUMNOS ORDENADOS POR NOMBRE: ");
        listaAlumnos.stream()
                .sorted((a1, a2) -> a1.getNombre().compareToIgnoreCase(a2.getNombre()))
                .forEach(a -> System.out.println(a.getNombre() + " - " + a.getNotaMedia()));
    }
}

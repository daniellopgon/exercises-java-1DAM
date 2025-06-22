package lambda;

/*
Crea una lista de objetos Mascota, cada uno con nombre, tipo (perro, gato, etc.), y edad.

Usa una expresión lambda para contar cuántas mascotas son perros.

Usa filter para obtener todas las mascotas de más de 10 años.

Ordena las mascotas de menor a mayor edad con sorted y una expresión lambda.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mascotas {
    private String nombre;
    private int edad;

    public Mascotas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Mascotas> listaMascotas = new ArrayList<>();

        listaMascotas.add(new Mascotas("perro", 5));
        listaMascotas.add(new Mascotas("gato", 7));
        listaMascotas.add(new Mascotas("perro", 11));
        listaMascotas.add(new Mascotas("gato", 3));
        listaMascotas.add(new Mascotas("pájaro", 1));

        long numPerros = listaMascotas.stream()
                .filter(m -> m.getNombre().equals("perro"))
                .count();
        System.out.println("Número de perros: " + numPerros);

        List<Mascotas> mayores = listaMascotas.stream()
                .filter(m -> m.getEdad() > 10)
                .toList();
        mayores.forEach(System.out::println);

        listaMascotas.stream()
                .sorted(Comparator.comparingInt(Mascotas::getEdad))
                .forEach(System.out::println);
    }
}

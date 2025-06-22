package lambda;

/*
Crea una lista de objetos Concierto, donde cada uno tenga atributos como nombre, ciudad, y precioEntrada.

Usa una expresión lambda para filtrar solo los conciertos que se celebran en Madrid.

Luego, usa otra expresión lambda para obtener el concierto con el precio más bajo.

Finalmente, imprime el nombre y ciudad de los conciertos con entrada inferior a 30 €.
 */

import java.util.ArrayList;

public class Concierto {
    private String nombre;
    private String ciudad;
    private double precioEntrada;

    public Concierto(String nombre, String ciudad, double precioEntrada) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.precioEntrada = precioEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public static void main(String[] args) {
        ArrayList<Concierto> listaConciertos = new ArrayList<>();

        listaConciertos.add(new Concierto("viña rock", "Caceres", 60.78));
        listaConciertos.add(new Concierto("summer fest", "Gandia", 25.54));
        listaConciertos.add(new Concierto("techno", "Madrid", 250.23));

        System.out.println("Conciertos en Madrid:");
        listaConciertos.stream()
                .filter(c -> c.getCiudad().equals("Madrid"))
                .forEach(c -> System.out.println(c.getCiudad() + " " + c.getNombre()));

        Concierto masBarato = listaConciertos.stream()
                .min((c1, c2) -> Double.compare(c1.getPrecioEntrada(), c2.getPrecioEntrada()))
                .orElse(null);

        if (masBarato != null) {
            System.out.println("Concierto más barato:");
            System.out.println(masBarato.getNombre() + " " + masBarato.getPrecioEntrada() + "€");
        }

        System.out.println("Conciertos con entrada < 30€:");
        listaConciertos.stream()
                .filter(c -> c.getPrecioEntrada() < 30)
                .forEach(c -> System.out.println(c.getNombre() + " " + c.getCiudad()));
    }
}

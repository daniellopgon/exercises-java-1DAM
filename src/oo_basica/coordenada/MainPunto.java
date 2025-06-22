package oo_basica.coordenada;

public class MainPunto {
    public static void main(String[] args) {

        Punto punto = new Punto(100, 200);

        System.out.println(" La distancia es: " + punto.distancia(new Punto(400, 800)));
    }
}

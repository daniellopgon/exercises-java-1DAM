package funciones;

/*
Realiza un método redondear() al que se le pasa como parámetro un numero
float y los decimales que deben quedar después de redondear, y retorna el numero redondeado.
Ejemplo: redondear( 234.49234 , 3 )
Da como resultado : 234.492
 */

public class Redondear {

    public static void main(String[] args) {

        float numero = 234.49234f;
        int decimales = 3;

        System.out.println("El resultado es: " + redondear(numero, decimales));

    }

    static double redondear(float numero, int decimales) {

        double potencia = Math.pow(10, decimales);

        return Math.round(numero * potencia) / potencia;
    }
}

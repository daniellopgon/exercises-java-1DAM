package oo_avanzada.persona;
/*
Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
No queremos que se accedan directamente a ellos.
Piensa que modificador de visibilidad es el más adecuado, también su tipo.
Si quieres añadir algún atributo puedes hacerlo.

Se implantarán varios constructores:

Un constructor con el nombre.
Un constructor con el nombre, edad y sexo.
Un constructor con todos los atributos como parámetro, salvo el DNI.
Los métodos que se implementarán son:

calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en m)),
 si esta fórmula devuelve un valor menor que 20, el método devuelve un -1, si devuelve un número entre 20
y 25 (incluidos), está en un peso normal, por tanto, devuelve un 0 y si devuelve un valor mayor que 25
significa que tiene sobrepeso, devuelve un 1. Te recomiendo que uses constantes para devolver
estos valores.
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto.
Si no es correcto, será H. No sería visible al exterior.
Devolverá el carácter correspondiente al sexo.
toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras y con ese número, calcula su letra correspondiente. Este método será invocado cuando se construya el objeto. No será visible al exterior.
Para calcular el DNI se debe obtener el módulo 23 del número. Y una vez obtenido, se relaciona el resto con la letra correspondiente:

RESTO	0	1	2	3	4	5	6	7	8	9	10	11
LETRA	T	R	W	A	G	M	Y	F	P	D	X	B
RESTO	12	13	14	15	16	17	18	19	20	21	22
LETRA	N	J	Z	S	Q	V	H	L	C	K	E

Métodos set y get de cada atributo.
Crear el método equals y hashCode.

Ahora, crea una clase principal que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior:
El primer objeto utilizará todas las variables.
El segundo objeto utilizará todas las variables menos el peso y la altura.
El último utilizará el constructor que solo dispone del nombre.
Para cada persona se deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
También hay que indicar, para cada persona, si es mayor de edad.
Por último, se debe mostrar la información de cada objeto.
NOTA: Deberás utilizar los métodos que consideres oportunos para realizar todas las acciones indicadas.

2. Se debe crear una clase Profesor que hereda de Persona, y que a su vez pueda ser ProfesorInterino o ProfesorTitular.

La clase Profesor deberá disponer de métodos y atributos relacionados con el módulo profesional que imparte (un atributo por módulo). Por ejemplo, 4 atributos móduloN, siendo N un número del 1 al 4.
La clase ProfesorInterino deberá disponer de un método que devuelva la fecha de inicio de la interinidad.
La clase ProfesorTitular dispondrá de un método que devuelva la fecha del aprobado de la oposición.
 */

import java.util.Objects;
import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public static final int DELGADO = -1;
    public static final int NORMAL = 0;
    public static final int SOBREPESO = 1;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo('H');
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) return DELGADO;
        else if (imc <= 25) return NORMAL;
        else return SOBREPESO;
    }

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : 'H';
    }

    private String generaDNI() {
        Random rand = new Random();
        int numero = rand.nextInt(100000000);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(numero % 23);
        return String.format("%08d%c", numero, letra);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad &&
                sexo == persona.sexo &&
                Double.compare(peso, persona.peso) == 0 &&
                Double.compare(altura, persona.altura) == 0 &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(DNI, persona.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, DNI, sexo, peso, altura);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}


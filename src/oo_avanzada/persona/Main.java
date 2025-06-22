package oo_avanzada.persona;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce el sexo (H/M): ");
        char sexo = sc.next().charAt(0);

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();

        System.out.println("Introduce el peso: ");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona("Laura", 23, 'M');
        Persona persona3 = new Persona("Marcos");

        Persona[] personas = {persona1, persona2, persona3};

        for (Persona p : personas) {
            int imc = p.calcularIMC();
            System.out.print(p.getNombre() + " tiene un IMC: ");
            switch (imc) {
                case Persona.DELGADO -> System.out.println("Bajo peso");
                case Persona.NORMAL -> System.out.println("Peso normal");
                case Persona.SOBREPESO -> System.out.println("Sobrepeso");
                default -> System.out.println("No calculable");
            }

            System.out.println(p.getNombre() + (p.esMayorDeEdad() ? " es mayor de edad" : " es menor de edad"));
            System.out.println(p);
            System.out.println();
        }

        ProfesorInterino interino = new ProfesorInterino("Jose", 35, 'H', 75, 1.80,
                "Programación", "Entornos", "Sistemas", "BD",
                LocalDate.of(2023, 9, 1));

        ProfesorTitular titular = new ProfesorTitular("Ana", 40, 'M', 65, 1.70,
                "Programación", "FOL", "Interfaces", "Acceso a datos",
                LocalDate.of(2020, 6, 15));

        System.out.println("--- PROFESORES ---");
        System.out.println(interino);
        System.out.println(interino.obtenerInicioInterinidad());

        System.out.println(titular);
        System.out.println(titular.obtenerFechaOposicion());
    }

}

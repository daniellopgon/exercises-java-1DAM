package excepciones.persona;

/*
Ejercicio 5: Manejo de Excepciones en Herencia de Clases (Nivel Avanzado)
Descripción: Crea una jerarquía de clases donde una clase base lanza una excepción y
una clase derivada maneja esa excepción de una manera específica. Por ejemplo, una clase Empleado
que hereda de Persona, donde Persona tiene un método que puede lanzar una excepción que Empleado
maneja de forma particular.

Requisitos:

Clase Persona:

Método establecerNombre(String nombre) que lanza una excepción NombreInvalidoException si
el nombre es null o vacío.
Clase Empleado (hereda de Persona):

Método establecerSalario(double salario) que lanza una excepción SalarioInvalidoException si el salario
es negativo.
Override del método establecerNombre que maneja NombreInvalidoException de forma específica (por ejemplo, establecer un nombre por defecto).
Excepciones Personalizadas:

NombreInvalidoException (extiende de Exception).
SalarioInvalidoException (extiende de Exception).
Clase Main:

Crear una instancia de Empleado y probar los métodos con datos válidos e inválidos.
Manejar las excepciones adecuadamente.
Objetivos:

Comprender cómo las excepciones interactúan con la herencia de clases.
Practicar la captura y manejo de excepciones en una jerarquía de clases.
Implementar lógica específica de manejo de excepciones en clases derivadas.
 */

public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNombre(String nombre) throws NombreInvalidoException {

        if (nombre == null || nombre.isEmpty()) {
            throw new NombreInvalidoException(" El nombre no puede estar vacio ni ser null ");
        } else {
            this.nombre = nombre;
        }
    }
}

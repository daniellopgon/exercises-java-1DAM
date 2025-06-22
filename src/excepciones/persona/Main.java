package excepciones.persona;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Antonio", 2000);

        empleado.establecerNombre(null);

        System.out.println(empleado.nombre);

        empleado.establecerNombre("Luis");

        System.out.println(empleado.nombre);

        try {
            empleado.establecerSalario(-5);
        } catch (SalarioInvalidoException e) {
            throw new RuntimeException(e);
        }

        System.out.println(empleado.salario);

        try {
            empleado.establecerSalario(1500);
        } catch (SalarioInvalidoException e) {
            throw new RuntimeException(e);
        }

        System.out.println(empleado.salario);
    }
}

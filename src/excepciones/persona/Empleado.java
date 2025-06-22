package excepciones.persona;

public class Empleado extends Persona {
    double salario;

    public Empleado(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    public void establecerSalario(double salario) throws SalarioInvalidoException {

        if (salario <= 0) {
            throw new SalarioInvalidoException(" Es salario no puede ser 0, ni negativo");
        } else {
            this.salario = salario;
        }
    }

    @Override
    public void establecerNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "SIN IDENTIFICAR";
        } else {
            this.nombre = nombre;
        }
    }
}

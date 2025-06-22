package oo_avanzada.persona;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
    private LocalDate fechaOposicion;

    public ProfesorTitular(String nombre, int edad, char sexo, double peso, double altura, String modulo1, String modulo2, String modulo3, String modulo4, LocalDate fechaOposicion) {
        super(nombre, edad, sexo, peso, altura, modulo1, modulo2, modulo3, modulo4);
        this.fechaOposicion = fechaOposicion;
    }

    public LocalDate getFechaOposicion() {
        return fechaOposicion;
    }

    public void setFechaOposicion(LocalDate fechaOposicion) {
        this.fechaOposicion = fechaOposicion;
    }

    public String obtenerFechaOposicion() {
        return "Fecha de oposición: " + fechaOposicion.toString();
    }
}


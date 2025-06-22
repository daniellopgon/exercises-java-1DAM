package oo_avanzada.persona;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
    private LocalDate fechaInicio;

    public ProfesorInterino(String nombre, int edad, char sexo, double peso, double altura,
                            String modulo1, String modulo2, String modulo3, String modulo4,
                            LocalDate fechaInicio) {
        super(nombre, edad, sexo, peso, altura, modulo1, modulo2, modulo3, modulo4);
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String obtenerInicioInterinidad() {
        return "Fecha de inicio de interinidad: " + fechaInicio.toString();
    }
}


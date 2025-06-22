package colecciones.tareas;

/*
Crea un programa en Java que permita gestionar una lista
de tareas pendientes usando un ListaTareas<String>. El usuario podrá:
Añadir una nueva tarea.
Marcar una tarea como completada (eliminándola del ListaTareas).
Ver todas las tareas pendientes.
Implementa un menú para que el usuario pueda realizar
estas acciones de forma repetida hasta que decida salir.
 */

import java.util.ArrayList;

public class ListaTareas {
    ArrayList<String> listaTareas;

    public ListaTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void addTarea(String tarea) {
        listaTareas.add(tarea);
    }

    public void deleteTarea(String tarea) {
        listaTareas.remove(tarea);
    }

    public void mostrarTareas() {

        for (String tareas : listaTareas) {
            System.out.println(" tarea: " + tareas);
        }
    }

}

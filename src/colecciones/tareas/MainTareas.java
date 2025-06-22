package colecciones.tareas;

import java.util.Scanner;

public class MainTareas {
    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE TAREAS ===");
            System.out.println("1. Añadir nueva tarea");
            System.out.println("2. Marcar tarea como completada (eliminar)");
            System.out.println("3. Ver tareas pendientes");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    lista.addTarea(nuevaTarea);
                    System.out.println("Tarea añadida.");
                    break;
                case 2:
                    System.out.print("Introduce la tarea que has completado: ");
                    String tareaCompletada = scanner.nextLine();
                    lista.deleteTarea(tareaCompletada);
                    System.out.println("Tarea eliminada (si existía).");
                    break;
                case 3:
                    System.out.println("Tareas pendientes:");
                    lista.mostrarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

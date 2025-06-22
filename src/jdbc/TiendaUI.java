package jdbc;

import jdbc.base_de_datos.TiendaInsertsDAO;
import jdbc.base_de_datos.TiendaSelectsDAO;
import jdbc.base_de_datos.TiendaSelectsEstadisticaDAO;
import jdbc.base_de_datos.TiendaUpdateDAO;
import jdbc.negocio.Venta;
import jdbc.negocio.Videojuego;

import java.time.LocalDate;
import java.util.Scanner;

public class TiendaUI {
    public static void main(String[] args) {
        TiendaInsertsDAO tiendaAñadir = new TiendaInsertsDAO();
        TiendaSelectsDAO tiendaMostrar = new TiendaSelectsDAO();
        TiendaSelectsEstadisticaDAO tiendaEstadistica = new TiendaSelectsEstadisticaDAO();
        TiendaUpdateDAO tiendaActualizar = new TiendaUpdateDAO();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n====== MENÚ TIENDA ======");
            System.out.println("1. Añadir videojuego al inventario");
            System.out.println("2. Mostrar todo el inventario");
            System.out.println("3. Consultar un título (por código o nombre)");
            System.out.println("4. Consultar stock de un título");
            System.out.println("5. Buscar cliente (por código, nombre, apellidos o email)");
            System.out.println("6. Registrar venta (y actualizar stock)");
            System.out.println("7. Mostrar historial de ventas completo");
            System.out.println("8. Mostrar historial de ventas de una fecha");
            System.out.println("9. Estadísticas: Acumulado de ventas por plataforma");
            System.out.println("10. Estadísticas: Acumulado de ventas por género");
            System.out.println("11. Mostrar el título más vendido");
            System.out.println("12. Mostrar el mejor día de ventas");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Long num = 123L;
                    tiendaAñadir.insertarVideojuego(new Videojuego("NBA2K2025", "PS5", "Deportes", 89.99, 10, num));
                    System.out.println("Videojuego añadido correctamente.");
                    break;
                case 2:
                    System.out.println("Inventario completo:");
                    tiendaMostrar.mostrarInventario().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Resultado búsqueda por título:");
                    System.out.println(tiendaMostrar.buscarPorTitulo("NBA2K2025"));
                    break;
                case 4:
                    System.out.println("Stock del título:");
                    System.out.println(tiendaMostrar.mostrarStockTitulo("NBA2K2025"));
                    break;
                case 5:
                    System.out.println("Resultado búsqueda de cliente:");
                    System.out.println(tiendaMostrar.buscarPorNombre("Paula".toLowerCase()));
                    break;
                case 6:
                    Venta venta = new Venta(tiendaMostrar.buscarPorNombre("Paula".toLowerCase()), LocalDate.now());
                    venta.addVideojuego(tiendaMostrar.buscarPorTitulo("Elden Ring".toLowerCase()));
                    venta.addVideojuego(tiendaMostrar.buscarPorTitulo("God of War Ragnarok".toLowerCase()));

                    tiendaAñadir.insertarVenta(venta);
                    tiendaActualizar.actualizarStock(1, tiendaMostrar.buscarPorTitulo("Elden Ring".toLowerCase()).getCodigoIdentificativo());
                    tiendaActualizar.actualizarStock(1, tiendaMostrar.buscarPorTitulo("God of War Ragnarok".toLowerCase()).getCodigoIdentificativo());
                    System.out.println("Venta registrada correctamente.");
                    break;
                case 7:
                    System.out.println("Historial completo de ventas:");
                    tiendaMostrar.obtenerHistorialVentas().forEach(row -> System.out.println(java.util.Arrays.toString(row)));
                    break;
                case 8:
                    System.out.println("Historial de ventas de la fecha:");
                    tiendaMostrar.obtenerHistorialVentasDeUnaFecha(LocalDate.now()).forEach(row -> System.out.println(java.util.Arrays.toString(row)));
                    break;
                case 9:
                    System.out.println("Acumulado de ventas por plataforma:");
                    tiendaEstadistica.acumuladoDeVentasPorPlataforma().forEach((plataforma, total) ->
                            System.out.println(plataforma + ": " + total));
                    break;
                case 10:
                    System.out.println("Acumulado de ventas por género:");
                    tiendaEstadistica.acumuladoDeVentasPorGenero().forEach((genero, total) ->
                            System.out.println(genero + ": " + total));
                    break;
                case 11:
                    System.out.println("Título más vendido: " + tiendaEstadistica.tituloMasVendido());
                    break;
                case 12:
                    System.out.println("Mejor día de ventas: " + tiendaEstadistica.mejorDiaVentas());
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

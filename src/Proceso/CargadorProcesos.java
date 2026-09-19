import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CargadorProcesos {

    public static List<Proceso> cargarPorConsola(int cantidad) {
        Scanner sc = new Scanner(System.in);
        List<Proceso> procesos = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Proceso " + i + ":");

            System.out.print("  Nombre: ");
            String nombre = sc.nextLine();

            int llegada = leerEntero(sc, "  Tiempo de llegada: ");
            int servicio = leerEntero(sc, "  Tiempo de servicio: ");

            procesos.add(new Proceso(nombre, llegada, servicio));
        }

        return procesos;
    }

    private static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("  Valor invalido, ingrese un numero entero.");
            }
        }
    }

    public static List<Proceso> cargarEjemplo() {
        List<Proceso> procesos = new ArrayList<>();
        procesos.add(new Proceso("P1", 0, 5));
        procesos.add(new Proceso("P2", 1, 3));
        procesos.add(new Proceso("P3", 2, 8));
        procesos.add(new Proceso("P4", 3, 6));
        procesos.add(new Proceso("P5", 4, 2));
        procesos.add(new Proceso("P6", 5, 4));
        procesos.add(new Proceso("P7", 6, 7));
        procesos.add(new Proceso("P8", 7, 1));
        procesos.add(new Proceso("P9", 8, 5));
        procesos.add(new Proceso("P10", 9, 3));
        return procesos;
    }
}
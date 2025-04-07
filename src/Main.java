import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n Sistema de Gestión de Empleados ");
            System.out.println("1. Registrar Empleado de Planta");
            System.out.println("2. Registrar Empleado por Horas");
            System.out.println("3. Mostrar todos los empleados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                empleados.add(new EmpleadoPlanta(nombre, edad));
                System.out.println("Empleado de planta registrado");

            } else if (opcion == 2) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                System.out.print("Horas trabajadas: ");
                int horas = scanner.nextInt();
                empleados.add(new EmpleadoPorHoras(nombre, edad, horas));
                System.out.println("Empleado por horas registrado");

            } else if (opcion == 3) {
                if (empleados.isEmpty()) {
                    System.out.println("No hay empleados registrados");
                } else {
                    System.out.println("\n=== Lista de Empleados ===");
                    for (Empleado e : empleados) {
                        System.out.println(e.getInformacion());
                    }
                }

            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida Intente nuevamente");
            }

        } while (opcion != 4);
    }
}

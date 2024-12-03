package pootarea4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", 1234567890, "Av. Principal 123", "contacto@techsolutions.com");

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("----- Menu de opciones -----");
            System.out.println("1. Añadir un empleado");
            System.out.println("2. Buscar un empleado por cedula");
            System.out.println("3. Eliminar un empleado por cedula");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("--- Añadir Empleado ---");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese la cedula: ");
                    int cedula = scanner.nextInt();
                    System.out.print("Ingrese el salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el departamento: ");
                    String departamento = scanner.nextLine();

                    Empleado nuevoEmpleado = new Empleado(nombre, cedula, salario, departamento);
                    empresa.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado añadido exitosamente.");
                    break;

                case 2:
                    System.out.println("--- Buscar Empleado ---");
                    System.out.print("Ingrese la cedula del empleado: ");
                    int cedulaBuscar = scanner.nextInt();
                    Empleado empleadoEncontrado = empresa.buscarEmpleadoPorCedula(cedulaBuscar);
                    if (empleadoEncontrado != null) {
                        System.out.println("Empleado encontrado: " + empleadoEncontrado);
                    } else {
                        System.out.println("Empleado con cédula " + cedulaBuscar + " no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("--- Eliminar Empleado ---");
                    System.out.print("Ingrese la cedula del empleado: ");
                    int cedulaEliminar = scanner.nextInt();
                    empresa.eliminarEmpleadoPorCedula(cedulaEliminar);
                    break;

                case 4:
                    System.out.println("Salir del menu");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no invalida");
            }
        }

        scanner.close();
    }
}

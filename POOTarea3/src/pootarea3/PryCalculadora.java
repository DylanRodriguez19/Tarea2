package pootarea3;
import java.util.Scanner;

public class PryCalculadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        System.out.println("Bienvenido a la calculadora.");
        System.out.println("---------------------------------------");
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("---------------------------------------");

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("---------------------------------------");

        System.out.println("Seleccione la opcion de la operacion a realizar:");
        System.out.println("---------------------------------------");
        System.out.println("1. Sumar");
        System.out.println("---------------------------------------");
        System.out.println("2. Restar");
        System.out.println("---------------------------------------");
        System.out.println("3. Multiplicar");
        System.out.println("---------------------------------------");
        System.out.println("4. Dividir");
        System.out.println("---------------------------------------");

        int opcion = scanner.nextInt();
        double resultado;

        switch (opcion) {
            case 1:
                resultado = operaciones.sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = operaciones.restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = operaciones.multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = operaciones.dividir(num1, num2);
                if (num2 > 0) {
                    System.out.println("El resultado de la division es: " + resultado);
                   } else{
                    System.out.println("Error: Division para cero");
                }
                break;
            default:
                System.out.println("Opcion no valida.");
        }

        scanner.close();
    }
}


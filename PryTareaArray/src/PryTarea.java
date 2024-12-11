import java.util.Scanner;

public class PryTarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] hombre = new String[5];
        String[] mujer = new String[5];
        String[] recuerdosUnidos = new String[10];
        int RecuerdosHombre =0; 
        int RecuerdosMujer = 0; 
        int RecuerdosdeambosUnidos = 0;

        System.out.println("Ingrese recuerdos para el hombre (maximo 5, escriba 'salir' para terminar):");
        while (RecuerdosHombre < 5) {
            String recuerdo = scanner.nextLine();
            if (recuerdo.equalsIgnoreCase("salir")) {
                break;
            }
            hombre[RecuerdosHombre] = recuerdo;
            RecuerdosHombre++;
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Ingrese recuerdos para la mujer (maximo 5, escriba 'salir' para terminar):");
        while (RecuerdosMujer < 5) {
            String recuerdo = scanner.nextLine();
            if (recuerdo.equalsIgnoreCase("salir")) {
                break;
            }
            mujer[RecuerdosMujer] = recuerdo;
            RecuerdosMujer++;
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Recuerdos del hombre:");
        for (int i = 0; i < RecuerdosHombre; i++) {
            System.out.println((i) + ". " + hombre[i]);
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Recuerdos de la mujer:");
        for (int i = 0; i < RecuerdosMujer; i++) {
            System.out.println((i) + ". " + mujer[i]);
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Seleccione el recuerdo del hombre que quiera unir (ingrese el numero):");
        int listadeRecuerdosHombre = scanner.nextInt();
        if (listadeRecuerdosHombre >= 0 && listadeRecuerdosHombre < RecuerdosHombre) {
            recuerdosUnidos[RecuerdosdeambosUnidos] = hombre[listadeRecuerdosHombre];
            RecuerdosdeambosUnidos++;
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Seleccione el recuerdo de la mujer que quiera unir (ingrese el numero):");
        int listadeRecuerdosMujer = scanner.nextInt();
        if (listadeRecuerdosMujer >= 0 && listadeRecuerdosMujer < RecuerdosMujer) {
            recuerdosUnidos[RecuerdosdeambosUnidos] = mujer[listadeRecuerdosMujer];
            RecuerdosdeambosUnidos++;
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Recuerdos que unio son:");
        for (int i = 0; i < RecuerdosdeambosUnidos; i++) {
            System.out.println(recuerdosUnidos[i]);
        }

        scanner.close();
    }
}

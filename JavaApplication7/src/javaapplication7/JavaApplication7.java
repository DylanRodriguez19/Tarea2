
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        int suma=-96;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su cedula");
        String cedula = scanner.nextLine();
        if(cedula.length()<10){
            System.out.println("Cedula debe tener 10 digitos");
            return;
        }
        System.out.println("Ingrese posiciciones a sumar, separadas por coma (,) ejem:" + " 1,5  ");
        String posiciones = scanner.nextLine();
        String[] posicionesArreglo=posiciones.split(",");
        for
          (int i=0; i< posicionesArreglo.length; i++){
            int posicion= Integer.parseInt(posicionesArreglo[i].trim());  
            suma += Integer.parseInt(String.valueOf(cedula.charAt(posicion)));
        }
        System.out.println("La suma de las posiciones es:"+ suma);
    }
     
        
    }
    
   

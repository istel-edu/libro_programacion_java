/*
 * Determinar si un año dado es bisiesto.
 */
package Unidad2_DecisionesSimples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un año
        System.out.println("Ingrese un año:");
        int year = scanner.nextInt();
        
        // Determinamos si el año es bisiesto
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        
        // Mostramos el resultado
        if (isLeapYear) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

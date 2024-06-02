/*
 * Convertir un número dado de días a semanas y días.
 */
package Unidad1_Secuenciales;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Claudio Borja
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese el número de días
        System.out.println("Ingrese el número de días:");
        int diasTotales = scanner.nextInt();
        
        // Calculamos el número de semanas y días
        int semanas = diasTotales / 7;
        int diasRestantes = diasTotales % 7;
        
        // Mostramos el resultado
        System.out.println(diasTotales + " días equivalen a " + semanas + " semanas y " + diasRestantes + " días.");
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

/*
 * Determinar la distancia recorrida por un objeto dado su velocidad y tiempo de viaje.
 */
package Unidad1_Secuenciales;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 * @author Diana Alegria, Claudio Borja
 */

public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese la velocidad en metros por segundo (m/s)
        System.out.println("Ingrese la velocidad del objeto en metros por segundo (m/s):");
        double velocidad = scanner.nextDouble();
        
        // Solicitamos al usuario que ingrese el tiempo de viaje en segundos
        System.out.println("Ingrese el tiempo de viaje en segundos:");
        double tiempo = scanner.nextDouble();
        
        // Calculamos la distancia recorrida utilizando la fórmula: distancia = velocidad * tiempo
        double distancia = velocidad * tiempo;
        
        // Mostramos el resultado
        System.out.println("La distancia recorrida por el objeto es: " + distancia + " metros.");
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

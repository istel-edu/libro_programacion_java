/*
 * Calcular el volumen de una esfera dado su radio.
 */
package Unidad1_Secuenciales;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Diana Alegria, Claudio Borja
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese el radio de la esfera
        System.out.println("Ingrese el radio de la esfera:");
        double radio = scanner.nextDouble();
        
        // Calculamos el volumen de la esfera utilizando la fórmula: volumen = (4/3) * pi * radio^3
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        
        // Mostramos el resultado
        System.out.println("El volumen de la esfera es: " + volumen);
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

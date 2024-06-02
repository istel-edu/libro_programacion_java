/*
 * Calcular el perímetro de un círculo dado su radio.
 */
package Unidad1_Secuenciales;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Diana Alegria Claudio Borja
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese el radio del círculo
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        
        // Calculamos el perímetro del círculo utilizando la fórmula: perímetro = 2 * pi * radio
        double perimetro = 2 * Math.PI * radio;
        
        // Mostramos el resultado
        System.out.println("El perímetro del círculo es: " + perimetro);
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

/*
 * Determinar si un número ingresado por el usuario es positivo.
 */
package Unidad2_DecisionesSimples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Claudio Borja
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();
        
        // Determinamos si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

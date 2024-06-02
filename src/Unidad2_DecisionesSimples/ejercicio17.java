/*
 * Determinar si un número es múltiplo de 5.
 */
package Unidad2_DecisionesSimples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        // Verificamos si el número es múltiplo de 5
        if (numero % 5 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 5.");
        } else {
            System.out.println("El número " + numero + " no es múltiplo de 5.");
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

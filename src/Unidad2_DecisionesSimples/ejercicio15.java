/*
 * Verificar si un número es divisible por 3.
 */
package Unidad2_DecisionesSimples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        // Verificamos si el número es divisible por 3
        if (numero % 3 == 0) {
            System.out.println("El número " + numero + " es divisible por 3.");
        } else {
            System.out.println("El número " + numero + " no es divisible por 3.");
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

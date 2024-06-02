/*
 * Verificar si un número ingresado es mayor que 10.
 */
package Unidad2_DecisionesSimples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        // Verificamos si el número es mayor que 10
        if (numero > 10) {
            System.out.println("El número " + numero + " es mayor que 10.");
        } else {
            System.out.println("El número " + numero + " no es mayor que 10.");
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

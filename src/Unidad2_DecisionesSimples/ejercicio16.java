/*
 * Comprobar si un caracter ingresado es una vocal.
 */
package Unidad2_DecisionesSimples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un caracter
        System.out.println("Ingrese un caracter:");
        char caracter = scanner.next().toLowerCase().charAt(0);
        
        // Verificamos si el caracter es una vocal
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("El caracter " + caracter + " es una vocal.");
        } else {
            System.out.println("El caracter " + caracter + " no es una vocal.");
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

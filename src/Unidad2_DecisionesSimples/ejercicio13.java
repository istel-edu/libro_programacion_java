/*
 * Comprobar si una persona es mayor de edad (18 años o más).
 */
package Unidad2_DecisionesSimples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese su edad
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        
        // Comprobamos si la persona es mayor de edad
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

/*
 * Convertir una cantidad dada en metros a pies y pulgadas.
 */
package Unidad1_Secuenciales;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Diana Alegria, Claudio Borja
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese la cantidad en metros
        System.out.println("Ingrese la cantidad en metros:");
        double metros = scanner.nextDouble();
        
        // Convertimos metros a pies
        double pies = metros * 3.28084;
        
        // Convertimos pies a pulgadas
        double pulgadas = pies * 12;
        
        // Mostramos el resultado
        System.out.println(metros + " metros equivalen a " + pies + " pies y " + pulgadas + " pulgadas.");
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

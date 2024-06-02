package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese un número entero
        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        // Verificamos si el número es par y/o positivo/negativo
        if (numero % 2 == 0) {
            // El número es par
            if (numero > 0) {
                // El número es par y positivo
                System.out.println("El número " + numero + " es par y positivo.");
            } else if (numero < 0) {
                // El número es par y negativo
                System.out.println("El número " + numero + " es par y negativo.");
            } else {
                // El número es cero
                System.out.println("El número es cero.");
            }
        } else {
            // El número es impar
            if (numero > 0) {
                // El número es impar y positivo
                System.out.println("El número " + numero + " es impar y positivo.");
            } else if (numero < 0) {
                // El número es impar y negativo
                System.out.println("El número " + numero + " es impar y negativo.");
            } else {
                // El número es cero
                System.out.println("El número es cero.");
            }
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }

}

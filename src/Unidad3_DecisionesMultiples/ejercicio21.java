package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese dos números
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        // Verificamos cuál es el mayor o si son iguales
        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero1 < numero2) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Los dos números son iguales (" + numero1 + " = " + numero2 + ").");
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }

}

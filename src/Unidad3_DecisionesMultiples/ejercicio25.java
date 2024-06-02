package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese un carácter
        System.out.println("Ingrese un carácter:");
        char caracter = scanner.next().charAt(0);

        // Determinamos si el carácter es una vocal, un dígito o un carácter especial
        if ((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z')) {
            // Verificamos si es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                System.out.println("El carácter ingresado es una vocal.");
            } else {
                System.out.println("El carácter ingresado es una consonante.");
            }
        } else if (caracter >= '0' && caracter <= '9') {
            // Es un dígito
            System.out.println("El carácter ingresado es un dígito.");
        } else {
            // Es un carácter especial
            System.out.println("El carácter ingresado es un carácter especial.");
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }

}

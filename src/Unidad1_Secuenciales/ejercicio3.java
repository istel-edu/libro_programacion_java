/*
 * Calcular el promedio de tres números ingresados por el usuario.
 */
package Unidad1_Secuenciales;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Diana Alegria, Claudio Borja
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese los tres números
        try ( // Creamos un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitamos al usuario que ingrese los tres números
            System.out.println("Ingrese el primer número:");
            double numero1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            double numero2 = scanner.nextDouble();
            System.out.println("Ingrese el tercer número:");
            double numero3 = scanner.nextDouble();
            // Calculamos el promedio
            double promedio = (numero1 + numero2 + numero3) / 3;
            // Mostramos el resultado
            System.out.println("El promedio de los tres números ingresados es: " + promedio);
            // Cerramos el objeto Scanner
        }
    }
    
}

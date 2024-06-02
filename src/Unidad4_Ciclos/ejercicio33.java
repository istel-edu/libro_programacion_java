package Unidad4_Ciclos;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author claudio
 */
public class ejercicio33 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el número
        System.out.println("Ingrese un número para calcular su factorial:");
        int numero = scanner.nextInt();

        // Verificamos si el número ingresado es positivo
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            // Calculamos el factorial del número ingresado
            long factorial = 1; // Usamos long para manejar números grandes
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            // Mostramos el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

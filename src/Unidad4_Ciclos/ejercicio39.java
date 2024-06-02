package Unidad4_Ciclos;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author claudio
 */
public class ejercicio39 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el límite
        System.out.println("Ingrese el límite para la serie de Fibonacci:");
        int limite = scanner.nextInt();

        // Inicializamos las variables para los dos primeros números de la serie
        int num1 = 0, num2 = 1;

        // Imprimimos el primer número de la serie
        System.out.print("Serie de Fibonacci hasta " + limite + ": " + num1);

        // Generamos los siguientes números de la serie de Fibonacci y los imprimimos hasta que superen el límite
        while (num2 <= limite) {
            System.out.print(", " + num2);
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

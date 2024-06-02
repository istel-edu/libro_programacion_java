package Unidad4_Ciclos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class ejercicio40 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos un objeto Random para generar el número aleatorio
        Random random = new Random();

        // Generamos un número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;

        // Inicializamos el contador de intentos
        int intentos = 0;

        // Mostramos las instrucciones del juego
        System.out.println("Bienvenido al juego de adivinar el número.");
        System.out.println("El número aleatorio ha sido generado entre 1 y 100.");
        System.out.println("Tienes un máximo de 10 intentos para adivinarlo.");

        // Comenzamos el juego
        while (intentos < 10) {
            // Solicitamos al usuario que ingrese un número
            System.out.println("\nIntento #" + (intentos + 1));
            System.out.println("Ingresa tu número:");

            int numeroUsuario = scanner.nextInt();

            // Verificamos si el número ingresado es igual al número aleatorio
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + (intentos + 1) + " intentos!");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            intentos++;
        }

        // Si el usuario no adivinó el número después de 10 intentos, mostramos el número generado
        if (intentos == 10) {
            System.out.println("\nLo siento, has excedido el máximo de intentos.");
            System.out.println("El número aleatorio era: " + numeroAleatorio);
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

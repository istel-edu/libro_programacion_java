package Unidad4_Ciclos;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author claudio
 */
public class ejercicio34 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el número para imprimir su tabla de multiplicar
        System.out.println("Ingrese un número para imprimir su tabla de multiplicar:");
        int numero = scanner.nextInt();

        // Imprimimos la tabla de multiplicar del número ingresado
        System.out.println("Tabla de multiplicar de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

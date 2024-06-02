package Unidad4_Ciclos;

import java.util.ArrayList;
import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author claudio
 */
public class ejercicio37 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos una lista para almacenar los números ingresados
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicitamos al usuario que ingrese los números hasta que ingrese un número negativo
        System.out.println("Ingrese una lista de números (ingrese un número negativo para terminar):");
        int numero = scanner.nextInt();
        while (numero >= 0) {
            // Agregamos el número a la lista
            numeros.add(numero);
            // Solicitamos al usuario que ingrese el siguiente número
            System.out.println("Ingrese otro número (o ingrese un número negativo para terminar):");
            numero = scanner.nextInt();
        }

        // Calculamos el promedio de los números ingresados
        double promedio = 0.0;
        if (!numeros.isEmpty()) {
            int suma = 0;
            for (int num : numeros) {
                suma += num;
            }
            promedio = (double) suma / numeros.size();
        }

        // Mostramos el promedio
        System.out.println("El promedio de los números ingresados es: " + promedio);

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

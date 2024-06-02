package Unidad4_Ciclos;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author claudio
 */
public class ejercicio35 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el número
        System.out.println("Ingrese un número para calcular la suma de sus dígitos:");
        int numero = scanner.nextInt();

        // Inicializamos la variable para almacenar la suma de los dígitos
        int sumaDigitos = 0;

        // Utilizamos un bucle while para extraer cada dígito del número y sumarlo
        while (numero != 0) {
            // Extraemos el último dígito del número
            int digito = numero % 10;
            // Sumamos el dígito a la suma total
            sumaDigitos += digito;
            // Eliminamos el último dígito del número
            numero /= 10;
        }

        // Mostramos la suma de los dígitos
        System.out.println("La suma de los dígitos del número ingresado es: " + sumaDigitos);

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

package Unidad5_Funciones;

/**
 *
 * @author claudio
 */
public class ejercicio42 {

    // Función para determinar si un número es primo o no
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        // Verificamos si el número es divisible por algún número menor que él mismo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Número que queremos verificar si es primo
        int numero = 17;

        // Llamamos a la función esPrimo y mostramos el resultado
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}

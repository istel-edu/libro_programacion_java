package Unidad5_Funciones;

import java.util.Arrays;

/**
 *
 * @author claudio
 */
public class ejercicio50 {

    // Función para ordenar un arreglo de números en orden ascendente utilizando el algoritmo de burbuja
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        // Iteramos sobre todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Iteramos sobre el arreglo desde el principio hasta el final-i-1
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Arreglo de números desordenados
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};

        // Ordenamos el arreglo utilizando el algoritmo de burbuja
        ordenamientoBurbuja(arreglo);

        // Mostramos el arreglo ordenado
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}

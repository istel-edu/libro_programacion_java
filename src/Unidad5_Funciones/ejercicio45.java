package Unidad5_Funciones;

/**
 *
 * @author claudio
 */
public class ejercicio45 {

    // Función para calcular la suma de los elementos de un arreglo de enteros
    public static int sumarElementos(int[] arreglo) {
        int suma = 0;
        // Iteramos sobre cada elemento del arreglo y sumamos su valor
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }

    public static void main(String[] args) {
        // Definimos un arreglo de ejemplo
        int[] arreglo = {1, 2, 3, 4, 5};

        // Llamamos a la función sumarElementos y mostramos el resultado
        int suma = sumarElementos(arreglo);
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}

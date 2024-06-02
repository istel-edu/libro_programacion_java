package Unidad5_Funciones;

import java.util.ArrayList;

/**
 *
 * @author claudio
 */
public class ejercicio48 {

    // Función para generar un arreglo con los números de la serie de Fibonacci hasta un número límite dado
    public static ArrayList<Integer> fibonacciHastaLimite(int limite) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        
        // Agregamos los primeros dos números de la serie de Fibonacci
        fibonacci.add(0);
        fibonacci.add(1);
        
        // Generamos los siguientes números de la serie de Fibonacci hasta alcanzar o superar el límite
        while (true) {
            int ultimo = fibonacci.get(fibonacci.size() - 1);
            int penultimo = fibonacci.get(fibonacci.size() - 2);
            int siguiente = ultimo + penultimo;
            if (siguiente > limite) {
                break;
            }
            fibonacci.add(siguiente);
        }
        
        return fibonacci;
    }

    public static void main(String[] args) {
        // Definimos el límite para la serie de Fibonacci
        int limite = 1000;

        // Llamamos a la función fibonacciHastaLimite y mostramos el arreglo resultante
        ArrayList<Integer> fibonacci = fibonacciHastaLimite(limite);
        System.out.println("Serie de Fibonacci hasta el límite " + limite + ": " + fibonacci);
    }
}

package Unidad5_Funciones;

/**
 *
 * @author Claudio Borja
 */
public class ejercicio43 {

    // Función para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        // Si el número es 0, el factorial es 1
        if (numero == 0) {
            return 1;
        }
        // Inicializamos el factorial como 1
        long factorial = 1;
        // Multiplicamos el factorial por todos los números desde 1 hasta el número dado
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Número para el cual queremos calcular el factorial
        int numero = 5;

        // Llamamos a la función calcularFactorial y mostramos el resultado
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

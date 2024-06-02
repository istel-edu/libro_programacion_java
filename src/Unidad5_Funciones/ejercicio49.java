package Unidad5_Funciones;

/**
 *
 * @author claudio
 */
public class ejercicio49 {

    // Función recursiva para calcular la potencia de un número
    public static double potencia(double base, int exponente) {
        // Caso base: si el exponente es 0, la potencia es 1
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: calcular la potencia con el exponente reducido en 1
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        // Definimos la base y el exponente para calcular la potencia
        double base = 2;
        int exponente = 5;

        // Calculamos la potencia utilizando la función potencia y mostramos el resultado
        double resultado = potencia(base, exponente);
        System.out.println("La potencia de " + base + " elevado a la " + exponente + " es: " + resultado);
    }
}

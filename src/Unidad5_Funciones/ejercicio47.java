package Unidad5_Funciones;

/**
 *
 * @author claudio
 */
public class ejercicio47 {

    // Función para calcular el máximo común divisor (MCD) de dos números
    public static int calcularMCD(int num1, int num2) {
        // Si alguno de los números es 0, el MCD es el otro número
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        // Aplicamos el algoritmo de Euclides para encontrar el MCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        // Ejemplos de números para calcular su MCD
        int num1 = 48;
        int num2 = 18;

        // Calculamos el MCD de los números y mostramos el resultado
        int mcd = calcularMCD(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
    }
}

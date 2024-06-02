package Unidad5_Funciones;

/**
 *
 * @author claudio
 */
public class ejercicio44 {

    // Función para convertir grados Celsius a grados Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        // Fórmula de conversión: Fahrenheit = Celsius * 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        // Temperatura en grados Celsius que queremos convertir
        double celsius = 20.0;

        // Llamamos a la función celsiusToFahrenheit y mostramos el resultado
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius son equivalentes a " + fahrenheit + " grados Fahrenheit.");
    }
}

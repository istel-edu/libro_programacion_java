/*
 * Convertir una temperatura dada en grados Celsius a grados Fahrenheit.
 */
package Unidad1_Secuenciales;

/**
 *
 * @author Diana Alegria, Claudio Borja
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos la temperatura en grados Celsius
        double celsius = 25.0;
        
        // Convertimos Celsius a Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Mostramos el resultado
        System.out.println(celsius + " grados Celsius equivale a " + fahrenheit + " grados Fahrenheit.");
    }
    
}

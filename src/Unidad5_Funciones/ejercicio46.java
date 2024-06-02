package Unidad5_Funciones;

/**
 *
 * @author claudio
 */
public class ejercicio46 {

    // Función para determinar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        // Eliminamos los espacios en blanco y convertimos la cadena a minúsculas
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        
        // Inicializamos dos índices para comparar los caracteres de la cadena
        int inicio = 0;
        int fin = cadena.length() - 1;
        
        // Mientras los índices no se crucen
        while (inicio < fin) {
            // Si los caracteres en los índices inicio y fin son diferentes, no es un palíndromo
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            // Movemos los índices hacia el centro de la cadena
            inicio++;
            fin--;
        }
        // Si hemos llegado a este punto, la cadena es un palíndromo
        return true;
    }

    public static void main(String[] args) {
        // Ejemplos de cadenas para verificar si son palíndromos
        String cadena1 = "anita lava la tina";
        String cadena2 = "oso";
        String cadena3 = "reconocer";
        String cadena4 = "hola";

        // Verificamos si las cadenas son palíndromos e imprimimos el resultado
        System.out.println("¿Es \"" + cadena1 + "\" un palíndromo? " + esPalindromo(cadena1));
        System.out.println("¿Es \"" + cadena2 + "\" un palíndromo? " + esPalindromo(cadena2));
        System.out.println("¿Es \"" + cadena3 + "\" un palíndromo? " + esPalindromo(cadena3));
        System.out.println("¿Es \"" + cadena4 + "\" un palíndromo? " + esPalindromo(cadena4));
    }
}

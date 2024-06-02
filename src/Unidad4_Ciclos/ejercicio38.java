package Unidad4_Ciclos;

/**
 *
 * @author Claudio Borja
 */
public class ejercicio38 {

    public static void main(String[] args) {
        // Iteramos sobre los números del 1 al 100
        for (int i = 2; i <= 100; i++) {
            // Verificamos si el número es primo
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // Si el número es divisible por otro número que no sea 1 o él mismo, no es primo
                    esPrimo = false;
                    break;
                }
            }
            // Si el número es primo, lo imprimimos
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}

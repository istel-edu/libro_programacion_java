package Unidad4_Ciclos;

/**
 *
 * @author Claudio Borja
 */
public class ejercicio31 {

    public static void main(String[] args) {
        // Inicializamos la variable suma
        int suma = 0;

        // Iteramos sobre los números del 1 al 100 y los sumamos
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        // Mostramos el resultado
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}

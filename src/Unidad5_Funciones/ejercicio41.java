package Unidad5_Funciones;

/**
 *
 * @author Claudio Borja
 */
public class ejercicio41 {

    // Función para calcular el área de un círculo dado su radio
    public static double calcularAreaCirculo(double radio) {
        // Fórmula para calcular el área del círculo: π * radio^2
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static void main(String[] args) {
        // Radio del círculo
        double radio = 5.0;

        // Llamamos a la función para calcular el área del círculo
        double area = calcularAreaCirculo(radio);

        // Mostramos el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}

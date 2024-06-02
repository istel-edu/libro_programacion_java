package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el número del mes
        System.out.println("Ingrese el número del mes (1-12):");
        int mes = scanner.nextInt();

        // Solicitamos al usuario que ingrese el día
        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();

        // Determinamos la estación del año correspondiente
        String estacion;
        if (mes >= 1 && mes <= 12) {
            estacion = switch (mes) {
                case 1, 2 -> "Invierno";
                case 3 -> (dia < 20) ? "Invierno" : "Primavera";
                case 4, 5 -> "Primavera";
                case 6 -> (dia < 21) ? "Primavera" : "Verano";
                case 7, 8 -> "Verano";
                case 9 -> (dia < 22) ? "Verano" : "Otoño";
                case 10, 11 -> "Otoño";
                default -> (dia < 21) ? "Otoño" : "Invierno";
            };
            System.out.println("La estación del año correspondiente al mes " + mes + " y al día " + dia + " es: " + estacion);
        } else {
            System.out.println("Número de mes inválido. Por favor ingrese un número del 1 al 12.");
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }

}

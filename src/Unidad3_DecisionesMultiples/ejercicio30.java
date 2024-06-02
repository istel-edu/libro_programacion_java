package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario
import java.time.DayOfWeek; // Importamos la enumeración DayOfWeek para trabajar con días de la semana
import java.time.LocalDate; // Importamos la clase LocalDate para obtener el día de la semana actual

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el monto total de la compra
        System.out.println("Ingrese el monto total de la compra:");
        double montoTotal = scanner.nextDouble();

        // Obtenemos el día de la semana actual
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();

        // Definimos variables para almacenar el descuento y el mensaje
        double descuento = 0.0;
        String mensaje = "";

        // Determinamos el descuento según el día de la semana y el monto total de la compra
        if ((diaSemana == DayOfWeek.MONDAY || diaSemana == DayOfWeek.TUESDAY) && montoTotal > 50) {
            descuento = 0.10;
            mensaje = "Se aplica un descuento del 10%.";
        } else if ((diaSemana == DayOfWeek.WEDNESDAY || diaSemana == DayOfWeek.THURSDAY) && montoTotal > 30) {
            descuento = 0.05;
            mensaje = "Se aplica un descuento del 5%.";
        } else {
            mensaje = "No se aplica ningún descuento.";
        }

        // Mostramos el mensaje correspondiente
        System.out.println(mensaje);

        // Cerramos el objeto Scanner
        scanner.close();
    }

}

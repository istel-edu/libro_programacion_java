package Unidad1_Secuenciales;

/*
 * Calcular el interés simple de un préstamo dado el capital, la tasa de interés y el tiempo en años.
 */


import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Claudio Borja
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese el capital
        try ( // Creamos un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitamos al usuario que ingrese el capital
            System.out.println("Ingrese el capital (monto del préstamo):");
            double capital = scanner.nextDouble();
            // Solicitamos al usuario que ingrese la tasa de interés anual en porcentaje
            System.out.println("Ingrese la tasa de interés anual (en porcentaje):");
            double tasaInteresAnual = scanner.nextDouble();
            // Solicitamos al usuario que ingrese el tiempo en años
            System.out.println("Ingrese el tiempo del préstamo en años:");
            int tiempoAnios = scanner.nextInt();
            // Calculamos el interés simple
            double interesSimple = (capital * tasaInteresAnual * tiempoAnios) / 100;
            // Mostramos el resultado
            System.out.println("El interés simple del préstamo es: " + interesSimple);
            // Cerramos el objeto Scanner
        }
    }
    
}

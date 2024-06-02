package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el número del día de la semana
        System.out.println("Ingrese el número del día de la semana (1-7):");
        int dia = scanner.nextInt();

        // Determinamos si el día es un día laboral o un día de fin de semana
        String tipoDia;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipoDia = "laboral";
                break;
            case 6:
            case 7:
                tipoDia = "de fin de semana";
                break;
            default:
                tipoDia = "inválido";
                break;
        }

        // Mostramos el resultado
        if (!tipoDia.equals("inválido")) {
            System.out.println("El día " + dia + " es un día " + tipoDia + ".");
        } else {
            System.out.println("Número de día inválido. Por favor ingrese un número del 1 al 7.");
        }

        // Cerramos el objeto Scanner
        scanner.close();
    }

}

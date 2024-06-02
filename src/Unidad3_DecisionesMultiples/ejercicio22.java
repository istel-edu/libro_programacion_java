package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese la nota numérica
        System.out.println("Ingrese la nota numérica:");
        double nota = scanner.nextDouble();

        // Convertimos la nota numérica a su equivalente en letra
        char equivalenteLetra;
        if (nota >= 90) {
            equivalenteLetra = 'A';
        } else if (nota >= 80) {
            equivalenteLetra = 'B';
        } else if (nota >= 70) {
            equivalenteLetra = 'C';
        } else if (nota >= 60) {
            equivalenteLetra = 'D';
        } else {
            equivalenteLetra = 'F';
        }

        // Mostramos el resultado
        System.out.println("La nota equivalente en letra es: " + equivalenteLetra);

        // Cerramos el objeto Scanner
        scanner.close();
    }

}

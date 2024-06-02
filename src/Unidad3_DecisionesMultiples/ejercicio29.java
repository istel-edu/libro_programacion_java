package Unidad3_DecisionesMultiples;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @autor Diana Alegria, Claudio Borja
 */
public class ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitamos al usuario que ingrese el código del producto
        System.out.println("Ingrese el código del producto:");
        int codigo = scanner.nextInt();
        // Definimos variables para almacenar la categoría y el descuento
        String categoria;
        double descuento = 0.0;
        // Determinamos la categoría y aplicamos el descuento según el código del producto
        switch (codigo) {
            case 1:
                categoria = "Electrónica";
                descuento = 0.10;
                break;
            case 2:
                categoria = "Ropa";
                descuento = 0.20;
                break;
            case 3:
                categoria = "Hogar";
                descuento = 0.15;
                break;
            default:
                categoria = "Otros";
                break;
        }
        // Mostramos la categoría del producto y el descuento aplicado (si corresponde)
        System.out.println("El producto pertenece a la categoría: " + categoria);
        if (descuento > 0) {
            System.out.println("Se aplica un descuento del " + (descuento * 100) + "%.");
        } else {
            System.out.println("No se aplica ningún descuento.");
        }
        // Cerramos el objeto Scanner
        scanner.close();
    }
}

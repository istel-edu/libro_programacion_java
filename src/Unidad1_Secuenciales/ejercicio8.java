/*
 * Determinar el área de un triángulo usando la fórmula de Herón, dados los tres lados.
 */
package Unidad1_Secuenciales;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Diana Alegria, Claudio Borja
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese los tres lados del triángulo
        System.out.println("Ingrese el lado 1 del triángulo:");
        double lado1 = scanner.nextDouble();
        
        System.out.println("Ingrese el lado 2 del triángulo:");
        double lado2 = scanner.nextDouble();
        
        System.out.println("Ingrese el lado 3 del triángulo:");
        double lado3 = scanner.nextDouble();
        
        // Calculamos el semiperímetro del triángulo
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        
        // Calculamos el área utilizando la fórmula de Herón: area = sqrt(s * (s - a) * (s - b) * (s - c))
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        // Mostramos el resultado
        System.out.println("El área del triángulo es: " + area);
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
    
}

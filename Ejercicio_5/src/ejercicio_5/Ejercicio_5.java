
package ejercicio_5;

/**
 *
 * @author Janina Fernanda Zari Mora
 */

import java.util.Scanner;
public class Ejercicio_5 {

    
    public static void opera(double a, double b) {
        System.out.println("------");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
     
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Error: No se puede dividir entre cero");
        }
        
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         double a;
         double b;
         
         System.out.println("Ingrese el primer numero: ");
         a = sc.nextDouble();
         
         System.out.println("Ingrese el segundo numero: ");
         b = sc.nextDouble();
        
         opera(a, b);
         sc.close();
        
    }
    
}


package ejercicio_10;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_10 {

     public static int mayorN(int a, int b) {
         if (a > b) {
            return a;
          } else {
            return b;      
        }
     }
  
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int num1;
        int num2;
        int mayor;
      
      System.out.println("Ingrese el primer numero: ");
         num1 = sc.nextInt();
        
       System.out.println("Ingrese el segundo numero: ");
       num2 = sc.nextInt();
       
       mayor = mayorN(num1, num2);
       System.out.println("El numero mayor de los dos es: " + mayor);
        
        sc.close();
        }
 }
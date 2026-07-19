
package ejercicios_11;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicios_11 {
    public static boolean esPar(int num) {
      if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }  
        
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
       boolean resul;
       
      System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        
      resul = esPar(num);  
      System.out.println("----------------");
      
        if (resul == true) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
        
        sc.close();
    }
    
}

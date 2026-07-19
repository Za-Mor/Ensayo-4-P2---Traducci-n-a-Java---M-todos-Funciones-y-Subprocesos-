
package ejercicio_8;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class Ejercicio_8 {

    
    public static double areaR (double base, double altura){
        return base* altura;
    }
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       
       double  base;
       double altura;
       double resul;
      
       
           System.out.println("ingrese la el valor de la base del rectangulo: ");
            base = sc.nextDouble();
            
            System.out.println("ingrese la el valor de la altura del rectangulo: ");
             altura = sc.nextDouble();
           
          resul = areaR(base,altura);
          
          System.out.println("El area del rectangulo es: " + resul);
             
            
           }
    
}


package ejercicio_9;

/**
 *
 * @author Janina Fernanda Zari Mora
 */

import java.util.Scanner;
public class Ejercicio_9 {
    
    public static double calcularPromedio(double a, double b, double c){
      double prom = (a+b+c)/3;
      return prom;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      double a;
      double b;
      double c;
      double prom;
     
        
      System.out.println("Ingrese la primera nota: ");
      a = sc.nextDouble();
      
      System.out.println("Ingrese la segunda nota: ");
       b = sc.nextDouble();
      
      System.out.println("Ingrese la tercera nota: ");
       c = sc.nextDouble();
       
      prom = calcularPromedio(a, b , c);
      
      System.out.println("----------------");
      
       System.out.println("Promedio: "+  prom);
      
       if (prom >= 7 ) {
        System.out.println("Estado: Aprobado ");
          } else {
        System.out.println("Estado: Reprobado ");
       }
      
    }
    
}

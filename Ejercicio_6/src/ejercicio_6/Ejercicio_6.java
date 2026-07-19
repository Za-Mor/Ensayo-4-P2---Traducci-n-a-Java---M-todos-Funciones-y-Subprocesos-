
package ejercicio_6;

/**
 *
 * @author Janina Fernanda Zari Mora
 */

import java.util.Random;
public class Ejercicio_6 {
    
    public static int num() {
      Random generador = new Random();
      int numR = generador.nextInt(100) + 1;
   
       return numR; 
    }
       
    public static void main(String[] args) {
        
        int resul;
                
             resul = num();
             
             System.out.println("Numero alteatorio");
             System.out.println("---------------");
             System.out.println("El numero generado es: " + resul);
    }
    
}

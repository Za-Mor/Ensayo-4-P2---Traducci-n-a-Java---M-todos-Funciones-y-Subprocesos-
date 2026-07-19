
package ejercicio_2;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
public class Ejercicio_2 {

    public static void mostrarPares () {
      for (int i = 2; i <= 100; i += 2) {
            System.out.println(i + " ");  
        } 
    
    }
   
    public static void main(String[] args) {
       
     System.out.println("Numeros pares del 1 hasta  el 100: ");
     System.out.println("------------");
     
        mostrarPares ();
        
    }
    
}

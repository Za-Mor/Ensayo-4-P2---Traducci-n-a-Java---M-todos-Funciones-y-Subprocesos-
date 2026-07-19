
package ejercicio_4;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_4 {
    
     public static void mostrarD(String nombre, int edad) { 
       System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
   

        if (edad >= 18) {
            System.out.println("Condicion: Es mayor de edad.");
        } else {
            System.out.println("Condicion: Es menor de edad.");
        }
    }   
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
     int edad; 
     String nombre;
     
     System.out.println("Ingrese su nombre: ");
     nombre = sc.nextLine();
     
     System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
     
     mostrarD(nombre, edad);
     sc.close();
    }
    
}

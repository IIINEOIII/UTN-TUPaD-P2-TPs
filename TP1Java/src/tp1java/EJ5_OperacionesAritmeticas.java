
package tp1java;

import  java.util.Scanner;

public class EJ5_OperacionesAritmeticas {

 
 
 
 
    public static void main(String[] args) {
       
        
        
        
         Scanner input = new Scanner(System.in); 
 
 /* 5. Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola.
*/
 
        System.out.println("Ingrese un primer numero :");
 int num1 = Integer.parseInt(input.nextLine());                                     // Double.parseDouble(input.nextLine()); // integer.parseint(input.nextLine());
        System.out.println("Ingrese un segundo numero :");
 int num2 = Integer.parseInt(input.nextLine());
 
        System.out.println("La Suma de : " + num1  + " + " + num2 + " = " + (num1 + num2) );
         System.out.println("La Suma de : " + num1  + " - " + num2 + " = " + (num1 - num2) );
          System.out.println("La Suma de : " + num1  + " * " + num2 + " = " + (num1 * num2) );
           System.out.println("La Suma de : " + num1  + " / " + num2 + " = " + (num1 / num2) );
 
 
 
 
 
 
 
 
    }
    
}

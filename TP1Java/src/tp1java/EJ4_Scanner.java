
package tp1java;


import java.util.Scanner;

public class EJ4_Scanner {

    public static void main(String[] args) {
        
        
   Scanner input = new Scanner(System.in);
  
        System.out.println("Ingrese su Nombre: ");
   String nombre = input.nextLine();
   
        System.out.println("Ingrese su edad: ");
    int edad = Integer.parseInt(input.nextLine());
    
    
        System.out.println("Mi nombre es :" +  nombre + " y mi edad es :" + edad + "años");
    
    }
    
}

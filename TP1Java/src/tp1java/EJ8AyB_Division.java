
package tp1java;

import java.util.Scanner;


public class EJ8AyB_Division {

 
    
    
    public static void main(String[] args) {
    
        
        /* 8. Manejar conversiones de tipo y división en Java.
a. Escribe un programa que divida dos números enteros ingresados por el usuario.
*/
   Scanner input = new Scanner(System.in);
   
   //Forma con int 
   int num1, num2;
           
        //solicitud de dato por mensaje
        System.out.println("Calculadora para division de enteros");
        System.out.println("Ingrese un primer numero: ");
         num1 = Integer.parseInt(input.nextLine());
         
         //solicitud de dato por mensaje
         System.out.println("Ingrese un segundo numero :");
         num2 = Integer.parseInt(input.nextLine());
         
         //imprecion de resultados con operaciones
         System.out.println("La division de :" + num1 + " / " + num2 + " = " + (num1 / num2));
   
       // b. Modifica el código para usar double en lugar de int y compara los resultados.
       
       //Forma deficida con Double
       double num3, num4;
       
       
        System.out.println("Calculadora para division de decimales");
        
        //solicitud de dato por mensaje
        System.out.println("Ingrese un primer numero: ");
         num3 = Double.parseDouble(input.nextLine());
         
         //solicitud de dato por mensaje
         System.out.println("Ingrese un segundo numero :");
         num4 = Double.parseDouble(input.nextLine());
         
         System.out.println("La division de :" + num3 + " / " + num4 + " = " +  num3 /  num4); //imprecion de resultados con operaciones
        
         //Segunda Forma Tecnica con convercion de variable en double
        int num5, num6;
        
        
        System.out.println("Calculadora para division de decimales");
        
        //solicitud de dato por mensaje
        System.out.println("Ingrese un primer numero: ");
         num5 = Integer.parseInt(input.nextLine());
         
         //solicitud de dato por mensaje
         System.out.println("Ingrese un segundo numero :");
         num6 = Integer.parseInt(input.nextLine());
         
         
         System.out.println("La division de :" + num5 + " / " + num6 + " = " +  num5 / (double) num6); //imprecion de resultados con operaciones
    }
    
}


package tp1java;

import java.util.Scanner;  // Importamos Scanner

public class EJ3_Variables {


    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);  //Declaramos Scanner
        
        
        /* 3. Crea un programa que declare las siguientes variables con valores asignados:
a. String nombre
b. int edad
c. double altura
d. boolean estudiante
Imprime los valores en pantalla usando System.out.println().*/
        
   String nombre = "Juan";
    int edad = 30;
    double altura = 1.72;
    boolean estudiante = true;
    
        System.out.println("Mi nombre es :" + nombre);
        System.out.println("Mi edad es :" + edad);
        System.out.println("Mi altura es :" + altura);
        System.out.println("Soy estudiante de la UTN <3 :" + estudiante);
        
        
    }
    
}

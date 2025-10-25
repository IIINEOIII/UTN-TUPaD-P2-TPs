
package tp2_clasificacionedad;


import java.util.Scanner;

public class TP2_ClasificacionEdad {

    
    
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
        //mensajes de pantalla
        System.out.println("Tabla de categorias segun su edad");
        System.out.println("");
        System.out.println("Ingresa tu edad: ");
        
        //variable que solicita la edad
        int edad = Integer.parseInt(input.nextLine());
        
        //Estructura condicional
        
        if(edad < 12){
            System.out.println("Usted es un Niño");
        }else if(edad >= 12 && edad <= 17) {
            System.out.println("Usted es un Adolescente");
        }else if (edad >= 18 && edad <= 59){
            System.out.println("Usted es un Adulto");
        }else{
            System.out.println("Usted es un Adulto Mayor");
            
    }
}   
}

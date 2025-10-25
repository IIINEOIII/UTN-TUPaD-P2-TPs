
package tp2_mayordetres;


import java.util.Scanner;



public class TP2_MayorDeTres {Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); 
        
        
        System.out.println("Verificador de ''Mayor'' de 3 numeros");
        System.out.println("");
        
        System.out.println("Ingrese un Primer numero 1): ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("");
        
        System.out.println("Ingrese un Segundo numero 2): ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("");
        System.out.println("Ingrese un Tercer numero 3): ");
        int num3 = Integer.parseInt(input.nextLine());
        
        
        if (num1 > num2 && num1 > num3){
            System.out.println("El numero 1) "+ num1+ " es mayor");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero 2) "+ num2+" es mayor");
        }else{
            System.out.println("El numero 3) "+ num3 + "es mayor");
        }
        
              
                
    }
    
}

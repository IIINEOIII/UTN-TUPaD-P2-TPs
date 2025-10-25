package tp2_validarnota_de_0a10;

import java.util.Scanner;
public class TP2_ValidarNota_De_0a10 {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in) ;
      
      int nota;
        do { System.out.println("Ingrese una nota entre: 0 - 10");
            nota = Integer.parseInt(input.nextLine());
            
        } while (nota <0 || nota > 10);
          System.out.println("Felicitaciones");
          
        
        
          }
    
}

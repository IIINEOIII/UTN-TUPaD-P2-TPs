

package tp2_aniobisiesto;
import java.util.Scanner;



public class TP2_AnioBisiesto {

   
   
   
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        
        // mensaje de solicitud
        System.out.println("Verificador de añio bisiesto");
        System.out.println("Ingrese un añio");
        
        // dato a solicitar para almacenar en variable
        int anio = Integer.parseInt(input.nextLine());
        
        if (anio % 400 == 0){
        System.out.println( anio + " Es un a bisiesto"); // Es multiplo de 400 
        }
        else if(anio % 100 == 0) {
            System.out.println(anio + " No es bisiesto"); //Si no es multiplode 400 y si de 100
        }else if(anio % 4 == 0) {
            System.out.println(anio + "Es bisiesto");    // si es divisible por 4 es bisiesto
            }else{
            System.out.println(anio + " No es bisiesto");   
        
        }
    }
    
}

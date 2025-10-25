
package tp2_sumadenumerospares;
import java.util.Scanner;

public class TP2_SumaDeNumerosPares {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //definimos el tipo de variable y creamos el contador
    int  num;
    int cont = 0;
    
    //mensaje de pantalla
        System.out.println("Programa de sumatoria de numeros pares");
        
        //estructura de while
        while (true) {            
           //solicitamos un numero y si este es cero cortamos 
        System.out.println("Ingrese un numero par, para cortar ingrese '0': ");
        num = Integer.parseInt(input.nextLine());
        
        if(num == 0) break;     //si se ingresa cero de entrada se corta el programa y muestra 0 de resultado
        if(num % 2 == 0) cont += num; //Si el numero es par, se va a ir sumando a nuestro contandor 
      
        }
        
        //mostramos resultados
        System.out.println("El resultado de la sumatoria es: "+ cont);
        
        
        
        
        
        
        
    }
    
}

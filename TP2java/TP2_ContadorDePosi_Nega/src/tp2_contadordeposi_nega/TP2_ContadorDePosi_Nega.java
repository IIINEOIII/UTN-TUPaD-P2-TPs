
package tp2_contadordeposi_nega;

import java.util.Scanner;
public class TP2_ContadorDePosi_Nega {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //creamos nuestras variables y contadores
    int num;
    int contP=0;
    int contN=0;
    int contC=0;
    
    //creamos nuestro siclo flor hasta 10
        System.out.println("Contador de numeros Enteros");
        for (int i = 1; i < 11; i++) {
              //solicitamos un numero  
            System.out.println("Ingrese un numeros enteros Negativos y Positivos"+ i);
            num = Integer.parseInt(input.nextLine());
            
            //para cada condicion cada vez que se cumpla se contara 1 y se le ira sumando al contador
            if (num >= 1){
               contP ++; 
            }else if(num < 0){
                contN ++;
            }else{
                contC ++;
            }
          }
        //imprimimos resultados
        System.out.println("La cantidad de positivos es: "+contP);
        System.out.println("La cantidad de Negativos es: "+contN);
        System.out.println("La cantidad de Ceros es: "+contC);
    }
    
}

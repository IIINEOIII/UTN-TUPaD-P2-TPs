
package tp2_calculodescuglobal;
import java.util.Scanner;

public class TP2_CalculoDescuGlobal {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("***Calculador de Descuento Especial***");
        System.out.println("Ingrese el precio del producto:$ ");
        double precPro = Double.parseDouble(input.nextLine());
        System.out.println("");
        System.out.println("Ingrese el descuento:$ ");
    
        double descuento = calcularDescuentoEspecial(precPro);
        
        
        System.out.println("***TICKETS-DESCUENTO-GLOBAL*** "); 
        System.out.println("Precio del Producto: $"+precPro);        
        System.out.println("Descuento Especial Aplicado: $"+calcularDescuentoEspecial(precPro));
        System.out.println("Precio Final: $" + (precPro - descuento));
    }
    
   static double calcularDescuentoEspecial(double precio){
       double descuentoAplicado = precio *10/100;
       return descuentoAplicado;
   
   } 
}

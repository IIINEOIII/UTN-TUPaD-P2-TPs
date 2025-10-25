
package tp2_actualizarstock;

 import java.util.Scanner;

public class TP2_ActualizarStock {

 
 
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  
 
  
        System.out.println("GESTOR DE STOCK");
        System.out.println("Ingresa el Stock actual: ");
        int estoAc = Integer.parseInt(input.nextLine());
        System.out.println("");
        System.out.println("Ingrese la cantidad Vendida: ");
        int cantVen = Integer.parseInt(input.nextLine());
        System.out.println("");
        System.out.println("Ingrese la cantidad Recibida: ");
        int cantReci = Integer.parseInt(input.nextLine());
        System.out.println("");
        
        int nuevoStock = actualizarStock(estoAc, cantVen, cantReci); 
        
        System.out.println("RESULTADO INVENTARIO-2025");
        System.out.println("Stock actual: "+estoAc);
        System.out.println("Cantidad Vendia: "+cantVen);
        System.out.println("Cantidad Recibida: "+cantReci);
        System.out.println("El nuevo Stock del producto es: "+nuevoStock);
        
    }
    
    
   static int actualizarStock(int stockActual,int cantidadVendida, int cantidadRecibida){ 
    return (stockActual - cantidadVendida) + cantidadRecibida;
   }
}

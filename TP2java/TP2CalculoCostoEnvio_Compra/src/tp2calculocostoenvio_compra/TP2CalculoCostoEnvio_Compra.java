
package tp2calculocostoenvio_compra;

import java.util.Scanner;
public class TP2CalculoCostoEnvio_Compra {
 
    public static void main(String[] args) {
       
     Scanner input = new Scanner(System.in);
     
     
     
     double precPro,costoEnvio = 0, pesopak; 
     String nacional;
     
        System.out.println("PRO-GREM CALCU: COSTO ENVIOS Y TOTAL DE COMPRA");
        
        
        System.out.println("Ingrese el costo del Producto: ");
        precPro = Double.parseDouble(input.nextLine());
        
        System.out.println("");
        
        System.out.println("Ingrese el peso del paquete: ");
        pesopak = Double.parseDouble(input.nextLine());
        
        System.out.println("");
        
        
        System.out.println("Ingrese el destino: NACIONAL / INTERNACIONAL ");
        String destini = input.nextLine().trim().toLowerCase();
        
        costoEnvio = calcularCostoEnvio(pesopak, destini);
        
        
        System.out.println("Tickets De Pago");
        System.out.println("Precio del producto: $"+precPro);
        System.out.println("Peso del paquete :"+pesopak);
        System.out.println("Zona de envio :"+destini);
        System.out.println("Costo de Envio: $"+calcularCostoEnvio(pesopak, destini));
        System.out.println("Total a Pagar :$"+calcularTotalCompra(precPro, costoEnvio));
    }
    static double calcularTotalCompra(double precioProducto, double costoEnvio){    
    return precioProducto + costoEnvio;
      
    }
   

   static double calcularCostoEnvio(double peso, String zona){
 
      double costoEnvio = 0.0;

    if (zona.equalsIgnoreCase("nacional")){
    costoEnvio = 8000 +(peso*1000);
    }else if (zona.equalsIgnoreCase("internacional")){
    costoEnvio = 24000 +(peso*1000) ;
    }else{
    System.out.println("Zona invalida: "+ zona);
    }
    return  costoEnvio;
   }
           
            
  
   
   
   
   
   
   
   
}

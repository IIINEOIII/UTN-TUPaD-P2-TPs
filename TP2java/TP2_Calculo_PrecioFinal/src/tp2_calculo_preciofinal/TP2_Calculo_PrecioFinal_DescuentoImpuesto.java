
package tp2_calculo_preciofinal_descuentoimpuesto;
import java.util.Scanner;

public class TP2_Calculo_PrecioFinal_DescuentoImpuesto {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.println("e-commerce La Anonima ");   
        double precioBa, impues, descu;
        
        
        System.out.println("Ingrese el precio base del producto: ");
        precioBa = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto %");
        impues = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el descuento %");
        descu = Double.parseDouble(input.nextLine());
        
        
        double precioFinal = CalculoPrecioFinal(precioBa, impues, descu);
        
        System.out.println("");
        
        System.out.println("$$$$$ Tiket Generado$$$$$");
        System.out.println("Precio base del producto:" + precioBa + 
                "\nImpuesto: " + impues + "%" +
                "\nDescuento: "+ descu + "%" +
                "\nPrecio Final: " + precioFinal);
        
        

    }
  
    
    static double CalculoPrecioFinal(double precioBase, double impuesto, double descuento){
        
        
        return precioBase + (precioBase*impuesto/100)-(precioBase*descuento/100);
    }     
    
}

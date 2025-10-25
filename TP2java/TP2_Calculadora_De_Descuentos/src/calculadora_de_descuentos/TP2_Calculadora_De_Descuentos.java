
package calculadora_de_descuentos;

import java.util.Scanner;
import java.util.Locale;

public class TP2_Calculadora_De_Descuentos {

   
    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

double descuento, precioFinal;

        System.out.println("Calculadora de Descuento de Compra por Categoria");
        
        
        //solicitamos precio del producto
        System.out.println("Ingrese el Precio del Producto: ");
        Double produc = Double.parseDouble(input.nextLine());
        
        // salto 
        System.out.println("");
        
        //solicitamos la categoria 
        System.out.println("Categorias 'A' 'B' 'C' ");
        System.out.println("Ingrese la Categoria correspondiente para sudescuento: ");
        char cat = Character.toUpperCase(input.next().charAt(0));
        //estructura condicional
        //si la categoria es A realiza el 10% de descuento
        if (cat == 'A'){
                    System.out.printf(new Locale("es","AR"), "Precio ingresado: $%,.2f%n", produc);
                    System.out.printf("Categoria ingresada: %c%n", cat);
                    System.out.println("Descuento: 10%");
                    System.out.printf(new Locale("es","AR"), "Monto de descuento: $%,.2f%n", (descuento = produc * 10 / 100));
                    System.out.printf(new Locale("es","AR"), "Precio Final: $%,.2f%n", (precioFinal = produc - descuento)); 
        //Si la categoria es B realiza un 15% de desceunto
        }else if (cat == 'B'){
            System.out.printf(new Locale("es","AR"), "Precio ingresado: $%,.2f%n", produc);
                    System.out.printf("Categoria ingresada: %c%n", cat);
                    System.out.println("Descuento: 15%");
                    System.out.printf(new Locale("es","AR"), "Monto de descuento: $%,.2f%n", (descuento = produc * 15 / 100));
                    System.out.printf(new Locale("es","AR"), "Precio Final: $%,.2f%n", (precioFinal = produc - descuento));
        //Si la categoria es C realiza un 20% de descuento
        }else if (cat == 'C'){
            System.out.printf(new Locale("es","AR"), "Precio ingresado: $%,.2f%n", produc);
                    System.out.printf("Categoria ingresada: %c%n", cat);
                    System.out.println("Descuento: 20%");
                    System.out.printf(new Locale("es","AR"), "Monto de descuento: $%,.2f%n", (descuento = produc * 20 / 100));
                    System.out.printf(new Locale("es","AR"), "Precio Final: $%,.2f%n", (precioFinal = produc - descuento));
        }else{
            System.out.println("Error, categoria no encontrada.");
        }
        
        
        
        
    }
    
}

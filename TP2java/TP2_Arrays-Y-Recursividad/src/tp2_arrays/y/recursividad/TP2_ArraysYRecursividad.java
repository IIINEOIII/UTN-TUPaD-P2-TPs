
package tp2_arrays.y.recursividad;




public class TP2_ArraysYRecursividad {

    
    public static void main(String[] args) {
        
    //creamos la lista de precios    
 double[] listaPrecios = {199.99,299.54,149.75,399.0,89.99};
 
 //creamos la estructura for para recorrer la arrays con la lista de precios y  la 
 // almacenamos en una nueva variable
            System.out.println("Lista de precios Actual");
        for (int i = 0; i < listaPrecios.length; i++) {
            double listaPrecio = listaPrecios[i];
            //imprimimos la lista de precios
            System.out.println(listaPrecio);
        }
        System.out.println("");
        
        // modificamos la lista de precios con el indice indicado
            listaPrecios[2] = 129.99 ;
            
        //creamos la estructura for para recorrer la arrays con los neuvos precios actualizados    
        System.out.println("Lista de Precios modificada");
    
    
        for (int i = 0; i < listaPrecios.length; i++) {
            double listaPrecio = listaPrecios[i];
            System.out.println(listaPrecio);
        }
    
    }
    
}

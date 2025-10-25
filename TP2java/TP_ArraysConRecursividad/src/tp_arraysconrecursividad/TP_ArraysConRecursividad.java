
package tp_arraysconrecursividad;


public class TP_ArraysConRecursividad {

    
    public static void main(String[] args) {
        
        
     //creamos nuestra lista arrays de precios   
  double[] listaPrecios = {199.99,299.54,149.75,399.0,89.99};      
        
  //llamamos a la funcion y le colocamos el indice 0 que es el inicio del recorrido
        recorrer(listaPrecios, 0);
        System.out.println(""); //salto
        
     listaPrecios[2] = 129.99;
     
        recorrer(listaPrecios, 0);
        
    }
  
static void recorrer(double[] lista, int i) {
    if (i == lista.length) {
        return;               //  caso base donde corta
    }
    System.out.println(lista[i]);  // se imprime vuelta de la lista con su indice
    recorrer(lista, i + 1);        // baja recursivamente
    
}

    
}

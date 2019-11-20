package bol9_2;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class sumaProducto {
    
    int suma=0;
    double producto=1;
    
    Scanner leer=new Scanner(System.in);

    public void sumaProducto(){
        
        System.out.println("teclea numero");
        
        for(int contador = 10 ; contador <= 90 ; contador++){
          
            suma  =suma+contador;
            producto =producto*contador;
            
        }
        System.out.println("Resultado de la suma = "+suma+ " resultado del producto = "+producto);
    }
 
}

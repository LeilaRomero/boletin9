package bol9_5;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Series {

    int numero1, numero2=1, numero3, numero4=1, numero5;

    Scanner leer = new Scanner(System.in);

    public void Serie1() {

        for (int contador = 0; contador < 10; contador++) {

            numero1 = numero1 + 2;
            System.out.print(numero1 + " + ");
        }

    }

    public void Serie2() {

        System.out.println("\n");    
        
        for (int contador = 1; contador < 10; contador++) {

            numero2 = numero2 - 2;
            numero3 = numero3 + 2;
            System.out.print(""+numero2 + " +" + numero3 + " ");
        }
    }
    
    public void Serie3(){
        
        System.out.println("\n");
        System.out.print("0, ");
        for(int contador=0;contador <5;contador++){            
            numero4=numero4+numero5;
            numero5=numero5+numero4;
            System.out.print(+numero4+" , "+numero5+" , ");            
        }
    }
}

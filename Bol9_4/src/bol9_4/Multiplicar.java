package bol9_4;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Multiplicar {

    public Multiplicar() {
    }

    public void multiplos() {
        int numero, contador, multiplo, fin = 10, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzcir numero para crear su table de multiplicar:");
        numero = leer.nextInt();
        while (numero > 0 || numero < 0) {
            System.out.println("La table del " + numero + " = ");

            for (contador = 0; contador <= fin; contador++) {
                multiplo = contador;
                resultado = numero * contador;
                System.out.println(numero + " * " + multiplo + " = " + resultado);

            }
            System.out.println("Introduzcir otro numero para visualizar su tabla:");
            numero = leer.nextInt();
        }
    }

}

package bol9_3;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Rectangulo {

    int base, altura;

    Scanner leer = new Scanner(System.in);

    public void Area() {

        System.out.println("Introduce base");
        base = leer.nextInt();
        System.out.println("Introduce altura");
        altura = leer.nextInt();

        while (base <= 0) {
            System.out.println("Número positivo en la base");
            base = leer.nextInt();
        }
        while (altura <= 0) {
            System.out.println("Número positivo en la altura");
            altura = leer.nextInt();
        }
        System.out.println("El área del rectangulo es= " + base * altura);

    }

}

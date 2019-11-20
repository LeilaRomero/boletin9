package bol9_1for;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class CalcularPosNegaCero {

    int num, pos = 0, nega = 0, cero = 0;
    Scanner sc = new Scanner(System.in);

    public int pedirDatos() {

        System.out.println("teclea numero");
        return num = sc.nextInt();

    }

    public void Calcular() {

        for (int cont = 0; cont < 10; cont++) {
            num = pedirDatos();
            if (num == 0) {
                cero = cero + 1;
            } else if (num > 0) {
                pos = pos + 1;
            } else {
                nega = nega + 1;
            }

        }
        System.out.println("cantidad de ceros = " + cero + " cantidad de negativos = " + nega + " cantidad de positivos = " + pos);
    }

}

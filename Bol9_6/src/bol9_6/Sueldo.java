package bol9_6;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Sueldo {

int sueldo, trabajadores = 0, trabajadores1000 = 0, totalTrabajadores = 0,comprobante = 1;
    float porcentaje;
    Scanner leer = new Scanner(System.in);

    public void Sueldo() {
        while(comprobante==1){
        System.out.println("Introducor el sueldo: ");
        sueldo = leer.nextInt();
            while(sueldo<0){
                System.out.println("Introducor el sueldo positivo: ");
                sueldo = leer.nextInt();
            }
        
            if(sueldo>=1000&&sueldo<=1750){
                    totalTrabajadores++;
                    trabajadores++;
            }
                else if(sueldo<1000){
                 totalTrabajadores++;
                 trabajadores1000++;
                }
            System.out.println("Desea introducir otro sueldo?\n0-No 1-Si");
            comprobante=leer.nextInt();
            while(comprobante!=1&&comprobante!=0){
                System.out.println("Desea introducir otro sueldo?\n0-No 1-Si");
                comprobante=leer.nextInt();  
            }
        }
        porcentaje=(trabajadores1000*100)/totalTrabajadores;
        System.out.println("Los trabajadores que cobran entre 1000 y 1750 son= "+trabajadores+"\nEl porcentaje de los que cobran menos de 1000= "+porcentaje+"%");
    }
}


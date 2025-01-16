package Aplicacao;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double xA , xB, xC, yA, yB, yC;

        System.out.println("Entradas do Trnigulos X: ");
        xA = sc.nextInt();
        xB = sc.nextInt();
        xC = sc.nextInt();

        System.out.println("Entradas do Trnigulos Y: ");
        yA = sc.nextInt();
        yB = sc.nextInt();
        yC = sc.nextInt();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA)  * (p - xB) * (p - xC));

        
        p = (yA+ yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA)  * (p - yB) * (p - yC));

        System.out.printf(" A Area do trnigulo X é: %.4f%n" , areaX);
        System.out.printf(" A Area do trnigulo Y é: %.4f%n ", areaY);
        

        sc.close();

    }
}










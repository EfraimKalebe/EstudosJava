import java.util.Scanner;

public class Exercirios2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159 * 2;
        double area = 100.64;

        double resultado = pi * area;

        System.out.printf("O resultado é " + "%.4f%n", resultado);


        sc.close();

        
    }
}

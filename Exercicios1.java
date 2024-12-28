import java.util.Scanner;


public class Exercicios1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();

        int resultado = a + b;

        System.out.println("A soma dos resultados é " + resultado);


        sc.close();
    }
}

package Condicionais;

public class Exercicios3 {
    
    public static void main(String[] args) {
        
        int A = 6;
        int B = 24;

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

    }
}

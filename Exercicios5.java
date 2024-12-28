public class Exercicios5 {
    
    public static void main(String[] args) {
        
        int CodigodaPeca1 = 12;
        int NumerodaPeca1 = 1;
        double ValorUnitario1 = 5.30;

        double resultado1 = ValorUnitario1 * NumerodaPeca1;

        int CodigodaPeca2 = 16;
        int NumerodaPeca2 = 2;
        double ValorUnitario2 = 5.10;

        double resultado2 = ValorUnitario2 * NumerodaPeca2;

        double resultadototal = resultado1 + resultado2;

        System.out.println("O valor a ser pago é " + resultadototal);

    }
}

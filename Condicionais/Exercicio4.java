package Condicionais;

public class Exercicio4 {
    
    public static void main(String[] args) {
        
        int Horainicial = 16;
        int Horafinal = 2;

        int duracao;
        if(Horainicial < Horafinal){
            duracao = Horafinal - Horainicial;
    }
    else {
        duracao = 24 - Horainicial + Horafinal;
    }


    System.out.println("O jogo durou " +   duracao  + " Hora(s)");
}
}
